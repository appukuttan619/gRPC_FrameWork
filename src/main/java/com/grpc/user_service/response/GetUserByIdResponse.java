package com.grpc.user_service.response;

public class GetUserByIdResponse extends ResponseBase{


    public boolean isNameSame(String name) {
        return getUserByIdResponse.getUser().getName().equals(name);
    }
}
