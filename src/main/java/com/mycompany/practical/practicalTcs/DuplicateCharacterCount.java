

package com.mycompany.practical.practicalTcs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class DuplicateCharacterCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input String:");
        String str = sc.nextLine().trim();
        
        String[] strSpl= str.split(" ");
        str = strSpl[0];
        for(int i=1; i<strSpl.length; i++){
            str = str.concat(strSpl[i]);
        }
        System.out.println("Total duplicate character:"+stringCount(str.toLowerCase()));
        sc.close();
        
    }
    
    
    public static int stringCount(String str){
        int count;
        HashMap<Character,Integer> hs = new HashMap();
        for(int i=0; i<str.length(); i++){
            if(hs.containsKey(str.charAt(i))){
                count = hs.get(str.charAt(i));
                hs.put(str.charAt(i), ++count);
            }else
                hs.put(str.charAt(i), 1);
        }
        System.out.println(hs.toString());
        count=0;
        for(HashMap.Entry<Character, Integer> hsSet : hs.entrySet()){
            if(hsSet.getValue()> 1)
                count++;
        }
        
        return count;
    }
}
