package app.Mapper;

import app.Model.UserModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

@Mapper
public interface UserMapper {
    @Select("select * from user where id = #{id}")
    UserModel find(int id);

    @SelectProvider(type = UserMapperSql.class, method = "findUserByName")
    UserModel findUserByName(String name);
}
