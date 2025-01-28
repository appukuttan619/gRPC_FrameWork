package com.grpc.user_service.request;

import com.anand.grpc.UserServiceOuterClass;
import com.grpc.user_service.response.AddUserResponse;
import com.grpc.user_service.response.ResponseBase;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;

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
