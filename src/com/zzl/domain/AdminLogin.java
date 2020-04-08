package com.zzl.domain;
/**
 * 管理员登录信息
 * @author Administrator
 *
 */
public class AdminLogin {
	private int admin;
	private String password;
	public AdminLogin() {
	}
	public AdminLogin(int admin, String password) {
		super();
		this.admin = admin;
		this.password = password;
	}
	public int getAdmin() {
		return admin;
	}
	public void setAdmin(int admin) {
		this.admin = admin;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

    @Override
    public String toString() {
        return "AdminLogin{" +
                "admin=" + admin +
                ", password='" + password + '\'' +
                '}';
    }
}
