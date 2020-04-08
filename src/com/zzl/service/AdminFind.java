package com.zzl.service;

import com.zzl.domain.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ����Ա����ѧ����Ϣ
 * @author Administrator
 *
 */
public class AdminFind {
    private static HashMap<Integer, Student> students = InitialSystem.getStudents();
	/**
	 * ��ѧ�Ų���
	 * @param id
	 */
	public static void findByid(int id){
		System.out.println("ѧ��Ϊ"+id+"��ѧ����Ϣ����:");
        try {
            students.get(id).getInfo();
        } catch (Exception e) {
            System.out.println("û��idΪ"+id+"��ѧ����");
        }
    }
	public static void findByName(String name){
        System.out.println("����Ϊ"+name+"��ѧ����Ϣ����:");
        for (Map.Entry<Integer, Student> entry:
                students.entrySet()){
            Student student = entry.getValue();
            // ģ����ѯ
            if(student.getName().contains(name)){
                try {
                    student.getInfo();
                } catch (Exception e) {
                    System.out.println("û������Ϊ"+name+"��ѧ����");
                }
            }
        }
	}
	/**
	 * ��רҵ����
	 * @param majorName
	 */
	public static void findByMajor(String majorName){
        System.out.println("רҵΪ"+majorName+"��ѧ����Ϣ����:");
        for (Map.Entry<Integer, Student> entry:
                students.entrySet()){
            Student student = entry.getValue();
            // ģ����ѯ
            if(student.getMajor().contains(majorName)){
                try {
                    student.getInfo();
                } catch (Exception e) {
                    System.out.println("û��רҵΪ"+majorName+"��ѧ����");
                }
            }
        }
	}
	/**
	 * ���Ա����
	 * @param sex
	 */
	public static void findBySex(String sex){
        System.out.println("�Ա�Ϊ"+sex+"��ѧ����Ϣ����:");
        for (Map.Entry<Integer, Student> entry:
                students.entrySet()){
            Student student = entry.getValue();
            if(student.getSex().equals(sex)){
                try {
                    student.getInfo();
                } catch (Exception e) {
                    System.out.println("û���Ա�Ϊ"+sex+"��ѧ��!");
                }
            }
        }
	}
	/**
	 * ���༶����
	 * @param majorName
	 * @param grade
	 */
	public static void findByClass(String majorName,int grade,int sclass){
	    System.out.println("�༶Ϊ"+majorName+grade+"��"+sclass+"���ѧ����Ϣ����:");
        for (Map.Entry<Integer, Student> entry:
                students.entrySet()){
            Student student = entry.getValue();
            if(student.getMajor().contains(majorName)&&student.getGrade()==grade&&student.getSclass()==sclass){
                try {
                    student.getInfo();
                } catch (Exception e) {
                    System.out.println("û�з���������ѧ����");
                }
            }
        }

	}
	/**
	 * ��ѧԺ����
	 * @param institution
	 */
	public static void findByInstitution(String institution){
        System.out.println("ѧԺΪ"+institution+"��ѧ����Ϣ����:");
        for (Map.Entry<Integer, Student> entry:
                students.entrySet()){
            Student student = entry.getValue();
            if(student.getInstitution().equals(institution)){
                try {
                    student.getInfo();
                } catch (Exception e) {
                    System.out.println("û��ѧԺΪ"+institution+"��ѧ��!");
                }
            }
        }
	}
	public static List<Student> getlist(){
		return null;
	}
}
