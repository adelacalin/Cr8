package com.adelacalin;

import com.adelacalin.reader.HtmlReader;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, Integer> result = new HashMap<>();
        String page = new HtmlReader().read("http://google.com");
        for (String word : page.split(" "))
            if (result.containsKey(word))
                result.get(word + 1);
            else
                result.put(word, 1);
    }
}
