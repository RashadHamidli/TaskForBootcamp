package com.object.lambda;

import java.util.Arrays;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("soz1", "soz2", "soz3");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
