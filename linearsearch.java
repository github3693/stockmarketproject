package stockmarket;

public class linearsearch {
	
	public int countcompaniesinprofit(boolean profitarray[]){
		
		int count =0;
		
		for(int i = 0;i<profitarray.length;i++) {
			
			if(profitarray[i]==true)
				count++;
		}	
			return count;
		
	}

}
