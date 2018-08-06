package app.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import app.Exception.MyException;

@Controller
public class Home {
    @ResponseBody
    @GetMapping("/")
    public String index() throws Exception {
        // 抛出自定义异常
        throw new MyException(404, "Spring Boot 同一错误处理");
        // 抛出其他异常
        // throw new RuntimeException("RuntimeException");
    }
}