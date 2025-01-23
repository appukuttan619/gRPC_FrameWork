package com.grpc.request;

import com.anand.grpc.UserServiceOuterClass;
import com.grpc.response.ResponseBase;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;

public class AddUserRequest extends RequestBase{

    UserServiceOuterClass.AddUserRequest addUserRequest;

    private static UserServiceOuterClass.AddUserRequest.Response addUserResponse;

    public void setUserNameAndHobby(String name, String hobby) {
        addUserRequest = UserServiceOuterClass.AddUserRequest.newBuilder()
                .setName(name)
                .addHobbies(hobby)
                .build();
    }

    public void callAddUser() {
        try {
            addUserResponse = stub.addUser(addUserRequest);

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


    public static UserServiceOuterClass.AddUserRequest.Response getAddUserResponse(){
//        System.out.println("lksjdflskjdflksjdflksjdlfkj");
//
//        System.out.println(addUserResponse.getUser().getName());
        return addUserResponse;
    }
}
