

public class Top {
	public String name;
	public String sleeveLength;
	public Bottom[] bottoms = new Bottom[9];
	public String[] sweaters = new String[6];
	
	public Top(String title, String sleeve, Bottom[] bottomArray, String[] sweaterArray){		
		name = title;
		sleeveLength = sleeve;
		
		bottoms = bottomArray;
		String[] sweaters = sweaterArray;
		
	}
	
	public String getName(){
		return name;
	}
	
	public boolean wasWornRecently(){
		//TODO set up worn recently file
		return false;
	}
	
/*	public String getOneBottom(int i){
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
	}*/
}
