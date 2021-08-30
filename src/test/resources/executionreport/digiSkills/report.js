$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("vehiclecheck.feature");
formatter.feature({
  "line": 2,
  "name": "As a User i Should be able to validate the Vehicle Details against the CarTaxCheck WebSite",
  "description": "",
  "id": "as-a-user-i-should-be-able-to-validate-the-vehicle-details-against-the-cartaxcheck-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@UI"
    },
    {
      "line": 1,
      "name": "@REGRESSION"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Compare Vehicle Details",
  "description": "",
  "id": "as-a-user-i-should-be-able-to-validate-the-vehicle-details-against-the-cartaxcheck-website;compare-vehicle-details",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User is Able to read and Access Vehicle Details File \"\u003cInputFile\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Vehicle details are verified against the CarTax website",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Vehicle details Retrieved should Match the Details in the Expected File \"\u003cOutputFile\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "comments": [
    {
      "line": 8,
      "value": "#    Can add any number of input and output files below for verification"
    }
  ],
  "line": 9,
  "name": "",
  "description": "",
  "id": "as-a-user-i-should-be-able-to-validate-the-vehicle-details-against-the-cartaxcheck-website;compare-vehicle-details;",
  "rows": [
    {
      "cells": [
        "InputFile",
        "OutputFile"
      ],
      "line": 10,
      "id": "as-a-user-i-should-be-able-to-validate-the-vehicle-details-against-the-cartaxcheck-website;compare-vehicle-details;;1"
    },
    {
      "cells": [
        "src/test/resources/testdata/car_input.txt",
        "src/test/resources/testdata/car_output.txt"
      ],
      "line": 11,
      "id": "as-a-user-i-should-be-able-to-validate-the-vehicle-details-against-the-cartaxcheck-website;compare-vehicle-details;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Compare Vehicle Details",
  "description": "",
  "id": "as-a-user-i-should-be-able-to-validate-the-vehicle-details-against-the-cartaxcheck-website;compare-vehicle-details;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@UI"
    },
    {
      "line": 1,
      "name": "@REGRESSION"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is Able to read and Access Vehicle Details File \"src/test/resources/testdata/car_input.txt\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Vehicle details are verified against the CarTax website",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Vehicle details Retrieved should Match the Details in the Expected File \"src/test/resources/testdata/car_output.txt\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "src/test/resources/testdata/car_input.txt",
      "offset": 54
    }
  ],
  "location": "VehicleCheckSteps.userIsAbleToReadAndAccessVehicleDetailsFile(String)"
});
formatter.result({
  "duration": 3499653959,
  "status": "passed"
});
formatter.match({
  "location": "VehicleCheckSteps.vehicle_details_are_verified_against_the_CarTax_website()"
});
formatter.result({
  "duration": 921674250,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "src/test/resources/testdata/car_output.txt",
      "offset": 73
    }
  ],
  "location": "VehicleCheckSteps.vehicleDetailsRetrievedShouldMatchTheDetailsInTheExpectedFile(String)"
});
formatter.result({
  "duration": 6150549042,
  "status": "passed"
});
formatter.after({
  "duration": 78689000,
  "status": "passed"
});
});