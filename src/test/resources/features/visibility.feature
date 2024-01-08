@ApiDemoVis
Feature: ApiDemosVisibility

  @Visibility
  Scenario: Check Visibility Page
    Given user should see the Categories Page
    When taps "Views" on Categories Page
    When taps "Visibility" on Categories Page
    Then should see Visibility "Views/Visibility"  Page

   @CheckActionsVis
  Scenario: Check Visibility Page Actions
    Given user is on the Visibility Page
    Then should see View Text "View B" on Visibility Page
    Then should see Buttons "Invis" on Visibility Page
    When taps to Buttons "Invis" on Visibility Page
    Then should not see View Text "View B" on Visibility Page
    When taps to Buttons "Vis" on Visibility Page
    Then should see View Text "View B" on Visibility Page
