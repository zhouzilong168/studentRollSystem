package com.zzl.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Scanner;
import com.zzl.domain.Student;

/**
 * 修改学生基本信息
 * 只能通过学号修改学生信息
 * @author Administrator
 *
 */
public class AdminUpdateStudent {
    private static HashMap<Integer, Student> students = InitialSystem.getStudents();
	public static void updateStu(int id) {
	    if(!StuFind.existStu(id)){
            System.out.println("没有学号为"+id+"的学生，修改失败！");
            return;
        }
		System.out.println("********请选择修改的内容**********");
		System.out.println("1.修改姓名"+"\n"+
							"2.修改性别"+"\n"+
							"3.修改班级"+"\n"+
							"4.修改专业"+"\n"+
							"5.修改学院"+"\n"+
							"6.修改年级"+"\n"+
							"7.修改出生年月"+"\n");
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.print("请选择:");
		switch(input.nextInt()){
		case 1:{
			System.out.print("请输入要修改的姓名:");
			String rename=input.next();
            students.get(id).setName(rename);
				}break;
		case 2:{
			System.out.print("请输入要修改的性别:");
			String resex=input.next();
            students.get(id).setSex(resex);
				}break;
		case 3:{
			System.out.print("请输入要修改的班级:");
			int recla=input.nextInt();
            students.get(id).setSclass(recla);
				}break;
		case 4:{
			System.out.print("请输入要修改的专业:");
			String remajor=input.next();
            students.get(id).setMajor(remajor);
				}break;
		case 5:{
			System.out.print("请输入要修改的学院:");
			String reins=input.next();
            students.get(id).setInstitution(reins);
				}break;
		case 6:{
			System.out.print("请输入要修改的年级:");
			int regrade=input.nextInt();
            students.get(id).setGrade(regrade);
				}break;
		case 7:{
			System.out.print("请输入要修改的生日(2018-08-02):");
			String rebirth=input.next();
            try {
                students.get(id).setBirthday(new SimpleDateFormat("yyyy-mm-dd").parse(rebirth));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }break;
		}
        System.out.println("修改成功！！！");
	}
}
