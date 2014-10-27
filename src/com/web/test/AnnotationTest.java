package com.web.test;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Description:
 * Created with IntelliJ IDEA.
 *
 * @author 张博
 * @version 1.0 2014/10/22 13:23 by zhangbo01@zuche.com 创建
 */
@Retention(RetentionPolicy.RUNTIME)
@interface debug{
    boolean devbuild()default false;
    int counter();
}
public class AnnotationTest {
        final boolean production=true;
        @debug(devbuild = production,counter = 1)
        public void testMethod(){
            System.out.println("e121321");
        }
        public static void main(String args[]){
            AnnotationTest mt=new AnnotationTest();
            try{
//                System.out.print(mt.getClass().getMethod("testMethod").toString());
//                mt.testMethod();
                Annotation[] a=mt.getClass().getMethod("testMethod").getAnnotations();
                for (int i = 0; i <a.length ; i++) {
                   System.out.println("a["+i+"]="+a[i]+" ");
                }
            }catch (NoSuchMethodException e){
                 System.out.print(e);
            }
        }
}
