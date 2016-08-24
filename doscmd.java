/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doscmd;

/**
 *
 * @author dell pc
 */
import java.util.*;
import java.io.*;

public class Doscmd {
	public static void main(String[] args) {
		try {
			String str = new Scanner(new File("C:\\text.txt")).useDelimiter("\\Z").next();
			System.out.println(str);
			String delimiters = "\\s+|,\\s*|\\.\\s*";
			String[] tokensval = str.split(delimiters);
		
			for(String token : tokensval) {
				System.out.println(token);
				try {
					Runtime rt = Runtime.getRuntime();
					Process p = rt.exec("cmd /c " + token);
					p.waitFor();
					BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
					String line;
					while((line = reader.readLine())!=null)
					{
						System.out.println(line);
					}
				}
				catch (IOException e1) {
					
				}
				catch (InterruptedException e2) {
						
				}
			}
		}
		catch(FileNotFoundException e)
		{
			
		}
		
	}
}
