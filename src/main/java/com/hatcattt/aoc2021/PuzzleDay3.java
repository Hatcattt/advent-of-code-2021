package com.hatcattt.aoc2021;

import com.hatcattt.aoc2021.utils.GetDatas;
import java.io.File;
import java.util.ArrayList;

/**
 * Solution of the puzzle day 3.
 */
public class PuzzleDay3 {
    public static void main(String[] args) {
        var binaryDatas = GetDatas.inputDatasToString(new File("src/main/resources/datatxt/day3.txt"));

        StringBuilder gamaRate = new StringBuilder();
        StringBuilder espilonRate = new StringBuilder();

//        var datasTest = Arrays.asList(
//                "00100", "11110", "10110", "10111", "10101", "01111",
//                "00111", "11100", "10000", "11001", "00010", "01010");

        int binaryNumberLenght = binaryDatas.get(0).length();

        for (int i = 0; i < binaryNumberLenght ; i++) {
            var listeChar = new ArrayList<Character>();

            for (var str : binaryDatas) {
                listeChar.add(str.charAt(i));
            }

            int count0bit = (int) listeChar.stream().filter(b -> b == '0').count();
            int count1bit = (int) listeChar.stream().filter(b -> b == '1').count();

            gamaRate.append(count0bit > count1bit ? '0' : '1');
            espilonRate.append(count0bit > count1bit ? '1': '0');
        }

        int powerConsumption = Integer.parseInt(gamaRate.toString(), 2) * Integer.parseInt(espilonRate.toString(), 2);
        System.out.println(powerConsumption);
    }
}
