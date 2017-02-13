Feature: login

  Scenario Outline:User can login with valid details
    Given User is on Ipass homepage
    When He navigate to Login page
    Then He has to provide "<userid>" "<password>"
    And press the LoginButton
    Then user should be logged in

    Examples:
      | userid                    | password |
      | sriram.angajala@gmail.com | Krishh12 |
      | hi                        | hellohi  |

  Scenario Outline:User cannot login with invalid details
    Given User is on Ipass homepage
    When He navigate the Login link
    Then He has to provide "<userid>" "<password>"
    And press the LoginButton
    Then "Invalid Username or password" should be displayed

    Examples:
      | userid          | password |
      | sriram.angajala | Krishh12 |


  Scenario Outline:User should be able to navigate to the expected page for all the links in the login dialog
    Given User is on Ipass homepage
    When he navigates to Login link
    And selects to link "<navigateLink>"
    Then he should land in a dialog box with title

    Examples:
      | navigateLink   |title|
      | Register       |Register|
      | Forget Password |Forget Password|

  Scenario Outline: User can search all the universities who offer the same course
    Given User is logged in
    When he search a "<course>" in the search field
    Then the univerity name "<university>" should be shown in the results

    Examples:
      | course                    |university|
      | Aerospace Engineering MSc |University of Salford          |
      | Media Arts And Creative   |          |
      | Petroleum And Gas         |          |

  Scenario Outline: User can select an university and apply a course
    Given User is logged in to the ipass portal
    When he search for a "<course>" in the search field
    Then the univerity name "<university>" should be shown in the results
    And selects the university "<university>"
    And user selects view all courses
    And select the "<course>" he is interested in
    And click apply now
    Then the applied course should be added to his profile

    Examples:
      | course                    |
      | Aerospace Engineering MSc |
      | Media Arts And Creative   |
      | Petroleum And Gas         |


    @end2end
    Scenario Outline: User should be able to apply for course successfully

      Given a registered user logged into the dashboard
      When he search for a course with title "<course>"
      And select the university "<university>" and navigate to the course "<course>"
      And intended to apply for that course and selected apply course
      Then the applied course "<course>" from univesity "<university>" should be added to his My Universities list

      Examples:
        | course                    |university|
        | Aerospace Engineering MSc |University of Salford|
        | Media Arts And Creative   |                     |
        | Petroleum And Gas         |                     |
