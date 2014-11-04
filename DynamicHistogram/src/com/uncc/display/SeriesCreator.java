
/*
 * SeriesCreator
 * 
 * Creates a XYChart series for the BarChart based on the number of bins passed. 
 *  
 * @author Kiran Gaitonde
 * 
 * 
 * References docs.oracle.com, stackoverflow.com
 */

package com.uncc.display;


import javafx.scene.chart.XYChart;

 
public class SeriesCreator  {
		
	
	
	// method to create Chart series
	public XYChart.Series seriesCreate(int b[])
	{
		    int bins = b.length;   
		     
		    XYChart.Series hist = new XYChart.Series();  
		    
		    for (int i = 0; i < bins; i++)
		    {
		    	hist.getData().add(new XYChart.Data(i+1+"", b[i]));
		    }  
	       
	        return hist;
		    
		
	}
     
    
	
}
