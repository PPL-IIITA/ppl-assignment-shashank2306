public class boys extends attributes
{
		public String girlname;
		public int budget;
		public int min_attractive;
		public final int readboyscount()
		{
			byte p;
			int count = 0;
			FILE fp = fopen("boys.txt","r");
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
		public final int input(boys[] boyss, int nb) //!boys data input.
		{
			FILE fb = fopen("boys.txt","r");
			String nme = new String(new char[10]);
			String nme2 = new String(new char[10]);
			String nme3 = new String(new char[20]);
			for (int i = 0;i < nb;i++)
			{
				fscanf(fb, "%s %s %d %d %d %d", nme, nme2, boyss[i].attractiveness, boyss[i].intelligence, boyss[i].budget, boyss[i].min_attractive);
				boyss[i].name = nme;
				boyss[i].type = nme2;
				boyss[i].committed = 0;
			}
			fclose(fb);
			return 0;
		}
		public final int logging(boys[] boyss, int nb) //!inserts girlfriend for a boyfriend if exists into log file.
		{
			std::ofstream outfile = new std::ofstream();
		  outfile.open("log.txt", std::ios_base.app);
			for (int i = 0;i < nb;i++)
			{
				time_t now = time(0);
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: sbyte* dt = ctime(&now);
				byte dt = ctime(now);
				if (boyss[i].committed == 1)
				{
					outfile << "New Relationship ----" << " " << dt << " " << boyss[i].name << " in relationship with " << boyss[i].girlname << "\n";
				}
			}
			return 0;
		}
}