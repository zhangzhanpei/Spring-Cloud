package app.Config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    // 使用 @Value 注解，通过 ${} 取得配置文件中的值
    @Value("${spring.jackson.time-zone}")
    private String timeZone;

    @Value("${spring.jackson.date-format}")
    private String dateFormat;

    public String getTimeZone() {
        return timeZone;
    }

    public String getDateFormat() {
        return dateFormat;
    }
}
