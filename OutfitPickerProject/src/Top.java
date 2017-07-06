

public class Top {
	public String name;
	public String sleeveLength;
	public String[] bottoms;
	public Top(String title, String sleeve, String[] bottomArray, Sweater[] sweaterArray){		
		name = title;
		sleeveLength = sleeve;
		
		String[] bottoms = bottomArray;
		Sweater[] sweaters = sweaterArray;
		
	}
	
	public String getName(){
		return name;
	}
	
	public boolean wasWornRecently(){
		//TODO set up worn recently file
		return false;
	}
	
	public String getOneBottom(int i){
		String bott = bottoms[i];
		return bott;
	}
	
	public boolean isOutOfRange(int i){
		int k = 0;
		
		for (String j: bottoms){
			k++;
		}
		
		if (i > k){
			return true;
		}
		return false;
	}
}
