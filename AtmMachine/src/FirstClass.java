import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
//import java.lang.String.*;
public class FirstClass {
	public static void main(String[] args) {int i,count=0,pin;String userid;
		Scanner s=new Scanner(System.in);
		String[] UserId = { "abc","def","ghi"};//array that has user id's of three users
		int[] Pins= {1234,1234,1234};
		double[] InitBals= {1000,2000,1400};
		System.out.println("\t\t\tWELCOME USER!!!!!!!");
		System.out.print("Enter your UserId:");
	    userid=s.nextLine();				
		for(i=0;i<3;i++)
		{
			if(UserId[i].equals(userid)) {
				System.out.print("Welcome "+UserId[i]+".Enter your pin to continue");
				pin=s.nextInt();
				if(Pins[i]==pin)
				{
					DisplayOptions(i);
				}
				else {
					System.out.println("Wrong pin");
					System.exit(0);
				}
			}
            count++;   	
		}//for
		if(count==3) {
			System.out.println("invalid UserId");System.exit(0);
		}
	}//main

		public static void DisplayOptions(int i){
			int AccType,WithDrawl;
		String[] UserId = { "abc","def","ghi"};//array that has user id's of three users
		int[] Pins= {1234,1234,1234};
		double[] InitBals= {1000,2000,1400};
			Scanner s=new Scanner(System.in);
		System.out.println("\t\t\t\tServices\t\t\t\t");
		System.out.println("1.Withdrawl");
		System.out.println("2.Balance Enquiry");
		System.out.println("3.Deposit");
		System.out.println("4.Pin change");
		System.out.println("5.Exit");
		System.out.println("Select any option");
	   int choice=s.nextInt();
	    switch(choice) {
	    case 1: System.out.println("Select Account Type");
	            System.out.println("1.Current"); 
	            System.out.println("2.Savings");
	            AccType=s.nextInt();
	            if(AccType==2||AccType==1) {
	            System.out.println("Enter Amount to be withdrawn");
	            WithDrawl=s.nextInt();
	             if(WithDrawl>InitBals[i]) {
	            	 System.out.println("Insufficient Funds.Your account currently has "+InitBals[i]+"Rs");
	            	 System.exit(0);
	              }
	             else {
	            	 InitBals[i]-=WithDrawl;
	            	 System.out.println(WithDrawl+"Rs withdrawn.Remaining amount:"+InitBals[i]);
	            	 
	            	 System.out.println("Enter 1 if you want a reciept\nEnter 0 if you dont want reciept");
	            	 int want=s.nextInt();
	            	 if(want==1)
	            	 {
	            		 System.out.println("Collect your Transaction reciept and money(Help us go green!!try to save paper)"); 
	            	 }
	            	 if(want==0) {
	            		 System.out.println("Collect your money.Thankyou!!!");
	            	 }
	            	 System.exit(0);
	            	}}else System.out.println("enter current account type.Request Cancelled");System.exit(0);break;
	    case 2:System.out.println("you have "+InitBals[i]+" rs in your account");
	              PrintReciept();break;
	    
	    case 3:
	    	System.out.println("Enter userid of account you want to deposit");
	    	 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
	    	 String Depid = null;
			try {
				Depid=reader.readLine();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
	          for(int k=0;k<3;k++)
	  		{
	  			if(UserId[k].equals(Depid)) {
	  				System.out.println("User id entered is "+Depid+"\nClick 1 to continue\nClick 0 to exit");
                int input;
                input=s.nextInt();	    	      
	    	   if(input==1) {
	    	   System.out.println("place the amount in socket");
	           int Deposit=s.nextInt();
	           InitBals[i]+=Deposit;
	           if(i==k)System.out.println(Deposit+"rs deposited succesfully.Current balance in account is "+InitBals[i]);
                if(i!=k)	          System.out.println( Deposit+" rs deposited to account with userid"+Depid);
	           PrintReciept();}
	    	   if(input==0) {
	    		  System.exit(0);
	    	   }
	  			}
	  		}break;
	    case 4:System.out.println("enter old pin");
	           int verify=s.nextInt();
	           if(Pins[i]==verify) {
	        	   System.out.println("Enter new pin");
	        	  int newpin=s.nextInt();
	        	  Pins[i]=newpin;
	        	  System.out.println("pin change dsuccesfully");//since this is a static project value of changed pin will have no effect  
	           }
	           else {
	        	   System.out.println("Invalid pin.Operation failed");
	    }System.exit(0);
	    case 5: 
	    
	    case 6:System.exit(0);	
		}//switch
		}//DisplayOptions
		public static void PrintReciept(){
			Scanner s=new Scanner(System.in);
			System.out.println("Enter 1 if you want a reciept\nEnter 0 if you dont want reciept");
	            int want=s.nextInt();
	            if(want==1)
	           {
		         System.out.println("Collect your reciept(Let us go green!!try to save paper)"); 
	             }
	            if(want==0) {
		        System.out.println("Thankyou!!!");
	           }
	        System.exit(0);
	            
		}
		
}//class
	
