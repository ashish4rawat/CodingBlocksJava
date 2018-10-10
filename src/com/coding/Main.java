package com.coding;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 10;


        board(3,3,"");



    }

    private static void board(int row, int col,String taken) {


        if(row==1 && col==1){
            System.out.println(taken);
        }

        if(row>1){
            board(row-1,col,taken+"V");
        }
        if(col>1){
            board(row,col-1,taken+"H");
        }

    }




}
