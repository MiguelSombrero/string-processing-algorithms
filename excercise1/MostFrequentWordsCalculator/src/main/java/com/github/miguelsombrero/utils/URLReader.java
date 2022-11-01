package com.github.miguelsombrero.utils;

import java.net.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.zip.GZIPInputStream;

public class URLReader {
    public static void readFileFromURL(String url) throws MalformedURLException {
        URL urlObject = new URL(url);

        try {
            byte[] bytes = decompressGzip(urlObject);
            System.out.println(new String(bytes, StandardCharsets.UTF_8));

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static byte[] decompressGzip(URL url) throws IOException {
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        try (GZIPInputStream gis = new GZIPInputStream(url.openStream())) {
            byte[] buffer = new byte[1024];
            int len;
            while ((len = gis.read(buffer)) > 0) {
                output.write(buffer, 0, len);
            }
        }

        return output.toByteArray();
    }
}