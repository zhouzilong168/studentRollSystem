package com.zzl.service;

import com.zzl.domain.AdminLogin;
import com.zzl.domain.StuLogin;

import java.util.Set;

/**
 * ��¼ϵͳ
 */
public class LoginSystem {
    // �õ���¼���ݣ������������
    private static Set<StuLogin> stuLogins = InitialSystem.getStuLogins();
    private static Set<AdminLogin> adminLogins = InitialSystem.getAdminLogins();
    /**
     * ��¼ϵͳ
     *
     * @param id���˺�
     * @param password������
     * @param isAdmin���Ƿ����Ա
     * @return
     */
    public static boolean login(int id, String password, boolean isAdmin) {
        //����Ա
        if (isAdmin) {
            System.out.println("*********����Ա��¼******");
            String realPwd = "";
            for (AdminLogin al :
                    adminLogins) {
                if (al.getAdmin() == id) {
                    realPwd = al.getPassword();
                    break;
                }
            }
            if (password.equals(realPwd)) {
                System.out.println("****��¼�ɹ�!****");
                return true;
            } else {
                System.err.println("�˺Ż����������!");
            }
        } else {
            System.out.println("*******ѧ����¼*********");
            String realPwd = "";
            for (StuLogin sl :
                    stuLogins) {
                if (sl.getId() == id) {
                    realPwd = sl.getPassword();
                    break;
                }
            }
            if (password.equals(realPwd)) {
                System.out.println("****��¼�ɹ�****");
                return true;
            } else {
                System.out.println("�˺Ż����������!����������");
            }
        }
        return false;
    }
}
