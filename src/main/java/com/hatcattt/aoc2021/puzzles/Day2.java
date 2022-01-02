package com.hatcattt.aoc2021.puzzles;

import com.hatcattt.aoc2021.skeleton.Puzzle;
import com.hatcattt.aoc2021.utils.GetDatas;

import java.io.File;
import java.util.List;

/**
 * Solution of the puzzle day 2.
 */
public class Day2 extends Puzzle {
    private final List<String> datas = GetDatas.inputDatasToString(new File("src/main/resources/datatxt/day2.txt"));

    public Day2(String name) {
        super(name);
    }

    /**
     * Solution for the part one of the puzzle.
     */
    @Override
    public void solvePartOne() {
        int diveResult = getSimpleDiveResult(datas);
        System.out.println(diveResult);
    }

    /**
     * Solution for the part two of the puzzle.
     */
    @Override
    public void solvePartTwo() {
        int diveResult = getComplexDiveResult(datas);
        System.out.println(diveResult);
    }

    /**
     * Get the simple dive result from a list of datas with instructions inside.
     * @param datas datas with instructions to load.
     * @return int : dive result
     */
    public int getSimpleDiveResult(List<String> datas) {
        int horizontalPoz = 0;
        int depth =  0;

        for (var string : datas) {
            String command = string.split(" ")[0];
            int direction = Integer.parseInt(string.split(" ")[1]);

            switch (command) {
                case "forward" -> horizontalPoz += direction;
                case "down" -> depth += direction;
                case "up" -> depth -= direction;
            }
        }
        return horizontalPoz * depth;
    }

    /**
     * Get the complex dive result from a list of datas with instructions inside.
     * @param datas datas with instructions to load.
     * @return int : dive result
     */
    public int getComplexDiveResult(List<String> datas) {
        int horizontalPoz = 0;
        int depth =  0;
        int aim = 0;

        for (var string : datas) {
            String command = string.split(" ")[0];
            int direction = Integer.parseInt(string.split(" ")[1]);

            switch (command) {
                case "forward" -> {
                    horizontalPoz += direction;
                    depth += aim * direction;
                }
                case "down" -> aim += direction;
                case "up" -> aim -= direction;
            }
        }
        return horizontalPoz * depth;
    }
}
