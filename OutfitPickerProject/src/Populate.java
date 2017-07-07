import java.util.Arrays;
import java.util.Random;


public class Populate {
	public Top[] tops;
	
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
		String a = "black pants";
		String b = "b/w/y skirt";
		String c = "blue flowered embroidered";
		String d = "blue pants";
		String e = "checked pants";
		String f = "grey skirt";
		String g = "navy skirt";
		String h = "purple floral skirt";
		String i = "suede skirt";
		String j = "white skirt";
		
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
		
		String[] aaaArray = {b, e, f, h, i, j};
		Top aaa = new Top("black button tee", "tee", aaaArray, empty);
		
		Top bbb = new Top("black long sleeved", "long", aaaArray, empty);
		
		String[] cccArray = {a, f, i};
		String [] cccarray = {aa, cc, dd, ee, gg};
		Top ccc = new Top("black with foxes", "tank", cccArray, cccarray);
		
		String[] dddArray = {c, f, g, h, j};
		Top ddd = new Top("blue gingham", "long", dddArray, empty);
		
		String[] eeeArray = {f, g, h, i, j};
		Top eee = new Top("blue striped shirt", "long", eeeArray, empty);
		
		String[] fffArray = {d, g, j};
		String[] fffarray = {bb, cc, dd, gg};
		Top fff = new Top("blue striped tank", "tank", fffArray, fffarray);
		
		String[] gggArray = {d, f, g, j};
		Top ggg = new Top("blue paisley", "long", gggArray, empty);
		
		String[] hhhArray = {d, f, g, i, j};
		Top hhh = new Top("green floral", "3/4", hhhArray, empty);
		
		String[] iiiArray = {a, c, f, h, i};
		String[] iiiarray = {aa, bb, cc, dd, ff, gg};
		Top iii = new Top("Perry shirt", "tee", iiiArray, iiiarray);
		
		String[] jjjArray = {a, d, f, g, i, j};
		Top jjj = new Top("pink floral shirt", "long", jjjArray, empty);
		
		String[] kkkarray = {aa, gg};
		Top kkk = new Top("pink floral tank", "tank", jjjArray, kkkarray);
		
		String[] lllArray = {b, c, d, e, f, g, j};
		String[] lllarray = {bb, ee, gg};
		Top lll = new Top("mustard tank", "tank", lllArray, lllarray);
		
		String[] mmmArray = {d, e, f, g, i, j};
		Top mmm = new Top("orange peter pan", "tank", mmmArray, lllarray);
		
		String[] nnnArray = {e, f, g, i, j};
		Top nnn = new Top("red tee w/ b/w collar", "tee", nnnArray, empty);
		
		Top ooo = new Top("red white blue striped", "long", gggArray, empty);
		
		String[] pppArray = {a, b, c, d, e, f, g, h, i, j};
		Top ppp = new Top("white button down", "long", pppArray, empty);
		
		String[] qqqArray = {a, d, g, i};
		Top qqq = new Top("white embroidered", "long", qqqArray, empty);
		
		Top rrr = new Top("white pirate sleeves", "3/4", pppArray, empty);
		
		String[] sssArray = {a, f, j};
		String[] sssarray = {aa, bb, gg};
		Top sss = new Top("teal feather", "tank", sssArray, empty);
		
		Top ttt = new Top("polka dot", "long", dddArray, empty);
		
		Top[] tops = {aaa, bbb, ccc, ddd, eee, fff, ggg, hhh, iii, jjj, kkk, lll, mmm, nnn, ooo, ppp, qqq, rrr, sss, ttt};
	
		int randTop = getRandom(18);
		Top top = tops[randTop];
		String name = top.getName();
		System.out.println(name);
		
		String bottom;		
		int randBottom;
		
		do{
			randBottom = getRandom(top.bottoms.length-1);
			bottom = top.bottoms[randBottom];

		}while (!(Arrays.asList(top.bottoms).contains(bottom)));
		
		int randSweater;
		String sweater;
		
		do{
			randSweater = getRandom(top.sweaters.length-1);
			sweater = top.sweaters[randSweater];

		}while (!(Arrays.asList(top.sweaters).contains(sweater)));

		System.out.println(sweater);


		
		System.out.println(bottom);

		
	}


	public static void main(String[] args){
		Populate populate = new Populate();
	}
}
