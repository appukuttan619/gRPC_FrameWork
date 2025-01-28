package com.grpc.user_service.steps;

import com.grpc.user_service.response.GetUserByIdResponse;
import com.grpc.user_service.response.ResponseBase;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class GetUserByIdResponseSteps extends ResponseBase {
    GetUserByIdResponse getUserByIdResponse = new GetUserByIdResponse();

    @Then("verify the name of the user is {string}")
    public void verify_the_name_of_the_user_is(String name) {

        Assert.assertTrue(getUserByIdResponse.isNameSame(name));

    }
}
