package app.Controller;

import app.Mapper.UserMapper;
import app.Model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Db {
    @Autowired
    UserMapper userMapper;

    @GetMapping("/user/{id:\\d+}")
    public UserModel getUserInfo(@PathVariable int id) {
        return userMapper.find(id);
    }

    @GetMapping("/get-user-info-by-name/{username}")
    public UserModel getUserInfoByName(@PathVariable String username) {
        return userMapper.findUserByName(username);
    }
}
