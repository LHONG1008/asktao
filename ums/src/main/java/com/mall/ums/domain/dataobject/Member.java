package com.mall.ums.domain.dataobject;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author wcy-auto
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@TableName(autoResultMap = true, value = "t_member")
public class Member {

    private String id;

    /**
     * 注册时间
     **/
    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    /**
     * 用户名
     **/
    private String username;

    /**
     * 密码
     **/
    private String password;

    /**
     * 手机号
     **/
    private String phone;

    /**
     * 名字
     **/
    private String name;

    /**
     * 年龄
     **/
    private Integer age;

    /**
     * 性别，0 - 未知，1 - 男，2 - 女
     **/
    private Integer gender;

    /**
     * 账户状态，0 - 删除，1 - 正常，2 - 冻结
     **/
    private Integer status;

    /**
     * 生日
     **/
    private LocalDate birthday;

}
