package com.zzl.domain;
/**
 * 管理员类
 * @author Administrator
 *
 */
@SuppressWarnings("unused")
public class Admin extends Student{
	private int admin;

    public Admin(int admin,Student student) {
        super(student);
        this.admin = admin;
    }

    public void getInfo(){
        System.out.println("管理员"+admin);
        super.getInfo();
    }

    public int getAdmin() {
        return admin;
    }

    public void setAdmin(int admin) {
        this.admin = admin;
    }
}
