package com.web.test;

import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Description:
 * Created with IntelliJ IDEA.
 *
 * @author 张博
 * @version 1.0 2014/10/22 11:45 by zhangbo01@zuche.com 创建
 */
public class TreeMapTest {
    @Test
    public void TestTreeMap(){
        LinkedHashMap<String,String> map=new LinkedHashMap<String, String>();
//        SortedMap<String,String> map=new TreeMap<String, String>();
        map.put("akey","aValue");
        map.put("bkey","bValue");
        map.put("dkey","dValue");
        map.put("ckey","cValue");

        //获取键值Set
        Set<String> keySet=map.keySet();
        //将keySet转换成数组
        Object[] keyArray=keySet.toArray();
        for (int i = 0; i <keyArray.length ; i++) {
            System.out.println("key="+(String)keyArray[i]+";value="+map.get((String)keyArray[i]));
        }

    }
}
