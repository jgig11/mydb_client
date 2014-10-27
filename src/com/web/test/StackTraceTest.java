package com.web.test;

import org.junit.Test;

/**
 * Description:
 * Created with IntelliJ IDEA.
 *
 * @author 张博
 * @version 1.0 2014/10/22 13:13 by zhangbo01@zuche.com 创建
 */
public class StackTraceTest {

   public static void main(String args[]){
       StackTraceElement e[]=Thread.currentThread().getStackTrace();
       for (int i = 0; i <e.length ; i++) {
           System.out.println(e[i]);
       }
       System.out.println("\n"+Thread.getAllStackTraces());
   }

//    @Test
//    public void TestStack(){
//        StackTraceElement e[]=Thread.currentThread().getStackTrace();
//        for (int i = 0; i <e.length ; i++) {
//          System.out.println(e[i]);
//        }
//        System.out.println("\n"+Thread.getAllStackTraces());
//    }

}
