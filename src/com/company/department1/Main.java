package com.company.department1;

public class Main {

    public static void main(String[] args) {

        /**数据类型**************************************************/
        int val1 = 88;
        double val2;
        val2 = 99.9;
        //val1 = 99.9;
        val2 = val1 * val2;

        String str = "I am a String";

        Integer iNum = 3;
        String string = iNum.toString();//整型转字符串
        iNum = Integer.parseInt(string);//字符串转整型

        //Float fNum = 5.4f;

        boolean isValid = true;
        isValid = false;
        isValid = val1 == 88;
        isValid = val1 == 99;


        /**if**************************************************/
        if(val1 == 88){
            System.out.println("val1 = 88");
        }

        if(val1 == 99){
            System.out.println("val1 = 99");
        } else {
            System.out.println("val1 != 99");
        }

        if(val1 > 0 && val1 < 100){
            System.out.println("between 0 and 100");
        }

        if(val1 < 0 || val1 > 100){
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
        while (age < 0 || age >100) {
            System.out.println("not between 0 and 100"); //死循环
        }

        /**Stage**************************************************/
        //Stage1.main(args);

        Stage2.main(args);
    }
}
