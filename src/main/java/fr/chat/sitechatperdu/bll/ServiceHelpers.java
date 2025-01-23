package fr.chat.sitechatperdu.bll;

public class ServiceHelpers {

    public static <T> ServiceResponse<T> hookLog(ServiceResponse<T> serviceResponse){

        System.out.printf("Code : %s - Message : %s%n", serviceResponse.getCode(), serviceResponse.getMessage());

        return serviceResponse;
    }


}
