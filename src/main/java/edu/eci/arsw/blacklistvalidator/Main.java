/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.blacklistvalidator;

import java.util.List;
import edu.eci.arsw.threads.CountThread;
import edu.eci.arsw.threads.ThreadSearch;
import edu.eci.arsw.threads.CountThread;

/**
 *
 * @author hcadavid
 */
public class Main {
    public int a;
    public int d;
    public static void main(String a[])throws InterruptedException{
        HostBlackListsValidator hblv=new HostBlackListsValidator();
        List<Integer> blackListOcurrences=hblv.checkHost("200.24.34.55");
        System.out.println("The host was found in the following blacklists:"+blackListOcurrences);

        // ejercicio punto 1
        counter(1,10);

        // ejercicio 1 punto 2
        ThreadSearch encontrado = new ThreadSearch(1, 4000, "200.24.34.55");
        
        encontrado.start();
        encontrado.join();

        System.out.println();
        System.out.println("++++++++++ Parte 2 Ejercicio 1 ++++++++++");
        System.out.println("Total ocurrencias encontradas: " + encontrado.getOcurrencias());


        // ejercicio 2 punto 2
        System.out.println();
        System.out.println("++++++++++ Parte 2 Ejercicio 2 ++++++++++");

        List<Integer> blackListOcurrences2 = hblv.checkHost("200.24.34.55", 50);
        System.out.println("The host was found in the following blacklists:" + blackListOcurrences2);

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