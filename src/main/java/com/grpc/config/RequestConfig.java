package com.grpc.config;

import com.anand.grpc.UserServiceOuterClass;

public class RequestConfig extends BaseConfig{

    UserServiceOuterClass.AddUserRequest addUserRequest;
    static UserServiceOuterClass.AddUserRequest.Response addUserResponse;

    public void setUserNameAndHobby(String name, String hobby) {
        addUserRequest = UserServiceOuterClass.AddUserRequest.newBuilder()
                .setName("shijas")
                .addHobbies("football")
                .build();
    }

    public void callAddUser() {
        addUserResponse = stub.addUser(addUserRequest);
    }
}
