package stockmarket;
import java.util.Scanner;
public class MergSort {

	static	Scanner sc=new Scanner(System.in);
	public 	void mergsort(double pricearray[],double left,double right,double mid) {
			
			double len1=mid-left+1;
			double len2=right-mid;
			double[] leftpricearray=new double[(int) len1];
			double rightpricearray[]=new double [(int) len2];
			
			for(int i = 0;i<len1;i++){
				leftpricearray[i]=pricearray[(int) (left+i)];
			for(int j=0;j<len2;j++) {
				rightpricearray[j]=pricearray[(int) (mid+1+j)];
				
		   
		     
		    j=0;
		    i=0;
		   double k = left;
			}
				
			}
			int i = 0;
			int j = 0;
			while (i<len1 && j<len2) {
				
			if (leftpricearray[i]<=rightpricearray[j]) {
				int k = 0;
				pricearray[k]=leftpricearray[i];
				i++;
				
			}
			else {
				int k = 0;
				pricearray[k]=rightpricearray[i];
				j++;
				k++;
			}
			}
		while(i <len1) {
			int k = 0;
			pricearray[k]=leftpricearray[i];
			i++;
			k++;
			
		}	
		}
		
	 public  void mergsort(double pricearray[],double left,double right) {
		 if(left<right) {
			 
		double mid =(left +right)/2;
		// mergsort(pricearray,left,mid,right);
		 mergsort(pricearray,mid+1,right);
		 
		 }
		 
	 }
	 void display(double pricearray[]) {
		int nocom =pricearray.length;
		for(int i =0 ;i<nocom;i++)
			
			System.out.println(pricearray[i]+ "");
		System.out.println();
		
	 }
	 
	 public static void main(String[] args) {
		 
		 int nocom = sc.nextInt();
		double pricearray[]= new double [nocom];
		 MergSort ob =new MergSort();
		 
		 System.out.println("orignal array");
		ob. display(pricearray);
		 ob.mergsort(pricearray,0, pricearray.length-1);
		 
		 System.out.println("sorted array");
		ob. display(pricearray);
	 }
	}


