package stockmarket;

public class additionalservices {

	
	public void displaypricesascendingorder(double []pricearray) {

		System.out.println("stock prices in ascending order are");
		
		for(int i=0;i<pricearray.length;i++) {
			
			System.out.println(pricearray[i]);
			
			System.out.println();
			
			
		}
		
	}
	
	public void displaypricesdescecndingorder(double []pricearray) {
		
		System.out.println("stock prices in descending order are");
		
		
for(int i=0;i<pricearray.length;i++) {
			
			System.out.println(pricearray[i]);
			
			System.out.println();
}
	}

}
