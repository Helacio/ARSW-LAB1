/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.blacklistvalidator;

import java.util.List;
import edu.eci.arsw.threads.CountThread;
import edu.eci.arsw.threads.CountThread;

/**
 *
 * @author hcadavid
 */
public class Main {
    public int a;
    public int d;
    public static void main(String a[]){
        //HostBlackListsValidator hblv=new HostBlackListsValidator();
        //List<Integer> blackListOcurrences=hblv.checkHost("200.24.34.55");
        //System.out.println("The host was found in the following blacklists:"+blackListOcurrences);
        counter(1,10);
    }
    public static void counter(int a,int d){
        int b=d/3;
        int c=2*b;
        Thread Hilo1=new Thread(new CountThread(a, b));
        Thread Hilo2=new Thread(new CountThread(b+1, c));
        Thread Hilo3=new Thread(new CountThread(c+1, d));
        Hilo1.start();
        Hilo2.start();
        Hilo3.start();
    }

    
}
