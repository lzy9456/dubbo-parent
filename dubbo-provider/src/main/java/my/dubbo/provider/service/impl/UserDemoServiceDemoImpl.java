package my.dubbo.provider.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import my.dubbo.provider.dao.ExtUserMapper;
import my.dubbo.provider.dao.auto.UserMapper;
import my.dubbo.provider.entity.User;
import my.dubbo.provider.entity.dto.UserDTO;
import my.dubbo.provider.service.IUserDemoService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Objects;

/**
 * @author _lizy
 * @version 1.0
 * @description user service
 * @date 2020/10/17 20:50
 */
@DubboService(version = "1.0.0")
public class UserDemoServiceDemoImpl implements IUserDemoService {


    /**
     * @Description
     *      @Resource extUserMapper,byName注入，须严格命名属性名,userMapper会报错
     *      Autowired byType注入
     * @param null
     * @Return
     * @Author _lizy
     * @Date 2020/10/21 17:25
     */
    @Autowired
    private UserMapper userMapper;


    @Override
    public User getUser(Integer id) {
        User user = userMapper.selectById(199);
        return user;
    }


    @Override
    public IPage<User> getUserPage(UserDTO userDTO) {
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Objects.nonNull(userDTO.getAge()), User::getAge, userDTO.getAge());
        queryWrapper.eq(Objects.nonNull(userDTO.getId()), User::getId, userDTO.getId());
        queryWrapper.eq(Objects.isNull(userDTO.getNameLike()) && Objects.nonNull(userDTO.getName()), User::getName, userDTO.getName());
        queryWrapper.like(Objects.nonNull(userDTO.getNameLike()), User::getName, userDTO.getNameLike());

        return userMapper.selectPage(userDTO.getPage(), queryWrapper);
    }


//    @Override
//    public Integer countByName(String name) {
//        return userMapper.countByName(name);
//    }
//
//    @Override
//    public List<User> findByName(String name) {
//        return userMapper.findByName(name);
//    }


}
