

public class Top {
	public String name;
	//public Boolean isShortSleeve;	// 1 if short sleeved, 0 if long sleeved
	public Bottom[] bottoms = new Bottom[9];
	public String[] sweaters = new String[6];
	public String[] shoes = new String[6];
	
	public Top(String title, Bottom[] bottomArray, String[] sweaterArray, String[] shoeArray){		
		name = title;
		//isShortSleeve = new Boolean(sleeve);
		
		bottoms = bottomArray;
		sweaters = sweaterArray;
		shoes = shoeArray;
		
	}
	
	public String getName(){
		return name;
	}
	
	public boolean wasWornRecently(){
		//TODO set up worn recently file
		return false;
	}
	
	
/*	public boolean isSleeve(){
		if(isShortSleeve)
			return true;
		return false;
	}*/
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
