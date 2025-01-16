package com.grpc.response;

import com.anand.grpc.UserServiceOuterClass;

public class AddUserResponse extends ResponseBase{

    public static int userId;


    public boolean isNameAndHobbySame(String name, String hobby) {
        return addUserResponse.getUser().getName().equals(name) && addUserResponse.getUser().getHobbies(0).equals(hobby);

    }

    public void storeId() {
        userId = Integer.parseInt(addUserResponse.getUser().getId());
        System.out.println(userId);
    }
}
