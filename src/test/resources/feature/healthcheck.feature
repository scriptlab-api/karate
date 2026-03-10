Feature: API Health Check

    Scenario: Verify API is reachable
        Given url 'https://www.google.com'
        When method GET
        Then status 200