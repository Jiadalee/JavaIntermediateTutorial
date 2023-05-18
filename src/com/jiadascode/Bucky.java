package com.jiadascode;

public class Bucky {
    public static void main(String args[]){
        String[] words = {"funk", "chunk", "furry", "jordan"};
        for(String w : words){
            if(w.startsWith("fu")){
                System.out.println(w + " starts with fu");
            }
        }

        for(String w : words){
            if(w.endsWith("unk")){
                System.out.println(w + " ends with unk");
            }
        }

        String s = "dnwuunauonnoafklefa";
        System.out.println(s.indexOf('k', 5));

        String a = "Bacon ";
        String b = "Monster";

        System.out.println(a.concat(b));
        System.out.println(a.replace('B', 'F'));
        System.out.println(b.toUpperCase());
        System.out.println(a);
        System.out.println(a.trim());
    }
}


