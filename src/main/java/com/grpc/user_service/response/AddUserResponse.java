package com.grpc.user_service.response;

public class AddUserResponse extends ResponseBase{

    public static int userId;


    public boolean isNameAndHobbySame(String name, String hobby) {
        return addUserResponse.getUser().getName().equals(name) && addUserResponse.getUser().getHobbies(0).equals(hobby);

    }

    public void storeId() {
        userId = Integer.parseInt(addUserResponse.getUser().getId());
//        userId = 500;
        System.out.println(userId);
    }
}
