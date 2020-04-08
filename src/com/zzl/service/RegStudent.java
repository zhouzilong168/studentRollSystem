package com.zzl.service;

import com.zzl.domain.StuLogin;
import com.zzl.domain.Student;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * 注册学生
 * @author Administrator
 *
 */
public class RegStudent {
    public static SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
	public static void registerStu(int id,String name,String sex,int sclass,String major,String
			institution,int grade,String birthdaya,long tel,String email,int qq,String state) {
        Date birthday = null;
        try {
            birthday = simpleDateFormat.parse(birthdaya);
        } catch (ParseException e) {
            System.out.println("数据格式转换失败,添加失败！");
            return;
        }
        Student student = new Student(id,name,sex,sclass,major,institution,grade,birthday,tel,email,qq);
        InitialSystem.getStudents().put(id,student);
        InitialSystem.getStuLogins().add(new StuLogin(id,"123456"));// 初始密码为123465
        System.out.println("添加学生成功，学生id为："+student.getId());
    }
}
