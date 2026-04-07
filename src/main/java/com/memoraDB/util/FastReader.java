package com.memoraDB.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FastReader {
    private StringTokenizer st;
    private final BufferedReader br;
    private final Logger logger = LoggerFactory.getLogger(FastReader.class);

    public FastReader() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (Exception e) {
                logger.error("Error reading input: ", e);
            }
        }
        return st.nextToken();
    }
}
