package io.artsok.tasks;

import java.math.BigDecimal;
import java.util.Map;

/**
 * Ряд Фибоначчи задаётся рекуррентным соотношением:
 * <p>
 * Fn = Fn−1 + Fn−2, где F1 = 1 и F2 = 1.
 * <p>
 * Следовательно, первыми 12-ю членами ряда будут:
 * <p>
 * F1 = 1
 * F2 = 1
 * F3 = 2
 * F4 = 3
 * F5 = 5
 * F6 = 8
 * F7 = 13
 * F8 = 21
 * F9 = 34
 * F10 = 55
 * F11 = 89
 * F12 = 144
 * <p>
 * 12-й член ряда, F12, — это первый член, в десятичной записи которого три цифры.
 * <p>
 * Каков индекс первого члена ряда Фибоначчи, в десятичной записи которого 1000 цифр?
 */
public class Task2 {
    public int run() {
        var digitsNumber = 1000;
        var index = 0;
        BigDecimal current = null; //current number
        do {
            BigDecimal[] fibs = {new BigDecimal(0), new BigDecimal(1)};
            for (var i = 0; i < index + 1; i++) {
                current = fibs[1].add(fibs[0]);
                fibs[0] = fibs[1];
                fibs[1] = current;
            }
            index += 1;
        } while (current.toString().length() != digitsNumber);
        return index - 1;
    }
}