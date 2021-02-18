package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Integer[] notes = new Integer[6];
        int positiones = notes.length;
        System.out.println("My notes array have " +positiones+ " positiones.");
        Integer[] notes1 = {1,2,3,4,5,6};

        for(int i=0; i<positiones; i++){
            System.out.println("Nota "+(i+1)+" = " +notes1[i]);
        }

        List<String> alumnas = new ArrayList<>();
        alumnas.add("Brigitte");
        alumnas.add("Michelle");
        alumnas.add("Mary");
        alumnas.add("Gaby");
        alumnas.add("Ivana");
        System.out.println("Hay " +alumnas.size()+" alumnas");
        //alumnas.remove(3);
        //System.out.println("Hay " +alumnas.size()+" alumnas");
        for (int i=0;i<alumnas.size();i++){
            System.out.println("Alumna " +i+ ":" + alumnas.get(i));
        }
        
        Collections.sort(alumnas);
        for (int i=0;i<alumnas.size();i++){
            System.out.println("Alumna " +i+ ":" + alumnas.get(i));
        }







    }
}
