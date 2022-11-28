package com.workshop;

public class Demo {
    public static void main(String[] args) {
        /*
        input = aaabbbccc
        o/p=abc
        probmlem statement=remove duplicate character from the string
         */
        String str = "aaabbbccc";
        System.out.println("old string is: " + str);
        System.out.println("new string is: " + removeDupliChar(str));
    }

    public static <Char> String removeDupliChar(String str) {
        String newStr="";
        for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        if(newStr.indexOf(ch)==-1)
        {
            newStr+=ch;
        }
    }
      return newStr;
}}
