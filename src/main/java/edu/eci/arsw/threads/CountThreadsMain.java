/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the editor in the template.
 */
package edu.eci.arsw.threads;

/**
 *
 * @author hcadavid
 */
public class CountThreadsMain {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Hilos con start()");

        CountThread t1 = new CountThread(0, 99);
        CountThread t2 = new CountThread(99, 199);
        CountThread t3 = new CountThread(200, 299);

        t1.start();
        t2.start();
        t3.start();

        //freno para esperar lo hilos antes de continuar
        t1.join();
        t2.join();
        t3.join();

        CountThread r1 = new CountThread(0, 99);
        CountThread r2 = new CountThread(99, 199);
        CountThread r3 = new CountThread(200, 299);

        System.out.println("Hilos con run()");

        r1.run();
        r2.run();
        r3.run();
    }

}
