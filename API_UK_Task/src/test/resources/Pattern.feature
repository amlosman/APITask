Feature: Get request to colourLovers

  Scenario: Verify the returned numView

    Given The APIs and GetActiveProductStatus MS base URL are ready
    When  The user calls Get Pattern PathParameter "api/patterns" successfully
    Then Check numViews "patterns.pattern.numViews" value is greater than "4000"
