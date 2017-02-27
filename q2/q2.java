import java.util.Collections; 
import java.util.Comparator; 
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.io.LineNumberReader;
import java.io.FileReader;
import java.io.IOException;
public class q2{
	public static void main(String[] args) throws IOException {  
	FileInputStream in1 = null;
	FileInputStream in2 = null;
	FileInputStream in3 = null;
	int k=3;
	
	Boy[] boys=new Boy[250];
	
	for(int i=0;i<250;i++)
	{
		boys[i]=new Boy();
	}	
	
	Girl[] girls=new Girl[145];
	
	for(int i=0;i<145;i++)
	{
		girls[i]=new Girl();
	}

	gift[] gifts=new gift[1000];
	
	for(int i=0;i<1000;i++)
	{
		gifts[i]=new gift();
	}
	
	try 
	{
		in1 = new FileInputStream("girl.txt");
		in2 = new FileInputStream("boy.txt");
		in3 = new FileInputStream("gift.txt");
		
		
        int count=0;
        String temp;
	while ((in1.available()) > 0) {
		char t;
		t=(char)in1.read();
		while(t != '\t')
		{
			//name here
			girls[count].name=girls[count].name+t;
			t=(char)in1.read();
		}	
		temp="";
		t=(char)in1.read();
		while(t != '\t')
		{
			//attractiveness here
			temp=temp+t;
			t=(char)in1.read();	
		}
				
		girls[count].attractiveness=Integer.parseInt(temp);
		
		t=(char)in1.read();
		temp="";
		while(t != '\t')
		{
			//intelligence_level here
			temp=temp+t;
			t=(char)in1.read();
		}
		
		girls[count].intelligence_level=Integer.parseInt(temp);
		temp="";
		t=(char)in1.read();
		while(t != '\t')
		{
			//maintenence_cost here
			temp=temp+t;
			t=(char)in1.read();
		}
		girls[count].maintenence_cost=Float.parseFloat(temp);
		t=(char)in1.read();
		while(t != '\t') 
		{
			//choice here
			girls[count].choice=t;
			t=(char)in1.read();
		}
		t=(char)in1.read();
		while(t != '\n')
		{
			//type here
			girls[count].type=t;
			t=(char)in1.read();
		}
		
		count++;
	}
	count=0;
	while ((in2.available()) > 0) {
		char t;
		t=(char)in2.read();
		while(t != '\t')
		{
			//name here
			boys[count].name=boys[count].name+t;
			t=(char)in2.read();
		}		
		temp="";
		t=(char)in2.read();
		while(t != '\t')
		{
			//attractiveness here
			temp=temp+t;
			t=(char)in2.read();
		}
		boys[count].attractiveness=Integer.parseInt(temp);
		t=(char)in2.read();
		temp="";
		while(t != '\t')
		{
			//needed_attractiveness here
			temp=temp+t;
			t=(char)in2.read();
		}
		boys[count].needed_attractiveness=Integer.parseInt(temp);
		temp="";
		t=(char)in2.read();
		while(t != '\t')
		{
			//intelligence_level here
			temp=temp+t;
			t=(char)in2.read();
			
		}
		boys[count].intelligence_level=Integer.parseInt(temp);		
		temp="";
		t=(char)in2.read();
		while(t != '\t')
		{
			//girlfriend_budget here
			temp=temp+t;
			t=(char)in2.read();
		}
		boys[count].girlfriend_budget=Float.parseFloat(temp);
		t=(char)in2.read();
		while(t != '\n')
		{
			//type here
			boys[count].type=t;
			t=(char)in2.read();
		}
		count++;
	}
	count=0;
	while ((in3.available()) > 0) {
		char t;
		t=(char)in3.read();
		while(t != '\t')
		{
			//name here
			gifts[count].name=gifts[count].name+t;
			t=(char)in3.read();
		}	
		temp="";
		t=(char)in3.read();
		while(t != '\t')
		{
			//price here
			temp=temp+t;
			t=(char)in3.read();	
		}
				
		gifts[count].price=Integer.parseInt(temp);
		
		t=(char)in3.read();
		temp="";
		while(t != '\t')
		{
			//value here
			temp=temp+t;
			t=(char)in3.read();
		}
		
		gifts[count].value=Integer.parseInt(temp);
		temp="";

		t=(char)in3.read();

		while(t != '\n')
		{
			//type here
			gifts[count].type=t;
			t=(char)in3.read();
		}
		
		count++;
	}
	//System.out.println("The Couples are:");
	int i;
	int count1=0;
	ArrayList<Couple> C=new ArrayList<Couple>();
	
	for(i=0;i<145;i++)
	{
		char criterion=girls[i].choice;
		int max=0,j;
		Couple temp1=new Couple();
		if(criterion == 'I')
		{
			for(j=1;j<250;j++)
			{
				
				if(boys[j].intelligence_level > boys[max].intelligence_level && boys[j].needed_attractiveness> girls[i].attractiveness && boys[max].commited==0)
				{
					max=j;
				}
			}
			if(boys[max].needed_attractiveness > girls[i].attractiveness && boys[max].commited==0)
			{
				boys[max].commited=1;
				girls[i].commited=1;
				temp1.b=boys[max];
				temp1.g=girls[i];
				C.add(temp1);
				//System.out.println(C.get(count1).b.name + '\t' +C.get(count1).g.name);
				count1++;
			}
		}
		if(criterion == 'A')
		{
			for(j=1;j<250;j++)
			{
				if(boys[j].attractiveness > boys[max].attractiveness && boys[j].needed_attractiveness > girls[i].attractiveness && boys[max].commited==0)
				{
					max=j;
				}
			}
			if(boys[max].needed_attractiveness > girls[i].attractiveness && boys[max].commited==0)
			{
				boys[max].commited=1;
				girls[i].commited=1;
				temp1.b=boys[max];
				temp1.g=girls[i];
				C.add(temp1);
				//System.out.println(C.get(count1).b.name + '\t' +C.get(count1).g.name);
				count1++;
			}
		}
		if(criterion == 'R')
		{
			for(j=1;j<250;j++)
			{
				if(boys[j].girlfriend_budget > boys[max].girlfriend_budget && boys[j].needed_attractiveness> girls[i].attractiveness && boys[max].commited==0)
				{
					max=j;
				}
			}
			if(boys[max].needed_attractiveness > girls[i].attractiveness && boys[max].commited==0)
			{
				boys[max].commited=1;
				girls[i].commited=1;
				temp1.b=boys[max];
				temp1.g=girls[i];
				C.add(temp1);
				//System.out.println(C.get(count1).b.name + '\t' +C.get(count1).g.name);
				count1++;
			}
		}
		
	}
	int size=C.size();

	Couple[] kcouples=new Couple[size];
	int max=0;
	/*for(i=0;i<size;i++)
	{
		for(int j=i+1;j<size;j++)
		{
			if(C.get(i).read==0 && C.get)
		}		
	}*/
	Collections.sort(C,new Comparator<Couple>()
	{
		public int compare(Couple c1,Couple c2)
		{
			return Float.valueOf(c1.b.girlfriend_budget).compareTo(c2.b.girlfriend_budget);
		}
	}
	);
		System.out.println("k happiest couple");
	for(i=0;i<k;i++)
	{
		System.out.println(C.get(i).b.name+"\t"+C.get(i).g.name);		
	}
	System.out.println("k compatible couple");
	size=C.size();
	for(i=size-1;i>size-k-1;i--)
	{
		System.out.println(C.get(i).b.name+"\t"+C.get(i).g.name);		
	}
	System.out.println();
	for(i=0;i<size;i++)
	{
		System.out.println("Gift exchange between couple"+(i+1));
		System.out.println("gift name\tprice	value	type");
		for(int j=0;j<1000;j++)
		{
			if(gifts[j].price<C.get(i).b.girlfriend_budget)
			{
				C.get(i).b.girlfriend_budget=C.get(i).b.girlfriend_budget-gifts[j].price;
				C.get(i).G.add(gifts[j]);
				System.out.println(gifts[j].name+"\t\t"+gifts[j].price+"\t"+gifts[j].value+"\t"+gifts[j].type);
			}
		}
	}
	System.out.println("E means Essential gifts and U means Utility gifts and L means Luxury gifts");
	}

	
	finally 
	{
		if (in1 != null) 
		{
         		in1.close();
		}
		if(in2 != null)
		{
			in2.close();
		}
		if (in3 != null) 
		{
        		in3.close();
		}
      }

   }
}
