package com.company.department1;

import javax.swing.*;

public class Stage2 {
    public static void main(String[] args) {

//        JOptionPane.showMessageDialog(null, "Welcome!");
//
//        String num= JOptionPane.showInputDialog("The amount of the topic is:");
//        int amount = Integer.parseInt(num);
//
//        while(amount <= 0) {
//            num= JOptionPane.showInputDialog("The amount of the topic is:");
//            amount =Integer.parseInt(num);
//        }

        int amount = 3;

        String[] topic = new String[amount];
        int number = 0;
        int i = 0;
        boolean equal = false;

        while(!equal) {
            //topic[i] = JOptionPane.showInputDialog("Topic" + i + "is:");
            System.out.println("Topic" + i + "is:");
            i++;
            if(number == amount) {
                equal = true;
            }
            number++;
        }

        String ques=" ";
        ques= JOptionPane.showInputDialog("Tell me more about topic"+i);
        boolean F=false;
        while(!F) {
            boolean C = false;
            int j=0;
            while(j<topic.length) {
                if(ques.contains(topic[j])) {
                    ques= JOptionPane.showInputDialog(null,"Twll me more about topic"+j);
                    C=true;
                    j=topic.length;
                }
                j++;
            }
            if(!C) {
                if(ques.contains("F"))
                    F=true;
            }

        }
    }
}
