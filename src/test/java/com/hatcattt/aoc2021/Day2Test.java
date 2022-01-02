package com.hatcattt.aoc2021;

import com.hatcattt.aoc2021.puzzles.Day2;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class Day2Test {
    static Day2 puzzleDay2 = new Day2("Dive Test!");

    // test part one
    @Test
    void simpleDiveResultOnEmptyList() {
        Assertions.assertEquals(0, puzzleDay2.getSimpleDiveResult(List.of()));
    }

    @Test
    void simpleDiveResultWith2Instructions() {
        Assertions.assertEquals(0, puzzleDay2.getSimpleDiveResult(List.of("down 2", "up 2")));
    }

    @Test
    void simpleDiveResultMustBe150() {
        Assertions.assertEquals(150, puzzleDay2.getSimpleDiveResult(List.of("forward 5", "down 5", "forward 8", "up 3", "down 8", "forward 2")));
    }

    // test part two
    @Test
    void complexDiveResultOnEmptyList() {
        Assertions.assertEquals(0, puzzleDay2.getComplexDiveResult(List.of()));
    }

    @Test
    void complexDiveResultWith2Instructions() {
        Assertions.assertEquals(-16, puzzleDay2.getComplexDiveResult(List.of("down 1", "up 2", "forward 4")));
    }

    @Test
    void complexDiveResultMustBe900() {
        Assertions.assertEquals(900, puzzleDay2.getComplexDiveResult(List.of("forward 5", "down 5", "forward 8", "up 3", "down 8", "forward 2")));
    }
}
