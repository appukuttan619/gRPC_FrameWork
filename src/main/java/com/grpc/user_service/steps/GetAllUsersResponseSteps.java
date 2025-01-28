package com.grpc.user_service.steps;

import com.grpc.user_service.response.GetAllUsersResponse;
import io.cucumber.java.en.Then;

public class GetAllUsersResponseSteps {

    GetAllUsersResponse getAllUsersResponse = new GetAllUsersResponse();

    @Then("display all the users")
    public void display_all_the_users() {
        getAllUsersResponse.displayAllUsers();
    }
}
