package com.grpc.request;

import com.anand.grpc.UserServiceOuterClass;

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
        addUserResponse = stub.addUser(addUserRequest);

    }


    public static UserServiceOuterClass.AddUserRequest.Response getAddUserResponse(){
//        System.out.println("lksjdflskjdflksjdflksjdlfkj");
//
//        System.out.println(addUserResponse.getUser().getName());
        return addUserResponse;
    }
}
