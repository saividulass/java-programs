1)  INPUT AND VARIABLES
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        float b=obj.nextFloat();
        char ch=obj.next().charAt(0);
        System.out.println(a+""+ch);
        
    }
}
-----------------------------------------------------------------------------------------------------
2)FLOAT PRECISION
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        float a =obj.nextInt();
        String formatted=String.format("%.2f",a);
        System.out.println(formatted);
    }
}
-----------------------------------------------------------------------------------------------------
3)CALORIES CALCULATOR
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
            int a=obj.nextInt();
            char ch=obj.next().charAt(0);
            double result=0;
            if(ch=='I'){
               result=a*2;
            }
            else if(ch=='M'){
                result=a*1.5;
            }
            else if(ch=='D'){
                result=a*1;
            }
            else{
                System.out.println("Invalid");
                return;
            }
            String formatted=String.format("%.2f",result);
            
            System.out.println(formatted+" CALORIES");
        
    }
}
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
            int num=obj.nextInt();
            char ch=obj.next().charAt(0);
            if(ch=='I'){
                System.out.println(num*2+" calories");
            }
            else if(ch=='M'){
                String change=String.format("%.0f",num*1.5);
                System.out.println(change+" calories");
            }
            else if(ch=='D'){
                System.out.println(num*1+ " calories");
        
            }
        
    }
}
------------------------------------------------------------------------------------------------------------
4) CHARACTER COMPARISON 

import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        char ch1=obj.next().charAt(0);
        char ch2=obj.next().charAt(0);
        if(ch1>ch2){
            System.out.print(ch1+" is greater than "+ch2);
        }
        else if(ch2>ch1){
            System.out.print(ch1+" is smaller than "+ch2);
        }
        else{
            System.out.print("both are equal");
        }
    }
}

----------------------------------------------------------------------------------------------------------------
5) SIMPLE INTREST 

import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int p=obj.nextInt();
        float r=obj.nextFloat();
        int t=obj.nextInt();
       float result=(p*t*r)/100;
       String change=String.format("%.2f",result);
        System.out.println(change);
    }
}

