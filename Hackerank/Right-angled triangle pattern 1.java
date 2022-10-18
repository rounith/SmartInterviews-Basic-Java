import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int i,j,counter=1;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=0;j<i;j++)
            {
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
}
