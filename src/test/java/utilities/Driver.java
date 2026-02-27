package utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Driver {

    private Driver() {
    }

    private static final ThreadLocal<WebDriver> driverPool = new ThreadLocal<>();
    private static final Logger logger = LogManager.getLogger(Driver.class);

    public static WebDriver getDriver() {
        if (driverPool.get() == null) {
            String browser = ConfigReader.getProperty("browser");
            String gridUrl = System.getenv("GRID_URL");

            if (gridUrl != null) {
                try {
                    ChromeOptions options = new ChromeOptions();
                    driverPool.set(new RemoteWebDriver(new URL(gridUrl), options));
                    logger.info("Remote browser started on grid: {}", gridUrl);
                } catch (MalformedURLException e) {
                    throw new RuntimeException("Invalid Grid URL: " + gridUrl, e);
                }
            } else {
                switch (browser) {
                    case "chrome":
                        driverPool.set(new ChromeDriver());
                        break;
                    case "chrome-headless":
                        ChromeOptions chromeOptions = new ChromeOptions();
                        chromeOptions.addArguments("--headless", "--no-sandbox", "--disable-dev-shm-usage");
                        driverPool.set(new ChromeDriver(chromeOptions));
                        break;
                    case "firefox":
                        driverPool.set(new FirefoxDriver());
                        break;
                    case "firefox-headless":
                        FirefoxOptions firefoxOptions = new FirefoxOptions();
                        firefoxOptions.addArguments("--headless");
                        driverPool.set(new FirefoxDriver(firefoxOptions));
                        break;
                    case "edge":
                        driverPool.set(new EdgeDriver());
                        break;
                    case "safari":
                        driverPool.set(new SafariDriver());
                        break;
                    default:
                        driverPool.set(new ChromeDriver());
                }
                logger.info("Browser started: {}", browser);
            }
            driverPool.get().manage().window().maximize();
            driverPool.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }
        return driverPool.get();
    }

    public static void closeDriver() {
        if (driverPool.get() != null) {
            driverPool.get().quit();
            driverPool.remove();
            logger.info("Browser closed");
        }
    }
}
