package app.Controller;

import app.Config.AnotherConfig;
import app.Config.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ConfigTest {
    @Autowired
    private Environment env;

    @Autowired
    private AppConfig appConfig;

    @Autowired
    private AnotherConfig anotherConfig;

    @ResponseBody
    @GetMapping("/env-get-property")
    public String getProperty() {
        // 通过注入环境对象来获取属性值
        return env.getProperty("spring.jackson.date-format");
    }

    @ResponseBody
    @GetMapping("/config-bean")
    public String configBean() {
        return appConfig.getDateFormat();
    }

    @ResponseBody
    @GetMapping("/another-config")
    public String anotherConfig() {
        return anotherConfig.getAppKey();
    }
}
