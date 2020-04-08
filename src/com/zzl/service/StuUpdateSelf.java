package com.zzl.service;

import com.zzl.domain.StuLogin;
import com.zzl.domain.Student;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 学生修改自己信息
 * @author Administrator
 *
 */
public class StuUpdateSelf {
    private static HashMap<Integer, Student> students = InitialSystem.getStudents();
    private static Set<StuLogin> stuLogins = new HashSet<>();
	public static void updateStu(int id){
		System.out.println("********请选择修改的内容**********");
		System.out.println("1.修改密码"+"\n"+
							"2.修改手机号"+"\n"+
							"3.修改邮箱"+"\n"+
							"4.修改qq号"+"\n");
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.print("请选择(1/2/3/4):");
		switch(input.nextInt()){
		case 1: {
            System.out.print("请输入要修改的密码:");
            String repwd = input.next();
            for (StuLogin sl :
                    stuLogins) {
                if (sl.getId() == id) {
                    sl.setPassword(repwd);
                    System.out.println("修改成功！");
                }
            }
            break;
        }
		case 2: {
            System.out.print("请输入要修改的手机号:");
            long retel = input.nextLong();
            students.get(id).setTel(retel);
            System.out.println("修改成功！");
            break;
        }
		case 3: {
            System.out.print("请输入要修改的邮箱:");
            String reemail = input.next();
            students.get(id).setEmail(reemail);
            System.out.println("修改成功！");
            break;
        }
		case 4: {
            System.out.print("请输入要修改的QQ:");
            int reqq = input.nextInt();
            students.get(id).setQq(reqq);
            System.out.println("修改成功！");
            break;
        }
		}
	}
}
