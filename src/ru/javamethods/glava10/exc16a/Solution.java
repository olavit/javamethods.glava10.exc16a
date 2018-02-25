package ru.javamethods.glava10.exc16a;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) {
    HashSet<String> set = new HashSet<>(100);
    Scanner scanner = null;
    try {
        scanner = new Scanner(new File("text.txt"));
        scanner.useDelimiter("[^A-z]");
        while (scanner.hasNext()) {

            String word = scanner.next();
            set.add(word.toLowerCase());
        }

    }catch (Exception e) {
        e.printStackTrace();
    }
    Iterator<String> it = set.iterator();
    while (it.hasNext()) {
        System.out.println(it.next());
    }
    TreeSet<String> ts = new TreeSet<>(set);
        System.out.println(ts);

    }
}
