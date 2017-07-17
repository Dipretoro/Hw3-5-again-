package andrew;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class user extends Chck  {
	
	
	
	

	public static   Chck[] checkmaker  ()  throws IOException {
boolean quit = false ;
	String ToQuit = null ;
		Chck chck= new Chck() ;
		Chck[] chckarray =new Chck [10] ;
			 		
		Scanner scan= new Scanner(System.in) ;
		 			 	 
		 			 				
		 			 			try{ 				
		 			// dialog with user to build checks 
		 	 			
		 			do{	
		 	 for (int cnt = 0 ; cnt < chckarray.length; cnt++ ){
		 		 chckarray [cnt] = new Chck();

				 System.out.println("Please enter your name on the check   ");
					chck.setNameofperson(scan.nextLine() .toString());
					chckarray[cnt]= chck;
					
					 System.out.println("Please enter Name of payee");
					chck.Setpayee(scan.nextLine().toString());
					chckarray[cnt]= chck;
					 
					 
					 System.out.println("Please enter the checknumber, ");
						chck.setchecknumber(scan.nextDouble());
					 chckarray[cnt]= chck ;
					 
					 System.out.println("Please enter The check amount if your writing a check please insert a negitave sign in front of amount ");
					 chck.setcheckamount(scan.nextDouble());
					 	chckarray[cnt]=chck;
					 
					 System.out.println("Please enter the date");
					 chck.setDate(scan.nextLine().toString());
					 chckarray[cnt]= chck;
					 
					 System.out.println("Please enter the memo");
					 chck.Setmemo(scan.nextLine().toString());
				chckarray[cnt]= chck; 	 
		 	
				  		
				 	
		 	 		 System.out.println( "press Q to quit the program  . Press any key to continue making checks ");
							 ToQuit= scan.next();
							 
		 	 		
						 if ( ToQuit.equalsIgnoreCase( "Q")){
						 quit = true ; 
						 scan.close() ;	   }
	
		 	}}while	 (!quit);
			}catch (Exception e ) {
								 System.out.println(" error try again  ");}
		 	 			return chckarray;
					  }
					
				 

public static  void chckprinter() throws IOException{
	Chck[] chckarray = checkmaker();
for (int cnt = 0 ; cnt < chckarray.length; cnt++ )
{		
	System.out.printf(" %s,   %d ,%n, pay to the order of:%s,       %d, %n,for,%s",
						chckarray[cnt].getNameofperson(),
						chckarray[cnt].getchecknumber(),
						chckarray[cnt].getpayee(),
						chckarray[cnt].getcheckamount(),
						chckarray[cnt].getmemo());
	
	}
}
public static  void singleprinter () throws  IOException
{
	Chck[] chckarray = checkmaker();
	
	int checknum = -1 ;
	System.out.println( " Please enter the checknumber you would like to print ");
	
	checknum =scan.nextInt() ;
	if (checknum < -1 || checknum > 10){
	System.out.printf(" %s,   %d ,%n, pay to the order of:%s,       %d, %n,for,%s",
			chckarray[checknum].getNameofperson(),
			chckarray[checknum].getchecknumber(),
			chckarray[checknum].getpayee(),
			chckarray[checknum].getcheckamount(),
			chckarray[checknum].getmemo());}
	else user.singleprinter();
	}
	
	public static  void newchckbook () throws  IOException{
		Chck[] chckarray = checkmaker();
		Scanner scan= new Scanner(System.in) ;
		 int  choice3 = 0 ; 
		try{
		 System.out.println(" would you like to save the checkbook press 1 to save or 2 to create new checkbook   ");
		choice3=scan.nextInt ();
	if (choice3< 0 ||choice3 >3 )
	{ System.out.println(" enter either 1 or 2   ") ;}
	 switch  ( choice3 ){
	 
	 case 1 : input123.export_checkbook	();		
	 break;
	 case 2: chckarray= null;
	 break;}}
		
	  catch (Exception e ) {
		 System.out.println(" error try again  ");}
		
	 System.out.println("congrats new check book made "  );
	 scan.close() ;
		

	
}

	} 			 



