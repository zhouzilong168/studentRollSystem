package com.zzl.service;

import com.zzl.domain.Student;

import java.util.HashMap;

/**
 * 学生登入后查看自己基本信息
 * @author Administrator
 *
 */
public class StuFind {
    // 得到模拟数据库map学生信息
    private static HashMap<Integer, Student> students = InitialSystem.getStudents();
	/**
	 * 按学号查找
	 * @param id
	 */
	public static void findByid(int id){
	    // 利用异常简化代码
        try {
            students.get(id).getInfo();
        } catch (Exception e) {
            System.out.println("没有此id的学生！");
            e.printStackTrace();
        }
    }
    public static boolean existStu(int id){
	    if(students.get(id)==null){
	        return false;
        }else {
	        return true;
        }
    }
}
