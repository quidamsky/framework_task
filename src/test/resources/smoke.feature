Feature: Smoke
  As a user
  I want to test all main site functional
  So that I can be sure that site works correctly

  Scenario Outline:
    Given User opens '<homePage>' page
    And User cheks search field visibility
    When User makes search by keyword '<keyword>'
    And User clicks search button
    And User clicks on save item on first product
    Then User checks that amount of products in wish list are '<amountOfProducts>'

    Examples:
      | homePage              | keyword        | amountOfProducts |
      | https://www.asos.com/ | Wide Leg Jeans | 1                |

    Scenario Outline: Check the main functions
      Given User opens '<homePage>' page
      And User checks footer visibility
      And User checks footer visibility
      And User checks search field visibility
      And User checks register button visibility
      And User checks sign in URL visibility
      When User put cursor over the myAccount button
      And User checks the popup field is visible
      And User checks that 'Sign In' URL is visible
      Then User closes the pop up

      Examples:
        | homePage              |
        | https://www.asos.com/ |

      Scenario Outline: Check the Sign in page functions
        Given User opens
