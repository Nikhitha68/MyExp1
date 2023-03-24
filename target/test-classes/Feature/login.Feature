Feature: Login with Valid Credentials


  Scenario: Successful Login with Valid Credentials
    Given User Launch browser
    And opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    And User enters username as "Admin" and Password as "admin123"
    When user clock on Time
    And select Project Info
    Then select Projects
    And click on Add and type Name
    Then  click on logout

#    Scenario : Login with Valid credentails
#      Given User Launch browser
#      And opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
#      And User enters username as "Admin" and Password as "admin123"
#      And click on Login
#
#      When user clock on Time
#    And select Project Info
#    Then select Projects
#    And click on Add and type Name
#    Then  click on logout