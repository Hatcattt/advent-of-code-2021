package com.hatcattt.aoc2021;

import com.hatcattt.aoc2021.puzzles.Day1;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class Day1Test {
    static Day1 puzzleDay1 = new Day1("Sonar Sweep Test");

    // Test with the method of day1 part one
    @Test
    void countOnEmptyList() {
        Assertions.assertEquals(0, puzzleDay1.getNumberOfIncreaseMeasurement(List.of()));
    }

    @Test
    void countWithNegativesValues() {
        Assertions.assertEquals(2, puzzleDay1.getNumberOfIncreaseMeasurement(List.of(-3, -2, -1)));
    }

    @Test
    void countWithValues() {
        Assertions.assertEquals(3, puzzleDay1.getNumberOfIncreaseMeasurement(List.of(1, 2, 3, 4)));
    }

    @Test
    void countWithValues2() {
        Assertions.assertEquals(3, puzzleDay1.getNumberOfIncreaseMeasurement(List.of(1, 10, 2, 20, 3, 30)));
    }

    // Test with the method of day1 part two
    @Test
    void sumOnEmptyList() {
        Assertions.assertEquals(List.of(), puzzleDay1.getSumGroupedBy3Elements(List.of()));
    }

    @Test
    void sumWithLessThan3Elements() {
        Assertions.assertEquals(List.of(), puzzleDay1.getSumGroupedBy3Elements(List.of(1, 2)));
    }

    @Test
    void sumWithValues() {
        Assertions.assertEquals(List.of(6, 7, 9, 11), puzzleDay1.getSumGroupedBy3Elements(List.of(1, 2, 3, 2, 4, 5)));
    }

    // Test with methods of day1 part one and part two
    @Test
    void countWithSumOf3Elements() {
        var datas = puzzleDay1.getSumGroupedBy3Elements(List.of(1, 2, 3, 2, 4, 5));
        var result = puzzleDay1.getNumberOfIncreaseMeasurement(datas);

        Assertions.assertEquals(3, result);
    }
}
