import java.util.*;

//C++ TO JAVA CONVERTER TODO TASK: The original C++ template specifier was replaced with a Java generic specifier, which may not produce the same behavior:
//ORIGINAL LINE: template <class T>
public class kbest<T>
{
	  public final void ret_best(T[] a, int[] ar, int n)
	  {
		int i;
		int j;
		int t;
		T tmp = new null;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (ar[i] > ar[j])
				{
				  t = ar[i];
				  ar[i] = ar[j];
				  ar[j] = t;
				  tmp = a[i];
				  a[i] = a[j];
				  a[j] = tmp;
				}
			}
		}
	  }
}