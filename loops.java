FIBONAACI SERIES
import java.util.*;
class solution {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int first=0;
        int second=1;
        int next=0;
        System.out.print(first+" "+second);
        next=first+second;
        while(next<=n){
            first=second;
            second=next;
            System.out.print(" "+next);
            next=first+second;
        }
    }
}
----------------------------------------------------------------
SUM OF DIGITS
import java.util.*;
class solution{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int rem=0;
        while(n!=0){
            rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        System.out.println(sum);
    }
}
----------------------------------------------------------------
REVERSE OF DIGITS 
import java.util.*;
class solution{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rem,rev=0;
        while(n!=0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println(rev);
    }
}

import java.util.*;
class solution{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        String rev="";
        for(int i=n.length()-1;i>=0;i--){
            rev=rev+n.charAt(i);
        }
        System.out.print(rev);
    }
}
--------------------------------------------------------------
PALLINDROME

INTEGER
import java.util.*;
class sol{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int rem,rev=0;
        while(temp!=0){
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        if(n==rev){
            System.out.println("Yes");
        }
        else{
            System.out.println("no");
        }
    }
}

STRING
import java.util.*;
class sol{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        String rev="";
        for(int i=n.length()-1;i>=0;i--){
            rev=rev+n.charAt(i);
        }
        if(rev.equals(n)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}

BETWEEN RANGE 
import java.util.*;
class sol{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int rem,rev=0;
        while(n1<n2){
            int temp=n1;
            while (temp!=0){
                rem=temp%10;
                rev=rev*10+rem;
                temp=temp/10;
            }
            if(rev==n1){
                System.out.print(rev+" ");
            }
            rev=0;
            rem=0;
            n1=n1+1;
        }
    }
}

CONSECUTIVE PALLINDROME 
import java.util.*;
class sol{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=1;
        while(count<=5){
            int temp=n;
            int rem=0;
            int rev=0;
            while(temp>0){
                rem=temp%10;
                rev=rev*10+rem;
                temp=temp/10;
            }
            if(n==rev){
                System.out.print(n+" ");
                count++;
            }
            n++;
            
        }
    }
}
------------------------------------------------------------------------
BINARY TO DECIMAL
import java.util.*;
class sol{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        int decimal=0;
        int power=n.length()-1;
        for(int i=0;i<n.length();i++){
            char bit=n.charAt(i);
            if(bit=='1'){
                decimal=decimal+(int)Math.pow(2,power);
            }
            power--;
        }
        System.out.println(decimal);
    }
}
-------------------------------------------------------------------------------
CUBE OF SUM OF EVEN NUMBERS IN A RANGE
import java.util.*;
class sol{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int cube=0;
        int result=0;
        while(n1<=n2){
            if(n1%2==0){
                result=result+n1;
            }
            n1++;
        }
        System.out.print(result*result*result);
    }
}
-------------------------------------------------------------------------------------
COUNT
import java.util.*;
class sol{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        do{
            count++;
            n=n/10;
        }while(n!=0);
    System.out.println(count);
        
    }
    
}
import java.util.*;
class sol{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        int count=0;
        for(int i=0;i<n.length();i++){
            count++;
        }
        System.out.println(count);
        
    }
}
-----------------------------------------------------------------------------------------
SUM OF FIRST AND LAST 
import java.util.*;
class sol{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int last=n%10;
        String str=String.valueOf(n);
        char ch=str.charAt(0);
        int first=ch-'0';
        System.out.print(first+last);
    }
}

