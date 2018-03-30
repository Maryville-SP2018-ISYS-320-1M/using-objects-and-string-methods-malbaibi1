/*
 ISYS 320
 Name(Mansoor Albaibi):
 Date:31-03-2018 
*/

/*
 Your expression predictions:
 
1.  13                       //length of str1 
2.  a                        //character at index 7 of str1
3.  G                        //character at index 0 of str2
4.  2                        //index of character o in str1

5.  GANDALF THE GRAY         //change into upper case
6.  frodo baggins            //change into lower case
7.  o Baggins                //string starting from index 4
8.  dalf the GR              //string starting from index 3 and ending at 14

9. Goondoolf the GRAY        //replace a with oo
10. Gandalf the GRAY         //replace gray with white
11. Frangeodo Baggins        //replace r with range
 
  
 */

/*
 Were you correct? Explain if you were not (what did you learn?)
 
 1.  Correct
 2.  Correct
 3.  Correct
 4.  Correct
 
 5.  Correct
 6.  Correct
 7.  Correct
 8.  Correct
 
 9.  Correct
 10.  Correct
 11.  Correct
 
 */
public class P1_TestStringMethods {
 public static void main(String[] args) {
   String str1 = "Frodo Baggins";
   String str2 = "Gandalf the GRAY";
  System.out.println("1. " + str1.length());
  System.out.println("2. " + str1.charAt(7));
  System.out.println("3. " + str2.charAt(0));
  System.out.println("4. " + str1.indexOf("o"));
  System.out.println("5. " + str2.toUpperCase());
  System.out.println("6. " + str1.toLowerCase());
  System.out.println("7. " + str1.substring(4));
  System.out.println("8. " + str2.substring(3, 14));
  System.out.println("9. " + str2.replace( "a", "oo"));
  System.out.println("10. " + str2.replace("gray", "white"));
  System.out.println("11. " + str1.replace("r", "range"));
 }

}