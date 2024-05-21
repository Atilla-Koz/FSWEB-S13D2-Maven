package org.example;

public class Main {
     public static boolean isPalindrome(int x) {

          x = Math.abs(x);

          int reversed = 0;
          int original = x;

          while (x != 0) {
               reversed = reversed * 10 + x % 10;
               x = x / 10;
          }

          return original == reversed;
     }



     public static boolean isPerfectNumber(int number) {
          if (number < 1) {
               return false;
          }
          int sum = 0;
          for (int i = 1; i < number; i++) {
               if (number % i == 0) {
                    sum += i;
               }
          }
          return sum == number;
     }


   public static String numberToWords(int number){
        if(number < 0){
             return "Invalid Value";
        }
        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String result = "";
        while(number != 0){
             int digit = number % 10;
             result = words[digit] + " " + result;
             number = number / 10;
        }
        return result.trim();
   }

}



