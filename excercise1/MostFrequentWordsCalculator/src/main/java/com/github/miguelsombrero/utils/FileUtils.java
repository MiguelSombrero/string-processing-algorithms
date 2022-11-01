package com.github.miguelsombrero.utils;

import java.net.*;
import java.io.*;
import java.util.zip.GZIPInputStream;

public class FileUtils {

    public static byte[] readGzipFromURL(URL url) throws IOException {
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