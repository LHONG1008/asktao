package com.asktao.ums.domain.gateway;

import com.asktao.ums.domain.admin.entity.Admin;

/**
 * @author wcy
 */
public interface AdminGateway {

    void insert(Admin admin);

    boolean existForUsername(String username);

    Admin selectByUsername(String username);
}
