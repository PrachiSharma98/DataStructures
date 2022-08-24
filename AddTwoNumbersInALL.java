<!--You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.-->
  
  package Strings;

import java.io.StringBufferInputStream;

/**
 * Diff methods to reverse a string in java.
 *
 */

public class ReverseStrings {


    public static void main(String[] args)
    {
       int[] arr={1,4,2,5,3};
       int s=0;
       for(int i=0;i<arr.length;i++)
       {
           for(int j=i;j<arr.length;j+=2)
           {
               for(int k=i;k<=j;k++)
               {
                   s=s+arr[k];
               }
           }

       }
        System.out.println(s);
    }


}

  
