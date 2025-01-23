package com.grpc.response;

import com.anand.grpc.UserServiceOuterClass;
import com.grpc.request.AddUserRequest;
import com.grpc.request.GetAllUsersRequest;
import com.grpc.request.GetUserByIdRequest;

public class ResponseBase {

    public static int statusCode;
    public static String status;

    UserServiceOuterClass.AddUserRequest.Response addUserResponse = AddUserRequest.getAddUserResponse();

    UserServiceOuterClass.GetUserByIdRequest.Response getUserByIdResponse = GetUserByIdRequest.getGetUserById();

    UserServiceOuterClass.GetAllUserRequest.Response getAllUsersResponse = GetAllUsersRequest.getGetAllUserRsponse();

}
