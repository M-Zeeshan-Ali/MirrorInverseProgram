package com.company;

import java.util.Scanner;

public class ReverseOrder {


        public static void main(String[] args) {

            String str = "Welcome to Java Learning Programming";
            String[] strArray = str.split(" "); // TODO Auto-generated method stub
            //for loop condition using temp type variable
            for (String temp: strArray){
                System.out.println(temp);
            }
            for(int i=0; i<3; i++){     //only three string value will be print
                char[] s1 = strArray[i].toCharArray();  //char type array used to strArray to CharArray method
                for (int j = s1.length-1; j>=0; j--){
                System.out.print(s1[j]);}

                System.out.print(" ");
            }
        }
    }