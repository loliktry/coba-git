/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lat1;

/**
 *
 * @author jan
 */
public class StrOps {
    public static void main(String args[]) {
        String str1 = "When it comes to Web programming, Java is #1.";
        String str2 = new String(str1);
        String str3 = "Java strings are powerful.";
        int result, idx;
        char ch;
        System.out.println("Length of str1: " + str1.length());//45
        // display str1, one char at a time.
        for(int i=0; i < str1.length(); i++)  //When it comes to Web programming, Java is #1.
            System.out.print(str1.charAt(i)); 
        System.out.println();
        //if(str1.equals(str2)) // true
        if(str1 == str3) // true
            System.out.println("str1 equals str2*");
        else
            System.out.println("str1 does not equal str2");
        
        if(str1.equals(str3)) // false
            System.out.println("str1 equals str3");
        else
            System.out.println("str1 does not equal str3*");
        
        result = str1.compareTo(str3); // lebih dari nol ??       
        if(result == 0)
            System.out.println("str1 and str3 are equal");
        else if(result < 0)
            System.out.println("str1 is less than str3="+result);
        else
            System.out.println("str1 is greater than str3*="+result);
        
        // assign a new string to str2
        str2 = "One Two Three One";
        idx = str2.indexOf(" "); // 3
        System.out.println("Index of first occurrence of One: " + idx);
        idx = str2.lastIndexOf("One"); // 14
        System.out.println("Index of last occurrence of One: " + idx);
    }
}