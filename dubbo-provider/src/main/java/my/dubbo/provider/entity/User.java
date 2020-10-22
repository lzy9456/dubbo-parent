package my.dubbo.provider.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author _lizy
 * @version 1.0
 * @description 用户
 * @date 2020/10/17 20:53
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 9093812076747311903L;

    private Integer id;
    private String name;
    private Integer age;
    private String createTime;





    public User setId(Integer id) {
        this.id = id;
        return this;
    }
    public User setName(String name) {
        this.name = name;
        return this;
    }
    public User setAge(Integer age) {
        this.age = age;
        return this;
    }
    public User setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
}
