package app.Exception;

public class MyException extends Exception {
    private int code;
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * 自定义异常
     * @param code 错误码
     * @param message 异常信息
     */
    public MyException(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
