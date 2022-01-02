package com.hatcattt.aoc2021;

import com.hatcattt.aoc2021.puzzles.Day3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

public class Day3Test {
    static Day3 puzzleDay3 = new Day3("Binary Diagnostic Test");
    List<String> exampleFromAdventOfCode = List.of(
            "00100", "11110", "10110", "10111", "10101", "01111",
            "00111", "11100", "10000", "11001", "00010", "01010");

    // test part one
    @Test
    void powerConsumptionOnEmptyList() {
        Assertions.assertEquals(0, puzzleDay3.getPowerConsumption(List.of()));
    }

    @Test
    void powerConsumptionWith2Values() {
        Assertions.assertEquals(84, puzzleDay3.getPowerConsumption(List.of("00001", "00011")));
    }

    @Test
    void powerConsumptionMustBe198() {
        Assertions.assertEquals(198, puzzleDay3.getPowerConsumption(exampleFromAdventOfCode));
    }

    // test part two

}
