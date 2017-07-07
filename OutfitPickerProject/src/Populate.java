import java.util.Arrays;
import java.util.Random;


public class Populate {
	public Top[] tops;
	public String sweater;
	public Bottom bottom;
	
	public static void print(Top[] printArray){
		for (int i = 0; i < printArray.length; i++){
			String name = printArray[i].name;
			System.out.println(name);
		}
	}
	
	public Top[] getTops(){
		return tops;
	}
	
	public static int getRandom(int bound){
		Random random = new Random();
		return random.nextInt(bound);
	}

	public Populate() {
		
		// ********** BOTTOMS ********** //
/*		String a = "black pants";
		String b = "b/w/y skirt";
		String c = "blue flowered embroidered";
		String d = "blue pants";
		String e = "checked pants";
		String f = "grey skirt";
		String g = "navy skirt";
		String h = "purple floral skirt";
		String i = "suede skirt";
		String j = "white skirt";*/
		
		Bottom a = new Bottom("black pants", false);
		Bottom b = new Bottom("b/w/y skirt", true);
		Bottom c = new Bottom("blue flowered embroidered", true);
		Bottom d = new Bottom("blue pants", false);
		Bottom e = new Bottom("checked pants", false);
		Bottom f = new Bottom("grey skirt", true);
		Bottom g = new Bottom("navy skirt", true);
		Bottom h = new Bottom("purple floral skirt", true);
		Bottom i = new Bottom("suede skirt", true);
		Bottom j = new Bottom("white skirt", true);
		
		// ********** SWEATERS ********** //
		
		String aa = "black blazer";
		String bb = "burgundy";
		String cc = "mustard";
		String dd = "red";
		String ee = "striped brown";
		String ff = "teal";
		String gg = "tan";
		
		// ********** TOPS ********** //
		String[] empty = {};
		
		Bottom[] aaaArray = {b, e, f, h, i, j};
		Top aaa = new Top("black button tee", "tee", aaaArray, empty);
		
		Top bbb = new Top("black long sleeved", "long", aaaArray, empty);
		
		Bottom[] cccArray = {a, f, i};
		String [] cccarray = {aa, cc, dd, ee, gg};
		Top ccc = new Top("black with foxes", "tank", cccArray, cccarray);
		
		Bottom[] dddArray = {c, f, g, h, j};
		Top ddd = new Top("blue gingham", "long", dddArray, empty);
		
		Bottom[] eeeArray = {f, g, h, i, j};
		Top eee = new Top("blue striped shirt", "long", eeeArray, empty);
		
		Bottom[] fffArray = {d, g, j};
		String[] fffarray = {bb, cc, dd, gg};
		Top fff = new Top("blue striped tank", "tank", fffArray, fffarray);
		
		Bottom[] gggArray = {d, f, g, j};
		Top ggg = new Top("blue paisley", "long", gggArray, empty);
		
		Bottom[] hhhArray = {d, f, g, i, j};
		Top hhh = new Top("green floral", "3/4", hhhArray, empty);
		
		Bottom[] iiiArray = {a, c, f, h, i};
		String[] iiiarray = {aa, bb, cc, dd, ff, gg};
		Top iii = new Top("Perry shirt", "tee", iiiArray, iiiarray);
		
		Bottom[] jjjArray = {a, d, f, g, i, j};
		Top jjj = new Top("pink floral shirt", "long", jjjArray, empty);
		
		String[] kkkarray = {aa, gg};
		Top kkk = new Top("pink floral tank", "tank", jjjArray, kkkarray);
		
		Bottom[] lllArray = {b, c, d, e, f, g, j};
		String[] lllarray = {bb, ee, gg};
		Top lll = new Top("mustard tank", "tank", lllArray, lllarray);
		
		Bottom[] mmmArray = {d, e, f, g, i, j};
		Top mmm = new Top("orange peter pan", "tank", mmmArray, lllarray);
		
		Bottom[] nnnArray = {e, f, g, i, j};
		Top nnn = new Top("red tee w/ b/w collar", "tee", nnnArray, empty);
		
		Top ooo = new Top("red white blue striped", "long", gggArray, empty);
		
		Bottom[] pppArray = {a, b, c, d, e, f, g, h, i, j};
		Top ppp = new Top("white button down", "long", pppArray, empty);
		
		Bottom[] qqqArray = {a, d, g, i};
		Top qqq = new Top("white embroidered", "long", qqqArray, empty);
		
		Top rrr = new Top("white pirate sleeves", "3/4", pppArray, empty);
		
		Bottom[] sssArray = {a, f, j};
		String[] sssarray = {aa, bb, gg};
		Top sss = new Top("teal feather", "tank", sssArray, sssarray);
		
		Top ttt = new Top("polka dot", "long", dddArray, empty);
		
		Top[] tops = {aaa, bbb, ccc, ddd, eee, fff, ggg, hhh, iii, jjj, kkk, lll, mmm, nnn, ooo, ppp, qqq, rrr, sss, ttt};
	
		int randTop = getRandom(tops.length);
		Top top = tops[randTop];
		String name = top.getName();
		System.out.println(name);
				
		int randBottom;
		
		randBottom = getRandom(top.bottoms.length);
		bottom = top.bottoms[randBottom];
	
		int randSweater;
		
		//System.out.println(top.sweaters.length);
		
		if(top.sweaters.length > 0){
			randSweater = getRandom(top.sweaters.length);
			sweater = top.sweaters[randSweater];
			//System.out.println(randSweater);
			System.out.println(sweater);
		}
	
		System.out.println(bottom.name);

		
	}


	public static void main(String[] args){
		Populate populate = new Populate();
	}
}
