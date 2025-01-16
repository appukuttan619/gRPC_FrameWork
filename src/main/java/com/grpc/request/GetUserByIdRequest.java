package com.grpc.request;

import com.anand.grpc.UserServiceOuterClass;
import com.grpc.response.AddUserResponse;

public class GetUserByIdRequest extends RequestBase{

    public static UserServiceOuterClass.GetUserByIdRequest.Response getUserByIdResponse;

    UserServiceOuterClass.GetUserByIdRequest getUserByIdRequest;


    public void setIdFromAddUser() {
        getUserByIdRequest = UserServiceOuterClass.GetUserByIdRequest.newBuilder()
                .setId(AddUserResponse.userId + "")
                .build();
    }

    public void callGetUserById() {
        getUserByIdResponse = stub.getUserById(getUserByIdRequest);
    }

    public static UserServiceOuterClass.GetUserByIdRequest.Response getGetUserById() {
        return getUserByIdResponse;
    }
}
