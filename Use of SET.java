
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

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int countFirst,countSecond,firstArray[],secondArray[];
        countFirst=s.nextInt();
                firstArray = new int[countFirst];

        for(int i=0;i<countFirst;i++)
            firstArray[i]=s.nextInt();
        countSecond =s.nextInt();
                secondArray = new int[countSecond];

        for(int i=0;i<countSecond;i++)
            firstArray[i]=s.nextInt();
        
        for(int i=0;i<countFirst;i++)
            for(int j=0;j<countSecond;j++){
            if(firstArray[i]==secondArray[j]){
                 firstArray[i]=secondArray[j]=0;
                 break;
            }
        }
        int tempArray[]=new int[15];
        int k,m=0;
        for(int i=0;i<countFirst;i++){
            if(firstArray[i]!=0){
              tempArray[m]=firstArray[i];
                m++;                
            }    
            
        }
        k=m;
        for(int i=0;i<countSecond;i++){
            if(secondArray[i]!=0){
              tempArray[k]=secondArray[i];
                k++;                
            }    
        }
        int x;
        for(int i=0; i<k;i++)
            for(int j=i;j<k;j++){
            if(tempArray[j]>tempArray[j+1]){
                x=tempArray[j];
                tempArray[j]=tempArray[j+1];
                tempArray[j+1]=x;               
            }
        }
            
        Set <Integer> setArray=new HashSet<Integer>();
        for(int i=0;i<k;i++){
            setArray.add(tempArray[i]);
        }
        Iterator iterator = setArray.iterator(); 
        while (iterator.hasNext()){
   System.out.println("Value: "+iterator.next() + " ");  
        
        }
        
    }
}