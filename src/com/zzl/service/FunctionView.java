package com.zzl.service;

import java.util.Scanner;

import com.zzl.test.TestSystem;

/**
 * ��������
 */
public class FunctionView {
	/**
	 * ����Ա����չʾģ��
	 */
	@SuppressWarnings("resource")
	public static void functionView(boolean isAdmin){
		Scanner input=new Scanner(System.in);
		if(isAdmin){
			System.out.println("1.���ѧ��");
			System.out.println("2.�Ƴ�ѧ��");
			System.out.println("3.��ѯѧ��");
			System.out.println("4.�޸�ѧ����Ϣ");
			System.out.print("��ѡ��:");
			int choose=input.nextInt();
			switch(choose){
			case 1:{
					System.out.println("���ѧ��**************");
					System.out.println("��дѧ��������Ϣ");
					System.out.print("ѧ��:");int id=input.nextInt();
					System.out.print("����:");String name=input.next();
					System.out.print("�Ա�:");String sex=input.next();
					System.out.print("�༶:");int sclass=input.nextInt();
					System.out.print("רҵ:");	String major=input.next();
					System.out.print("ѧԺ:");	String institution=input.next();
					System.out.print("�꼶:");	int grade=input.nextInt();
					System.out.print("��������(1999-12-1):");String birthday=input.next();
					RegStudent.registerStu(id,name,sex,sclass,major,institution,grade,birthday,0l,"",0,"�ڶ�");
				}break;
			case 2:{
					System.out.println("�Ƴ�ѧ��**************");
					System.out.print("������ɾ��ѧ��ѧ��:");int num=input.nextInt();
					DropStudent.delete(num);
				}break;
			case 3:{
					System.out.println("��ѯѧ��************");
					System.out.println("1.��ѧ�Ų���"+"\n"+
										"2.����������"+"\n"+
										"3.��רҵ����"+"\n"+
										"4.��Ժϵ����"+"\n"+
										"5.���Ա����"+"\n"+
										"6.���༶����"+"\n");
					System.out.print("��ѡ��:");
					int choose2=input.nextInt();
					switch(choose2){
						case 1:{
							System.out.println("����ѧ��:");int id=input.nextInt();
							AdminFind.findByid(id);
							}break;
						case 2:{
							System.out.println("��������:");String name=input.next();
							AdminFind.findByName(name);
						}break;
						case 3:{
							System.out.println("����רҵ:");String major=input.next();
							AdminFind.findByMajor(major);
						}break;
						case 4:{
							System.out.println("����Ժϵ:");String institution=input.next();
							AdminFind.findByInstitution(institution);
						}break;
						case 5:{
							System.out.println("�����Ա�:");String sex=input.next();
							AdminFind.findBySex(sex);
						}break;
						case 6:{
							System.out.println("���Ұ༶:");
							System.out.println("רҵ");String major=input.next();
							System.out.println("�꼶��");int grade=input.nextInt();
							System.out.println("�༶��");int sclass=input.nextInt();
							AdminFind.findByClass(major, grade, sclass);
						}break;
					}
				}break;
			case 4:{
					System.out.println("������Ҫ�޸�ѧ����ѧ��:");int id=input.nextInt();
					AdminUpdateStudent.updateStu(id);
				}break;
			}
		}
		//ѧ���������
		else{
			System.out.println("1.��ѯ�Լ���Ϣ");
			System.out.println("2.�޸���Ϣ");
			System.out.print("��ѡ��(1/2):");
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
