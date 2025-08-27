package com.example.project.bee1040;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double n4 = sc.nextDouble();

        double avg = Average1040.weightedAverage(n1, n2, n3, n4);
        System.out.printf("Media: %.1f%n", Math.floor(avg * 10.0) / 10.0);

        String status = Average1040.initialStatus(avg);
        System.out.println(status);

        if (status.equals("Aluno em exame.")) {
            double exam = sc.nextDouble();
            System.out.printf("Nota do exame: %.1f%n", exam);
            double fin = Average1040.finalAverage(avg, exam);
            System.out.println(Average1040.finalStatus(fin));
            System.out.printf("Media final: %.1f%n", Math.floor(finalAvg * 10.0) / 10.0);
        }

        sc.close();
    }
}
