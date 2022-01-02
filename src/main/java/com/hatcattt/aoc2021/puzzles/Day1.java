package com.hatcattt.aoc2021.puzzles;

import com.hatcattt.aoc2021.skeleton.Puzzle;
import com.hatcattt.aoc2021.utils.GetDatas;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Solution of the Puzzle day 1.
 */
public class Day1 extends Puzzle {
    private final List<Integer> datas = GetDatas.inputDatasToInt(new File("src/main/resources/datatxt/day1.txt"));

    public Day1(String name) {
        super(name);
    }

    /**
     * Solution for the part one of the puzzle.
     */
    @Override
    public void solvePartOne() {
        int count = getNumberOfIncreaseMeasurement(datas);
        System.out.println(count);
    }

    /**
     * Solution for the part one of the puzzle.
     */
    @Override
    public void solvePartTwo() {
        var newDatas = getSumGroupedBy3Elements(datas);
        int count2 = getNumberOfIncreaseMeasurement(newDatas);
        System.out.println(count2);
    }

    /**
     * Get the number of Measurement increase in the list of Integer.
     * @param datas list of Integer
     * @return int : increase measurement
     */
    public int getNumberOfIncreaseMeasurement(List<Integer> datas) {
        int countIncrease = 0;
        for (int i = 0; i < datas.size() - 1; i++) {
            if (datas.get(i) < datas.get(i + 1)) { countIncrease++; }
        }
        return countIncrease;
    }

    /**
     * Get the sum of the elements grouped by 3 elements in the list of Integer.
     * @param integerList list of Integer
     * @return List<Integer> : new list with sums
     */
    public List<Integer> getSumGroupedBy3Elements(List<Integer> integerList) {
        List<Integer> sum = new ArrayList<>();

        for (int i = 0; i < integerList.size() - 2; i++) {
            sum.add(integerList.get(i) + integerList.get(i + 1) + integerList.get(i + 2));
        }
        return sum;
    }
}
