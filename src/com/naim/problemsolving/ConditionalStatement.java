package com.naim.problemsolving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// Problem From HackerRank
public class ConditionalStatement {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        String answer = "";

        bufferedReader.close();

        if(N % 2 == 1){
            answer = "Weird";
        }
        else{
            if(N >= 2 && N <= 5)
                answer = "Not Weird";
            else if (N >= 6 && N <= 20)
                answer = "Weird";
            else if (N > 20)
                answer = "Not Weird";
        }
        System.out.println(answer);

    }
}
