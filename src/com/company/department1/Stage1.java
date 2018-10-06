package com.company.department1;

import javax.swing.*;

public class Stage1 {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Starting type your things");
        String firstTopic = JOptionPane.showInputDialog(null,"Type your first topic here");
        String secondTopic = JOptionPane.showInputDialog(null,"Type your second topic here");
        String thirdTopic = JOptionPane.showInputDialog(null,"Type your third topic here");

        while(true) {

            JOptionPane.showMessageDialog(null, "Starting talk about your things");

            String userQuestion = JOptionPane.showInputDialog(null,
                    "please tell something about " + firstTopic + "," + secondTopic + "," + thirdTopic);

            if(userQuestion.contains(firstTopic)) {

                String firstQuestionDetail = JOptionPane.showInputDialog(null,
                        "please talk something about " + firstTopic);

            }else if(userQuestion.contains(secondTopic)) {

                String secondQuestionDetail = JOptionPane.showInputDialog(null,
                        "That' cool, what about" + secondTopic);

            }else {
                String thirdQuestionDetail = JOptionPane.showInputDialog(null,
                        "And then how about the " + thirdTopic);
            }
        }
    }
}
