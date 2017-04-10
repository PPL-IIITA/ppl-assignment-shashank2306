import java.util.*;

public class util
{
	  public final int coupling()
	  {
		boys bo = new boys();
		girls gfg = new girls();
		  int nb = bo.readboyscount();
		  int ng = gfg.readgirlscount();
		  boys[] boyss = tangible.Arrays.initializeWithDefaultboysInstances(nb);
		  girls[] girlss = tangible.Arrays.initializeWithDefaultgirlsInstances(ng);
		  couples cc = new couples();
		  bo.input(boyss,nb); //!taking boys input from boys.txt .
		  gfg.input(girlss,ng); //!taking girls input from boys.txt.
		  cc.pairing(boyss,girlss,nb,ng); //!pairing girl-boys if attractive of girl is greater than boy's reqquirement, satisfying the budget of boy and boys fall under the selection criterion of girl.
		  bo.logging(boyss,nb); //!inserting into log file relations of a boy.
		//printf("1\n\n\n\n");
		return 0;
	  }
	   public final int gifting()
	   {
		 couples cc = new couples();
		 int x;
			int count = cc.readcouplecount(); //!counting the number of couples.
			couples[] couple = tangible.Arrays.initializeWithDefaultcouplesInstances(count);
			cc.input(couple,count); //!Reading couples data from couple.txt.
			gifts gg = new gifts();
			int ngf = gg.readgiftscount();
			gifts[] gif = tangible.Arrays.initializeWithDefaultgiftsInstances(ngf);
			gg.input(gif,ngf); //!Reading the types of gifts.
		 x = tangible.RandomNumbers.nextNumber() % 4;
		 if (x != 1)
		 {
		   System.out.print("Using new technique of gifting\n\n");
		   cc.couplegiftingnew(couple,count,gif,ngf); //!New technique in which atleast one gift of each category should be given.
		 }
		 else
		 {
		   System.out.print("Using old technique of gifting\n\n");
			  cc.couplegifting(couple,count,gif,ngf); //!Gift exchanges,happiness and compatibility calculation and inserting into log file and fcalc.txt.
		 }
		 return 0;
	   }
}