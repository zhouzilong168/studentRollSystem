package com.zzl.service;

import com.zzl.domain.StuLogin;
import com.zzl.domain.Student;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * ѧ���޸��Լ���Ϣ
 * @author Administrator
 *
 */
public class StuUpdateSelf {
    private static HashMap<Integer, Student> students = InitialSystem.getStudents();
    private static Set<StuLogin> stuLogins = new HashSet<>();
	public static void updateStu(int id){
		System.out.println("********��ѡ���޸ĵ�����**********");
		System.out.println("1.�޸�����"+"\n"+
							"2.�޸��ֻ���"+"\n"+
							"3.�޸�����"+"\n"+
							"4.�޸�qq��"+"\n");
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.print("��ѡ��(1/2/3/4):");
		switch(input.nextInt()){
		case 1: {
            System.out.print("������Ҫ�޸ĵ�����:");
            String repwd = input.next();
            for (StuLogin sl :
                    stuLogins) {
                if (sl.getId() == id) {
                    sl.setPassword(repwd);
                    System.out.println("�޸ĳɹ���");
                }
            }
            break;
        }
		case 2: {
            System.out.print("������Ҫ�޸ĵ��ֻ���:");
            long retel = input.nextLong();
            students.get(id).setTel(retel);
            System.out.println("�޸ĳɹ���");
            break;
        }
		case 3: {
            System.out.print("������Ҫ�޸ĵ�����:");
            String reemail = input.next();
            students.get(id).setEmail(reemail);
            System.out.println("�޸ĳɹ���");
            break;
        }
		case 4: {
            System.out.print("������Ҫ�޸ĵ�QQ:");
            int reqq = input.nextInt();
            students.get(id).setQq(reqq);
            System.out.println("�޸ĳɹ���");
            break;
        }
		}
	}
}
