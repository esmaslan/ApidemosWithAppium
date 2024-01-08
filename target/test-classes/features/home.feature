@HomePage
Feature: ApiDemos

  @PopupMenuPage
  Scenario: Check Popup Menu Page
    Given user should see the Categories Page
    When taps "Views" on Categories Page
    When taps "Popup Menu" on Categories Page
    Then should see Title "Views/Popup Menu" on Popup Menu Page

  @CheckActions
  Scenario: Check Popup Menu Page Actions
    Given user is on the Popup Menu Page
    Then should Make Popup Button "Make a Popup!" on Popup Menu Page
    When taps Make Popup Button on Popup Menu Page
    Then should see Popup Element "Search" on Popup Menu Page
    Then should see Popup Element "Add" on Popup Menu Page
    Then should see Popup Element "Edit" on Popup Menu Page
    When taps Popup Element "Edit" on Popup Menu Page
    Then should see Popup Menu Tite "Share" on Popup Menu Page

  @RadioButtonPage
  Scenario: Check Radio Button Page
    Given user should see the Categories Page
    When taps "Views" on Categories Page
    When taps "Radio Group" on Categories Page
    Then should see Title "Views/Radio Group" on Radio Button Page

  @CheckActionsRadioButton
  Scenario: Check Radio Button Page Actions
    Given user is on the Radio Button Page
    Then should see Radio Button "Snack" on Radio Button Page
    Then should see Radio Button "Breakfast" on Radio Button Page
    Then should see Radio Button "Lunch" on Radio Button Page
    Then should see Radio Button "Dinner" on Radio Button Page
    Then should see Radio Button "All of them" on Radio Button Page
    Then should see Clear Button "Clear" on Radio Button Page
    When taps to Radio Button "Dinner" on Radio Button Page
    Then should see Selected Text "You have selected: 2131296432" on Radio Button Page
    When taps to Radio Button "Lunch" on Radio Button Page
    Then should see Selected Text "You have selected: 2131296577" on Radio Button Page

  @SearchView
  Scenario: Check Search View Page
    Given user should see the Categories Page
    When taps "Views" on Categories Page
    When taps "Search View" on Categories Page
    When taps "Action Bar" on Categories Page
    Then should see Title "Views/Search View/Action Bar" on Search View Page

  @CheckActionsSearchView
  Scenario: Check Search View Page Actions
    Given user is on the Search View Page
    Then should see Search Button on Search View Page
    When taps to Search Button on Search View Page
    When sendkeys to Search Area "hello" on Search View Page
    Then should see Result "hello" on Search View Page
