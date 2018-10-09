package com.company.department1;

import com.company.department2.Piece;
import com.company.department2.Rook;
import com.company.exam.FourthQuestion;
import com.company.exam.SecondQuestion;
import com.company.exam.ThirdQuestion;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        /**数据类型**************************************************/
        int iVal1 = 88;
        iVal1 = -9;
        iVal1 = 9;
        //iVal1 = 9.9; //整型变量不能付值为小数

        int iVal2 = 3;
        int iVal3 = iVal1 + iVal2;
        int iVal4 = iVal1 - iVal2;
        int iVal5 = iVal1 * iVal2;
        int iVal6 = iVal1 / iVal2; //整除

        int iVal7 = 9 % 2; //取余数
        int iVal8 = 9 % 3;


        double dVal1;
        dVal1 = 99.9;


        boolean isValid = true;
        isValid = false;
        iVal1 = 88;
        isValid = iVal1 == 88;
        isValid = iVal1 == 99;
        isValid = iVal1 > 99;
        isValid = iVal1 < 99;
        isValid = iVal1 <= 99;
        isValid = iVal1 >= 99;

        char cVal1 = 'd';


        String str = "I am a String";

        String firstName = "Alan";
        String lastName = "Turing";
        String fullName = firstName + lastName;

        fullName = firstName + " " + lastName;
        System.out.println(fullName);

        /**类型转换**************************************************/
        int iNum = Integer.parseInt("33");//字符串转整型
        double dNum = Double.parseDouble( "33.3" );//字符串转double

        String string = String.valueOf(33);

        //Integer iNum = 3;
        //String string = iNum.toString();//整型转字符串
        //iNum = Integer.parseInt(string);//字符串转整型

        //Float fNum = 5.4f;


        /**if**************************************************/
        iVal1 = 88;
        if(iVal1 == 88){
            System.out.println("val1 = 88");
        }

        if(iVal1 == 99){
            System.out.println("val1 = 99");
        } else {
            System.out.println("val1 != 99");
        }

        boolean isTrue1 = true && true;
        boolean isTrue2 = false && true;
        boolean isTrue3 = true && false;
        boolean isTrue4 = false && false;

        boolean isTrue5 = true || true;
        boolean isTrue6 = false || true;
        boolean isTrue7 = true || false;
        boolean isTrue8 = false || false;


        if(iVal1 > 0 && iVal1 < 100){
            System.out.println("between 0 and 100");
        }

        if(iVal1 < 0 || iVal1 > 100){
            System.out.println("not between 0 and 100");
        }

        String str1 = "firststring";

        String str2 = "first";
        String str3 = "string";
        String str4 = "stst";
        String str5 = "second";

        boolean isContains2 = str1.contains(str2);
        boolean isContains3 = str1.contains(str3);
        boolean isContains4 = str1.contains(str4);
        boolean isContains5 = str1.contains(str5);

        if(str1.contains(str5)) {

            System.out.println("contains second");

        }else if(str1.contains(str4)) {

            System.out.println("contains stst");

        }else if(str1.contains(str3)) {
            // if 和 多个else if 只要有一个为true，就不再继续判断
            System.out.println("contains string");
        }else {

            System.out.println("contains first");
        }

        /**loop**************************************************/
        int amount = 3;
        for (int i = 0; i < amount; i++){
            //topic[i] = JOptionPane.showInputDialog("Topic" + i + "is:");
            System.out.println("Topic" + i + "is:");
        }

        int[] iNumArray = {3, 2, 5,9};
        for(int j : iNumArray){
            System.out.println(j);
        }

        int k = 1;
        while(k <= 3){
            System.out.println("Topic" + k + "is:");
            k++;
        }

        int age = 230;
//        while (age < 0 || age >100) {
//            System.out.println("not between 0 and 100"); //死循环
//        }

        /**io**************************************************/
        //firstName = JOptionPane.showInputDialog("Enter first name");
        //JOptionPane.showMessageDialog(null,"Welcome " + firstName + "!");


        /**Stage**************************************************/
        //Stage1.main(args);

        //Stage2.main(args);

        /**数组**************************************************/
        //初始化
        int[] n1 = {3, 5, 9, 7, 4, 1};
        int n2[] = new int[10];

        Arrays.sort(n1); //数组排序
        System.out.print(Arrays.toString(n1));

        String strArray[] = {"str1", "str2", "str3", "str4"};
        String[] strArray2 = new String[10];

        //遍历
        for(int i : n1){
            System.out.println(i);
        }

        for(String str11 : strArray){
            System.out.println(str11);
        }

        /**类-封装继承*****************************************************/
        int maxAmount = Piece.BOARD_SIZE;// static 只能通过"类名."访问，属性和方法同理

        Piece piece = new Piece();
        //int public_variable = piece.public_variable;       //包内可访问
        //int protected_variable = piece.protected_variable; //包内可访问
        //int default_variable = piece.default_variable;     //包内可访问
        //int private_variable = piece.private_variable;   //包内不可访问

        Rook rook = new Rook();
        rook = new Rook(33,44);

        boolean isValidMove = rook.isValidMove(55,66);

        /**试卷*****************************************************/
        SecondQuestion.main(args);
        ThirdQuestion.main(args);
        FourthQuestion.main(args);

    }
}
