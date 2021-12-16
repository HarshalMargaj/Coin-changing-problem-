package Coin;

public class Coin {

	      static final int INF = 100000;

	      public static int min(int x, int y) {

	    	  if(x<y)

	    		  return x;

	    	  return y;

	      }

	      

	      public static int coinChange(int coins[], int n, int k)

	      {

	    	  int[] M = new int[n+1];

	    	  M[0] = 0;

	    	  

	    	  for(int j=1; j<=n; j++)

	    	  {

	    		  int minimum = INF;

	    		  for(int i=1;i<=k;i++)

	    		  {

	    			  if(j>= coins[i])

	    			  {

	    				  minimum = min(minimum, 1+M[j-coins[i]]);

	    			  }

	    		  }

	    	       M[j] = minimum;

	    	  }

	    	  return M[n];

	      }

	      public static void main(String[] args)

	      {

	    	  int coins[]= {0, 1, 2, 3};

	    	  System.out.println("The minimum coins required are:");

	    	  System.out.println(coinChange(coins, 8, 3));

		  }



	}

