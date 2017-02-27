
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.LineNumberReader;
import java.io.FileReader;
import java.io.IOException;
public class MakeCouple{
	public static void main(String[] args) throws IOException {  
	FileInputStream in1 = null;
	FileInputStream in2 = null;
	
	
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

	try 
	{
		in1 = new FileInputStream("girl.txt");
		in2 = new FileInputStream("boy.txt");
		
		
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
	System.out.println("The Couples are:");
	int i;
	for(i=0;i<145;i++)
	{
		char criterion=girls[i].choice;
		int max=0,j;
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
				System.out.println(boys[max].name + '\t' +girls[i].name);
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
				System.out.println(boys[max].name + '\t' +girls[i].name);
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
				System.out.println(boys[max].name + '\t' +girls[i].name);
			}
		}
		
	}
	
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
		if (out != null) 
		{
        		out.close();
		}
      }

   }
}
