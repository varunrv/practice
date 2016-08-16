/*import java.io.*;
import java.util.*;
import java.util.Map.Entry;
public class hash 
{
public static void main(String []args)throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
Hashtable<Integer,Integer> ht=new Hashtable<Integer,Integer>();
Scanner s=new Scanner(System.in);
System.out.print("Enter the length of first array ");
int len1=s.nextInt();
System.out.println("Enter the elements of first array ");
int count=1;int arg;
for(int i=0;i<len1;i++)
{
arg=s.nextInt();
if(ht.containsKey(arg))
{
count=ht.get(arg);
count++;
ht.put(arg, count);
}
else
{
ht.put(arg, count);
}
count=1;
}

System.out.print("Enter the length of second array ");
int len2=s.nextInt();
System.out.println("Enter the elements of second array ");

for(int i=0;i<len2;i++)
{
arg=s.nextInt();
if(ht.containsKey(arg))
{
count=ht.get(arg);
count--;
ht.put(arg, count);
}
else
{
ht.put(arg, count);
}
count=1;
}
ArrayList <Integer> arrayList=new ArrayList<Integer>();
for(Map.Entry<Integer,Integer> e:ht.entrySet())
{
if(e.getValue() <= -1)
{
arrayList.add(e.getKey());
}
}

Collections.sort(arrayList);
for(int i : arrayList)
System.out.print(i+" ");


/*203 204 205 206 
207 
208 
203 
204 
205 
206

203 204 205 206 207 208 203 204 205 206

203 204 204 205 206 207 205 208 203 206 205 206 204
*/ 
/*for(int i=0;i<len1;i++)
{
arg=Integer.parseInt(br.readLine());
for(Map.Entry entry : ht.entrySet())
{

if(arg == (Integer)entry.getValue())
{
count =(Integer) entry.getKey();
count++;
ht.put(count, arg);
}
else
{
ht.put(count, arg);
}
}
count =1;
}
*/


/*
for(int i=0;i<len2;i++)
{
arg=Integer.parseInt(br.readLine());
for(Map.Entry entry : ht.entrySet())
{

if(arg == (Integer)entry.getValue())
{
count =(Integer) entry.getKey();
count++;
ht.put(count, arg);
System.out.println(count);
}
else
{
ht.put(count, arg);
}
}
count =1;
}*/


}
}
