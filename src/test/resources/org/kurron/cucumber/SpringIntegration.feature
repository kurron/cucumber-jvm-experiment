@google
Feature: Spring Integration
  Scenario: Call Google
    Given A valid REST template
    When I invoke GET on wwww.google.com
    Then I should get a 200 status code