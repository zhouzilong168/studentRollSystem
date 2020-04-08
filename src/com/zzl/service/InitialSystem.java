package com.zzl.service;

import com.zzl.domain.Admin;
import com.zzl.domain.AdminLogin;
import com.zzl.domain.StuLogin;
import com.zzl.domain.Student;

import java.sql.Date;
import java.util.*;

/**
 * @ClassName InitialSystem
 * @Description TODO
 * @Author thinkpad
 * @Date 2020/3/15 10:04
 * @Version 1.0
 **/
public class InitialSystem {
    // 存储学生信息
    private static HashMap<Integer, Student> students = new HashMap();
    // 存储学生登录信息
    private static Set<StuLogin> stuLogins = new HashSet<>();
    // 存储管理员信息
    private static HashMap<Integer, Admin> admins = new HashMap();
    // 存储管理员登录信息
    private static Set<AdminLogin> adminLogins = new HashSet<>();


    public static void initialSys(){
        Random random = new Random();
        long sub = (long)1000*60*60*24*365*21;
        // 添加学生到map
        for(int i=11;i<20;i++ ){
            students.put(i*10,new Student(i*10, "zilongzhou"+i, "1",
                    1702,"SoftwareEngineering","Computer Science",3,
                    new Date(System.currentTimeMillis()-sub+random.nextInt(1000*60*60*24)*365),
                    Long.parseLong("159271685"+i),"17287015"+i+"@qq.com",17287015+i));
            stuLogins.add(new StuLogin(i*10,"123456"));
        }
        // 添加两个管理员 学号为110 120
        admins.put(11*10,new Admin(11*10,(Student) students.get(11*10)));
        admins.put(12*10,new Admin(12*10,(Student) students.get(12*10)));
        adminLogins.add(new AdminLogin(11*10,"123456"));
        adminLogins.add(new AdminLogin(12*10,"123456"));
    }
    public static HashMap<Integer,Student> getStudents(){
        return students;
    }
    public static HashMap<Integer,Admin> getAdmin(){
        return admins;
    }

    public static Set<StuLogin> getStuLogins() {
        return stuLogins;
    }

    public static Set<AdminLogin> getAdminLogins() {
        return adminLogins;
    }

    public static void test() {
        initialSys();
        for (Map.Entry<Integer,Student> entry: students.entrySet()) {
            entry.getValue().getInfo();
        }
        System.out.println("=========");
        for (Integer i :
                admins.keySet()) {
            admins.get(i).getInfo();
        }
    }
}
