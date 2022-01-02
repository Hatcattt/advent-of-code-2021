package com.hatcattt.aoc2021;

import com.hatcattt.aoc2021.skeleton.IPuzzle;
import com.hatcattt.aoc2021.puzzles.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Main class for running all the puzzles.
 */
public class RunAllPuzzles {
    public static void main(String[] args) {
        List<IPuzzle> puzzleList = new ArrayList<>() {{
            add(new Day1("Sonar Sweep"));
            add(new Day2("Dive!"));
            add(new Day3("Binary Diagnostic"));
        }};

        System.out.println("( Number of puzzles solved : " + puzzleList.size() + " )\n");
        for (var puzzle : puzzleList) {
            System.out.println("Puzzle  : " + puzzle);

            System.out.print("Part One: ");
            puzzle.solvePartOne();

            System.out.print("Part Two: ");
            puzzle.solvePartTwo();

            System.out.println();
        }
    }
}
