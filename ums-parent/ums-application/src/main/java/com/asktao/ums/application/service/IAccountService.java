package com.asktao.ums.application.service;

import com.asktao.lib.domain.UserDto;
import com.asktao.ums.application.cmd.AdminAccountRegisterCmd;
import com.asktao.ums.application.cmd.LoginCmd;
import com.asktao.ums.application.cmd.MemberRegisterCmd;
import com.asktao.ums.domain.member.entity.Member;
import com.asktao.ums.dto.AdminInfoCO;
import org.springframework.http.ResponseEntity;

/**
 * 账户相关
 *
 * @author wcy
 */
public interface IAccountService {

    /**
     * 门户会员、后台管理员登录
     *
     * @param loginCmd 登录信息
     * @return token信息
     */
    ResponseEntity<?> login(LoginCmd loginCmd);

    /**
     * 后台管理员注册
     *
     * @param accountRegisterCmd 注册信息
     */
    void registerAdmin(AdminAccountRegisterCmd accountRegisterCmd);

    AdminInfoCO getAdminRoles(String uid);

    UserDto loadAdmin(String username);
}
