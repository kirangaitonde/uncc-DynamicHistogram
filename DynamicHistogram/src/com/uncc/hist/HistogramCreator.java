/*
 * HistogramCreator
 * 
 * Creates Histograms with given # of bins 
 *  
 * @author Kiran Gaitonde
 * 
 */

package com.uncc.hist;

import com.uncc.numgen.NumberGenerator;



public class HistogramCreator {
	
	private static int size = 10000;
		
	// create Histogram with input array and number of bins
	public int[] createHistogram(int[] arr, int bins)
	{
		int b[] = new int[bins];
		double d = 100.0/bins;		
		double num ;
		int index;
		for (int i = 0; i < size; i++)
	    {
	    	num = arr[i] /d;
	    	index = (int)num;
	    	b[index]++;	    	
	     }	
		
		return b;
	}
	
	public static final void main(String... aArgs)
	  {
		  NumberGenerator n  = new NumberGenerator();
		  int histIn[] = new int[size];
		  histIn  = n.generateNubmers();
		  HistogramCreator h = new HistogramCreator();
		  int b[]= new int[30];
		  b = h.createHistogram(histIn, 30);
	  
	  }

}
