PRINT THE DIFFERENCE OF REMAINING VALUES

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(i==0){
                System.out.print(arr[i]);
            }
            else{
                System.out.print(arr[i]-arr[i-1]);
            }
            if(i<n-1){
                System.out.print(" ");
            }
        }
    }
}
-----------------------------------------------------------------------------------------------
IMPUT STRING AND LOOP THROUGH LETTERS AND WORDS
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] words=str.split(" ");
        for(int i=0;i<words.length;i++){
            System.out.println(words[i]);
            String cha=words[i];
            for(int j=0;j<cha.length();j++){
                System.out.println(cha.charAt(j));
            }
        }
    }
}
---------------------------------------------------------------------------------------------
WORD COUNT 
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] word=str.split(" ");
       System.out.print(word.length);
    }
}
---------------------------------------------------------------------------------------------
REPLACE LETTERS
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str2=str.replace('a','b');
        System.out.print(str2);
        
    }
}

REPLACE WORDS
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str2=str.replace("apple","banana");
        String str3=str.replace("fruits","vegetables");
        System.out.print(str2);
    }
}
-----------------------------------------------------------------------------------------------
SPLIT EACH LETTER IN WORD
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str.trim();
        char[] arr=str.toCharArray();
        System.out.print(Arrays.toString(arr));
    }
}
-----------------------------------------------------------------------------------------------
MATRIX ADDITION 
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] arr1=new int[r][c];
        int[][] arr2=new int[r][c];
        int[][] res=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                res[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
---------------------------------------------------------------------------------------------
TWO ARRAY EQUAL
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr1=new int[n];
        int[] arr2=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
        if(Arrays.equals(arr1,arr2)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
-----------------------------------------------------------------------------------------
SORTING 
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print(Arrays.toString(arr));
    }
}
-----------------------------------------------------------------------------------------
ARRAY RANK 
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            res[i]=n;
            for(int j=0;j<n;j++){
                if(arr[i]<arr[j]){
                    res[i]--;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(res[i]+" ");
        }
        System.out.print(Arrays.toString(res));
    }
}
--------------------------------------------------------------------------------------------
CAPTIALIZE FIRST LETTERS
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String sb=sc.nextLine();
        StringBuilder str=new StringBuilder(sb);
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(i==0|| str.charAt(i-1)==' '){
                str.setCharAt(i,Character.toUpperCase(c));
            }
            
        }
        System.out.print(str);
    }
}


PRINT THAT ALONE 
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder str=new StringBuilder(s);
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(i==0|| str.charAt(i-1)==' '){
                System.out.print(Character.toUpperCase(c)+" ");
            }
        }
       
    }
}
-------------------------------------------------------------------------------------------
VOWELS AND CONSONENT COUNT
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str.toLowerCase();
        int vowels=0;
        int consonent=0;
        
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                vowels++;
            }
            else if(c>='a' && c<='z'){
                consonent++;
            }
        }
        System.out.print(vowels+" "+consonent);
        
    }
}
---------------------------------------------------------------------------------------------
STRING COMPRESSION 
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++){
            int count=1;
            while(i+1<s.length() && s.charAt(i)==s.charAt(i+1)  ){
                count++;
                i++;
            }
            str.append(s.charAt(i)).append(count);
        }
        System.out.print(str);
    }
}
-----------------------------------------------------------------------------------------------
SWAP MAXIMUM AND MINIMUM

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int minindex=0;
        int maxindex=0;
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
                maxindex=i;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
                minindex=i;
            }
        }
        int temp=arr[maxindex];
       arr[maxindex]=arr[minindex];
       arr[minindex]=temp;
       for(int i=0;i<n;i++){
           System.out.print(arr[i]+" ");
       }
    }
}
------------------------------------------------------------------------------------------
GCD ARRAY 

