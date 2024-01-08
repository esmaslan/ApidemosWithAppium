@ApiDemoS
Feature: ApiDemosSwitch

  @Switches
  Scenario: Check Switches Page
    Given user should see the Categories Page
    When taps "Views" on Categories Page
    When taps "Switches" on Categories Page
    Then should see Switches "Views/Switches" Page

   @CheckActionsSwitch
  Scenario: Check Radio Button Page Actions
    Given user is on the Switches Page
    Then should see Defaults Switch On"Default is on" on Switches Page
    When taps to Defaults Switch on Switches Page
    Then should see Defaults Switch Off "KAPALI" on Switches Page

