package com.zzl.service;

import com.zzl.domain.StuLogin;

import java.util.Set;

/**
 * ɾ��ѧ��������Ϣ
 * ��Ϊֻ��ѧ����Ψһ�ԣ�����ֻ�ܰ���ѧ��ɾ��
 * @author Administrator
 *
 */
public class DropStudent {
    private static Set<StuLogin> stuLogins = InitialSystem.getStuLogins();
	/**
	 * ��ѧ��ɾ��
	 * @param id
	 */
	public static void delete(int id){
        InitialSystem.getStudents().remove(id);
        for (StuLogin sl :
                stuLogins) {
            if (sl.getId()==id){
                stuLogins.remove(sl);
                System.out.println("ɾ��ѧ���ɹ���ѧ��idΪ��"+id);
                return;
            }
        }
        System.out.println("û�����ѧ��������");
	}


}
