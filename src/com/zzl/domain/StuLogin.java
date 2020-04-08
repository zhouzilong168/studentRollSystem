package com.zzl.domain;
/**
 * 学生登录信息
 * @author Administrator
 *
 */
public class StuLogin {
	private int id;
	private String password;
	public StuLogin() {
	}
	public StuLogin(int id, String password) {
		super();
		this.id = id;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

    @Override
    public String toString() {
        return "StuLogin{" +
                "id=" + id +
                ", password='" + password + '\'' +
                '}';
    }
}
