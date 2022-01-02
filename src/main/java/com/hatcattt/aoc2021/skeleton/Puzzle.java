package com.hatcattt.aoc2021.skeleton;

/**
 * Initialised infos of the puzzles.
 * Each puzzle created must extend this class.
 */
public abstract class Puzzle implements IPuzzle {
    private final String day;
    private final String name;

    /**
     * Create a new puzzle.
     * @param name name of the puzzle.
     */
    public Puzzle(String name) {
        day = getClass().getSimpleName();
        this.name = name;
    }

    @Override
    public String toString() {
        return  day + " -> " + name;
    }
}
