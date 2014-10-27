package com.web.test;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;

/**
 * Description:
 * Created with IntelliJ IDEA.
 *
 * @author 张博
 * @version 1.0 2014/10/21 13:34 by zhangbo01@zuche.com 创建
 */
public class GCTest {
    public static void main(String[] args){
      int length =5;
        //--------------创建强引用------------
        Set<MyObject> a=new HashSet<MyObject>();
        for(int i=0;i<length;i++){
           MyObject ref=new MyObject("hard_"+i);
           System.out.println("创建强引用:"+ref);
           a.add(ref);
        }
        a=null;
        //------------- 创建软引用-------------
        Set<SoftReference<MyObject>> sa=new HashSet<SoftReference<MyObject>>();
        for (int i = 0; i < length; i++) {
            SoftReference<MyObject> ref=new SoftReference<MyObject>(new MyObject("soft_"+i));
            System.out.println("创建软引用:"+ref.get());
            sa.add(ref);
        }
        System.gc();
        //------------- 创建弱引用-------------
        Set<WeakReference<MyObject>> wa=new HashSet<WeakReference<MyObject>>();
        for (int i = 0; i < length; i++) {
            WeakReference<MyObject> ref=new WeakReference<MyObject>(new MyObject("weak_"+i));
            System.out.println("创建弱引用:"+ref.get());
            wa.add(ref);
        }
        System.gc();
        //------------- 创建虚引用-------------
        ReferenceQueue<MyObject> rq=new ReferenceQueue<MyObject>();
        Set<PhantomReference<MyObject>> pa=new HashSet<PhantomReference<MyObject>>();

        for (int i = 0; i < length; i++) {
            PhantomReference<MyObject> ref=new PhantomReference<MyObject>(new MyObject("phantom_"+i),rq);
            System.out.println("创建虚引用:"+ref.get());
            pa.add(ref);
        }
        System.gc();
    }
}
