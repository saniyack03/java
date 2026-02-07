import java.util.Scanner;
public class Stringmanipulation {
 public static void main(String[] args) {
 Scanner sc =new Scanner(System.in);
 
 System.out.print("Enter first string:");
 String s1 =new String(sc.nextLine());
 System.out.print("Enter second string:");
 String s2 =new String(sc.nextLine());

 System.out.println("length of first string:"+s1.length());
 String concat =s1+" "+s2;
 System.out.println("Concatenating string:"+concat);
 
char ch=s2.charAt(3);
System.out.println("character at position 3rd in string 2:"+ch);
 System.out.println("s1 compare to s1:"+s1.compareTo(s2));
 System.out.println("s1 equals to s2:"+s1.equals(s2));
 
 System.out.print("enter the substring to search in the string1:");
 String sub=new String(sc.nextLine());
 System.out.println("index of string:"+s1.indexOf(sub));
 
 System.out.println("Uppercase String:"+s1.toUpperCase());
 System.out.println("Replace 'a' with 'x':"+s1.replace('a','x'));
 
 System.out.print("enter a number:");
 int n=sc.nextInt();
 String num=String.valueOf(n);
 System.out.println("NUmber as String:"+num);
 
 System.out.println("Enter a sentence:");
 sc.nextLine();
 String sentence=sc.nextLine();
 String[] words=sentence.split(" ");
 System.out.println("Splitted words:");
 for(String word: words) {
  System.out.println(word);
  }
 System.out.print("Enter text for buffer:");
 StringBuffer sb = new StringBuffer(sc.nextLine());
 System.out.print("Enter text to append:");
 sb.append(sc.nextLine());
 System.out.println("stringbuffer result:"+sb);
 
 
 }
 }
 
