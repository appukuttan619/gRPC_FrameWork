package com.grpc.request;

import com.anand.grpc.UserServiceOuterClass;
import com.grpc.response.AddUserResponse;
import com.grpc.response.ResponseBase;
import com.grpc.utils.ReportManager;
import io.grpc.Status;
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
            System.out.println(Status.OK.getCode().value());

            // updating the status code for ok
            ResponseBase.statusCode = Status.OK.getCode().value();
            ResponseBase.status = Status.OK.getCode() + "";
            System.out.println("-----------------"+Status.OK.getCode());

        } catch (StatusRuntimeException status) {
            System.out.println("status code :"+status.getStatus().getCode().value());
//            ReportManager.writeText("status code :"+status.getStatus().getCode().value());

            // updating the status code field declared inside the response base
            ResponseBase.statusCode = status.getStatus().getCode().value();
            ResponseBase.status = status.getStatus().getCode() + "";
        }
    }

    public static UserServiceOuterClass.GetUserByIdRequest.Response getGetUserById() {
        return getUserByIdResponse;
    }
}
