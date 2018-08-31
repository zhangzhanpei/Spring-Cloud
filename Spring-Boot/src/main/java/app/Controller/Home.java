package app.Controller;

import app.Aop.Annotation.Timer;
import app.Exception.MyException;
import org.springframework.web.bind.annotation.*;

@RestController
public class Home {
    @GetMapping("/")
    public String index() throws Exception {
        // 抛出自定义异常
        throw new MyException(404, "Spring Boot 统一错误处理");
        // 抛出其他异常
        // throw new RuntimeException("RuntimeException");
    }

    @GetMapping("/aop")
    @Timer
    public String aop() {
        System.out.println("aop");
        return "aop";
    }

    @GetMapping("/params/{id:\\d+}")
    public void params(@PathVariable int id, @RequestParam(value = "nickname", required = false) String queryString) {
        System.out.println(id);
        System.out.println(queryString);
    }
}
