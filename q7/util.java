import java.util.*;

public class util
{
	  public final int coupling(String[] x, int n)
	  {
		boys bo = new boys();
		girls gfg = new girls();
		int c;
		  int nb = bo.readboyscount();
		  int ng = gfg.readgirlscount();
		  boys[] boyss = tangible.Arrays.initializeWithDefaultboysInstances(nb);
		  girls[] girlss = tangible.Arrays.initializeWithDefaultgirlsInstances(ng);
		  couples cc = new couples();
		  bo.input(boyss,nb); //!taking boys input from boys.txt .
		  gfg.input(girlss,ng); //!taking girls input from boys.txt.
		  cc.pairing(boyss,girlss,nb,ng); //!pairing girl-boys if attractive of girl is greater than boy's reqquirement, satisfying the budget of boy and boys fall under the selection criterion of girl.
		  bo.logging(boyss,nb); //!inserting into log file relations of a boy.
		//couples cc;
		int count = cc.readcouplecount(); //!counting the number of couples.
		couples[] couple = tangible.Arrays.initializeWithDefaultcouplesInstances(count);
		cc.input(couple,count);
		//std::vector< pair<string,string> > committedboys;
		String[] committedboys = new String[count];
		for (int i = 0;i < count;i++)
		{
		  for (int j = 0;j < nb;j++)
		  {
			if (boyss[j].committed == 1)
			{
			  committedboys[i] = boyss[j].name; //.push_back(make_pair(boyss[j].name,boyss[j].girlname));// =  //!created an array of name of committedboys.
			  GlobalMembers.m2.put(boyss[j].name, 1); //created a map(hashtable) of committedboys.
			  GlobalMembers.m1.put(boyss[j].name, boyss[j].girlname);
			  boyss[j].committed = 2;
			  break;
			}
		  }
		}
		c = tangible.RandomNumbers.nextNumber() % 99;
		if (c % 76 == 70) //!usinglinearsearch.
		{
		  System.out.print("\nUsing linear search in an unsorted array\n\n");
		  for (int i = 0;i < n;i++)
		  {
			int flag = 0;
			for (int j = 0;j < count;j++)
			{
			  if (x[i].equals(committedboys[j]))
			  {
				flag = 1;
				break;
			  }
			}
			if (flag == 1)
			{
			  System.out.print(x[i]);
			  System.out.print(" is in relationship with ");
			  System.out.print(GlobalMembers.m1.get(x[i]));
			  System.out.print("\n");
			}
			else
			{
			  System.out.print(x[i]);
			  System.out.print(" is not in relationship\n");
			}
		  }
		}
		else if (c % 4 == 2)
		{
		  System.out.print("\nUsing binary search in an sorted array\n\n");
		  sort(committedboys,committedboys + count);
		  for (int i = 0;i < n;i++)
		  {
			if (binary_search(committedboys,committedboys + count,x[i])) //!using binary_search.
			{
			  System.out.print(x[i]);
			  System.out.print(" is in relationship with ");
			  System.out.print(GlobalMembers.m1.get(x[i]));
			  System.out.print("\n");
			}
			else
			{
			  System.out.print(x[i]);
			  System.out.print(" is not in relationship\n");
			}
		  }
		}
		else
		{
		  System.out.print("\nUsing hashing through mapping\n\n");
		  for (int i = 0;i < n;i++)
		  {
			if (GlobalMembers.m2.get(x[i]).equals(1)) //!using maps as a hashtable.
			{
			  System.out.print(x[i]);
			  System.out.print(" is in relationship with ");
			  System.out.print(GlobalMembers.m1.get(x[i]));
			  System.out.print("\n");
			}
			else
			{
			  System.out.print(x[i]);
			  System.out.print(" is not in relationship\n");
			}
		  }
		}
		//printf("1\n\n\n\n");
		return 0;
	  }
}