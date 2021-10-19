import java.util.*;

class Codechef
{
	public static void main (String args[])
	{
	    try 
	    {
	        Scanner Sc = new Scanner(System.in);
    		int T = Sc.nextInt();
    		int i;
    		for(i = 1; i <= T; i++)
    		{
    		    int A = Sc.nextInt();
    		    int B = Sc.nextInt();
    		    int C = Sc.nextInt();
    		    int D = Sc.nextInt();
    		    int E = Sc.nextInt();
    		    boolean flag = false;
    		    if(((A+B) <= D) && (C <= E))
    		        flag = true;
    		    if(((A+C) <= D) && (B <= E))
    		        flag = true;
    		    if(((C+B) <= D) && (A <= E))
    		        flag = true;
    		    if(flag)
    		        System.out.println("YES");
    		    else
    		        System.out.println("NO");
    		}
	    } 
	    catch (Exception e) 
	    {
	        return;
	    }
	}
}
