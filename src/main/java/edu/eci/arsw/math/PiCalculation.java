package edu.eci.arsw.math;

import java.util.ArrayList;
import java.util.List;

/**
 * PiCalculation
 */
public class PiCalculation {
    public static byte[] DigitCalculated;
    private static int count, n;
    public static int start;

    public PiCalculation(int start, int count, int n) {
        this.DigitCalculated = new byte[count];
        this.start = start;
        this.count = count;
        this.n = n;
    }

    public void calculate() {
        int divcn = count / n;
        List<Thread> threads = new ArrayList<Thread>();
        for (int i = 0; i < n - 1; i++) {
            Thread th = new Thread(new PiThread(start + (divcn * (i)), divcn));
            th.start();
            threads.add(th);
        }
        Thread th = new Thread(new PiThread(start + (divcn * (n - 1)), divcn + (count % n)));
        th.start();
        threads.add(th);
        // Confirmamos finalización de todos los hilos
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                System.out.println("Fallo en el Join de los hilos");
                e.printStackTrace();
            }
        }
    }
}