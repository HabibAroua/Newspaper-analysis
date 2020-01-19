package view;

import java.awt.*;
import java.util.List;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.*;
import treatment.Operation;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ui.ApplicationFrame;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
 
public class HistogramPanel1 extends ApplicationFrame 
{   
   public HistogramPanel1()
   {
      super( "Author by Article" ); 
      setContentPane(createDemoPanel( ));
   }
   
   private static PieDataset createDataset( ) 
   {
	   DefaultPieDataset dataset = new DefaultPieDataset();
       Operation o =new Operation("C:/Users/lenovo/workspace/Newspaper-analysis/src/treatment/journal.txt");
       o.collectData();
       for(int i=0 ; i<o.getAllAuthors().size() ; i++)
       {
    	   dataset.setValue( o.getAllAuthors().get(i) , new Double( o.countNewSpaperByAuthor(o.getAllAuthors().get(i)) ));
       }
       return dataset;         
   }
   private static JFreeChart createChart( PieDataset dataset )
   {
	   JFreeChart chart = ChartFactory.createPieChart
	   (      
			   "Author by article",   // chart title 
			   dataset,          // data    
			   true,             // include legend   
			   true, 
			   false
	    );

      return chart;
   }
   
   public static JPanel createDemoPanel()
   {
      JFreeChart chart = createChart(createDataset( ) );  
      
      return new ChartPanel( chart ); 
   }
   
   public static void run()
   {
	   HistogramPanel1 demo = new HistogramPanel1();  
	   demo.setSize( 560 , 367 );    
	   //RefineryUtilities.centerFrameOnScreen( demo );    
	   demo.setVisible( true );
   }

   public static void main( String[ ] args ) 
   {
	   HistogramPanel1 demo = new HistogramPanel1( );  
      demo.setSize( 560 , 367 );    
      //RefineryUtilities.centerFrameOnScreen( demo );    
      demo.setVisible( true ); 
   }
}