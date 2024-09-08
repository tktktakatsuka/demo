package com.example.q13.q16;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Arrays;
import java.util.Locale;

import lombok.Data;

@Data
public class Sample {
    private String name;
    private int num;

    public Sample(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public static void main(String[] args) {
        var samples = Arrays.asList(new Sample("A", 8), new Sample("B", 21), new Sample("C", 23), new Sample("D", 12));
        int result = samples.stream()
        .mapToInt(Sample::getNum)
        .filter((x)-> x > 20)
        .sum();
        // .reduce(0, (a,b) -> a+b);
    }
}
