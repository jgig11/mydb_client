package com.web.test;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Description:
 * Created with IntelliJ IDEA.
 *
 * @author 张博
 * @version 1.0 2014/10/23 14:36 by zhangbo01@zuche.com 创建
 */
public class Cmd {
     @Test
    public void exeCmd(){

         try {
             Process pro = Runtime.getRuntime().exec("cmd /c tasklist");
             BufferedReader br = new BufferedReader(new InputStreamReader(pro
                     .getInputStream()));
             String msg = null;
             while ((msg = br.readLine()) != null) {
                 System.out.println(msg);
             }
         } catch (IOException exception) {
         }
//        Runtime rt = Runtime.getRuntime();
//        //   cmd命令格式为  "cmd.exe /c ipconfig /all"
//        String[] cmdarray={"ipconfig /all"};
//        Process p = null; //    或者   Process p = rt.exec(String cmd);
//        try {
//            p = rt.exec(cmdarray);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    //    对像p为进程,在给p赋值以前,必须保证p为空
//        if(p != null){
//            p.destroy();
//            p = null;
//        }
    }
}
