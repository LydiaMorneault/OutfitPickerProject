import java.util.Random;

public class PopulateStr {
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

	public PopulateStr() {
		
		// ********** BOTTOMS ********** //
		String a = new String("black pants");
		String b = new String("b/w/y skirt");
		String c = new String("blue floral embroidered");
		String d = new String("blue pants");
		String e = new String("checked pants");
		String f = new String("grey skirt");
		String g = new String("navy skirt");
		String h = new String("purple floral skirt");
		String i = new String("suede skirt");
		String j = new String("white skirt");
		
		// ********** SWEATERS ********** //
		
		Sweater aa = new Sweater("black blazer");
		Sweater bb = new Sweater("burgundy");
		Sweater cc = new Sweater("mustard");
		Sweater dd = new Sweater("red");
		Sweater ee = new Sweater("striped tan");
		Sweater ff = new Sweater("teal");
		
		// ********** TOPS ********** //
		Sweater[] empty = {};
		
		String[] aaaArray = {b, e, f, h, i, j};
		Top aaa = new Top("black button tee", "tee", aaaArray, empty);
		
		Top bbb = new Top("black long sleeved", "long", aaaArray, empty);
		
		String[] cccArray = {a, f, i};
		Sweater [] cccarray = {aa, cc, dd, ee};
		Top ccc = new Top("black with foxes", "tank", cccArray, cccarray);
		
		String[] dddArray = {c, f, g, h, j};
		Top ddd = new Top("blue gingham", "long", dddArray, empty);
		
		String[] eeeArray = {f, g, h, i, j};
		Top eee = new Top("blue striped shirt", "long", eeeArray, empty);
		
		String[] fffArray = {d, g, j};
		Sweater[] fffarray = {bb, cc, dd};
		Top fff = new Top("blue striped tank", "tank", fffArray, fffarray);
		
		String[] gggArray = {d, f, g, j};
		Top ggg = new Top("blue paisley", "long", gggArray, empty);
		
		String[] hhhArray = {d, f, g, i, j};
		Top hhh = new Top("green floral", "3/4", hhhArray, empty);
		
		String[] iiiArray = {a, c, f, h, i};
		Sweater[] iiiarray = {aa, bb, cc, dd, ff};
		Top iii = new Top("Perry shirt", "tee", iiiArray, iiiarray);
		
		String[] jjjArray = {a, d, f, g, i, j};
		Top jjj = new Top("pink floral shirt", "long", jjjArray, empty);
		
		Sweater[] kkkarray = {aa};
		Top kkk = new Top("pink floral tank", "tank", jjjArray, kkkarray);
		
		String[] lllArray = {b, c, d, e, f, g, j};
		Sweater[] lllarray = {bb, ee};
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
		Sweater[] sssarray = {aa, bb};
		Top sss = new Top("teal feather", "tank", sssArray, empty);
		
		Top[] tops = {aaa, bbb, ccc, ddd, eee, fff, ggg, hhh, iii, jjj, kkk, lll, mmm, nnn, ooo, ppp, qqq, rrr, sss};

		int randTop = getRandom(18);
		Top top = tops[randTop];
		String name = top.getName();
		System.out.println(name);
		
		String bottom = null;
		
/*		do{
			int randBottom = getRandom(9);
			bottom = pppArray[randBottom];
			


		}while (!(top.bottoms.contains(bottom));*/
		
		String[] bottomArray = pppArray;
		
		boolean flag = true;
		boolean isOutofRange = false;
		
/*		int randBottom = getRandom(9);
		bottom = bottomArray[randBottom];*/
		
		while (flag){
			int randBottom = getRandom(9);
			isOutofRange = top.isOutOfRange(randBottom);
			
			bottom = top.getOneBottom(randBottom);
			System.out.println(bottom);

			for (int i1 = -1; i1 >= 0; i1--){
				if (bottomArray[i1].equals(bottom)){
					flag = false;
					break;
				}
				else{
					System.out.println("Nope");
				}
			}
		}
		
		System.out.println(bottom);
	}


	public static void main(String[] args){
		PopulateStr populate = new PopulateStr();
	}
}