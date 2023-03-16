package com.cydeo.algoQuestions;



import java.util.ArrayList;

public class RemoveDuplicates {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Kadifa");
        names.add("Entisar");
        names.add("Nihan");
        names.add("Violetta");
        names.add("Adelina");
        names.add("Kramer");
        names.add("Violetta");
        names.add("Adelina");
        names.add("Kramer");

        System.out.println(names);
        ArrayList<String> nonDup= new ArrayList<>();
                for(String each:names){
                    if(nonDup.contains(each)){
                        continue;
                    }
                    nonDup.add(each);
                }
                names= nonDup;
        System.out.println(names);
        System.out.println(nonDup);

    }
}




