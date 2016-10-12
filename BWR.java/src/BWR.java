/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Arrays;
import java.util.Random;
package bwr;

/**
 *
 * @author meganmoore
 */
public class BWR {
    
    char[] arr=new char[30];
    //int arraySize=30;
    
    
   public BWR(){
       
   }
   
    public static void main(String[] args)
    {
        new BWR().insert();
        new BWR().sort();
       // new BWRJava().sort();
    }
    public char randChar()
    {
        Random rand=new Random();
        int x=rand.nextInt(3)+1;

        if(x==3){
            return 'B';
        }
        if(x==2){
            return 'W';
        }
        else{
            return 'R';
        }
    }
    
    public void insert()
    {
       for(int i=0; i <=arr.length; i++)
       {
           arr[i]=randChar();
           System.out.print(arr[i]);
       }
    }
   public void sort()
    {
       int k=0;
        int n=29;
        char y;
        char z;
        int x;
        for(x=0; x<=arr.length; x++)
        {
            if(arr[x]=='B')
            {
                while(arr[k]=='B')
                    k++;
                y=arr[k];
                arr[x]=y;
                arr[k]='B';
            }
            if(arr[x]=='W')
            {
                while(arr[n]=='W')
                    n--;
                z=arr[n];
                arr[x]=z;
                arr[n]='W';
            }    
            x++;

        }
        System.out.print(arr[x]);
        
    }

   
}
