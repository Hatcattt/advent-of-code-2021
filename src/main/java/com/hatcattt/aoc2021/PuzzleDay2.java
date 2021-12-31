package com.hatcattt.aoc2021;

import com.hatcattt.aoc2021.utils.GetDatas;
import java.io.File;

/**
 * Solution of the puzzle day 2.
 */
public class PuzzleDay2 {
    public static void main(String[] args) {
        int horizontalPoz = 0;
        int depth =  0;
        int aim = 0;

        var datas = GetDatas.inputDatasToString(new File("src/main/resources/datatxt/day2.txt"));

        for (var string : datas) {
            switch (string.split(" ")[0]) {
                case "forward" -> {
                    horizontalPoz += Integer.parseInt(string.split(" ")[1]);
                    depth += aim * Integer.parseInt(string.split(" ")[1]);
                }
                case "down" -> aim += Integer.parseInt(string.split(" ")[1]);
                case "up" -> aim -= Integer.parseInt(string.split(" ")[1]);
            }
        }

        int result = horizontalPoz * depth;
        System.out.println("horizontal:" + horizontalPoz + " * " + "depth:" + depth + " = " + result);
    }
}
