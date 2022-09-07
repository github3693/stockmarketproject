package stockmarket;



	public class binarysearch {
		
		public static void  binarySearch(double pricearray [],double first , double last,double key) {
			
			double mid =(first+ last)/2;
			
			while (first <=last) {
				
				if (pricearray[(int) mid]<key) {
					
					first=mid+1 ;
				
				}
			else if (pricearray[(int) mid]==key) {
				
				System.out.println("element found at array index :" +mid);
			  break;
			}	
			else {
				last=mid-1;
			}
				mid=first+last/2;
				 
			}if (first >last) {
				System.out.println("element is not found");
			}
		}

		public static void main (String[]args) {
			binarysearch b =new binarysearch();
	double pricearray[]= {4,18,18,43,46};
	   double key=43;
		double last= pricearray.length-1;
		binarysearch.binarySearch(pricearray,0,last,key);
		}

		
		}
		 


