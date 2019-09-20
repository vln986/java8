package com.java.programs;

import java.util.Arrays;

 class Ex1 { 
    
    private int[] dataD; 
  
    // altered to make a deep copy of values 
    public Ex1(int[] values) { 
        dataD = new int[values.length]; 
        for (int i = 0; i < dataD.length; i++) { 
            dataD[i] = values[i]; 
        } 
    } 
  
    public void showData() { 
        System.out.println(Arrays.toString(dataD)); 
    } 
} 
public class DeepCopy {
	
	public static void main(String[] args) { 
        int[] vals = {3, 7, 9}; 
        Ex1 e = new Ex1(vals); 
        e.showData(); // prints out [3, 7, 9] 
        vals[0] = 13; 
        e.showData(); // prints out [3, 7, 9] 
  
       // changes in array values will not be  
       // shown in data values.  
    } 

}
