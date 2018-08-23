package app.Mapper;

import org.apache.ibatis.jdbc.SQL;

public class UserMapperSql {
    public static String findUserByName(final String username) {
        // return new SQL() {{
        //     SELECT("*");
        //     FROM("users");
        //     WHERE("username = #{username}");
        // }}.toString();
        return "select * from user where username = #{username}";
    }
}