-----------------------------------------------------------------------------------------------------------------
6) COMPOUND INTREST 
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int p=obj.nextInt();
        float r=obj.nextFloat();
        int t=obj.nextInt();
        double compound=p*Math.pow((1+r/100),t);
        double result=compound-p;
        String change=String.format("%.2f",result);
        System.out.print(change);
        
        
    }
}
------------------------------------------------------------------------------------------------------------------
7) CONDONENT VOWEL 
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        char ch1=obj.next().charAt(0);
        char ch2=obj.next().charAt(0);
        if((ch1=='a' || ch1=='e' || ch1=='i'|| ch1=='o'|| ch1=='u'|| ch1=='A'|| ch1=='E'|| ch1=='I'|| ch1=='O'|| ch1=='U') && (ch2=='a' || ch2=='e'|| ch2=='i'|| ch2=='o'|| ch2=='u'|| ch2=='A'|| ch2=='E'|| ch2=='I'|| ch2=='O'|| ch2=='U')){
            System.out.print(ch1+ch2);
        }
        else if((ch1!='a' && ch1!='e' && ch1!='i' && ch1!='o'&& ch1!='u' && ch1!='A'&& ch1!='E'&& ch1!='I'&& ch1!='O'&& ch1!='U') && (ch2!='a' && ch2!='e'&& ch2!='i'&& ch2!='o'&& ch2!='u'&& ch2!='A'&& ch2!='E'&& ch2!='I'&& ch2!='O'&& ch2!='U')){
            System.out.print(ch1*ch2);
        }
        else{
            System.out.print(ch1-ch2);
        }
        
    }
}
------------------------------------------------------------------------------------------------------------------
8) WINDOW SEAT 
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int cols=obj.nextInt();
        int seat=obj.nextInt();
        if(cols*11<seat || seat<=0){
            System.out.print("invalid");
        }
        else if(seat%cols==0 || seat%cols==1){
            System.out.print("window");
        }
        else{
            System.out.print("not");
        }
    }
}
---------------------------------------------------------------------------------------------------------------------
9) HEXADECIMAL AND OCTADECIMAL
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int decimal=obj.nextInt();
        String hex=Integer.toHexString(decimal);
        String oct=Integer.toOctalString(decimal);
        System.out.println(hex.toUpperCase()+" "+oct);
    }
}
------------------------------------------------------------------------------------------------------------------
10) EVEN SUM AND ODD SUM 
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
      Scanner obj=new Scanner(System.in);
      int a=obj.nextInt();
      int evensum=0;
      int oddsum=0;
      int rem =0;
      while(a!=0){
          rem=a%10;
          if(rem%2==0){
              evensum=evensum+rem;
          }
          else{
              oddsum=oddsum+rem;
          }
          a=a/10;
      }
      System.out.println(evensum+" "+oddsum);
    }
}
---------------------------------------------------------------------------------------------------------------------
11) AMOUNT SPLIT
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int amt=obj.nextInt();
        if(amt>=500){
            int n=amt/500;
            System.out.println("500 - "+n);
            amt=amt%500;
        }
        if(amt>=100){
            int n=amt/100;
            System.out.println("100 - "+n);
            amt=amt%100;
        }
        if(amt>=50){
            int n=amt/50;
            System.out.println("50 - "+n);
            amt=amt%50;
        }
        if(amt>=20){
            int n=amt/20;
            System.out.println("20 - "+n);
        }
        if(amt>=5){
            int n=amt/5;
            System.out.println("5 - "+n);
            amt=amt%5;
        }
        if(amt>=1){
            int n=amt/1;
            System.out.println("1 - "+n);
            amt=amt%1;
        }
    }
}
---------------------------------------------------------------------------------------------------------------
12) ALPHABET OR NUMBER OR SPECIAL CHARACTER 
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        char ch=obj.next().charAt(0);
        if ((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
            System.out.println("alphabet");
        }
        else if(ch>='0' && ch<='9'){
            System.out.println("number");
        }
        else{
            System.out.print("spl char");
        }
    }
}
----------------------------------------------------------------------------------------------------------------
13) SQUARE OR RECTANGLE 
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        if(a==b){
            System.out.println("square");
        }
        else{
            System.out.println("rectangle");
        }
    }
}
-------------------------------------------------------------------------------------------------------------------
14) SLOPE 
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int x1=obj.nextInt();
        int x2=obj.nextInt();
        int y1=obj.nextInt();
        int y2=obj.nextInt();
        float slope=(float)(y2-y1)/(x2-x1);
        if(slope>0){
            System.out.println("slope is positive");
        }
        else if(slope ==0){
            System.out.println("Slope is zero");
        }
        else if(slope <=0){
            System.out.println("Slope is negative");
        }
        System.out.printf("%.2f",slope);
    }
}
-------------------------------------------------------------------------------------------------------------------
15) ATTENDENCE PERCENTAGE
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int present=obj.nextInt();
        int absent=obj.nextInt();
        int total=present+absent;
        float eligible=((float)present/total)*100;
        if(eligible>=75){
            System.out.println("eligible");
        }
        else {
            char ch=obj.next().charAt(0);
            if(ch=='y'){
                System.out.println("eligible");
            }
            else{
                System.out.println("not");
    
            }}
    
        System.out.printf("%.2f",eligible);
    }
    
}
--------------------------------------------------------------------------------------------------------------------------
16) DIRECTION 
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        if(n>360){
            n=n-360;
        }
        if(n>=0 && n<=89){
            System.out.println("East");
        }
        else if(n>=90 && n<=179){
            System.out.println("south");
        }
        else if(n>=180 && n<=270){
            System.out.println("west");
        }
        else if(n>=271 && n<=360){
            System.out.println("North");
        }
    }
}
----------------------------------------------------------------------------------------------------------------------------
17) CHARACTER MULTIPLE 
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        char ch=obj.next().charAt(0);
        if(ch=='A'){
            System.out.println(n*2);
        }
        else if(ch=='B'){
            System.out.println(n*3);
        }
        else if(ch=='C'){
            System.out.println(n);
        }
        else{
            System.out.println("invalid");
        }
    }
}
--------------------------------------------------------------------------------------------------------------------------------
18) QUADRANTS
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt();
        int y=obj.nextInt();
        if(x==0 && y==0){
            System.out.println("Origin");
        }
        else if(x==0){
            System.out.println("Y axis");
        }
        else if(y==0){
            System.out.println("X axis");
        }
        else if(x>0 && y>0){
            System.out.println("1st");
        }
        else if(x<0 && y>0){
            System.out.println("2nd");
        }
        else if(x<0 && y<0){
            System.out.println("3rd");
        }
        else if(x>0 && y<0){
            System.out.println("4th");
        }
    }
}
---------------------------------------------------------------------------------------------------------------
19) HCF LCM
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        int hcf=1;
        for(int i=1;i<=a && i<=b;i++){
            if(a%i==0 && b%i==0){
                hcf=i;
            }
        }
        int lcm=(a*b)/hcf;
        System.out.println(hcf+" "+lcm);
    }
}
-------------------------------------------------------------------------------------------------------------------
20)SALARY PREDICTION 
import java.util.Scanner;
public class Main{
  public static void main(String args[]){
      Scanner obj=new Scanner(System.in);
      int basic =obj.nextInt();
      char ch=obj.next().charAt(0);
      if(ch=='a'){
          float hra=(20f/100)*basic;
          float da=(10f/100)*basic;
          System.out.println(hra+da+basic);
      }
      if (ch=='b'){
          float hra=(25f/100)*basic;
          float da=(12f/100)*basic;
          System.out.println(hra+da+basic);
      }
      if(ch=='c'){
          float hra=(30f/100)*basic;
          float da=(15f/100)*basic;
          System.out.println(hra+da+basic);
      }
  }    

}
------------------------------------------------------------------------------------------------------------------
21) ELECTRICITY BILL
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int unit=obj.nextInt();
        int total=0;
        if(unit<=100){
            total=unit*10;
        }
        else if(unit<=200){
            total=(100*10)+((unit-100)*15);
        }
        else if (unit>200){
            total=(100*10)+(100*15)+((unit-200)*20);
        }
        System.out.println(total);
    }
}


