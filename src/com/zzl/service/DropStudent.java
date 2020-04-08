package com.zzl.service;

import com.zzl.domain.StuLogin;

import java.util.Set;

/**
 * 删除学生基本信息
 * 因为只有学号有唯一性，这里只能按照学号删除
 * @author Administrator
 *
 */
public class DropStudent {
    private static Set<StuLogin> stuLogins = InitialSystem.getStuLogins();
	/**
	 * 按学号删除
	 * @param id
	 */
	public static void delete(int id){
        InitialSystem.getStudents().remove(id);
        for (StuLogin sl :
                stuLogins) {
            if (sl.getId()==id){
                stuLogins.remove(sl);
                System.out.println("删除学生成功，学生id为："+id);
                return;
            }
        }
        System.out.println("没有这号学生！！！");
	}


}
