package com.hatcattt.aoc2021.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Get datas from input file to List.
 */
public class GetDatas {
    /**
     * Get a list of String with the datas from a file using Stream API.
     * @param filePath the file to get datas
     * @return list of String (ArrayList).
     */
    public static List<String> inputDatasToString(File filePath) {
        List<String> dataString = new ArrayList<>();

        try {
            BufferedReader file = new BufferedReader(new FileReader(filePath));
            dataString = file.lines().collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }
        return dataString;
    }

    /**
     * Get a list of Integer with the datas from a file using Stream API.
     * @param filePath the file to get datas
     * @return list of Integer (ArrayList).
     */
    public static List<Integer> inputDatasToInt(File filePath) {
        List<Integer> dataInt = new ArrayList<>();

        try {
            BufferedReader file = new BufferedReader(new FileReader(filePath));
            dataInt = file.lines().map(Integer::parseInt).collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }
        return dataInt;
    }
}
