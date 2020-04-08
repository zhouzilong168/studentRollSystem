package com.zzl.domain;

import java.util.Date;

/**
 * 学生类
 * @author Administrator
 *
 */
public class Student {
	private int id;
	private String name;
	private String sex;
	private int sclass;
	private String major;
	private String institution;
	private int grade;
	private Date birthday;
	private long tel;
	private String email;
	private int qq;
	public Student() {
	}
	public Student(int id, String name, String sex, int sclass, String major, String institution, int grade,
			Date birthday, long tel, String email, int qq) {
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.sclass = sclass;
		this.major = major;
		this.institution = institution;
		this.grade = grade;
		this.birthday = birthday;
		this.tel = tel;
		this.email = email;
		this.qq = qq;
	}
    public Student(Student student) {
        this.id = student.getId();
        this.name = student.getName();
        this.sex = student.getSex();
        this.sclass = student.getSclass();
        this.major = student.getMajor();
        this.institution = student.getInstitution();
        this.grade = student.getGrade();
        this.birthday = student.getBirthday();
        this.tel = student.getTel();
        this.email = student.getEmail();
        this.qq = student.getQq();
    }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getSclass() {
		return sclass;
	}
	public void setSclass(int sclass) {
		this.sclass = sclass;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getInstitution() {
		return institution;
	}
	public void setInstitution(String institution) {
		this.institution = institution;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public long getTel() {
		return tel;
	}
	public void setTel(long tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getQq() {
		return qq;
	}
	public void setQq(int qq) {
		this.qq = qq;
	}

	public void getInfo(){

		System.out.println("学号:"+this.id+"\n"+
		"姓名:"+this.name+"\n"+
		"性别:"+this.sex+"\n"+
		"班级:"+this.sclass+"\n"+
		"专业:"+this.major+"\n"+
		"学院:"+this.institution+"\n"+
		"年级:"+this.grade+"\n"+
		"出生年月:"+this.birthday+"\n"+
		"手机号码:"+this.tel+"\n"+
		"邮箱:"+this.email+"\n"+
		"QQ:"+this.qq);


	}
}
