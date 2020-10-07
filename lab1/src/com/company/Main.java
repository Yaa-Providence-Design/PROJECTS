package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	int[] array = new int[6];
	for(int i = 0; i < 6; i++){
	    array[i] = (int)(Math.random() *49);
	    System.out.println(array[i]);
    }
    }
}
