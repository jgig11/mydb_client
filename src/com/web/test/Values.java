package com.web.test;

import org.junit.Test;

/**
 * Description:
 * Created with IntelliJ IDEA.
 *
 * @author 张博
 * @version 1.0 2014/10/21 17:25 by zhangbo01@zuche.com 创建
 */
public class Values {
    private void test(int i){
        i=1;
    }
    @Test
    public void TestValues(){
       int a=0;
       new Values().test(a);
       System.out.print(a);
    }

     class Student{
         String id;
         String name;
     }

     Student s1=new Student();


}
