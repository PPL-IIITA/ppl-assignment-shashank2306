public class girls
{
		public String name; //!attributes of girls.
		public String type;
		public String boyname;
		public String need;
		public int attractiveness;
		public int maintenance;
		public int intelligence;
		public int happiness;
		public int committed;
		public final int readgirlscount()
		{
			byte p;
			int count = 0;
			FILE fp = fopen("girls.txt","r");
			for (p = getc(fp); p != EOF; p = getc(fp))
			{
				if (p == '\n') //! Increment count if this character is newline.
				{
					count = count + 1; //!number of couples.
				}
			}
			fclose(fp);
			return count;
		}
		public final int input(girls[] girlss, int ng) //!reading girls data.
		{
			FILE fg = fopen("girls.txt","r");
				String nme = new String(new char[10]);
				String nme2 = new String(new char[10]);
				String nme3 = new String(new char[20]);
			for (int i = 0;i < ng;i++)
			{
				fscanf(fg, "%s %s %s %d %d %d", nme, nme2, nme3, girlss[i].attractiveness, girlss[i].intelligence, girlss[i].maintenance);
				girlss[i].name = nme;
				girlss[i].type = nme2;
				girlss[i].need = nme3;
				girlss[i].committed = 0;
			}
			fclose(fg);
			return 0;
		}
}