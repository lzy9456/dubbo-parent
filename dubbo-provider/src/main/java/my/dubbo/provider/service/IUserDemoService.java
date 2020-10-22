package my.dubbo.provider.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import my.dubbo.provider.entity.User;
import my.dubbo.provider.entity.dto.UserDTO;

import java.util.List;


/**
 * @Description
 *
 * @Author _lizy
 * @Date 2020/10/19 22:39
 */
public interface IUserDemoService {
    User getUser(Integer id);
    IPage<User> getUserPage(UserDTO userDTO);
//    Integer countByName(String name);
//    List<User> findByName(String name);
}
