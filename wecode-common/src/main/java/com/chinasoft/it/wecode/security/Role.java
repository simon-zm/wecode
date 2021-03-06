package com.chinasoft.it.wecode.security;

import java.util.Set;

/**
 * 角色
 *
 * @author Administrator
 */
public interface Role {

    /**
     * 获取角色ID
     *
     * @return
     */
    String getId();

    /**
     * 获取角色代码
     *
     * @return
     */
    String getCode();

    /**
     * 获取角色权限列表
     *
     * @return
     */
    Set<String> getPermissionCodeSet();

    /**
     * 是否为系统管理员角色
     * @return
     */
    boolean isSysAdmin();
}
