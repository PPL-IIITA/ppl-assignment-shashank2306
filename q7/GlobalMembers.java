public class GlobalMembers
{
	public static void Main(String[] args) //inheritance is used here to connect common attributes of boys and girls in a class attribute
	{
		util x = new util();
		couples cc = new couples();
		int n;
		String[] s = {"b0","b1","b2","b3","b4","b5","b6","b7","b8","b9","b10"}; //!Given array of boys for which we have to search.
		n = 11;
		x.coupling(s, n); //!Inserting the couples formed into log file and couples.txt
	}
	public static void Main(String[] args)
	{
		//printf("Enter the number of boys,girls in order separated by spaces\n");
		//int nb,ng;
		int nb = 50;
		int ng = 30;
		FILE fb = fopen("boys.txt","w+"); //!Randomly Generating different types of boys in boys.txt.
		for (int j = 0;j < nb;j++)
		{
			fprintf(fb,"b");
			fprintf(fb,"%d",j); //!boy name.
			fprintf(fb," ");
			int type = tangible.RandomNumbers.nextNumber() % 3; //!boy type.
			if (type == 0)
			{
				fprintf(fb,"Miser ");
			}
			else if (type == 1)
			{
				fprintf(fb,"Generous ");
			}
			else if (type == 2)
			{
				fprintf(fb,"Geeks ");
			}
			fprintf(fb,"%d ",tangible.RandomNumbers.nextNumber() % 100 + 1); //!attractiveness.
			fprintf(fb,"%d ",tangible.RandomNumbers.nextNumber() % 100 + 1); //!intelligent.
			fprintf(fb,"%d ",tangible.RandomNumbers.nextNumber() % 1000 + 200); //!budget.
			fprintf(fb,"%d ",tangible.RandomNumbers.nextNumber() % 100 + 1); //!minimum attr.
			fprintf(fb,"\n");
		}

		FILE fg = fopen("girls.txt","w+"); //!Randomly Generating different types of girls in girls.txt.
		for (int j = 0;j < ng;j++)
		{
			fprintf(fg,"g%d",j); //!Name.
			fprintf(fg," ");
			int type = tangible.RandomNumbers.nextNumber() % 3;
			if (type == 0)
			{
				fprintf(fg,"Choosy "); //!type.
			}
			else if (type == 1)
			{
				fprintf(fg,"Normal ");
			}
			else if (type == 2)
			{
				fprintf(fg,"Desperate ");
			}
					type = tangible.RandomNumbers.nextNumber() % 3;
			if (type == 0)
			{
				fprintf(fg,"Attractive "); //!type.
			}
			else if (type == 1)
			{
				fprintf(fg,"Rich ");
			}
			else if (type == 2)
			{
				fprintf(fg,"Intelligent ");
			}
			fprintf(fg,"%d ",tangible.RandomNumbers.nextNumber() % 100 + 1); //!attractiveness.
			fprintf(fg,"%d ",tangible.RandomNumbers.nextNumber() % 100 + 1); //!intelligent.
			fprintf(fg,"%d ",tangible.RandomNumbers.nextNumber() % 1000 + 200); //!maintenance.
			fprintf(fg,"\n");
		}
	}

	public static TreeMap<String,String> m1 = new TreeMap<String,String>(); //! used a hash table to store name of partner.
	public static TreeMap<String,Integer> m2 = new TreeMap<String,Integer>();
}