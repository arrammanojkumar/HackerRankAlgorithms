package thirtyDaysOfCode;

import java.util.Hashtable;
import java.util.Scanner;

public class DictionariesAndMaps {
	public static void main(String[] args) {
	      Scanner scan = new Scanner(System.in);
	      int n=scan.nextInt();
	      scan.nextLine();
	      Hashtable<String, Integer> contactTables = new Hashtable<>();
	      
	      for(int i=0;i<n;i++)
	      {
	         String name=scan.nextLine();
	         int phone=scan.nextInt();
	         contactTables.put(name, phone);
	         scan.nextLine();
	      }
	      while(scan.hasNext())
	      {
	         String s=scan.nextLine();
	         if(contactTables.containsKey(s)){
	        	 System.out.println(s+"="+contactTables.get(s));
	         }else{
	        	 System.out.println("Not found");
	         }
	      }
	      scan.close();
	}
}