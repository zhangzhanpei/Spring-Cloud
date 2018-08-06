package app.Controller;

import app.Exception.MyException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class ExceptionHandle {
    // 全局异常捕获
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public Map globalExceptionHandle(Exception e) {
        Map map = new HashMap();
        map.put("code", 500);
        map.put("message", e.getMessage());
        return map;
    }

    // 自定义异常捕获
    @ResponseBody
    @ExceptionHandler(value = MyException.class)
    public Map myExceptionHandle(MyException e) {
        Map map = new HashMap();
        map.put("code", e.getCode());
        map.put("message", e.getMessage());
        return map;
    }
}
