@UI @REGRESSION
Feature: As a User i Should be able to validate the Vehicle Details against the CarTaxCheck WebSite

  Scenario Outline: Compare Vehicle Details
    Given User is Able to read and Access Vehicle Details File "<InputFile>"
    When Vehicle details are verified against the CarTax website
    Then Vehicle details Retrieved should Match the Details in the Expected File "<OutputFile>"
#    Can add any number of input and output files below for verification
    Examples:
      | InputFile                                 | OutputFile                                 |
      | src/test/resources/testdata/car_input.txt | src/test/resources/testdata/car_output.txt |

