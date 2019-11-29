package com.spartaglobal.codewars;

public class Main {

    public static void main(String[] args) {
	// write your code here
        countBits(1234);
        toJadenCase("most trees are blue");
        makeNegative(-29);
        sum(new int[]{1,2,3,4,5});
    }

//    Write a function that takes an integer as input, and returns the number of bits that are equal to one in the binary representation of that number. You can guarantee that input is non-negative.
//    Example: The binary representation of 1234 is 10011010010, so the function should return 5 in this case
    public static int countBits(int n){
        // Show me the code!
        Integer.toBinaryString(n);
        System.out.println(Integer.bitCount(n));
        return Integer.bitCount(n);
    }

//Jaden Smith, the son of Will Smith, is the star of films such as The Karate Kid (2010) and After Earth (2013).
//Jaden is also known for some of his philosophy that he delivers via Twitter. When writing on Twitter, he is known for almost always capitalizing every word.
//Your task is to convert strings to how they would be written by Jaden Smith.
//The strings are actual quotes from Jaden Smith, but they are not capitalized in the same way he originally typed them.

    public static String toJadenCase(String phrase) {
        // TODO put your code below this comment
        int spaceCount=0;
        char[] sentence = phrase.toCharArray();
        for(int i = 0; i< sentence.length;i++) {

            if (i==0){
                sentence[i] = Character.toUpperCase(sentence[i]);
            }

            if (Character.isWhitespace(sentence[i])) {
                spaceCount++;
                sentence[i+1] = Character.toUpperCase(sentence[i+1]);
            }

        }
        System.out.println(String.valueOf(sentence));
            return String.valueOf(sentence);
    }

//    Create a function (or write a script in Shell) that takes an integer as an argument and returns "Even" for even numbers or "Odd" for odd numbers.
public static String even_or_odd(int number) {
    //Place code here
    String ans;
    if(number%2==0){
        ans="Even";
    }
    else{
        ans="Odd";
    }

    return ans;
}
   // In this simple assignment you are given a number and have to make it negative. But maybe the number is already negative?
    public static int makeNegative(final int x) {
        int nNum=x;
        if(x> 0) {
            nNum=-nNum;
        }
        System.out.println(nNum);
        return nNum; // Your code here
    }
//    You get an array of numbers, return the sum of all of the positives ones.
//    Example [1,-4,7,12] => 1 + 7 + 12 = 20
//    Note: if there is nothing to sum, the sum is default to 0.
    public static int sum(int[] arr){
        int sNum=0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>0){
                sNum = sNum + arr[i];
            }
        }
        System.out.println(sNum);
            return sNum;
    }

    //Given an integral number, determine if it's a square number:
    //In mathematics, a square number or perfect square is an integer that is the square of an integer; in other words, it is the product of some integer with itself.
    //The tests will always use some integral number, so don't worry about that in dynamic typed languages.
    public static boolean isSquare(int n) {
        boolean square;
        double squareNum = Math.sqrt(n);
        if (squareNum-Math.floor(squareNum)==0){
            square=true;
        }
        else {
            square=false;
        }
        return square;
    }

}
