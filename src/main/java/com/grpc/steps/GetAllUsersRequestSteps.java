package com.grpc.steps;

import com.grpc.request.GetAllUsersRequest;
import io.cucumber.java.en.When;

public class GetAllUsersRequestSteps {

    GetAllUsersRequest getAllUsersRequest = new GetAllUsersRequest();

    @When("user calls getAllUser methode")
    public void user_calls_get_all_user_methode() {
        getAllUsersRequest.callGetAllUsers();
    }
}
