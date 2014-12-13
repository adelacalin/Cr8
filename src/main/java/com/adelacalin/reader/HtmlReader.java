package com.adelacalin.reader;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Created by adelacalin on 12/13/2014.
 */
public class HtmlReader {
    public String read(String url) {
        StringBuilder b = new StringBuilder();
        try (BufferedReader in = new BufferedReader(new InputStreamReader(new URL(url).openStream()))) {
            String inputLine;
            while ((inputLine = in.readLine()) != null)
                b.append(inputLine);
        } catch (Exception e) {
            System.out.println("Can not read URL");
            e.printStackTrace();
        }
        return b.toString();
    }

}
