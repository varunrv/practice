
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {


public static void isPanagram(String input)
{
Set <Character> s=new HashSet<Character>();
char character;
for(int i=0;i<input.length();i++)
{
character=Character.toLowerCase(input.charAt(i));
if(character != ' ')
s.add(character);
}
if(s.size() == 26)
{
System.out.println("pangram");
}
else
{
System.out.println("not pangram");//+s.size());
}
}
public static void main(String []args)throws IOException
{
String input;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
// System.out.println("enter the sentence :");
input=br.readLine();
isPanagram(input);
}
/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
}



import java.io.*;
import java.util.*;

