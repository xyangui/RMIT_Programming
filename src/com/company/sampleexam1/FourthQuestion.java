package com.company.sampleexam1;

import javax.swing.*;

public class FourthQuestion {
	 public static void main(String[] args) {
		 
       //JOptionPane.showMessageDialog(null, "Welcome!");

       String num = JOptionPane.showInputDialog("The amount of the inputting number is:");
       int amount = Integer.parseInt(num);

       while(amount <= 0) {
           num = JOptionPane.showInputDialog("The amount of the inputting number is:");
           amount = Integer.parseInt(num);
       }
       
       int[] iArray = new int[amount];
       
       for (int i = 0; i < amount; i++){
    	   iArray[i] = Integer.parseInt(JOptionPane.showInputDialog("Number" + i + "is:"));
       }
       
       for (int i = 0; i < amount; i++){
    	   
    	   boolean isUnique = true;
    	   
    	   for (int j = 0; j < amount; j++){
    		   
    		   if (i != j) {
    			   if (iArray[i] == iArray[j]) {
    				   isUnique = false;
    			   }
    		   }   
    	   }
    	   
    	   if(isUnique) {
    		   //System.out.println(iArray[i] + " was unique");
			   JOptionPane.showMessageDialog(null,iArray[i] + " was unique");
    	   }
       }
	 }
}