import java.util.*;
class sol{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int last=n%10;
        int first=0;
        while(n>0){
            first=n%10;
            n=n/10;
        }
        System.out.print(first+last);
    }
}
----------------------------------------------------------------------------
TWIN PRIME 
import java.util.*;
class sol{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            boolean p1=false;
            boolean p2=false;
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                p1=true;
            }
            count=0;
            int next=i+2;
            for(int j=1;j<=next;j++){
                if(next%j==0){
                    count++;
                }
            }
            if(count==2){
                p2=true;
            }
            if(p1 && p2){
                System.out.println("("+i+","+next+")");
            }
        }
    }
}
----------------------------------------------------------------------------------
AUTOMORPHIC NUMBER
import java.util.*;
class sol{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        while(n1<=n2){
            int temp=n1;
            int sq=n1*n1;
            int divisor=1;
            while(temp>0){
                divisor=divisor*10;
                temp=temp/10;
            }
            if(sq%divisor==n1){
                System.out.println(n1);
            }
            n1++;
        }
    }
}
--------------------------------------------------------------------------------------
AMSTRONG NUMBER 

import java.util.*;
class sol{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int count=0;
        String n1=String.valueOf(n);
        int len=n1.length();
        int ams=0;
       while(n!=0){
           int rem=n%10;
           ams=ams+(int)Math.pow(rem,len);
           n=n/10;
       }
       if(temp==ams){
           System.out.println("yes");
       }
       else{
           System.out.println("no");
       }
       
    }
}


BETWEEN RANGE
import java.util.*;
class sol{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        while(n1<n2){
            int temp=n1;
            String t=String.valueOf(n1);
            int power=t.length();
            int rem,ams=0;
            while(temp!=0){
                 rem=temp%10;
                ams=ams+(int)Math.pow(rem,power);
                temp=temp/10;
            }if(ams==n1){
                System.out.println(ams);
            }
            n1++;
            
        }
    }
}
------------------------------------------------------------------------------------
HARSHAD NUMBER 
import java.util.*;
class sol{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String n1=String.valueOf(n);
        int sum=0;
        for(int i=0;i<n1.length();i++){
            char c=n1.charAt(i);
            int num=c-'0';
            sum=sum+num;
        }
        System.out.println(sum);
        if(n%sum==0){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
------------------------------------------------------------------------------------------
POWER OF 2 OR NOT
import java.util.*;
class sol{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean result=false;
        for(int i=0;i<=n;i++){
            int a=(int)Math.pow(2,i);
            if(a==n){
                
               result=true;
            }
            
        }
        if(result){
            System.out.print("yes");
        }else{
        System.out.print("no");
    }
    }
}
-------------------------------------------------------------------------------------------
BUZZ FIZZ 
import java.util.*;
class sol{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%3==0){
                System.out.print("buzz"+" ");
            }
            else if(i%5==0){
                System.out.print("fizz"+" ");
            }
            else{
                System.out.print(i+" ");
            }
        }
    }
}
----------------------------------------------------------------------------------------------
SUM OF %3 OR %5
import java.util.*;
public class sol{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                continue;
            }
            else if(i%3==0 || i%5==0){
                sum=sum+i;
            }
        }
        System.out.print(sum);
    }
}
-----------------------------------------------------------------------------------------------
PERFECT NUMBER OR NOT
import java.util.*;
class sol{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(sum==n){
            System.out.print("yes");
        }
        else{
            System.out.print("no");
        }
    }
}

BETWEEN RANGE
import java.util.*;
class sol{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=1;
        while(n1<n){
            int sum=0;
            for(int i=1;i<n1;i++){
                if(n1%i==0){
                    sum=sum+i;
                }
            }
            if(sum==n1){
                System.out.print(n1+" ");
            }
            n1++;
            
        }
    }
}
-------------------------------------------------------------------------------
NTH PRIME 
import java.util.*;
class sol{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int start=1;
        int lastprime=0;
        while(count!=n){
            int flag=0;
            
            for(int i=1;i<=start;i++){
                if(start%i==0){
                    flag++;
                }
            }
            if(flag==2){
                //System.out.print(start+" ");
                lastprime=start;
                count++;
            }
            start++;
        }
        System.out.print(lastprime);
    }
}
----------------------------------------------------------------------------------
TRIANGULAR NUMBER 
import java.util.*;
class sol{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int sum=0;
            for(int j=1;j<=i;j++){
                sum=sum+j;
            }
            System.out.print(sum+" ");
        }
    }
}