import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int unit=obj.nextInt();
        int total=0;
        if(unit<=100){
            total=0;
        }
        else if(unit <=300){
            total=((unit-100)*2);
        }
        else if(unit<=600){
            total=(200*2)+((unit-300)*3);
        }
        else{
            total=(200*2)+(300*3)+((unit-600)*5);
        }
        System.out.println(total);
    }
}
--------------------------------------------------------------------------------------------------------------------
22) PROFIT OR LOSS
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        float purchase =obj.nextFloat();
        float market=obj.nextFloat();
        if(market>purchase){
            System.out.printf("%.0f profit",market-purchase);
        }
        else{
            System.out.printf("%.0f loss",purchase - market);
        }
    }
}
--------------------------------------------------------------------------------------------------------------------
23) TIME DURATION 
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int sh=obj.nextInt();
        int sm=obj.nextInt();
        int eh=obj.nextInt();
        int em=obj.nextInt();
        int startmin=sh*60+sm;
        int endmin=eh*60+em;
        int duration=endmin-startmin;
        int hours=duration/60;
        int minutes=duration%60;
        System.out.printf("%02d hours and %02d minutes",hours,minutes);
    }
}

----------------------------------------------------------------------------------------------------------------------------
24) SIMPLE AND COMPOUND INTREST 
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        float p=obj.nextFloat();
        float r=obj.nextFloat();
        float t=obj.nextFloat();
        float simple=(p*t*r)/100;
        double intrest=p*Math.pow(1+(r/100),t);
        float compound=(float)intrest-p;
        System.out.printf("%.2f\n",simple);
        System.out.printf("%.2f",compound);
    }
}
----------------------------------------------------------------------------------------------------------------------------
25) SOUND 
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        if(num<=20){
            System.out.println("Infrated");
        }
        else if(num>=20 && num<=20000){
            System.out.println("Audible");
        }
        else {
            System.out.println("ultra sound");
        }
    }
}
-------------------------------------------------------------------------------------------------------------------------------
26) SALARY BONUS
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int salary=obj.nextInt();
        int ex=obj.nextInt();
        float bonus=0;
        if(ex>=10){
            bonus=((20f/100)*salary)+salary;
            System.out.println(bonus);
        }
        else if(ex>=5 && ex<=9){
            bonus=((10f/100)*salary)+salary;
        
            System.out.println(bonus);
        }
        else if(ex<5){
            bonus=((5f/100)*salary)+salary;
            System.out.println(bonus);
        }
        
    }
}
------------------------------------------------------------------------------------------------------------------------------
27) LEAP YEAR
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int year=obj.nextInt();
        if((year%4==0 && year%100!=0 )|| year%400==0){
            System.out.print("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
-----------------------------------------------------------------------------------------------------------------------------------
28)  DECIMAL TO HEXADECIMAL
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int decimal=obj.nextInt();
        String hex=Integer.toHexString(decimal);
        System.out.printf(hex);
    }
}
-----------------------------------------------------------------------------------------------------------------------------------
29) INTEGER TO BINARY NUMBER 
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        String bi=Integer.toBinaryString(n);
        System.out.printf(bi);
    }
}
--------------------------------------------------------------------------------------------------------------------------------
30) BINARY TO HEXADECIMAL 
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        String binary=obj.next();
        int decimal=Integer.parseInt(binary,2);
        String hex=Integer.toHexString(decimal);
        System.out.printf(hex);
    }
}
----------------------------------------------------------------------------------------------------------------------------------
31) OCTAL TO DECIMAL 
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        String binary=obj.next();
        int decimal=Integer.parseInt(binary,2);
        String hex=Integer.toHexString(decimal);
        System.out.printf(hex);
    }
}
---------------------------------------------------------------------------------------------------------------------------------
32) OCTAL TO BINARY 
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        String oct=obj.next();
        int decimal=Integer.parseInt(oct,8);
        String binary=Integer.toBinaryString(decimal);
        System.out.print(binary);
        
    }
}
---------------------------------------------------------------------------------------------------------------------------------
33) HEXADECIMAL TO DECIMAL 
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        String hex=obj.next();
        int decimal=Integer.parseInt(hex,16);
        System.out.print(decimal);
    }
}
---------------------------------------------------------------------------------------------------------------------------------
34) 
