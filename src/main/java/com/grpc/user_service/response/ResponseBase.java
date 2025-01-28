package com.grpc.user_service.response;

import com.anand.grpc.UserServiceOuterClass;
import com.grpc.user_service.request.AddUserRequest;
import com.grpc.user_service.request.GetAllUsersRequest;
import com.grpc.user_service.request.GetUserByIdRequest;

public class ResponseBase {

    public static int statusCode;
    public static String status;

    UserServiceOuterClass.AddUserRequest.Response addUserResponse = AddUserRequest.getAddUserResponse();

    UserServiceOuterClass.GetUserByIdRequest.Response getUserByIdResponse = GetUserByIdRequest.getGetUserById();

    UserServiceOuterClass.GetAllUserRequest.Response getAllUsersResponse = GetAllUsersRequest.getGetAllUserRsponse();

}
