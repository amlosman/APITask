Feature: Get request to colourLovers
  Scenario: The APIs and Get pattern Status base URL are ready and Verify the returned numView
    Given The user calls Get Pattern PathParameter "api/patterns" successfully
    Then Check numViews "patterns.pattern.numViews" value is greater than "4000"
