package com.shail.parking;

public class Main {

    public static void main(String[] args) {

        String s = "My NaMe is panshul";

        String s1 = s.replaceAll("\\s","");

        String s2 = s1.toLowerCase();



        int count = 0;

        for(int i=0;i<s2.length();i++){
            char c = s1.charAt(i);

            count = 0;
            for(int j=0;j<s2.length();j++){

                if(c == s1.charAt(j)){

                    count ++;
                }


            }
            System.out.println("Count of " + c + " "  + count);

        }

    }

}
