/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.threads;

/**
 *
 * @author hcadavid
 */
public class CountThreadsMain {

    public static void main(String a[]) {
        Thread cThread1 = new Thread(new CountThread(0, 99));
        Thread cThread2 = new Thread(new CountThread(100, 199));
        Thread cThread3 = new Thread(new CountThread(200, 299));
        cThread1.run();
        cThread2.run();
        cThread3.run();
    }

}