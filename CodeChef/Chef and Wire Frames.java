/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=0;i<a;i++)
		{
		    int n=sc.nextInt();
		    int m=sc.nextInt();
		    int x=sc.nextInt();
		    n=(2*n)+(2*m);
		    System.out.println(n*x);
		}
	}
}
