Feature: US1011 WebUniversty Window Handle
  @WebU
  Scenario Outline: TC16 Window Handle Test with Reusable Methods

    Given user navigates to "WUUrl" page
    And scrolls down to Login Portal
    And clicks on Login Portal
    Then switches to the other opened window
    And enters "<username>" and "<password>" into the fields
    And clicks the login button on the page
    And verifies that the popup text is validation failed
    And closes the popup by clicking ok
    And returns to the first page
    And verifies that returned to the first page


    Examples:
    |username|password|
    |erdi    |bey     |

