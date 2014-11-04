
/*
 * NumberGenerator
 * Generates 10k random Integers ranging from 0 to 100. 
 *  
 * @author Kiran Gaitonde
 * 
 */

package com.uncc.numgen;


import java.util.Random;



public final class NumberGenerator{
	
	private static int size =10000;
	  
	 	  
	  // returns an array with 10k random numbers ranging from 0 to 100
	  public int[] generateNubmers()
	  {
		  int b[] = new int[10000];
		  Random rand = new Random();
		    for (int i = 0; i < size; i++)
		    {
		      rand.nextInt(100);
		      b[i]=rand.nextInt(100);
		      //System.out.println(b[i]+" ");
		      }
		    return b;
		  
	  }
	  
	  public static final void main(String... aArgs)
	  {
	       
		  int a[]  = new int[size];
		  NumberGenerator n  = new NumberGenerator();
		  a  = n.generateNubmers();
		  //System.out.println(a[9999]);  
	    
	  }
}
	  
	 

