package com.zzl.service;

import java.util.Scanner;

import com.zzl.test.TestSystem;

/**
 * 工作界面
 */
public class FunctionView {
	/**
	 * 管理员功能展示模块
	 */
	@SuppressWarnings("resource")
	public static void functionView(boolean isAdmin){
		Scanner input=new Scanner(System.in);
		if(isAdmin){
			System.out.println("1.添加学生");
			System.out.println("2.移除学生");
			System.out.println("3.查询学生");
			System.out.println("4.修改学生信息");
			System.out.print("请选择:");
			int choose=input.nextInt();
			switch(choose){
			case 1:{
					System.out.println("添加学生**************");
					System.out.println("填写学生基本信息");
					System.out.print("学号:");int id=input.nextInt();
					System.out.print("姓名:");String name=input.next();
					System.out.print("性别:");String sex=input.next();
					System.out.print("班级:");int sclass=input.nextInt();
					System.out.print("专业:");	String major=input.next();
					System.out.print("学院:");	String institution=input.next();
					System.out.print("年级:");	int grade=input.nextInt();
					System.out.print("出生年月(1999-12-1):");String birthday=input.next();
					RegStudent.registerStu(id,name,sex,sclass,major,institution,grade,birthday,0l,"",0,"在读");
				}break;
			case 2:{
					System.out.println("移除学生**************");
					System.out.print("请输入删除学生学号:");int num=input.nextInt();
					DropStudent.delete(num);
				}break;
			case 3:{
					System.out.println("查询学生************");
					System.out.println("1.按学号查找"+"\n"+
										"2.按姓名查找"+"\n"+
										"3.按专业查找"+"\n"+
										"4.按院系查找"+"\n"+
										"5.按性别查找"+"\n"+
										"6.按班级查找"+"\n");
					System.out.print("请选择:");
					int choose2=input.nextInt();
					switch(choose2){
						case 1:{
							System.out.println("查找学号:");int id=input.nextInt();
							AdminFind.findByid(id);
							}break;
						case 2:{
							System.out.println("查找姓名:");String name=input.next();
							AdminFind.findByName(name);
						}break;
						case 3:{
							System.out.println("查找专业:");String major=input.next();
							AdminFind.findByMajor(major);
						}break;
						case 4:{
							System.out.println("查找院系:");String institution=input.next();
							AdminFind.findByInstitution(institution);
						}break;
						case 5:{
							System.out.println("查找性别:");String sex=input.next();
							AdminFind.findBySex(sex);
						}break;
						case 6:{
							System.out.println("查找班级:");
							System.out.println("专业");String major=input.next();
							System.out.println("年级号");int grade=input.nextInt();
							System.out.println("班级号");int sclass=input.nextInt();
							AdminFind.findByClass(major, grade, sclass);
						}break;
					}
				}break;
			case 4:{
					System.out.println("请输入要修改学生的学号:");int id=input.nextInt();
					AdminUpdateStudent.updateStu(id);
				}break;
			}
		}
		//学生管理界面
		else{
			System.out.println("1.查询自己信息");
			System.out.println("2.修改信息");
			System.out.print("请选择(1/2):");
			switch(input.nextInt()){
			case 1:{
					StuFind.findByid(TestSystem.logid);
                    break;
				}
			case 2:{
					StuUpdateSelf.updateStu(TestSystem.logid);
                    break;
			    }
			}
		}
	}
}
