package com.zzl.service;

import com.zzl.domain.AdminLogin;
import com.zzl.domain.StuLogin;

import java.util.Set;

/**
 * 登录系统
 */
public class LoginSystem {
    // 得到登录数据，方便下面操作
    private static Set<StuLogin> stuLogins = InitialSystem.getStuLogins();
    private static Set<AdminLogin> adminLogins = InitialSystem.getAdminLogins();
    /**
     * 登录系统
     *
     * @param id：账号
     * @param password：密码
     * @param isAdmin：是否管理员
     * @return
     */
    public static boolean login(int id, String password, boolean isAdmin) {
        //管理员
        if (isAdmin) {
            System.out.println("*********管理员登录******");
            String realPwd = "";
            for (AdminLogin al :
                    adminLogins) {
                if (al.getAdmin() == id) {
                    realPwd = al.getPassword();
                    break;
                }
            }
            if (password.equals(realPwd)) {
                System.out.println("****登录成功!****");
                return true;
            } else {
                System.err.println("账号或者密码错误!");
            }
        } else {
            System.out.println("*******学生登录*********");
            String realPwd = "";
            for (StuLogin sl :
                    stuLogins) {
                if (sl.getId() == id) {
                    realPwd = sl.getPassword();
                    break;
                }
            }
            if (password.equals(realPwd)) {
                System.out.println("****登录成功****");
                return true;
            } else {
                System.out.println("账号或者密码错误!请重新输入");
            }
        }
        return false;
    }
}