import java.util.*;
import java.math.BigInteger;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        BigInteger gcd=BigInteger.valueOf(arr[0]);
        for(int i=1;i<n;i++){
            gcd=gcd.gcd(BigInteger.valueOf(arr[i]));
        }
        System.out.print(gcd);
    }
}
------------------------------------------------------------------------------------------------
CAMEL CASE TO SNAKE CASE 
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str2=str.replaceAll("([a-z])([A-Z])","$1_$2").toLowerCase();
        System.out.print(str2);
    }
}

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder copy=new StringBuilder();
        for(int i=0;i<str.length();i++){
             char c=str.charAt(i);
            if(c==Character.toUpperCase(c)&& i>0){
                copy.append("_");
                copy.append(Character.toLowerCase(c));
            }
            
            else{
                copy.append(c);
            }
        }

        System.out.print(copy);
    }
}
-----------------------------------------------------------------------------------------------
MATRIX MULTIPLICATION 
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c1=sc.nextInt();
        int c2=sc.nextInt();
        int[][] arr1=new int[r][c1];
        int[][] arr2=new int[c1][c2];
        int[][] res=new int[r][c2];
        for(int i=0;i<r;i++){
            for(int j=0;j<c1;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<c1;i++){
            for(int j=0;j<c2;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c2;j++){
                res[i][j]=0;
                for(int k=0;k<c1;k++){
                    res[i][j]+=arr1[i][k]*arr2[k][j];
                }
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c2;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
---------------------------------------------------------------------------------------------

APPLE DISTRIBUTION 
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int applecount=sc.nextInt();
        int boxcount=sc.nextInt();
        int totalapples=0;
        int count=0;
        int[] apples=new int[applecount];
        int[] boxes=new int[boxcount];
        for(int i=0;i<applecount;i++){
            apples[i]=sc.nextInt();
            totalapples+=apples[i];
        }
        for(int i=0;i<boxcount;i++){
            boxes[i]=sc.nextInt();
        }
        Arrays.sort(boxes);
        for(int i=boxcount-1;i>=0;i--){
            totalapples-=boxes[i];
            count++;
            if(totalapples<0){
                break;
            }
        }
        System.out.print(count);
       
        
    }
}
---------------------------------------------------------------------------------------------
PALLINDROME 
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder str=new StringBuilder(s);
        String rev=str.reverse().toString();
        System.out.println(rev);
        if(s.equals(rev)){
            System.out.print("yes");
        }
        else{
            System.out.print("no");
        }
    }
}
------------------------------------------------------------------------------------------------
A AN THE COUNT
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine().toLowerCase();
        String[] words=str.split(" ");
        int a=0;
        int an=0;
        int the=0;
        for(int i=0;i<words.length;i++){
            if(words[i].equals("an")){
                an++;
            }
            if(words[i].equals("a")){
                a++;
            }
            if(words[i].equals("the")){
                the++;
            }
        }
        System.out.print(a+" "+an+" "+the);
        
    }
}
--------------------------------------------------------------------------------------------------
WORDS TO SENTENCE
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] str=new String[n];
        for(int i=0;i<n;i++){
            str[i]=sc.next();
        }
        StringBuilder str2=new StringBuilder();
        for(int i=0;i<n;i++){
            str2.append(str[i]);
            if(i<n-1){
            str2.append(" ");
        }
        }
    
        System.out.print(str2);
    }
}

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] str=new String[n];
        for(int i=0;i<n;i++){
            str[i]=sc.next();
        }
        StringBuilder copy=new StringBuilder();
        for(int i=0;i<n;i++){
            copy.append(str[i]);
            if(i<n-1){
                copy.append(" ");
            }
        }
        copy.setCharAt(0,Character.toUpperCase(copy.charAt(0)));
        copy.append(".");
        System.out.print(copy);
    }
}
-----------------------------------------------------------------------------------------------------
INDEX OF PATTERN 
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        int index=str1.indexOf(str2);
        if(index==-1){
            System.out.print("-1");
        }
        while(index!=-1){
            System.out.print(index);
            index=str1.indexOf(str2,index+1);
            if(index!=-1){
                System.out.print(",");
            }
        }
    }
}
-------------------------------------------------------------------------------------------------------
ANAGRAM
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str1=sc.next().toLowerCase();
        String str2=sc.next().toLowerCase();
        char[] arr1=str1.toCharArray();
        char[] arr2=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){
            System.out.print("yes");
        }
        else{
            System.out.print("no");
        }
    }
}



