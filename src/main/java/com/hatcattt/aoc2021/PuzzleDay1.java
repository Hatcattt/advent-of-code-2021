package com.hatcattt.aoc2021;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Solution of the puzzle day 1 (part one et part two)
 */
public class PuzzleDay1 {

    /**
     * Get the number of Measurement increase in the list of Integer.
     * @param datas list of Integer
     * @return int
     */
    static int getNumberOfIncreaseMeasurement(List<Integer> datas) {
        int countIncrease = 0;
        for (int i = 0; i < datas.size() - 1; i++) {
            if (datas.get(i) < datas.get(i + 1)) { countIncrease++; }
        }
        return countIncrease;
    }

    public static void main(String[] args) {
        System.out.println("PART ONE:");

        String filePath = "src/main/resources/datatxt/day1.txt";

        try {
            BufferedReader file = new BufferedReader(new FileReader(filePath));

            var datas = file.lines().map(Integer::parseInt).collect(Collectors.toList());
            var count = getNumberOfIncreaseMeasurement(datas);

            System.out.println(count);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\nPART TWO:");

    }
}
