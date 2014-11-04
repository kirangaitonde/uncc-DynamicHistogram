/*
 * DynamicHistogramDisplay
 * 
 * Displays Histogram dynamically based on the slider position 
 *  
 * @author Kiran Gaitonde
 * 
 * References docs.oracle.com, stackoverflow.com
 */

package com.uncc.display;

import com.uncc.hist.HistogramCreator;
import com.uncc.numgen.NumberGenerator;

import javafx.application.Application;
import javafx.beans.value.*;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class DynamicHistogramDisplay extends Application {
 

    @Override public void start(Stage stage) throws Exception {        
    	 
        final Slider slider = new Slider();
        
        HBox hb = new HBox(10);
        setHB(hb,1);
        VBox layout = new VBox(10);
        layout.setAlignment(Pos.CENTER);
        layout.setPadding(new Insets(10));
        layout.getChildren().setAll(slider,hb);
        VBox.setVgrow(hb, Priority.ALWAYS);
    	
        final Scene scene = new Scene(layout);
        stage.setTitle("Dynamic Histogram");
        stage.setScene(scene);
        stage.show();
        
        slider.valueProperty().addListener(new ChangeListener<Number>() {
            public void changed(ObservableValue<? extends Number> ov,
                Number old_val, Number new_val) {
            	int n = new_val.intValue();
	            Number max = slider.getMax();	            
	            int m = max.intValue()/100;
	            if (n <= m) setHB(hb,1);
	            if (n > m*1 && n <= m*2)setHB(hb,2); 
	            if (n > m*2 && n <= m*3)setHB(hb,3);
	            if (n > m*3 && n <= m*4)setHB(hb,4);
	            if (n > m*4 && n <= m*5)setHB(hb,5);
	            if (n > m*5 && n <= m*6)setHB(hb,6);
	            if (n > m*6 && n <= m*7)setHB(hb,7);
	            if (n > m*7 && n <= m*8)setHB(hb,8);
	            if (n > m*8 && n <= m*9)setHB(hb,9);
	            if (n > m*9 && n <= m*10)setHB(hb,10);
	            if (n > m*10 && n <= m*11)setHB(hb,11);
	            if (n > m*11 && n <= m*12)setHB(hb,12);
	            if (n > m*12 && n <= m*13)setHB(hb,13);
	            if (n > m*13 && n <= m*14)setHB(hb,14);
	            if (n > m*14 && n <= m*15)setHB(hb,15);
	            if (n > m*15 && n <= m*16)setHB(hb,16);
	            if (n > m*16 && n <= m*17)setHB(hb,17);
	            if (n > m*17 && n <= m*18)setHB(hb,18);
	            if (n > m*18 && n <= m*19)setHB(hb,19);
	            if (n > m*19 && n <= m*20)setHB(hb,20);
	            if (n > m*20 && n <= m*21)setHB(hb,21);
	            if (n > m*21 && n <= m*22)setHB(hb,22);
	            if (n > m*22 && n <= m*23)setHB(hb,23);
	            if (n > m*23 && n <= m*24)setHB(hb,24);
	            if (n > m*24 && n <= m*25)setHB(hb,25);
	            if (n > m*25 && n <= m*26)setHB(hb,26);
	            if (n > m*26 && n <= m*27)setHB(hb,27);
	            if (n > m*27 && n <= m*28)setHB(hb,28);
	            if (n > m*28 && n <= m*29)setHB(hb,29);
	            if (n > m*29 && n <= m*30)setHB(hb,30);
	            if (n > m*30 && n <= m*31)setHB(hb,31);
	            if (n > m*31 && n <= m*32)setHB(hb,32);
	            if (n > m*32 && n <= m*33)setHB(hb,33);
	            if (n > m*33 && n <= m*34)setHB(hb,34);
	            if (n > m*34 && n <= m*35)setHB(hb,35);
	            if (n > m*35 && n <= m*36)setHB(hb,36);
	            if (n > m*36 && n <= m*37)setHB(hb,37);
	            if (n > m*37 && n <= m*38)setHB(hb,38);
	            if (n > m*38 && n <= m*39)setHB(hb,39);
	            if (n > m*39 && n <= m*40)setHB(hb,40);
	            if (n > m*40 && n <= m*41)setHB(hb,41);
	            if (n > m*41 && n <= m*42)setHB(hb,42);
	            if (n > m*42 && n <= m*43)setHB(hb,43);
	            if (n > m*43 && n <= m*44)setHB(hb,44);
	            if (n > m*44 && n <= m*45)setHB(hb,45);
	            if (n > m*45 && n <= m*46)setHB(hb,46);
	            if (n > m*46 && n <= m*47)setHB(hb,47);
	            if (n > m*47 && n <= m*48)setHB(hb,48);
	            if (n > m*48 && n <= m*49)setHB(hb,49);
	            if (n > m*49 && n <= m*50)setHB(hb,50);
	            if (n > m*50 && n <= m*51)setHB(hb,51);
	            if (n > m*51 && n <= m*52)setHB(hb,52);
	            if (n > m*52 && n <= m*53)setHB(hb,53);
	            if (n > m*53 && n <= m*54)setHB(hb,54);
	            if (n > m*54 && n <= m*55)setHB(hb,55);
	            if (n > m*55 && n <= m*56)setHB(hb,56);
	            if (n > m*56 && n <= m*57)setHB(hb,57);
	            if (n > m*57 && n <= m*58)setHB(hb,58);
	            if (n > m*58 && n <= m*59)setHB(hb,59);
	            if (n > m*59 && n <= m*60)setHB(hb,60);
	            if (n > m*60 && n <= m*61)setHB(hb,61);
	            if (n > m*61 && n <= m*62)setHB(hb,62);
	            if (n > m*62 && n <= m*63)setHB(hb,63);
	            if (n > m*63 && n <= m*64)setHB(hb,64);
	            if (n > m*64 && n <= m*65)setHB(hb,65);
	            if (n > m*65 && n <= m*66)setHB(hb,66);
	            if (n > m*66 && n <= m*67)setHB(hb,67);
	            if (n > m*67 && n <= m*68)setHB(hb,68);
	            if (n > m*68 && n <= m*69)setHB(hb,69);
	            if (n > m*69 && n <= m*70)setHB(hb,70);
	            if (n > m*70 && n <= m*71)setHB(hb,71);
	            if (n > m*71 && n <= m*72)setHB(hb,72);
	            if (n > m*72 && n <= m*73)setHB(hb,73);
	            if (n > m*73 && n <= m*74)setHB(hb,74);
	            if (n > m*74 && n <= m*75)setHB(hb,75);
	            if (n > m*75 && n <= m*76)setHB(hb,76);
	            if (n > m*76 && n <= m*77)setHB(hb,77);
	            if (n > m*77 && n <= m*78)setHB(hb,78);
	            if (n > m*78 && n <= m*79)setHB(hb,79);
	            if (n > m*79 && n <= m*80)setHB(hb,80);
	            if (n > m*80 && n <= m*81)setHB(hb,81);
	            if (n > m*81 && n <= m*82)setHB(hb,82);
	            if (n > m*82 && n <= m*83)setHB(hb,83);
	            if (n > m*83 && n <= m*84)setHB(hb,84);
	            if (n > m*84 && n <= m*85)setHB(hb,85);
	            if (n > m*85 && n <= m*86)setHB(hb,86);
	            if (n > m*86 && n <= m*87)setHB(hb,87);
	            if (n > m*87 && n <= m*88)setHB(hb,88);
	            if (n > m*88 && n <= m*89)setHB(hb,89);
	            if (n > m*89 && n <= m*90)setHB(hb,90);
	            if (n > m*90 && n <= m*91)setHB(hb,91);
	            if (n > m*91 && n <= m*92)setHB(hb,92);
	            if (n > m*92 && n <= m*93)setHB(hb,93);
	            if (n > m*93 && n <= m*94)setHB(hb,94);
	            if (n > m*94 && n <= m*95)setHB(hb,95);
	            if (n > m*95 && n <= m*96)setHB(hb,96);
	            if (n > m*96 && n <= m*97)setHB(hb,97);
	            if (n > m*97 && n <= m*98)setHB(hb,98);
	            if (n > m*98 && n <= m*99) setHB(hb,99);
	            if (n > m*99 )setHB(hb,100);
	            
            }
        });
    
      
    }
    
    // update Histogram bins based on the slider value
    private HBox setHB(HBox hb, int bins)
    {   
    	
    	final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();  
        final BarChart<String,Number> bc =  new BarChart<String,Number>(xAxis,yAxis);
        yAxis.setLabel("Frequency");  
        xAxis.setLabel("Bins");         
        bc.setTitle("Histogram");        
        SeriesCreator sc =  new SeriesCreator();	    
        NumberGenerator n  = new NumberGenerator();
        HistogramCreator h = new HistogramCreator();
        int histIn[] = new int[10000];
        histIn  = n.generateNubmers();
		int a[] = new int[bins];
		a = h.createHistogram(histIn,bins);
		bc.getData().addAll(sc.seriesCreate(a));        
		HBox.setHgrow(bc, Priority.ALWAYS); 
		hb.getChildren().clear();
		hb.getChildren().add(bc);
      
        return hb;
    }

    
   

    public static void main(String[] args) { launch(args); }
}