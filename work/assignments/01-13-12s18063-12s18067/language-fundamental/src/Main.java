/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 13-12s18063 Calvin Adelbert Lumban Gaol
 * @author 13-12s18067 Grace Vidia Rosa Panjaitan
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] _args) {
        System.out.println("Hello, world!");
        
    // declaring and manipulating primitive variable
    int gear = 1;
    boolean result = true;
    char capitalC = 'C';
    byte b  = 100;
    
    System.out.println(gear + ", " + result + ", " + capitalC + ", " + b);
    
    gear++;
    result = !result;
    capitalC += 4;
    
    System.out.println(gear + ", " + result + ", " + capitalC + ", " + b);
    
    int hexVal = 0x1a;
    int binVal = 0b11010;
    
    System.out.println(hexVal + ", " + binVal);
    
    // intantiating and manipulating objects
    String name = "Wiro Sableng";
    Short gearObject = 1;
    Boolean resultObj = true;
    
    System.out.println(name + ", " + gearObject + ", " + resultObj);
    
    name = name.toUpperCase();
    gearObject++;
    resultObj = (result == false) || !resultObj;
    
    System.out.println(name + ", " + gearObject + ", " + resultObj);
    
    
    // array, collections, and loop 
    int[][] numbers = new int[10][10];
    
    for(int i = 0; i < numbers.length; ++i){
        for(int j = 0; j < numbers[i].length; ++j){
            numbers[i][j] = i + j;
        } 
    }
    
    for(int i = 0; i < numbers.length; ++i){
        for(int j = 0; j < numbers[i].length; ++j){
            System.out.print(numbers[i][j] + " ");
        }
    
    //Challenge
    System.out.println(); 
    System.out.println("Challenge");
    ArrayList<Integer> challenge = new ArrayList<>();
    int number = 10; 
    
    
    for(int a=0; a<number; ++a){
        int x = 0;
        int y = 0;
        for(int j = 0; j < number; ++j){
            x = a + j;
            System.out.print(x + " ");
            y++; 
        }
        System.out.println();
    }
    }
    }
}
