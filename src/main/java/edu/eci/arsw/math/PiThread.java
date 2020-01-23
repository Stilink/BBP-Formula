package edu.eci.arsw.math;

/**
 * PiThread
 */
public class PiThread implements Runnable {
    private int start, count;

    public PiThread(int start, int count) {
        this.start = start;
        this.count = count;
    }

    @Override
    public void run() {
        byte[] digits = PiDigits.getDigits(start, count);
        for (int i = start, j = 0; i < start + count; i++, j++) {
            PiCalculation.DigitCalculated[i - PiCalculation.start] = digits[j];
        }
    }

}