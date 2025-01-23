package fr.chat.sitechatperdu.bll;

public class ServiceResponse<T> {

    private String code;
    private String message;
    private T data;

    public ServiceResponse(String code, String message) {
        this.code = code;
        this.message = message;
        this.data = null;
    }

    public ServiceResponse(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }
}
