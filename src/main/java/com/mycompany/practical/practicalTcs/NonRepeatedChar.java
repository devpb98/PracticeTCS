
package com.mycompany.practical.practicalTcs;


import java.util.Scanner;


public class NonRepeatedChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input String:");
        String str = sc.nextLine().trim();
        
        String[] strSpl= str.split(" ");
        str = strSpl[0];
        for(int i=1; i<strSpl.length; i++){
            str = str.concat(strSpl[i]);
        }
        char ch = nonRepeatedChar(str);
        if(ch == ' '){
            System.out.println("String is empty or there is no non repeated character in string.");
        }else
            System.out.println("First non repeated character is "+nonRepeatedChar(str));
        sc.close();
    }
    
    public static char nonRepeatedChar(String str){
        char ch = ' ';
        int count =0;
        char[] strCh = str.toCharArray();
        for(int i=0; i<strCh.length; i++){
            count =0;
            for(int j=0; j<strCh.length; j++ ){
                if(i != j)
                    if(strCh[i] == strCh[j])
                        count++;
            }
            if(count == 0)
                return strCh[i];
        }
        
        return ch;
    }
}
