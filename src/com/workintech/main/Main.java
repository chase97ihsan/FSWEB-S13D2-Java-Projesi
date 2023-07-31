package com.workintech.main;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
        System.out.println("Perfect Numbers;");
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
        System.out.println("NumbersToWords;");
        System.out.println(numberToWords(123));
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(-12));
    }
    public static boolean isPalindrome(int number){
        number=Math.abs(number);
        char[] numberr=String.valueOf(number).toCharArray();
        String reverse="";
        for (int i=numberr.length-1; i>=0; i--){
            reverse=reverse+numberr[i];
        }
        return reverse.equals(String.valueOf(number));

    }
    public  static boolean isPerfectNumber(int number){
        if(number<0){return false;}

        int sum=0;
        for(int i =1; i<=number/2; i++){
            if(number%i==0){
                sum=sum+i;
            }
        }
        return sum==number ;
    }
    public static String numberToWords(int number){
        if (number<0){
            return "Invalid Value";
        }
        char[] array=String.valueOf(number).toCharArray();
        String numberWords="";
        for(char c:array){
            switch (c){
                case '0':
                    numberWords+="zero ";
                    break;
                case '1':
                    numberWords+="one ";
                    break;
                case '2':
                    numberWords+="two ";
                    break;
                case '3':
                    numberWords+="three ";
                    break;
                case '4':
                    numberWords+="four ";
                    break;
                case '5':
                    numberWords+="five ";
                    break;
                case '6':
                    numberWords+="six ";
                    break;
                case '7':
                    numberWords+="seven ";
                    break;
                case '8':
                    numberWords+="eight ";
                    break;
                case '9':
                    numberWords+="nine ";
                    break;
            }
        }
        return  numberWords.trim();
    }
    private void mymethod(){

    }
}