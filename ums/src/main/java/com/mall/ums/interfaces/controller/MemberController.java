package com.mall.ums.interfaces.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wcy
 */
@RequestMapping("/member")
@RestController
public class MemberController {

//    @Autowired
//    private IAccountService accountService;
//
//    @PostMapping("/register")
//    public RestResult<?> register(@Validated MemberRegisterForm memberRegister) {
//        accountService.registerMember(memberRegister.convert2Dto());
//        return RestResult.success();
//    }
}
