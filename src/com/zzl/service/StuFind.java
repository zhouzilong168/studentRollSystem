package com.zzl.service;

import com.zzl.domain.Student;

import java.util.HashMap;

/**
 * ѧ�������鿴�Լ�������Ϣ
 * @author Administrator
 *
 */
public class StuFind {
    // �õ�ģ�����ݿ�mapѧ����Ϣ
    private static HashMap<Integer, Student> students = InitialSystem.getStudents();
	/**
	 * ��ѧ�Ų���
	 * @param id
	 */
	public static void findByid(int id){
	    // �����쳣�򻯴���
        try {
            students.get(id).getInfo();
        } catch (Exception e) {
            System.out.println("û�д�id��ѧ����");
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
