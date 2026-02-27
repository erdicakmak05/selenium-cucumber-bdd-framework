package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;
import pages.DemoGuruPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class DemoGuru99Stepdefinitions {

    DemoGuruPage demoGuruPage=new DemoGuruPage();


    @Given("prints all values in the {string} column")
    public void prints_all_values_in_the_column(String desiredColumnStr) {

        //demoGuruPage.cookiesKabulEtButonu.click();



        List<WebElement> baslikWebelementListesi= demoGuruPage.baslikWebelementListesi;

        List<String> baslikStringListesi= ReusableMethods.getElementsText(baslikWebelementListesi);

        int istenenSutunIndexi=baslikStringListesi.indexOf(desiredColumnStr);

        //     //tbody//tr//td[3]

        List<WebElement> istenenSutunWebelementListesi= demoGuruPage.sutunListesiGetir(istenenSutunIndexi);

        List<String> istenenSutunStrList = ReusableMethods.getElementsText(istenenSutunWebelementListesi);

        System.out.println(desiredColumnStr +" Column elements \n"+istenenSutunStrList);



    }
}