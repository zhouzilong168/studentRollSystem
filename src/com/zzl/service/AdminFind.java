package com.zzl.service;

import com.zzl.domain.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 管理员查找学生信息
 * @author Administrator
 *
 */
public class AdminFind {
    private static HashMap<Integer, Student> students = InitialSystem.getStudents();
	/**
	 * 按学号查找
	 * @param id
	 */
	public static void findByid(int id){
		System.out.println("学号为"+id+"的学生信息如下:");
        try {
            students.get(id).getInfo();
        } catch (Exception e) {
            System.out.println("没有id为"+id+"的学生！");
        }
    }
	public static void findByName(String name){
        System.out.println("名字为"+name+"的学生信息如下:");
        for (Map.Entry<Integer, Student> entry:
                students.entrySet()){
            Student student = entry.getValue();
            // 模糊查询
            if(student.getName().contains(name)){
                try {
                    student.getInfo();
                } catch (Exception e) {
                    System.out.println("没有姓名为"+name+"的学生！");
                }
            }
        }
	}
	/**
	 * 按专业查找
	 * @param majorName
	 */
	public static void findByMajor(String majorName){
        System.out.println("专业为"+majorName+"的学生信息如下:");
        for (Map.Entry<Integer, Student> entry:
                students.entrySet()){
            Student student = entry.getValue();
            // 模糊查询
            if(student.getMajor().contains(majorName)){
                try {
                    student.getInfo();
                } catch (Exception e) {
                    System.out.println("没有专业为"+majorName+"的学生！");
                }
            }
        }
	}
	/**
	 * 按性别查找
	 * @param sex
	 */
	public static void findBySex(String sex){
        System.out.println("性别为"+sex+"的学生信息如下:");
        for (Map.Entry<Integer, Student> entry:
                students.entrySet()){
            Student student = entry.getValue();
            if(student.getSex().equals(sex)){
                try {
                    student.getInfo();
                } catch (Exception e) {
                    System.out.println("没有性别为"+sex+"的学生!");
                }
            }
        }
	}
	/**
	 * 按班级查找
	 * @param majorName
	 * @param grade
	 */
	public static void findByClass(String majorName,int grade,int sclass){
	    System.out.println("班级为"+majorName+grade+"级"+sclass+"班的学生信息如下:");
        for (Map.Entry<Integer, Student> entry:
                students.entrySet()){
            Student student = entry.getValue();
            if(student.getMajor().contains(majorName)&&student.getGrade()==grade&&student.getSclass()==sclass){
                try {
                    student.getInfo();
                } catch (Exception e) {
                    System.out.println("没有符合条件的学生！");
                }
            }
        }

	}
	/**
	 * 按学院查找
	 * @param institution
	 */
	public static void findByInstitution(String institution){
        System.out.println("学院为"+institution+"的学生信息如下:");
        for (Map.Entry<Integer, Student> entry:
                students.entrySet()){
            Student student = entry.getValue();
            if(student.getInstitution().equals(institution)){
                try {
                    student.getInfo();
                } catch (Exception e) {
                    System.out.println("没有学院为"+institution+"的学生!");
                }
            }
        }
	}
	public static List<Student> getlist(){
		return null;
	}
}
