package com.example.project.bee1040;

public class Average1040 {

    public static double weightedAverage(double n1, double n2, double n3, double n4) {
        return (n1*2.0 + n2*3.0 + n3*4.0 + n4*1.0) / 10.0;
    }

    public static String initialStatus(double avg) {
        if (avg >= 7.0) return "Aluno aprovado.";
        if (avg < 5.0)   return "Aluno reprovado.";
        return "Aluno em exame.";
    }

    public static double finalAverage(double avg, double exam) {
        return (avg + exam) / 2.0;
    }

    public static String finalStatus(double finalAvg) {
        return finalAvg >= 5.0 ? "Aluno aprovado." : "Aluno reprovado.";
    }
}
