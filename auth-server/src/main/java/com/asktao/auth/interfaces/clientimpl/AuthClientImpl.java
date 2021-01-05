package com.asktao.auth.interfaces.clientimpl;

import com.asktao.auth.client.IAuthClient;
import com.asktao.auth.dto.LoginCmd;
import com.asktao.lib.domain.RestResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.endpoint.TokenEndpoint;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wcy
 */
@Slf4j
@RestController
public class AuthClientImpl implements IAuthClient {

    @Autowired
    private TokenEndpoint tokenEndpoint;

    @Override
    public RestResponse<?> login(LoginCmd loginCmd) {
        return null;
    }
}
