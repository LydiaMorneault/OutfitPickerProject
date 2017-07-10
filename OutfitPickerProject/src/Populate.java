import java.util.Arrays;
import java.util.Random;

import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class Populate {
	public static Top[] tops;
	public Bottom bottom;
	public String sweater;
	public String shoes;
	public static Top top;
	
	public static void print(Top[] printArray){
		for (int i = 0; i < printArray.length; i++){
			String name = printArray[i].name;
			System.out.println(name);
		}
	}
	
	public static int getRandom(int bound){
		Random random = new Random();
		return random.nextInt(bound);
	}
	
	public static Top getTop(){
		// gets random top
		int randTop = getRandom(tops.length);
		Top newTop = tops[randTop];
		return newTop;
	}
	

	public Populate() {
		// ********** BOTTOMS *********** //
		Bottom a = new Bottom("black pants", false);
		Bottom b = new Bottom("b/w/y skirt", true);
		Bottom c = new Bottom("blue flowered embroidered", true);
		Bottom d = new Bottom("blue pants", false);
		Bottom e = new Bottom("checked pants", false);
		Bottom f = new Bottom("grey skirt", true);
		Bottom g = new Bottom("navy skirt", true);
		Bottom h = new Bottom("purple floral skirt", true);
		Bottom j = new Bottom("white skirt", true);
		
		// ********** SWEATERS ********** //
		
		String aa = "black blazer";
		String bb = "burgundy";
		String cc = "mustard";
		String dd = "red";
		String ee = "striped brown";
		String ff = "teal";
		String gg = "tan";
		
		// ********** SHOES **********//
		String sh1 = "black sandal heels";
		String sh2 = "white sandals";
		String sh3 = "black flats";
		String sh4 = "blue flats";
		String sh5 = "red flats";
		String sh6 = "wedges";
		
		// ********** TOPS ********** //
		String[] empty = {};
		
		Bottom[] aaaArray = {b, e, f, h,  j};
		String[] sha = {sh1, sh2, sh3, sh4, sh5, sh6};
		Top aaa = new Top("black button tee",  aaaArray, empty, sha);
		
		Top bbb = new Top("black long sleeved",  aaaArray, empty, sha);
		
		Bottom[] cccArray = {a, f};
		String [] cccarray = {aa, cc, dd, ee, gg};

		Top ccc = new Top("black with foxes",  cccArray, cccarray, sha);
		
		Bottom[] dddArray = {c, f, g, h, j};
		String[] shd = {sh1, sh2, sh4, sh6};
		Top ddd = new Top("blue gingham",  dddArray, empty, shd);
		
		Bottom[] eeeArray = {f, g, h,  j};
		Top eee = new Top("blue striped shirt",  eeeArray, empty, shd);
		
		Bottom[] fffArray = {d, g, j};
		String[] fffarray = {bb, cc, dd, gg};
		String[] shf = {sh1, sh2, sh4, sh5, sh6};
		Top fff = new Top("blue striped tank",  fffArray, fffarray, shf);
		
		Bottom[] gggArray = {d, f, g, j};
		Top ggg = new Top("blue paisley",  gggArray, empty, shf);
		
		Bottom[] hhhArray = {d, f, g,  j};
		Top hhh = new Top("green floral",  hhhArray, empty, shf);
		
		Bottom[] iiiArray = {a, c, f, h};
		String[] iiiarray = {aa, bb, cc, dd, ff, gg};
		Top iii = new Top("Perry shirt",  iiiArray, iiiarray, sha);
		
		Bottom[] jjjArray = {a, d, f, g,  j};
		Top jjj = new Top("pink floral shirt",  jjjArray, empty, sha);
		
		String[] kkkarray = {aa, gg};
		Top kkk = new Top("pink floral tank",  jjjArray, kkkarray, sha);
		
		Bottom[] lllArray = {b, c, d, e, f, g, j};
		String[] lllarray = {bb, ee, gg};
		Top lll = new Top("mustard tank",  lllArray, lllarray, sha);
		
		Bottom[] mmmArray = {d, e, f, g,  j};
		Top mmm = new Top("orange peter pan",  mmmArray, lllarray, sha);
		
		Bottom[] nnnArray = {e, f, g,  j};
		Top nnn = new Top("red tee w/ b/w collar",  nnnArray, empty, sha);
		
		Top ooo = new Top("red white blue striped",  gggArray, empty, shf);
		
		Bottom[] pppArray = {a, b, c, d, e, f, g, h,  j};
		Top ppp = new Top("white button down",  pppArray, empty, sha);
		
		Bottom[] qqqArray = {a, d, g};
		Top qqq = new Top("white embroidered",  qqqArray, empty, sha);
		
		Top rrr = new Top("white pirate sleeves",  pppArray, empty, sha);
		
		Bottom[] sssArray = {a, f, j};
		String[] sssarray = {aa, bb, gg};
		Top sss = new Top("teal feather", sssArray, sssarray, sha);
		
		Top ttt = new Top("polka dot", dddArray, empty, shd);
		
		Bottom[] uuuArray = {a, d, f, g, h, j};
		Top uuu = new Top("light grey striped", uuuArray, empty, sha);
		
		Bottom[] vvvArray = {a, d, f, g, j};
		String[] vvvarray = {aa, bb, dd, gg};
		Top vvv = new Top("France floral tank", vvvArray, vvvarray, sha);
		
		Top[] tops = {aaa, bbb, ccc, ddd, eee, fff, ggg, hhh, iii, jjj, kkk, lll, mmm, nnn, ooo, ppp, qqq, rrr, sss, ttt};
		
		boolean isCold = true;
		
		// ********** CODE ********** //
	
/*		if (isCold){
			//do {
				// gets random top

			//} while (top.isShortSleeve == true);
		} else {
			// gets random top
			int randTop = getRandom(tops.length);
			Top top = tops[randTop];
			String name = top.getName();
			System.out.println(name);
		}*/

		
		int randTop = getRandom(tops.length);
		Top top = tops[randTop];
		String name = top.getName();
		System.out.println(name);
				
		// gets random bottom
		int randBottom;		
		randBottom = getRandom(top.bottoms.length);
		bottom = top.bottoms[randBottom];
		
		// gets random sweater	
		int randSweater;
		// checks if the top has any sweaters that go with it
		if(top.sweaters.length > 0){
			randSweater = getRandom(top.sweaters.length);
			sweater = top.sweaters[randSweater];
			System.out.println(sweater);
		}	
		System.out.println(bottom.name);	
		
		int randShoe;
		randShoe = getRandom(top.shoes.length);
		shoes = top.shoes[randShoe];
		System.out.println(shoes);
	}


	public static void main(String[] args){
		Populate populate = new Populate();
	}
}
