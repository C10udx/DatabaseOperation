package com.c10udx.entity;

/**
 * <p>
 * 管理员表
 * </p>
 *
 * @author yun.xia
 * @since 2019-06-27
 */
public class Admin {

    private Long id;
    /**
     * 管理员帐号
     */
    private String adminAccount;
    /**
     * 管理员名称
     */
    private String adminName;
    /**
     * 用户权限，9 系统管理员
     */
    private String adminPassword;
    /**
     * 管理员权限
     */
    private Integer adminRole;
    /**
     * 0未删除，1已删除
     */
    private Integer isDel;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdminAccount() {
        return adminAccount;
    }

    public void setAdminAccount(String adminAccount) {
        this.adminAccount = adminAccount;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public Integer getAdminRole() {
        return adminRole;
    }

    public void setAdminRole(Integer adminRole) {
        this.adminRole = adminRole;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    @Override
    public String toString() {
        return "Admin{" +
                ", id=" + id +
                ", adminAccount=" + adminAccount +
                ", adminName=" + adminName +
                ", adminPassword=" + adminPassword +
                ", adminRole=" + adminRole +
                ", isDel=" + isDel +
                "}";
    }
}
