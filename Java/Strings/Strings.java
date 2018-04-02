/* 
 Java Strings Introduction
 "A string is traditionally a sequence of characters, either as a literal constant or as some kind of variable." � Wikipedia: String (computer science)

This exercise is to test your understanding of Java Strings. A sample String declaration:

String myString = "Hello World!"
The elements of a String are called characters. The number of characters in a String is called the length, and it can be retrieved with the String.length() method.

Given two strings of lowercase English letters,  and , perform the following operations:

Sum the lengths of  and .
Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
Capitalize the first letter in  and  and print them on a single line, separated by a space.
Input Format

The first line contains a string . The second line contains another string . The strings are comprised of only lowercase English letters.

Output Format

There are three lines of output: 
For the first line, sum the lengths of  and . 
For the second line, write Yes if  is lexicographically larger than  or No if it is not. 
For the third line, capitalize the first letter in both  and  and print them on a single line, separated by a space.

Sample Input

hello
java
Sample Output

9
No
Hello Java
Explanation

String  is "hello" and  is "java".

 has a length of , and  has a length of ; the sum of their lengths is . 
When sorted alphabetically/lexicographically, "hello" comes before "java"; therefore,  is not larger than  and the answer is No.

When you capitalize the first letter of both  and  and then print them separated by a space, you get "Hello Java".
 * */

import java.io.*;
import java.util.*;

public class Strings {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        int length = A.length()+B.length();
        
        
        System.out.println(length);
        
      
        String arr[]=new String[2];
       
        arr[0]=A;
        arr[1]=B;
        
        Arrays.sort(arr);
        
        if(arr[0].equals(arr[1])) {
        	System.out.println("No");
        }
        else if(B.equals(arr[0])) {
    	System.out.println("Yes");
    }
    else {
    	System.out.println("No");
    }
    
    
    char a1=A.charAt(0);
    char b1=B.charAt(0);
    
    a1=Character.toUpperCase(a1);
    b1=Character.toUpperCase(b1);
    
    System.out.println(a1+A.substring(1, (A.length()))+" "+ b1+B.substring(1, (B.length())));
    }
        
    }

