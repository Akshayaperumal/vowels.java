# vowels.java
import java.io.*;
import java.util.*;
public class vowels
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int flag=0;
        String a=s.next();
        char[] c=a.toCharArray();
        for(int i=0;i<a.length();i++)
        {
        if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u')
        {
          flag+=1;
        }
        }
        if(flag>=1)
        {
            System.out.println("vowels");
        }
        else
        {
            System.out.println("consonants");
        } 
          
    }
}


