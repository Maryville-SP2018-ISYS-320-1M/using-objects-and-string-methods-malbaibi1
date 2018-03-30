/*
 ISYS 320
 Name(Mansoor Albaibi):
 Date:31-03-2018
*/

public class MovieTimeParser {

 public static void main(String[] args) {
   String out = getMovieTime("9:00a,11:15a,1:30p,3:00p,6:45p,9:00p",3);
   System.out.println("\"" + out + "\"");
   
 }
 
    public static String getMovieTime(String str, int index) {   //method to get movie timing
    int a1 = 5 * (index-1);
    int a2 = 5 * index; 
    int n1 = str.indexOf(",",a1) + 1;                            //to find the starting index of required movie time
    int n2 = str.indexOf(",",a2);                                //to find the ending index of required movie time
    String out = str.substring(n1,n2);
    return out;

}
}