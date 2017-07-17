package andrew;

import java.io.IOException;

public class Checkregister extends user{


public static  void checkadder() throws IOException{
double balance = 0 ;
	Chck[] chckarray = checkmaker();
	for (int cnt = 0 ; cnt < chckarray.length; cnt++ ){
	balance += chckarray[cnt].getcheckamount();


		System.out.println("The current Balance is " + balance );
		
		
	}
}
}
