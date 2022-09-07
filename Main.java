package stockmarket;

import java.util.Scanner;

public class Main {
	
	public static void main(String  [] args) {
		
	
	int noOfCompanies;
	int option;
	

	System.out.println("enter the no.of companies that are associated with stockers");
	Scanner sc =new Scanner(System.in);
	noOfCompanies=sc.nextInt();
	
	double pricearray[]=new double [noOfCompanies];
	boolean profitarray[]=new boolean [noOfCompanies];
	
	//taking todays stock price
	
	for(int i=0;i<noOfCompanies;i++) {
		System.out.println("enter the no.of stock prices");
		pricearray[i]=sc.nextInt();
		
		System.out.println("whether the stock price increases today as compared to ysterday");
		profitarray[i]=sc.nextBoolean();
	}	
	
	//sort methods
		MergSort m=new MergSort();
	   m.mergsort(pricearray,0,pricearray.length-1);
	   
	   additionalservices a =new additionalservices();
	   
	   linearsearch l =new linearsearch();
	   
	binarysearch b=new binarysearch();
	
	
	//take user inputs
	
	do {
		System.out.println("enter the opertaions thay u=you want to perform");
		System.out.println("1, display the no.of companies in ascending order");
		System.out.println("2, display the no.of companies in descending order ");
		System.out.println("3, display the no.of companies for which stock orce increases today");
		System.out.println("4, display the no.of companies for which stock orce decreases today");
		System.out.println("5, search specific stock price");
		System.out.println("6, press 0 to exit");
		
		System.out.println("-------------------------------------------------------------");
	
	option =sc.nextInt();
		
	
   switch (option) {//like condition
   
   case 0:
   option=0;
   break;
   
   case 1:
   a.displaypricesascendingorder(pricearray);
   break;
   
   case 2 :
   a.displaypricesdescecndingorder(pricearray);
   break;
   
   case 3:
	   
   System.out.println("total no.of companies whose value stock price declined today"+
                      (noOfCompanies-l.countcompaniesinprofit(profitarray)));
   break;
   
   case 4:
   
   System.out.println("total no.of companies whose value stock price increased today :"
                      +l.countcompaniesinprofit(profitarray)) ;
   case 5:
	   
	   double key;
	   
	   System.out.println("enter the key value");
	   key=sc.nextDouble();
	   
	   b.binarySearch(pricearray,0,key,key);
	   
	   break;
	   default:
		   System.out.println("enter valid option");
		   
   }	   
   }
   while(option!=0);
   
   //exit message and close the scanner object

   System.out.println("exited sucessfully");
   sc.close();

	


   
   
   
   
   
   
   
	} 
   
	}
	
	
	   
	   
	   
   
   
   
