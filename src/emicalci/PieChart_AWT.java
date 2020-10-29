/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emicalci;

/**
 *
 * @author Hemlata Ahire
 */
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
public class PieChart_AWT extends ApplicationFrame{
    /* public PieChart_AWT( String title ) {
     super(title); 
     setContentPane(createDemoPanel( ));
   }*/
   
   static PieDataset createDataset(int a1,int a2 ) {
      DefaultPieDataset dataset = new DefaultPieDataset( );
      dataset.setValue( "Total payable amount" , a1 );  
      dataset.setValue( "Loan Amount" ,a2);   
      return dataset;         
   }
   static String title;
   private static JFreeChart createChart( PieDataset dataset ) {
      JFreeChart chart = ChartFactory.createPieChart(title, dataset,true,true,false);
      return chart;
   }
   
   public static JPanel createDemoPanel( int a1,int a2) {
      JFreeChart chart = createChart(createDataset(a1,a2 ) );  
      return new ChartPanel( chart ); 
   }

    public PieChart_AWT(String title) {
        super(title);
        this.title=title;
        
    }
    
}
