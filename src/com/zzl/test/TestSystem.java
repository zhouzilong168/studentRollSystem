package com.zzl.test;
import java.util.Scanner;

import com.zzl.service.FunctionView;
import com.zzl.service.InitialSystem;
import com.zzl.service.LoginSystem;
/**
 * 学籍管理系统客户端界面
 * @author Administrator
 *
 */
public class TestSystem {
	public static int logid=0;
	static String logpwd="";
	static boolean isAdmin=false;
    static {
        // 静态初始化
        InitialSystem.initialSys();
    }

    /**
     * 启动系统，入口界面
     */
	public static void start() {
//        InitialSystem.test();
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.println("*********武理学籍管理系统（精简版）***********");
		System.out.println("********登录系统********");
		//账号密码
        boolean state = false;
		while(!state){
			System.out.print("账号:");
			logid=input.nextInt();
			System.out.print("密码:");
			logpwd=input.next();
			System.out.println("是否管理员（y/n）:");
			isAdmin=input.next().equalsIgnoreCase("y");
			if(LoginSystem.login(logid, logpwd, isAdmin)){
			    state=true;
            }else {
                System.out.println("是否退出登录？（y/n）");
                state= input.next().equalsIgnoreCase("y");
                if(state){ return;}
            }
		}
		//是管理员
		if(isAdmin){
			boolean continueDo=true;//是否继续操作
			while(continueDo){
				FunctionView.functionView(isAdmin);
				System.out.print("是否继续操作（y/n）?");String how=input.next();
				continueDo=how.equalsIgnoreCase("y");
			}
			System.out.println("退出系统成功!");
		}
		//不是管理员
		else{
			boolean continueDo=true;//是否继续操作
			while(continueDo){
				FunctionView.functionView(isAdmin);
				System.out.print("是否继续操作（y/n）?");String how=input.next();
				continueDo=how.equalsIgnoreCase("y");
			}
			System.out.println("退出系统成功!");
		}
	}
}
