package com.example.project.bee1040;

import static org.junit.jupiter.api.Assertions.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import org.junit.jupiter.api.Test;

class Average1040Test {

    @Test
    void weightedAverage_example() {
        double a = Average1040.weightedAverage(2.0, 4.0, 7.5, 8.0);
        assertEquals(5.4, Math.round(a*10)/10.0, 1e-9);
    }

    @Test
    void status_boundaries() {
        assertEquals("Aluno reprovado.", Average1040.initialStatus(4.9));
        assertEquals("Aluno em exame.",  Average1040.initialStatus(5.0));
        assertEquals("Aluno em exame.",  Average1040.initialStatus(6.9));
        assertEquals("Aluno aprovado.",  Average1040.initialStatus(7.0));
    }

    @Test
    void final_avg_and_status() {
        double avg = Average1040.weightedAverage(2.0, 4.0, 7.5, 8.0); // 5.4
        double fin = Average1040.finalAverage(avg, 6.4);
        assertEquals("Aluno aprovado.", Average1040.finalStatus(fin));
        assertEquals(5.9, Math.round(fin*10)/10.0, 1e-9);
    }

    @Test
    void integration_like_beecrowd() throws Exception {
        Locale.setDefault(Locale.US);
        String input = "2.0 4.0 7.5 8.0\n6.4\n";
        String expected =
            "Media: 5.4\n" +
            "Aluno em exame.\n" +
            "Nota do exame: 6.4\n" +
            "Aluno aprovado.\n" +
            "Media final: 5.9\n";

        InputStream inBak = System.in; PrintStream outBak = System.out;
        try (ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.US_ASCII));
             ByteArrayOutputStream out = new ByteArrayOutputStream();
             PrintStream ps = new PrintStream(out, true, StandardCharsets.US_ASCII)) {
            System.setIn(in); System.setOut(ps);
            Main.main(new String[]{});
            assertEquals(expected, out.toString(StandardCharsets.US_ASCII));
        } finally {
            System.setIn(inBak); System.setOut(outBak);
        }
    }
}
