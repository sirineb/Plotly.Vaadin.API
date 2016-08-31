package org.kopi.plotly.data.marker;

import java.util.Collection;

import javax.json.JsonArray;

import org.kopi.plotly.data.features.Colors;

import com.vaadin.shared.ui.colorpicker.Color;

/**
 * 
 * @author sbchini
 *
 */
public class BubbleMarker extends AbstractMarker {
  
  //---------------------------------------------------------
  // CONSTRUCTOR
  //---------------------------------------------------------

  public BubbleMarker(){
    this.color = Colors.LIGHTSKYBLUE;
    this.opacity=0.8;
  }
  //---------------------------------------------------------
  // IMPLEMENTATIONS
  //---------------------------------------------------------


  @Deprecated
  @Override
  public Collection<Color> getColors() {
    return null;
  }

  @Override
  public JsonArray getSizes() {
    return sizes;
  }

  @Override
  public String getColor() {
    return "rgba("+color.getRed()+","+color.getGreen()+","+color.getBlue()+",0.5)";
  }

  @Override
  public double getOpacity() {
    return opacity;
  }
  
  /**
   * Sets the marker's color.
   * @param color
   */
  
  public void setColor(Color color){
    this.color=color;
  }

  @Override
  public void setSizes(JsonArray r){
    this.sizes = r;
  }
  
  //---------------------------------------------------------
  // DATA MEMBERS
  //---------------------------------------------------------

  private JsonArray            sizes;
  private double		        opacity;
  private Color                         color;

}
