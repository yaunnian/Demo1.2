package cn.blb.service;

import cn.blb.mapper.UserMapper;
import cn.blb.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper mapper;
    public User queryById(Long id){
       return mapper.selectByPrimaryKey(id);
    }
}
