package stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static io.restassured.RestAssured.given;

public class CheckBitCoinRate {

      Response response;

       @Given("the Coinbase API endpoint for GBP value is available")
       public void the_coinbase_api_endpoint_for_gbp_value_is_available () {
           RestAssured.baseURI = "https://api.coindesk.com/";
           RestAssured.basePath = "/v1/bpi/currentprice.json";

       }

       @When("I request the Bitcoin value in GBP")
       public void i_request_the_bitcoin_value_in_gbp () {

           response = given().when().get().then().contentType(ContentType.JSON).extract().response();
       }

       @Then("the response status code should be {int}")
       public void the_response_status_code_should_be (Integer statusCode){

           statusCode = response.getStatusCode();
           System.out.println("StatusCode value is : " + statusCode);
       }

       @Then("the Bitcoin value should be fetched successfully")
       public void the_bitcoin_value_should_be_fetched_successfully () {

           String bitcoinRateGBP = response.jsonPath().getString("bpi.GBP.rate");
           System.out.println("Bitcoin rate in GBP: " + bitcoinRateGBP);
       }

    }
