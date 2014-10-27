package com.web.test;

import org.junit.Test;
import org.omg.CORBA.MARSHAL;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Description:
 * Created with IntelliJ IDEA.
 *
 * @author 张博
 * @version 1.0 2014/10/23 10:25 by zhangbo01@zuche.com 创建
 */
public class VarargsTest {
    void varargs(Object... args){
        for (int i = 0; i <args.length ; i++) {
            System.out.println(args[i]);
        }
    }
    @Test
    public void testVar(){
        Map<String,String> map=new ConcurrentHashMap<String, String>();
        map.put("111","adas");
       varargs("11", "222", null,map);
    }

}
