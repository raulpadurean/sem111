package org.example;

public class StringOps {

    public String reverse(String str){
        String reversed = "";

        for(int i=str.length() -1 ; i>=0 ;i--){
            reversed += str.charAt(i);
        }
            return reversed;
    }

    public int wordCount(String str){
        int count = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ')
            {
                count++;
            }
        }
        return count+1;
    }

}
