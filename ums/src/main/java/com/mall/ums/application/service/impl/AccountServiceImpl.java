package com.mall.ums.application.service.impl;

import com.mall.ums.application.dto.MemberRegisterDTO;
import com.mall.ums.application.service.IAccountService;
import com.mall.ums.domain.member.entity.Member;
import com.mall.ums.dto.MemberInfoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wcy
 */
@Service
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private Member member;

    @Override
    public void registerMember(MemberRegisterDTO memberRegister) {
        member.setRegisterInfo(memberRegister.getRegisterInfo());
        member.register();
    }

    @Override
    public MemberInfoDto memberLogin(String username) {
        return member.login(username);
    }
}
