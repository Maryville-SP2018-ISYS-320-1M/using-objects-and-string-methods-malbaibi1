/*
 ISYS 320
 Name(Mansoor Albaibi):
 Date:31-03-2018
*/


public class P2_BananaStand {
 public static void main(String[] args) {
  String quote = "There's always money in the banana stand.";
  String BANANA=new String(quote);                                   //string method for new object creation
  System.out.println(BANANA);
  
  String out = lastHalf("There's always money in the banana stand.");
  System.out.println("\"" + out + "\"");
 }
 
     public static String lastHalf(String str) {                       //method to get half of given string
       int length = str.length();
       length = length/2;
    return str.substring(length);
}
}