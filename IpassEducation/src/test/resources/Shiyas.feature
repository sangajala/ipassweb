Feature: University page

  Scenario Outline: user can view the course details after logged in
    Given user is logged in
    When user navigates to the searched university page
    And  user selects view all courses
    And select the "<course>" he is interested in
    Then the selected course’s  information must be displayed
    Examples:
      | course                      |
      | Aerospace Engineering PGDip |
      | Acoustics MSc               |
      | Advanced Control Systems    |
      | Biomechanics, Biomedical    |
      | Civil Engineering Mphil     |
      | Data Telecommunications N   |
  Scenario Outline: user can apply a course from course details page
    Given user is logged in
    When user navigates to the searched university page
    And  user selects view all courses
    And select the "<course>" he is interested in
    And click apply now
    Then the applied course is added to his profile
    Examples:
      | course                      |
      | Aerospace Engineering PGDip |
      | Acoustics MSc               |
      | Advanced Control Systems    |
      | Biomechanics, Biomedical    |
      | Civil Engineering Mphil     |
      | Data Telecommunications N   |
  Scenario: user can directly apply a course from the university course list
    Given user is logged in
    When user navigates to the searched university page
    And  user selects view all courses
    And click apply now
    Then the applied course is added to his profile

  Scenario: user cannot apply for a course without logging in
    Given user navigates to his selected university page
    When user selects view all courses
    And select a course he is interested in
    And selects Apply now
    Then user should be prompted to login

  Scenario: User can be access the university website
    Given user is in Ipass homepage
    When user search for a university
    And clicks on view website
    Then user can see the university website


  Scenario: User can view the location of the university
    Given user is in Ipass homepage
    When user search for a university
    And clicks on the given map
    Then user can see the location in google map

    Scenario: User can see the details of university

      Given user is in university home page of "University of Salford"
      Then he should see title "University of Salford"
      And address "The Crescent, Salford, Greater Manchester, England, M5 4WT"
      And phone number "441612955000"
      And should see the Courses with title "Social studies and Media","Business and Management"
      And should see the section "You might also be interested in these Universities"
      And interested universites "The Courtaul Institute Of Art"


      Scenario: User can view the courses of the university

        Given user is in university home page of "University of Salford"
        Then he should see title "University of Salford"
        And navigates to "Social studies and Media"
        Then he should see list of courses with titles "Art And Design (Communica"


  Scenario: User can view the courses of the university

    Given user is in university home page of "University of Salford"
    Then he should see title "University of Salford"
    And navigates to "Social studies and Media"
    When he select "Art And Design (Communica"
    Then he should see "View website" button
    When she selects on "View website" button
    Then he should land on "http://www.salford.ac.uk/" page
