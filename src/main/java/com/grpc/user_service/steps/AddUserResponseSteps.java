package com.grpc.user_service.steps;

import com.grpc.user_service.response.AddUserResponse;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AddUserResponseSteps {

    AddUserResponse addUserResponse = new AddUserResponse();

    @Then("verify response has name {string} and hobby {string}")
    public void verify_response_has_name_and_hobby(String name, String hobby) {

        Assert.assertTrue(addUserResponse.isNameAndHobbySame(name, hobby));

    }


    @When("user stores the id")
    public void userStoresTheId() {
        addUserResponse.storeId();
    }
}
