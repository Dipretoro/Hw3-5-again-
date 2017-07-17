package andrew ;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class input123 extends user implements Serializable {

	
	static final long serialVersionUID = 1L;

	public static void export_checkbook() { 
		int choice2 = 0;
		
		try {
			chckarray = checkmaker();
		} catch (IOException e1) {
		
			e1.printStackTrace();
		} 
		Scanner scan= new Scanner(System.in) ;
		 System.out.println (" If you want to serialize a check book  enter 1 .   " );
		try{
		 choice2=scan.nextInt();}
		 catch (Exception e ) {
			 System.out.println(" error try again  ");}
		 if (choice2 < 0 || choice2 > 3)
		 {
				
		 System.out.println("Invaild choice ,Try again ");	
		 }
		 try{
		 switch (choice2)
			{
			
			
			case 1 : 
							
				File happyfile = new File("happyfile.txt");
			 FileOutputStream fos = new FileOutputStream("happyfile.txt");
			 ObjectOutputStream oos = new ObjectOutputStream(fos);
			 oos.writeObject(chckarray);
			 oos.flush(); 
			break;}
		
				 			
							 } catch (IOException e ) 	 { 
						   e.printStackTrace();
							 System.out.println("Unable to serialize the object"); }   }
						
			 
			
		

			
			
			 
			 
				
			public static  void importchckbook() throws IOException, ClassNotFoundException {
			
				Chck[] chckarray = checkmaker();
		ObjectInputStream in =     new ObjectInputStream(new FileInputStream("happyfile.txt")); 
		   Chck [] chckarray  =(Chck[])in.readObject();  
		 
		   in.close();  }  
		}
		
		
			 
			
			
			
			
		
				
