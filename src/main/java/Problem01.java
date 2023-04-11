/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MoaathAlrajab
 */
public class Problem01 {
    
    public static void func1(int n){
        int i=1,j=1,k=1;
        int x=0,y=0;

        for ( ; i<=n; i++){ 
            for (; j<=n;  j=j*2){ //log2(n)
                 //System.out.print("A'");
                 x++;
            }
        }
         for (;k<=j*j; k++){ //n
            //System.out.print("A'");
            y++;
         }

         System.out.print(" \n x= "+x +" y= "+y);
    
    }
    
    //1. O(log3(n))?? havent practiced this in a while..
    
    public static void func2(int n){
        int k,j,i=n;
        while(i>1){ 
            j=1;
            while(j<n){ //log(n)
                k=0;
                while(k<n){ //for(k=0;k<n;k+2) n/2 ?
                    k=k+2; 
                   
                }
                j=j*2;
            }
            i=i/2;
        }
       
    }
    //2. O(logn(n))?
   // also discuss T(n) = 3 T(n/4) + n
    //T(n) = a T(n/b) + f(n)
    //a = 3, b = 4, f(n) = n
    //n^(log_4(3))
    //T(n) = O(n^(log_4(3)))?
}
