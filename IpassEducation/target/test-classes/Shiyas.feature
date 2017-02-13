Feature: University page

  Scenario Outline: user can view the course details after logged in
    Given user is logged in
    When user is in university home page of "University of Salford"
    And  user selects view all courses
    And select the "<course>" he is interested in
    Then the "Course Info" must be displayed
    Examples:
      | course                      |
      | Aerospace Engineering PGD |
      | Acoustics MSc               |
      | Advanced Control Systems    |
      | Biomechanics, Biomedical    |
      | Civil Engineering Mphil     |
      | Data Telecommunications N   |
  Scenario Outline: user can apply a course from course details page
    Given user is logged in
    When user is in university home page of "University of Salford"
    And  user selects view all courses
    And select the "<course>" he is interested in
    And selects Apply now
    Then the applied "<course>" is added to his profile
    Examples:
      | course                      |
      | Aerospace Engineering PGD |
      | Acoustics MSc               |
      | Advanced Control Systems    |
      | Biomechanics, Biomedical    |
      | Civil Engineering Mphil     |
      | Data Telecommunications N   |
  Scenario: user can directly apply a course from the university course list
    Given user is logged in
    When user is in university home page of "University of Salford"
    And  user selects view all courses
    And select "Acoustics MSc"
    And selects Apply now
    Then the "Acoustics MSc" is added to his profile

  Scenario: user cannot apply for a course without logging in
    Given user is in university home page of "University of Salford"
    When user selects view all courses
    And select "Acoustics MSc"
    And selects Apply now
    Then user should be prompted to login


  Scenario: User can view the location of the university
    Given user is in university home page of "University of Salford"
    When he selects "View larger map"
  Then he should land on google maps

  @working
  Scenario: User can see the details of university

      Given user is in university home page of "University of Salford"
      Then he should see title "University of Salford"
      And address "The Crescent, Salford, Greater Manchester, England, M5 4WT"
      And phone number "441612955000"
      And should see the Courses with title "Social studies and Media","Business and Management"
      And should see the section "You might also be interested in these Universities"
      And interested universities "The Courtaul Institute Of Art"

  @first
  Scenario: User can view the courses of the university
        Given user is in university home page of "University of Salford"
        Then he should see title "University of Salford"
        And navigates to "Social studies and Media"
        Then he should see list of courses with titles "Art And Design (Communica"
 @third
  Scenario: User can access the university page

    Given user is in university home page of "University of Salford"
    Then he should see title "University of Salford"
    Then he should see "View website" button in university Page
    When he selects on "View website" button in university Page
    Then he should land on "http://www.salford.ac.uk/" page

  @second
  Scenario: User can view the courses and access the university page

    Given user is in university home page of "University of Salford"
    Then he should see title "University of Salford"
    And navigates to "Social studies and Media"
    When he select "Art And Design (Communica"
    Then he should see "View website" button
    When he selects on "View website" button
    Then he should land on "http://www.salford.ac.uk/" page
