package com.hatcattt.aoc2021;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Collectors;

public class PuzzleDay2 {
    public static void main(String[] args) {

        String filePath = "src/main/resources/datatxt/day2.txt";
        int horizPoz = 0;
        int depth =  0;
        int aim = 0;

        try {
            BufferedReader file = new BufferedReader(new FileReader(filePath));
            var datas = file.lines().collect(Collectors.toList());

            for(var string : datas) {
                switch (string.split(" ")[0]) {
                    case "forward" -> {
                        horizPoz += Integer.parseInt(string.split(" ")[1]);
                        depth += aim * Integer.parseInt(string.split(" ")[1]);
                    }
                    case "down" -> aim += Integer.parseInt(string.split(" ")[1]);
                    case "up" -> aim -= Integer.parseInt(string.split(" ")[1]);
                }
            }

            int result = horizPoz * depth;
            System.out.println("horizontal:" + horizPoz + " * " + "depth:" + depth + " = " + result);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
