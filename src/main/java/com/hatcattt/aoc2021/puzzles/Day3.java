package com.hatcattt.aoc2021.puzzles;

import com.hatcattt.aoc2021.skeleton.Puzzle;
import com.hatcattt.aoc2021.utils.Binary;
import com.hatcattt.aoc2021.utils.GetDatas;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Solution of the puzzle day 3.
 */
public class Day3 extends Puzzle {
    private final List<String> binaryDatas = GetDatas.inputDatasToString(new File("src/main/resources/datatxt/day3.txt"));

    public Day3(String name) {
        super(name);
    }

    /**
     * Solution for the part one of the puzzle.
     */
    @Override
    public void solvePartOne() {
        int powerConsumption = getPowerConsumption(binaryDatas);
        System.out.println(powerConsumption);
    }

    /**
     * Solution for the part two of the puzzle.
     */
    @Override
    public void solvePartTwo() {
        System.out.println("Not yet, but soon here !");
    }

    /**
     * Get the power consumption from the binary datas input.
     * Power consumption is calculated with the gamaRate and epsilonRate.
     * @param binaryDatas binary datas to load
     * @return int : power consumption
     */
    public int getPowerConsumption(List<String> binaryDatas) {
        StringBuilder gamaRateBinary = new StringBuilder();
        StringBuilder epsilonRateBinary = new StringBuilder();

        if (binaryDatas.isEmpty()) { return 0; }

        int binaryNumberLenght = binaryDatas.get(0).length();

        for (int i = 0; i < binaryNumberLenght ; i++) {
            var listeChar = new ArrayList<Character>();

            for (var str : binaryDatas) {
                listeChar.add(str.charAt(i));
            }

            int count0bit = (int) listeChar.stream().filter(b -> b == '0').count();
            int count1bit = (int) listeChar.stream().filter(b -> b == '1').count();

            gamaRateBinary.append(count0bit > count1bit ? '0' : '1');
            epsilonRateBinary.append(count0bit > count1bit ? '1' : '0');
        }

        int gamaRate = Binary.getDecimal(gamaRateBinary.toString());
        int epsilonRate = Binary.getDecimal(epsilonRateBinary.toString());

        return gamaRate * epsilonRate;
    }
}
