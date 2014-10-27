package com.web.test;

import org.junit.Test;

/**
 * Description:
 * Created with IntelliJ IDEA.
 *
 * @author 张博
 * @version 1.0 2014/10/21 16:51 by zhangbo01@zuche.com 创建
 */
public class Student implements Cloneable {
    public String id;
    public String name;

    @Override
    protected Object clone() {
        Student student=null;
        try{
            student=  (Student)super.clone();
        }catch (Exception e){
            System.out.print(e.getMessage());
        }
        return student;
    }
    @Test
    public void TestClone(){
        Student s=new Student();
        s.id="ooo1";
        s.name="张三";
        //Student s1=(Student)s.clone();
        Student s1=s;
        s.id="ooo2";
        s.name="李四";
        System.gc();
        System.out.print(s1.id+s1.name);
    }




}


