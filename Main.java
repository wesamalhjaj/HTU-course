package com.company;

import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String p = reader.next();
        char[] ch = p.toCharArray();
        boolean c = true;
        for(int i=1; i<ch.length; i++)
            if(Character.isLowerCase(ch[i]))
                c = false;
        if(c)
            for(int i=0; i<ch.length; i++)
                if(Character.isUpperCase(ch[i]))
                    ch[i] = Character.toLowerCase(ch[i]);
                else
                    ch[i] = Character.toUpperCase(ch[i]);
        for (char value : ch) System.out.print(value);
    }
}