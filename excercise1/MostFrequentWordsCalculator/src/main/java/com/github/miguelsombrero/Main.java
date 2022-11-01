package com.github.miguelsombrero;

import com.github.miguelsombrero.utils.URLReader;

import java.net.MalformedURLException;

public class Main {
    private static final String URL = "http://pizzachili.dcc.uchile.cl/texts/nlang/english.50MB.gz";

    public static void main(String[] args) throws MalformedURLException {
        URLReader.readFileFromURL(URL);
    }
}
