package org.kopi.plotly.data.marker;

import org.kopi.plotly.data.features.Colors;
import org.kopi.plotly.data.line.Line;

import com.vaadin.shared.ui.colorpicker.Color;


/**
 * @author sbchini
 *
 */
public class BarMarker extends AbstractMarker {

  //---------------------------------------------------------
  // CONSTRUCTOR
  //---------------------------------------------------------

  public BarMarker() {
    this.color = Colors.LIGHTSKYBLUE;
    line = new Line();
  }
  
  //---------------------------------------------------------
  // IMPLEMENTATIONS
  //---------------------------------------------------------

  @Override
  public String getColor() {
    return "rgba("+color.getRed()+","+color.getGreen()+","+color.getBlue()+",0.5)";
  }
  
  /**
   * Sets the marker color.
   * @param color
   */
  
  public void setColor(Color color) {
    this.color=color;
  }
  
  /**
   * Return The marker's line.
   * @return The marker's line.
   */

  public Line getLine() {
    return this.line;
  }
  
  
  
  //---------------------------------------------------------
  // DATA IMPLEMENTATIONS
  //---------------------------------------------------------  
  
  private Color 	color;
  private Line          line;
}
