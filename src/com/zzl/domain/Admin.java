package com.zzl.domain;
/**
 * ����Ա��
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
        System.out.println("����Ա"+admin);
        super.getInfo();
    }

    public int getAdmin() {
        return admin;
    }

    public void setAdmin(int admin) {
        this.admin = admin;
    }
}
