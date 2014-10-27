package com.web.test.com.study;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Description:
 * Created with IntelliJ IDEA.
 *
 * @author 张博
 * @version 1.0 2014/10/22 14:17 by zhangbo01@zuche.com 创建
 */
@Retention(RetentionPolicy.RUNTIME)
@interface remote{
     int count()default 1;
}

public class Ping {
   @Test
   public @remote(count = 3) void ping(){
       try {
           Annotation[] a=  this.getClass().getMethod("ping").getAnnotations();
           for (int i = 0; i <a.length ; i++) {
               System.out.print(a[i].annotationType());
           }
       } catch (NoSuchMethodException e) {
           e.printStackTrace();
       }

   }
}
