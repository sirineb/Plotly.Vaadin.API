package org.kopi.plotly.layout;

import org.kopi.plotly.IChartProprety;

import com.vaadin.shared.ui.colorpicker.Color;
/**
 * 
 * @author sbchini
 *
 */

public interface ILayout extends IChartProprety{
  
  /**
   * 
   * @return the width of the layout.
   */
  
  int getWidth();
  
  /**
   * 
   * @return the height of the layout.
   */
  
  int getHeight();
  
  /**
   * 
   * @return if the legends are shown
   */
  
  boolean isLegendShowed();
  
  /**
   * 
   * @return the graph's title
   */
  
  String getGraphTitle();
  
  /**
   * 
   * @return the backgroundColor
   */
  
  Color getBackgroundColor();
}
