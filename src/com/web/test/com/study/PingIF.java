package com.web.test.com.study;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Description:
 * Created with IntelliJ IDEA.
 *
 * @author 张博
 * @version 1.0 2014/10/22 14:18 by zhangbo01@zuche.com 创建
 */
public interface PingIF extends Remote {
    public void ping() throws RemoteException;
}
//public class Ping implements PingIF{
//    public void ping() throws RemoteException {
//
//    }
//}