/*
 ISYS 320
 Name(Mansoor Albaibi):
 Date:31-03-2018 
*/

public class P4_Vertical {

 public static void main(String[] args) {
   vertical("hey now");

 }
 
      public static void vertical(String str) {                       //method to print wertically of given string
       int length = str.length();
       for(int i=0;i<length;i++)
         System.out.println(str.charAt(i));
       
}

}