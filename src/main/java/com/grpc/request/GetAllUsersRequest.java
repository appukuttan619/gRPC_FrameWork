package com.grpc.request;

import com.anand.grpc.UserServiceOuterClass;

public class GetAllUsersRequest extends RequestBase{


    UserServiceOuterClass.GetAllUserRequest getAllUserRequest ;
    static UserServiceOuterClass.GetAllUserRequest.Response getAllUserResponse;
    public void callGetAllUsers() {
        getAllUserRequest = UserServiceOuterClass.GetAllUserRequest.newBuilder().build();
        getAllUserResponse = stub.getAllUser(getAllUserRequest);
    }

    public static UserServiceOuterClass.GetAllUserRequest.Response getGetAllUserRsponse(){
        return getAllUserResponse;
    }
}
