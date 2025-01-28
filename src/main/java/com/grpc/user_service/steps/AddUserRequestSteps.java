package com.grpc.user_service.steps;

import com.grpc.user_service.request.AddUserRequest;
import io.cucumber.java.en.*;

public class AddUserRequestSteps {

    AddUserRequest addUserRequest = new AddUserRequest();
    @When("user sets body name as {string} and hobby as {string}")
    public void user_sets_body_name_as_and_hobby_as(String name, String hobby) {
        addUserRequest.setUserNameAndHobby(name, hobby);

    }

    @When("user calls addUser methode")
    public void user_calls_add_user_methode() {
        addUserRequest.callAddUser();

    }

}
