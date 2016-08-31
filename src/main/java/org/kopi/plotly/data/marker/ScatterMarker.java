package org.kopi.plotly.data.marker;


import org.kopi.plotly.data.features.Colors;

import com.vaadin.shared.ui.colorpicker.Color;

/**
 * 
 * @author sbchini
 *
 */

public class ScatterMarker extends AbstractMarker {
  
  //---------------------------------------------------------
  // CONSTRUCTOR
  //---------------------------------------------------------

  public ScatterMarker(){
    this.color = Colors.LIGHTSKYBLUE;
    this.opacity = 0.8;
    this.size = 10;
  }
  
  //---------------------------------------------------------
  // IMPLEMENTATIONS
  //---------------------------------------------------------
  
  /**
   * Sets the marker color.
   * @param color
   */

  public void setColor(Color color){
    this.color=color;
  }
  
  /**
   * Sets the marker size.
   * @param s
   */
  public void setSize(int size){
    this.size = size;
  }
  
  @Override
  protected int getSize() {
    return size;
  }


  @Override
  public String getColor() {
    return "rgba("+color.getRed()+","+color.getGreen()+","+color.getBlue()+",0.8)";
  }

  @Override
  public double getOpacity() {
    return opacity;
  }
  
  //---------------------------------------------------------
  // DATA MEMBERS
  //---------------------------------------------------------

  private int		 	size;
  private double		opacity;
  private Color                 color;

}
