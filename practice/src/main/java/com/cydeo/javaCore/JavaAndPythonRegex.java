package com.cydeo.javaCore;

public class JavaAndPythonRegex {
    public static void main(String[] args) {


        String sentence = "We study Java not Python";
        sentence = sentence.toLowerCase();

        int java = 0;
        int python = 0;

        while (sentence.contains("java") || sentence.contains("python")) {

            while (sentence.contains("java")) {
                sentence = sentence.replaceFirst("java", " ");
                java += 1;
                continue;
            }
            while (sentence.contains("phyton")) {
                sentence = sentence.replaceFirst("phyton", "");
                python += 1;
                continue;
            }
        }
        boolean equal = java == python;
        System.out.println(equal);

    }
}