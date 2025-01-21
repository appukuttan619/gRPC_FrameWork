package com.grpc.request;

import com.anand.grpc.UserServiceOuterClass;
import com.grpc.response.AddUserResponse;
import com.grpc.utils.ReportManager;
import io.grpc.StatusRuntimeException;

import javax.net.ssl.SSLEngineResult;

public class GetUserByIdRequest extends RequestBase{

    public static UserServiceOuterClass.GetUserByIdRequest.Response getUserByIdResponse;

    UserServiceOuterClass.GetUserByIdRequest getUserByIdRequest;


    public void setIdFromAddUser() {
        getUserByIdRequest = UserServiceOuterClass.GetUserByIdRequest.newBuilder()
                .setId(AddUserResponse.userId + "")
                .build();
    }

    public void callGetUserById() {

        try {
            getUserByIdResponse = stub.getUserById(getUserByIdRequest);
            System.out.println(SSLEngineResult.Status.OK);
        } catch (StatusRuntimeException status) {
            System.out.println("status code :"+status.getStatus().getCode().value());
            ReportManager.writeText("status code :"+status.getStatus().getCode().value());
        }
    }

    public static UserServiceOuterClass.GetUserByIdRequest.Response getGetUserById() {
        return getUserByIdResponse;
    }
}
