package io.artsok;


import io.artsok.tasks.Task4;
import io.artsok.tasks.Task5;

public class MainClass {

    public static void main(String[] args) {
        //System.out.println("Print answer for task [1]");
        System.out.println("Answer for task [4]. What is the sum of the digits in the decimal notation of 2 ^ 1000?: [" + new Task4().run() + "].");
        System.out.println("Answer for task [5]. Number and it max sequence length: [" + new Task5().run() + "].");
    }
}
