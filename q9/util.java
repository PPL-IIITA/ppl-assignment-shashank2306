import java.util.*;

public class util
{
	  public final int coupling(int k)
	  {
		boys bo = new boys();
		girls gfg = new girls();
		  int nb = bo.readboyscount();
		  int ng = gfg.readgirlscount();
		int[] a = new int[nb];
		int[] b = new int[ng];
		  boys[] boyss = tangible.Arrays.initializeWithDefaultboysInstances(nb);
		  girls[] girlss = tangible.Arrays.initializeWithDefaultgirlsInstances(ng);
		  couples cc = new couples();
		  bo.input(boyss,nb); //!taking boys input from boys.txt
		for (int i = 0;i < nb;i++)
		{
		  a[i] = boyss[i].budget;
		}
		  gfg.input(girlss,ng);
		for (int i = 0;i < ng;i++)
		{
		  b[i] = girlss[i].maintenance; //!taking girls input from boys.txt.
		}
		  kbest<boys> kboys = new kbest<boys>();
		kbest<girls> kgirls = new kbest<girls>();
//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
//ORIGINAL LINE: kboys.ret_best(boyss,a,nb);
		kboys.ret_best(new boys(boyss), a, nb);
//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
//ORIGINAL LINE: kgirls.ret_best(girlss,b,ng);
		kgirls.ret_best(new girls(girlss), b, ng);
		System.out.print("---------- BEST RELATIONShIPS ------------\n");
		System.out.print("\n");
		cc.pairing(boyss,girlss,k,ng); //!first priority for selection of boys will be budget and their second priority will be according to the girl type and the top "k" are eligible for the girls.
		//printf("1\n\n\n\n");
		return 0;
	  }
	   public final int gifting(int k)
	   {
		 couples cc = new couples();
			int count = cc.readcouplecount(); //!counting the number of couples.
			couples[] couple = tangible.Arrays.initializeWithDefaultcouplesInstances(count);
			cc.input(couple,count); //!Reading couples data from couple.txt.
			gifts gg = new gifts();
			int ngf = gg.readgiftscount();
		 int[] a = new int[ngf];
			gifts[] gif = tangible.Arrays.initializeWithDefaultgiftsInstances(ngf);
			gg.input(gif,ngf); //!Reading the types of gifts.
		 kbest<gifts> kgifts = new kbest<gifts>();
		 for (int i = 0;i < ngf;i++)
		 {
		   a[i] = gif[i].value;
		 }
//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy constructor call - this should be verified and a copy constructor should be created if it does not yet exist:
//ORIGINAL LINE: kgifts.ret_best(gif,a,ngf);
		 kgifts.ret_best(new gifts(gif), a, ngf);
		 //sort(a,a+ngf);
		 //for(int i=0;i<ngf;i++)
		 System.out.print("---------- GIFTINGS ------------");
		 System.out.print("\n");
		 cc.couplegifting(couple,count,gif,k); //!Gift exchanges among k best gifts,happiness and compatibility calculation and inserting into log file and fcalc.txt.
		 return 0;
	   }
}