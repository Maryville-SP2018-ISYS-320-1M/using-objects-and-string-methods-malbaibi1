/*
 ISYS 320
 Name(Mansoor Albaibi):
 Date:31-03-2018 
*/

public class P5_UpperFirst {

 public static void main(String[] args) {
   String out = upperFirst("supper rainbow"," ");
   System.out.println("\"" + out + "\"");
   
   out = upperFirst("LEBRON.James",".");
   System.out.println("\"" + out + "\"");
 }
 
    public static String upperFirst(String str1, String str2) {
    int n = str1.indexOf(str2);
    String s1 = str1.substring(0,n);
    String s2 = str1.substring(n);
    s1 = s1.toUpperCase();
    String s = s1 + s2;
    return s;

}
}