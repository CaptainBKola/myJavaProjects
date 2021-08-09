package string;

public class StringLiterals {




    public static void main(String[] args) {




    /*
    PREAMBLE
     A character literal is an integer value represented as a character in single quotes.
     For example, 'z' represents the integer value of z, and '\t' rep- resents the integer value of a tab character.

     The value of a character literal is the integer value of the character in the Unicode character set.
     a string is a sequence of characters treated as a single unit.
     A string may include letters, digits and various special characters, such as +, -, *, / and $.
 */

String color = "blue";


for(int i = color.length()-1; i >= 0; i--)

    System.out.println(color.charAt(i));










    }


}
