package com.zzl.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Scanner;
import com.zzl.domain.Student;

/**
 * �޸�ѧ��������Ϣ
 * ֻ��ͨ��ѧ���޸�ѧ����Ϣ
 * @author Administrator
 *
 */
public class AdminUpdateStudent {
    private static HashMap<Integer, Student> students = InitialSystem.getStudents();
	public static void updateStu(int id) {
	    if(!StuFind.existStu(id)){
            System.out.println("û��ѧ��Ϊ"+id+"��ѧ�����޸�ʧ�ܣ�");
            return;
        }
		System.out.println("********��ѡ���޸ĵ�����**********");
		System.out.println("1.�޸�����"+"\n"+
							"2.�޸��Ա�"+"\n"+
							"3.�޸İ༶"+"\n"+
							"4.�޸�רҵ"+"\n"+
							"5.�޸�ѧԺ"+"\n"+
							"6.�޸��꼶"+"\n"+
							"7.�޸ĳ�������"+"\n");
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.print("��ѡ��:");
		switch(input.nextInt()){
		case 1:{
			System.out.print("������Ҫ�޸ĵ�����:");
			String rename=input.next();
            students.get(id).setName(rename);
				}break;
		case 2:{
			System.out.print("������Ҫ�޸ĵ��Ա�:");
			String resex=input.next();
            students.get(id).setSex(resex);
				}break;
		case 3:{
			System.out.print("������Ҫ�޸ĵİ༶:");
			int recla=input.nextInt();
            students.get(id).setSclass(recla);
				}break;
		case 4:{
			System.out.print("������Ҫ�޸ĵ�רҵ:");
			String remajor=input.next();
            students.get(id).setMajor(remajor);
				}break;
		case 5:{
			System.out.print("������Ҫ�޸ĵ�ѧԺ:");
			String reins=input.next();
            students.get(id).setInstitution(reins);
				}break;
		case 6:{
			System.out.print("������Ҫ�޸ĵ��꼶:");
			int regrade=input.nextInt();
            students.get(id).setGrade(regrade);
				}break;
		case 7:{
			System.out.print("������Ҫ�޸ĵ�����(2018-08-02):");
			String rebirth=input.next();
            try {
                students.get(id).setBirthday(new SimpleDateFormat("yyyy-mm-dd").parse(rebirth));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }break;
		}
        System.out.println("�޸ĳɹ�������");
	}
}