import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine().replace(" ","");
        String str2=sc.nextLine().replace(" ","");
        char[] arr1=str1.toCharArray();
        char[] arr2=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){
            System.out.print("yes");
        }
        else{
            System.out.print("no");
        }
    }
}

-----------------------------------------------------------------------------------------------------------
PANGRAM 
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine().toLowerCase();
        boolean[] arr=new boolean[26];
        int count=0;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            int index=c-'a';
            if(c>='a' && c<='z'){
            if(!arr[index]){
                arr[index]=true;
                count++;
            }}
            
        }
        if(count==26){
            System.out.print("yes");
        }
        else{
            System.out.print("no");
        }
        
    }
}
---------------------------------------------------------------------------------------------------------------
WORD FREQUENCY
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine().toLowerCase();
        String[] words=str.split(" ");
        List<String> wordslist=Arrays.asList(words);
        Set<String> unique=new LinkedHashSet<>(wordslist);
        for(String word:unique){
            System.out.println(word+"-"+Collections.frequency(wordslist,word));
        }
        
    }
    
    
}
----------------------------------------------------------------------------------------------------------------
PALLINDROME COUNT IN ARRAY 
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int nn=sc.nextInt();
        int[] arr=new int[nn];
        for(int i=0;i<nn;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<nn;i++){
            int temp=arr[i];
            int n=temp;
            int rem=0;
            int rev=0;
            while(n!=0){
                rem=n%10;
                rev=rev*10+rem;
                n=n/10;
            }
            if(rev==temp){
                count++;
            }
        }
        System.out.print(count);
    }
}
-----------------------------------------------------------------------------------------------------------
PALLINDOMR STRING 
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine().toLowerCase();
        StringBuilder copy=new StringBuilder();
        StringBuilder copy2=new StringBuilder();
        StringBuilder ref=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c!=' '){
                copy.append(c);
                copy2.append(c);
            }
        }
        for(int i=copy2.length()-1;i>=0;i--){
            char c=copy2.charAt(i);
            ref.append(c);
        }
     
        if(ref.toString().equals(copy.toString())){
            System.out.print("yes");
        }
        else{
            System.out.print("no");
        }
    }
}
----------------------------------------------------------------------------------------------------
CURRENT NUMBER TO THE POWER OF NEXT 
import java.util.*;
public class Main{
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int[] arr=new int[n];
     for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
     }
     int[] res=new int[n];
     for(int i=0;i<n;i++){
         if(i<n-1){
         res[i]=(int)Math.pow(arr[i],arr[i+1]);
     }else{
         res[i]=arr[i];
     }
     }
     for(int i=0;i<n;i++){
         System.out.print(res[i]+" ");
     }
    }
}
-----------------------------------------------------------------------------------------------------
ADD EVEN , MULTIPLY ODD
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr1=new int[n];
        int[] arr2=new int[n];
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr1[i]%2==0 && arr2[i]%2==0){
                res[i]=arr1[i]+arr2[i];
            }
            else{
                res[i]=arr1[i]*arr2[i];
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(res[i]+" ");
        }
    }
}
---------------------------------------------------------------------------------------------------
ARRAY ROTATION 
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<a;j++){
        int first=arr[0];
        for(int i=0;i<n;i++){
            if(i<n-1){
            arr[i]=arr[i+1];
        }
        }
        arr[n-1]=first;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
---------------------------------------------------------------------------------------------------------
STRING ROTATION 
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=sc.nextInt();
        StringBuilder str=new StringBuilder(s);
        for(int j=0;j<n;j++){
        char first=str.charAt(0);
        for(int i=0;i<str.length();i++){
            if(i<str.length()-1){
            str.setCharAt(i,str.charAt(i+1));
        }
        }
        str.setCharAt(str.length()-1,first);
        }
        System.out.print(str.toString());
    }
}
---------------------------------------------------------------------------------------------------------
LONGEST COMMON PREFIX
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] words=new String[n];
        for(int i=0;i<n;i++){
            words[i]=sc.next();
        }
        
        
        String current=words[0];
        for(int i=1;i<n;i++){
            String str1=words[i];
             StringBuilder copy=new StringBuilder();
             int len=Math.min(str1.length(),current.length());
            for(int j=0;j<len;j++){
                if(current.charAt(j)==str1.charAt(j)){
                    copy.append(str1.charAt(j));
                }
                else{
                    break;
                }
            }
            current=copy.toString();
        }
        
        System.out.print(current);
    }
}
-------------------------------------------------------------------------------------------------------------
EVEN PRIMES
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=n;
        int temp=0;
        int j=0;
        int[] res=new int[n];
        while(n!=0){
             temp++;
             int count=0;
             for(int i=1;i<=temp;i++){
                 if(temp%i==0){
                     count++;
                 }
             }
             if(count==2){
                 res[j++]=temp;
                 n--;
             }
             
        }
        for(int i=0;i<a;i+=2){
            System.out.print(res[i]+" ");
        }
        
    }
}
---------------------------------------------------------------------------------------------------------------------------
STRING ADDITION UPTO SINGLE DIGIT
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int sum=0;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            int value=c-96;
            sum=sum+value;
        }
        System.out.println(sum);
        int temp=sum;
        while(sum>9){
           int res=0;
            while(temp!=0){
                int rem=temp%10;
                 res=res+rem;
                temp=temp/10;
            }
            sum=res;
            temp=res;
            
        }
        System.out.print(sum);
    }
}
---------------------------------------------------------------------------------------------------------------------------------
REVERSE THE SENTENCE 
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] words=s.split(" ");
        for(int i=words.length-1;i>=0;i--){
            System.out.print(words[i]);
            if(i>0){
                System.out.print(" ");
            }
        }
    }
}
----------------------------------------------------------------------------------------------------------------------------------
SUM OF ELEMENTS EXCEPT FIRST AND LAST
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=1;i<n-1;i++){
            sum=sum+arr[i];
        }
        System.out.print(sum);
    }
}
-----------------------------------------------------------------------------------------------------------------------------------
DIFFERENCE OF MAX AND MIN
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print(arr[0]-arr[n-1]);
    }
}
----------------------------------------------------------------------------------------------------------------------------------
EMAIL PRIVACY 
import java.util.*;
public class Main{
    public static void main(String[] args)
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str2="@gmail.com";
        int index=str.indexOf(str2);
        StringBuilder copy=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(i==0){
                copy.append(str.charAt(i));
            }
            else if(i>=index){
                copy.append(str.charAt(i));
            }
            else if(i==index-1){
                copy.append(str.charAt(i));
            }
            else{
                copy.append("*");
            }
            
        }
        System.out.print(copy.toString());
        
    }
}
--------------------------------------------------------------------------------------------------------------------
SNAKE CASE TO CAMEL
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        StringBuilder copy=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c=='_'){
                copy.append(Character.toUpperCase(str.charAt(i+1)));
                i++;
            }
            else{
                copy.append(c);
            }
        }
        System.out.print(copy.toString());
    }
}
---------------------------------------------------------------------------------------------------------------------
2 PAIRS
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Set<Character> set=new HashSet<>();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(Character.isUpperCase(c)){
                set.add(Character.toLowerCase(c));
            }
        }
        int count=0;
        for(char s:set){
            for(int i=0;i<str.length();i++){
                char a=str.charAt(i);
                if(a==s){
                    count++;
                    break;
                }
            }
        }
        System.out.print(count);
    }
}
---------------------------------------------------------------------------------------------------------------------------
FIRST UNIQUE INDEX 
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        
        for(int i=0;i<str.length();i++){
            int count=1;
            for(int j=0;j<str.length();j++){
                if(i!=j && str.charAt(i)==str.charAt(j)){
                       count=0;
                    break;
                 
                }
            }
             if(count==1){
            System.out.print(i);
            break;
            }
           
        }
        
    }
}
---------------------------------------------------------------------------------------------------------
RUN LENGTH ENCODING 
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int count=1;
        StringBuilder copy=new StringBuilder();
        for(int i=0;i<str.length()-1;i++){
            
            if(str.charAt(i)==str.charAt(i+1)){
                count++;
            }
            else{
                copy.append(str.charAt(i)).append(count);
                count=1;
            }
        }
        copy.append(str.charAt(str.length()-1)).append(count);
        System.out.print(copy.toString());
    }
}
-----------------------------------------------------------------------------------------------------------
COUNT DEVICE AFTER OPERATION 
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
           
            if(arr[i]>0){
                count++;
                for(int j=i+1;j<n;j++){
                    if(arr[j]>0){
                    arr[j]--;
                }
                }
            }
        }
            System.out.print(count);
    }
}
---------------------------------------------------------------------------------------------------------------------
BULLS AND COWS COUNT
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        int[] arr1=new int[4];
        int[] arr2=new int[4];
        for(int i=0;i<4;i++){
            arr1[i]=str1.charAt(i)-'0';
        }
        for(int i=0;i<4;i++){
            arr2[i]=str2.charAt(i)-'0';
        }
        int bullscount=0;
        int cowscount=0;
        int[] freq1=new int[10];
        int[] freq2=new int[10];
        for(int i=0;i<4;i++){
            if(arr1[i]==arr2[i]){
                cowscount++;
            }
            else{
                freq1[arr1[i]]++;
                freq2[arr2[i]]++;
            }
        }
        for(int i=0;i<10;i++){
            bullscount+=(int)Math.min(freq1[i],freq2[i]);
        }
        System.out.print(cowscount+" "+bullscount);
    }
}
-------------------------------------------------------------------------------------------------------------------
LAST STONE
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(n==1){
            System.out.print(arr[0]);
            return ;
        }
       while(true){
           Arrays.sort(arr);
           if(arr[n-2]==0){
               System.out.print(arr[n-1]);
               break;
           }
           arr[n-1]=arr[n-1]-arr[n-2];
           arr[n-2]=0;
       }
        
    }
}
------------------------------------------------------------------------------------------------------------------------
9988877555222
888

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int n=str.length();
        int[] arr=new int[n];
        for(int i=0;i<str.length();i++){
            arr[i]=str.charAt(i)-'0';
        }
        Arrays.sort(arr);
        for(int i=n-1;i>=2;i--){
            if(arr[i]==arr[i-1] && arr[i-1] ==arr[i-2]){
                System.out.print(""+arr[i]+arr[i]+arr[i]);
                break;
            }
        }
    }
}
-----------------------------------------------------------------------------------------------------------------------------
TEMPERATURE IN A WEEK
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<n-1;i++){
            if(arr[i]>arr[i+1] && arr[i]>arr[i-1]){
                count++;
            }
        }
        System.out.print(count);
    }
}
----------------------------------------------------------------------------------------------------------------------------
SWAP ADJACENT ELEMENTS
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(n%2==0){
            for(int i=0;i<n;i=i+2){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        else{
            for(int i=0;i<n-1;i=i+2){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
---------------------------------------------------------------------------------------------------------------------------
SECOND LARGEST IN A STRING
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int n=str.length();
        int[] arr=new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            char c=str.charAt(i);
            if(Character.isDigit(c)){
                int a=c-'0';
                arr[j++]=a;
            }
        }
        Arrays.sort(arr,0,j);
      
        System.out.print(arr[j-2]);
    }
}
-----------------------------------------------------------------------------------------------------------------------
PALLINDROME 
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder copy1=new StringBuilder();
        for (int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if((c>='a' &&c<='z') || (c>='A' && c<='Z')){
                copy1.append(c);
            }
        }
        StringBuilder copy2=new StringBuilder();
         for (int i=str.length()-1;i>=0;i--){
            char c=str.charAt(i);
            if(c>='a' &&c<='z' || c>='A' && c<='Z'){
                copy2.append(c);
            }
        }
        if(copy1.toString().equals(copy2.toString())){
            System.out.print("yes");
        }
        else{
            System.out.print("no");
        }
        
        
        
    }
}
-----------------------------------------------------------------------------------------------------------------------------------
FIND MISSING
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int sum=0;
        int sum2=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum2+=arr[i];
        }
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.print(sum-sum2);
    }
}
------------------------------------------------------------------------------------------------------------------------------------
REMOVE ELEMENT 
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int j=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int[] arr2=new int[n];
        for(int i=0;i<n;i++){
            if(arr[i]!=target){
                arr2[j++]=arr[i];
            }
        }
       for(int i=0;i<j;i++){
           System.out.print(arr2[i]+" ");
       }
    }
}
-----------------------------------------------------------------------------------------------------------------------------------
ARRAY DIFFERENCE 
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int[] arr1=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        arr1[0]=arr[0];
        for(int i=1;i<n;i++){
            int min=(int)Math.min(arr[i],arr[i-1]);
            int max=(int)Math.max(arr[i],arr[i-1]);
            arr1[i]=max-min;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
------------------------------------------------------------------------------------------------------------------------------
UNIQUE CHARACTERS
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Set<Character> set=new LinkedHashSet<>();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            set.add(c);
        }
        for(char unique:set){
            System.out.print(unique);
        }
    }
}
----------------------------------------------------------------------------------------------------------------------------
SEPERATOR 
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        char str2=sc.next().charAt(0);
        for(int i=0;i<str1.length();i++){
            char c=str1.charAt(i);
            if(c==str2){
                System.out.println();
            }
            else{
                System.out.print(c);
            }
        }
    }
}
---------------------------------------------------------------------------------------------------------------------------
MINIMUM REPLACEMENT 
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int r=0;
        int c=0;
        for(int i=0;i<str.length();i++){
            char s=str.charAt(i);
            if(s=='R'){
                r++;
            }
            if(s=='C'){
                c++;
            }
        }
        if(r<c){
            System.out.print(r);
        }
        else if(c<r){
            System.out.print(c);
        }
    }
}
---------------------------------------------------------------------------------------------------------------------------------
MAXIMUM ENEMIES(LEETCODE)
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            
        }
        int max=0;
        int count=0;
        int found=0;
        for(int i=0;i<n;i++){
          
            if(arr[i]==1){
                  count=0;
                  found=0;
                for(int j=i;j<n;j++){
                    if(arr[j]==0){
                        count++;
                    }
                    else if(arr[j]==-1){
                        found=1;
                        break;
                    }
                }
                if(count>max && found==1){
                    max=count;
                }
            }
        }
        for(int i=n-1;i>=0;i--){
          
            if(arr[i]==1){
                  count=0;
                  found=0;
                for(int j=i;j>=0;j--){
                    if(arr[j]==0){
                        count++;
                    }
                    else if(arr[j]==-1){
                        found=1;
                        break;
                    }
                }
                if(count>max && found==1){
                    max=count;
                }
            }
        }
        System.out.print(max);
    }
}
----------------------------------------------------------------------------------------------------------------------------
NUMBER OF WORDS
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] str1=str.split(" ");
        System.out.print(str1.length);
    }
}
---------------------------------------------------------------------------------------------------------------------------
COUNT DIGITS IN A STRING
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int count=0;
        char[] arr=str.toCharArray();
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(arr[i])){
                if(i==0 || !Character.isDigit(arr[i-1])){
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int count=0;
        char[] arr=str.toCharArray();
        for(int i=0;i<str.length();i++){
             if(i==0 && Character.isDigit(arr[i])){
                 count++;
             }
            if(  Character.isLetter(arr[i]) && Character.isDigit(arr[i+1])){
                count++;
            }
        }
        System.out.print(count);
    }
}
------------------------------------------------------------------------------------------------------------------------------
LEMONADE CHALLENGE(LEETCODE)
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int five=0;
        int ten=0;
        int fount=0;
        for(int i=0;i<n;i++){
            if(arr[i]==5){
                five++;
            }
            else if(arr[i]==10){
                if(five>0){
                    five--;
                    ten++;
                }
                else if(five<=0){
                    fount=1;
                }
            }
            else if(arr[i]==20){
                if(ten>0 && five>0){
                    ten--;
                    five--;
                }
                else if(five>=3){
                    five=five-3;
                }
                else{
                    fount=1;
                    
                }
            }
        }
        if(fount==1){
            System.out.print("false");
        }
        else{
            System.out.print("true");
    }
}
}
---------------------------------------------------------------------------------------------------------------------------------
XOR OPERATION 
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=4;
        int[] arr1=new int[4];
        int[] arr2=new int[4];
        int total=0;
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
        int[] res=new int[4];
        for(int i=0;i<n;i++){
            res[i]=arr1[i]^arr2[i];
        }
        for(int i=0;i<n;i++){
            total=total+res[i]*(int)Math.pow(2,n-1-i);
        }
        System.out.print(total);
    }
}
-----------------------------------------------------------------------------------------------------------------------------------------
BOWLING (LEETCODE)
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr1=new int[n];
        int[] arr2=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
        int p1=0;
        int p2=0;
        for(int i=0;i<n;i++){
            if(i>1){
            if(arr1[i-1]==10 || arr1[i-2]==10){
                p1=p1+arr1[i]*2;
            }
            else{
                p1=p1+arr1[i];
            }
            }
            else if(i==1){
                if(arr1[i-1]==10){
                    p1=p1+arr1[i]*2;
                }
                 else{
                p1=p1+arr1[i];
            }
            }
            else if(i==0){
                 p1=p1+arr1[i];
            }
        }
        
        
         for(int i=0;i<n;i++){
            if(i>1){
            if(arr2[i-1]==10 || arr2[i-2]==10){
                p2=p2+arr2[i]*2;
            }
            else{
                p2=p2+arr2[i];
            }
            }
            else if(i==1){
                if(arr2[i-1]==10){
                    p2=p2+arr2[i]*2;
                }
                 else{
                p2=p2+arr2[i];
            }
            }
            else if(i==0){
                 p2=p2+arr2[i];
            }
        }
        System.out.print(p1+" "+p2);
        
    }
}
----------------------------------------------------------------------------------------------------------------------------
SENTENCE ROTATION 
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=sc.nextInt();
        String[] str=s.split(" ");
        for(int j=0;j<n;j++){
        String first=str[0];
        
        for(int i=0;i<str.length-1;i++){
            str[i]=str[i+1];
        }
        str[str.length-1]=first;
        }
        for(int i=0;i<str.length;i++){
            System.out.print(str[i]+" ");
        }
    }
}
-------------------------------------------------------------------------------------------------------------------------------
KEYBOARD(LEETCODE)
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] str=new String[n];
        for(int i=0;i<n;i++){
            str[i]=sc.next();
        }
        String row1="qwertyuiop";
        String row2="asdfghjkl";
        String row3="zxcvbnm";
        for(int i=0;i<n;i++){
            String current=str[i];
            boolean r1=true;
            boolean r2=true;
            boolean r3=true;
            for(int j=0;j<current.length();j++){
                char c=current.charAt(j);
                if(row1.indexOf(c)==-1){
                    r1=false;
                }
                if(row2.indexOf(c)==-1){
                    r2=false;
                }
                if(row3.indexOf(c)==-1){
                    r3=false;
                }
            }
            if(r1||r2||r3){
                System.out.print(current+" ");
            }
        }
    }
}
-----------------------------------------------------------------------------------------------------------------------------
BINARY TO DECIMAL ARRAY
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr1=new int[n];
        int[] arr2=new int[n];
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
         for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
         for(int i=0;i<n;i++){
            res[i]=arr1[i]^arr2[i];
        }
        StringBuilder copy=new StringBuilder();
        for(int i=0;i<n;i++){
            copy.append(res[i]);
        }
        int decimal=Integer.parseInt(copy.toString(),2);
        System.out.print(decimal);
    }
}
------------------------------------------------------------------------------------------------------------------------------------
