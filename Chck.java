package andrew ;
import java.util.Scanner;

public class Chck {
// private fields
	private static Double _checkamount ;
	private static String _Date;
	private  static String _payee;
	private static String _memo;
	private static double  _checknumber;
	private static String _Nameofperson;
	static Scanner scan = new Scanner ( System.in) ;
	
	
	// Constructor
	public  static void chck( String Nameofperson ,Double checkamount,String Date, String payee , double checknumber ,String memo )
	{_checkamount = checkamount;
		_Date = Date;
			_payee = payee;
					_memo = memo;
							_checknumber = checknumber;
									_Nameofperson= Nameofperson ;
	}

	//Getter
	public   Double getcheckamount() { return _checkamount ;}
			
	
			public   Double getchecknumber() { return _checknumber ;}
					
					public  String getDate () { return _Date ;}
							
							public  String getpayee () { return _payee ;}
								
									public  String getmemo () { return _memo;}
	
									public  String getNameofperson() { return _Nameofperson;}
									
	// Setters 
	
									
					
									
	public  void setcheckamount( Double checkamount ) {_checkamount = checkamount; }


	public   void setNameofperson(String Nameofperson){_Nameofperson = Nameofperson;}
	
			public   void setDate ( String Date ){ _Date = Date;}
			
		
					public  void setchecknumber( Double checknumber ){_checknumber = checknumber;}
						
											
			
						public void Setpayee  ( String payee)
					
						{_payee = payee;}
						
							public   void Setmemo( String memo){ _memo = memo ;}
							
								 
			public void quitscanner () {		
								scan.close() ;
			}

		



}

							
							
	
											
									
	
	
	
	
	
	
	
	
	
	

