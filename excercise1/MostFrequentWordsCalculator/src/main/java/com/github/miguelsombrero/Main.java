package com.github.miguelsombrero;

import static com.github.miguelsombrero.utils.FileUtils.*;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.*;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {
    private static final String URL = "http://pizzachili.dcc.uchile.cl/texts/nlang/english.50MB.gz";

    public static void main(String[] args) throws IOException {
        URL url = new URL(URL);

        byte[] bytes = readGzipFromURL(url);

        String fileString = new String(bytes, StandardCharsets.UTF_8);

        String[] words = fileString.split(" ");

        Map<String,Long> wordsByFrequency = Arrays.asList(words).stream()
                .collect(groupingBy(String::toLowerCase, counting()));

        List<String> tenMostFrequent = wordsByFrequency.keySet().stream()
                .sorted(comparing(wordsByFrequency::get).reversed())
                .limit(10)
                .collect(toList());

        print(tenMostFrequent.toString());
    }

    private static void print(String string) {
        System.out.println(string);
    }
}