import java.util.*;
class sol{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int sum=i*(i+1)/2;
            System.out.print(sum+" ");
        }
    }
}
------------------------------------------------------------------------------------
KAPREKAR NUMBER 
import java.util.*;
class sol{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sq=n*n;
        int temp=n;
        int divisor=1;
        while(temp>0){
            divisor=divisor*10;
            temp=temp/10;
        }
        int left=sq%divisor;
        int right=sq/divisor;
        if(left+right==n){
            System.out.print("Yes");
        }
        else{
            System.out.print("no");
        }
    }
}
--------------------------------------------------------------------------------------------
UGLY NUMBER 
import java.util.*;
class sol{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n%2==0){
            n=n/2;
        }
        while(n%3==0){
            n=n/3;
        }
        while(n%5==0){
            n=n/5;
        }
        if(n==1){
            System.out.print("yes");
        }
        else{
            System.out.print("no");
        }
    }
}
-----------------------------------------------------------------------------------------
SUM OF DIVISORS AND REVERSE
import java.util.*;
class sol{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        
        String sum1=String.valueOf(sum);
        int len=sum1.length();
        for(int i=len-1;i>=0;i--){
            char c=sum1.charAt(i);
            System.out.print(c);
        }
    }
}
------------------------------------------------------------------------------------------
FACTORIAL 
import java.util.*;
class sol{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;
        for(int i=n;i>0;i--){
            fact=fact*i;
        }
        System.out.print(fact);
    }
}


CONSECUTIVE FACCTORIAL 
import java.util.*;
class sol{
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int found=0;
     for(int i=1;i<n;i++){
         int fact=1;
         for(int j=1;j<=i;j++){
             fact=fact*j;
         }
         if(fact==n){
             found=i;
             System.out.println(i);
         }
     }
     int n1=found+1;
     int count=0;
     while(count!=5){
         int fact=1;
         for(int i=1;i<=n1;i++){
             fact=fact*i;
         }
         System.out.print(fact+" ");
         count++;
         n1++;
     }
     
    }
}
-------------------------------------------------------------------------------
CATALAN NUMBER 
import java.util.*;
class sol{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int k=0;k<=n;k++){
            long res=1;
            int r=k;
            if(r>(2*k-r)){
                r=2*k-r;
            }
            for(int i=0;i<r;i++){
                res=res*(2*k-i);
                res=res/(i+1);
            }
            long cat=res/(k+1);
            System.out.println("C("+k+")="+cat);
        }
    }
}
---------------------------------------------------------------------------------
FLYOD'S TRIANGLE 
import java.util.*;
class sol{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}

1 
2 3 
4 5 6 
7 8 9 10 
---------------------------------------------------------------------------------------
CUBE ROOT
import java.util.*;
class sol{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int cube=(int)Math.round(Math.cbrt(n));
       if(cube*cube*cube==n){
           System.out.print("yes");
       }
       else{
           System.out.print("no");
       }
    }
}
------------------------------------------------------------------------------------------
CLIMBING STAIRS
import java.util.*;
class sol{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=2){
            System.out.print(n);
        }
        int a=1;
        int b=2;
        int ways=0;
        for(int i=3;i<=n;i++){
            ways=a+b;
            a=b;
            b=ways;
        }
        System.out.print(b);
    }
}
-----------------------------------------------------------------------------------------
ALPHABET-> ASCII->HEXDECIMAL
import java.util.*;
class sol{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        int n=(int)ch;
        System.out.println(n);
        String hex=Integer.toHexString(n);
        System.out.print(hex);
        
    }
}
--------------------------------------------------------------------------------------------
TRIBONACCI SERIES 
import java.util.*;
class sol{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int c=1;
        int next=0;
        System.out.print(a+" "+b+" "+c+" ");
        for(int i=3;i<=n;i++){
            next=a+b+c;
            System.out.print(next+" ");
            a=b;
            b=c;
            c=next;
            
            
        }
    }
}
--------------------------------------------------------------------------------------------------
