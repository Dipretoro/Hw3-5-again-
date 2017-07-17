package andrew;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.io.BufferedWriter;
import java .io .File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;



/* Programmed by Andrew Dipretoro
 	HomeWork  3,4,5,6
 	Computer Science 1 Java

 */


public class ChecksonCheck{
							
	
	
	public  static void   main(String[] args) throws IOException {

	int choice = 0;
	Scanner sc= new Scanner(System.in);

			
			
									// start screen 
				
					do{
						System.out.println("1 )Show account Balance ");
						System.out.println("2 ) write or deposit a check ");
						System.out.println("3 )Export and serialize a checkbook");
						System.out.println("4 )Import  checkbook");
						System.out.println("5) start a new check book ");
						System.out.println("6 )Print whole CheckBook ");
						System.out.println("7 )Print single check ");
						System.out.println("8 )Exit Program");
						System.out.println("Enter Choice ");
					try {	
						choice =sc.nextInt();

						if (choice < 1 || choice > 10){	
							System.out.println("Invaild choice ,Try again "	);	}
									
						}

							catch (Exception e ) {
								System.out.println(" you had and error try again  ");   
							}
							switch (choice)
							{
							//show account balance 
							
							case 1 : 
								Checkregister.checkadder();
								break;
							// write or deposit a check 
	
							case 2 : 
								user.checkmaker();
								break;
								// export check
							case 3 : 
								input123.export_checkbook();
								break;
								// import check 
							///case 4 : 5;
								//input123.importchckbook();
								//break;12
								// print checks 
							case 5 : 
								user.newchckbook();
								break;
							case 6 : 
								user.chckprinter();
								break;
							case 7: 
								user.singleprinter();
							case 8 : 
								System.out.println(" would you like to save first ");
								System.exit(choice);
							}
					}while (choice !=8);
							
							
					}
	}


	




		
		
		
		
		
		
		
		
	
	


	
	


		 
		 
	 
	 
	 


	


		


	