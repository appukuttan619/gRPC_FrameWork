package com.grpc.user_service.response;

import com.anand.grpc.UserServiceOuterClass;

import java.util.List;

public class GetAllUsersResponse extends ResponseBase{

    public void displayAllUsers() {
        List<UserServiceOuterClass.User> users = getAllUsersResponse.getUsersList();

        for(UserServiceOuterClass.User user : users){
//            System.out.println(user);
        }
    }
}
