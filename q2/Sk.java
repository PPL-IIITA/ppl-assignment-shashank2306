import java.io.*;
import java.util.*;

class Sk{
	public static void main(String args[]) throws FileNotFoundException{
		int i, intel;
		//ArrayList<Boy> glist = new ArrayList<Boy>();
		int value;
		int price;
		String name;
		char type;
		PrintWriter pw = new PrintWriter(new File("gift.txt"));
        	StringBuilder sb = new StringBuilder();
		Random r = new Random();
		
		for(i=1;i<=1000;i++){
//			Boy g = new Boy();
			char[] ch = {'E', 'L', 'U'};
			char[] t={'M','G','K'};
			name = "Gift"+i;
//			g.setName(name);
			value = r.nextInt(10)+1;
			price = r.nextInt(1000)+1;
	//		g.setAttractiveness(attractiveness);
			
		//	g.setIntellegence(intel);
			
			//g.setMainentence(budget);
			type = ch[r.nextInt(3)];
			
			//g.setsetBoytype(choice);
			//glist.add(g);
			
			
			sb.append(name);
			sb.append('\t');
			sb.append(price);
			sb.append('\t');
			sb.append(value);
			sb.append('\t');
			sb.append(type);
			
			sb.append('\n');
			
        
		}
		pw.write(sb.toString());
		pw.close();
        System.out.println("done!");
	}
}
