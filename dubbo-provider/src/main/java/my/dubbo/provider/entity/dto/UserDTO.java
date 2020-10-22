package my.dubbo.provider.entity.dto;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.Data;

import java.io.Serializable;

/**
 * @author _lizy
 * @version 1.0
 * @description 用户
 * @date 2020/10/17 20:53
 */
@Data
public class UserDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String name;
    private String nameLike;
    private Integer age;
    private Page page;





    public UserDTO setId(Integer id) {
        this.id = id;
        return this;
    }

    public UserDTO setName(String name) {
        this.name = name;
        return this;
    }

    public UserDTO setNameLike(String nameLike) {
        this.nameLike = nameLike;
        return this;
    }

    public UserDTO setPage(Page page) {
        this.page = page;
        return this;
    }

    public UserDTO setAge(Integer age) {
        this.age = age;
        return this;
    }
}
