/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sorting;

import java.util.Arrays;


public class Sorting {
    private int[] numbers;
    
    public Sorting(int[]numbers){
        this.numbers=numbers;
    }
    
    public void OriginalArray(){
        System.out.println("Original Array:" +Arrays.toString(numbers));
    }
    
    public void sortArray(){
     Arrays.sort(numbers);   
        System.out.println("sorted array: " +Arrays.toString (numbers));
        
    }
    public static void main(String [] args){
        int [] array = {9,7,6,10,3,5};
        Sorting Sorter = new Sorting(array);
        Sorter.OriginalArray();
        Sorter.sortArray();
    }
}
