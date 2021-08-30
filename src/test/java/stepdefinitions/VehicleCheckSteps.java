package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pageobjects.CarDetailsPage;
import pageobjects.CarTaxCheckHomePage;
import utilities.CSVReader;
import utilities.FileUtil;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class VehicleCheckSteps {

    private CarTaxCheckHomePage carTaxCheckHomePage;
    private CarDetailsPage carDetailsPage;
    List<String> inputVehicleRegNumbers;
    Map<String, CSVReader> listOfOutputVehicleDetails;

    public VehicleCheckSteps(CarTaxCheckHomePage carTaxCheckHomePage, CarDetailsPage carDetailsPage) {
        this.carTaxCheckHomePage = carTaxCheckHomePage;
        this.carDetailsPage = carDetailsPage;
    }

    @Given("^User is Able to read and Access Vehicle Details File \"([^\"]*)\"$")
    public void userIsAbleToReadAndAccessVehicleDetailsFile(String inputFile) throws Throwable {
        String fileContent = FileUtil.readInputFileAsString(inputFile);
        inputVehicleRegNumbers = FileUtil.getRegDataBasedOnRegx(fileContent);

    }

    @When("^Vehicle details are verified against the CarTax website$")
    public void vehicle_details_are_verified_against_the_CarTax_website() throws Throwable {
        carTaxCheckHomePage.goToCarCheckWebsite();
    }

    @Then("^Vehicle details Retrieved should Match the Details in the Expected File \"([^\"]*)\"$")
    public void vehicleDetailsRetrievedShouldMatchTheDetailsInTheExpectedFile(String outputFile) throws Throwable {
        listOfOutputVehicleDetails = FileUtil.getDataFromCSV(outputFile);

        for (String regNumbFromInputText : inputVehicleRegNumbers) {
            CSVReader csvData = listOfOutputVehicleDetails.get(regNumbFromInputText);
            if (csvData == null) {
                System.out.println("No vehicle data found for Vehicle Reg :  " + regNumbFromInputText + " In the Output File");
            } else {
                carTaxCheckHomePage.clearAndEnterCarRegNumber(regNumbFromInputText);
                carTaxCheckHomePage.clickOnFreeCarCheck();
                assertEquals("Registration Number Doesn't Match", csvData.getREGISTRATION(), carDetailsPage.getVehicleRegistrationNumber());
                assertEquals("Make of the Vehicle Doesn't Match", csvData.getMAKE(), carDetailsPage.getCarMake());
                assertEquals("Model of the Vehicle Doesn't Match", csvData.getMODEL(), carDetailsPage.getVehicleModel());
                assertEquals("Colour of the Vehicle Doesn't Match", csvData.getCOLOR(), carDetailsPage.getVehicleColour());
                assertEquals("Year of the Vehicle Doesn't Match", csvData.getYEAR(), carDetailsPage.getVehicleYear());
            }
            if (regNumbFromInputText != null) carTaxCheckHomePage.goToCarCheckWebsite();
        }
    }

        @After
        public void afterScenario (Scenario scenario){
            carDetailsPage.closeBrowser();
        }

    }

