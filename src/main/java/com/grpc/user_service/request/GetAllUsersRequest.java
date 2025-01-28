package com.grpc.user_service.request;

import com.anand.grpc.UserServiceOuterClass;
import com.grpc.user_service.response.ResponseBase;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;

public class GetAllUsersRequest extends RequestBase{


    UserServiceOuterClass.GetAllUserRequest getAllUserRequest ;
    static UserServiceOuterClass.GetAllUserRequest.Response getAllUserResponse;
    public void callGetAllUsers() {
        getAllUserRequest = UserServiceOuterClass.GetAllUserRequest.newBuilder().build();

        try {
            getAllUserResponse = stub.getAllUser(getAllUserRequest);
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

    public static UserServiceOuterClass.GetAllUserRequest.Response getGetAllUserRsponse(){
        return getAllUserResponse;
    }
}
