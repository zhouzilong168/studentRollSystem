package com.zzl.test;
import java.util.Scanner;

import com.zzl.service.FunctionView;
import com.zzl.service.InitialSystem;
import com.zzl.service.LoginSystem;
/**
 * ѧ������ϵͳ�ͻ��˽���
 * @author Administrator
 *
 */
public class TestSystem {
	public static int logid=0;
	static String logpwd="";
	static boolean isAdmin=false;
    static {
        // ��̬��ʼ��
        InitialSystem.initialSys();
    }

    /**
     * ����ϵͳ����ڽ���
     */
	public static void start() {
//        InitialSystem.test();
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.println("*********����ѧ������ϵͳ������棩***********");
		System.out.println("********��¼ϵͳ********");
		//�˺�����
        boolean state = false;
		while(!state){
			System.out.print("�˺�:");
			logid=input.nextInt();
			System.out.print("����:");
			logpwd=input.next();
			System.out.println("�Ƿ����Ա��y/n��:");
			isAdmin=input.next().equalsIgnoreCase("y");
			if(LoginSystem.login(logid, logpwd, isAdmin)){
			    state=true;
            }else {
                System.out.println("�Ƿ��˳���¼����y/n��");
                state= input.next().equalsIgnoreCase("y");
                if(state){ return;}
            }
		}
		//�ǹ���Ա
		if(isAdmin){
			boolean continueDo=true;//�Ƿ��������
			while(continueDo){
				FunctionView.functionView(isAdmin);
				System.out.print("�Ƿ����������y/n��?");String how=input.next();
				continueDo=how.equalsIgnoreCase("y");
			}
			System.out.println("�˳�ϵͳ�ɹ�!");
		}
		//���ǹ���Ա
		else{
			boolean continueDo=true;//�Ƿ��������
			while(continueDo){
				FunctionView.functionView(isAdmin);
				System.out.print("�Ƿ����������y/n��?");String how=input.next();
				continueDo=how.equalsIgnoreCase("y");
			}
			System.out.println("�˳�ϵͳ�ɹ�!");
		}
	}
}
