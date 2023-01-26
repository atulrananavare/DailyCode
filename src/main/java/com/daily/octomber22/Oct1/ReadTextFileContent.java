package com.daily.octomber22.Oct1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadTextFileContent {
    public static void main(String[] args) throws IOException {

        List<String> fileData = Files.readAllLines(Paths.get("example.txt"));
        fileData.stream().skip(1)
                .limit(fileData.size() - 2)
                .forEach(System.out::println);

    }
}
