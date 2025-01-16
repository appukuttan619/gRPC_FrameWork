package com.grpc.response;

import com.anand.grpc.UserServiceOuterClass;
import com.grpc.request.AddUserRequest;
import com.grpc.request.GetUserByIdRequest;

public class ResponseBase {

    UserServiceOuterClass.AddUserRequest.Response addUserResponse = AddUserRequest.getAddUserResponse();

    UserServiceOuterClass.GetUserByIdRequest.Response getUserByIdResponse = GetUserByIdRequest.getGetUserById();

}
