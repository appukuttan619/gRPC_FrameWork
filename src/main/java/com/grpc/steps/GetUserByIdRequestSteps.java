package com.grpc.steps;

import com.grpc.request.GetUserByIdRequest;
import io.cucumber.java.en.*;

public class GetUserByIdRequestSteps {
    GetUserByIdRequest getUserByIdRequest = new GetUserByIdRequest();

    @When("user sets the id as the body from add user")
    public void user_sets_the_id_as_the_body() {
        getUserByIdRequest.setIdFromAddUser();
    }


    @And("user calls getUserById methode")
    public void userCallsGetUserByIdMethode() {

        getUserByIdRequest.callGetUserById();

    }
}
