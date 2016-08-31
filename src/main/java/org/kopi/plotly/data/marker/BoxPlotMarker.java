package org.kopi.plotly.data.marker;

import org.kopi.plotly.data.features.Colors;

import com.vaadin.shared.ui.colorpicker.Color;


/**
 * @author sbchini
 *
 */
public class BoxPlotMarker extends AbstractMarker {

  //---------------------------------------------------------
  // CONSTRUCTOR
  //---------------------------------------------------------

  public BoxPlotMarker() {
    this.color = Colors.LIGHTSKYBLUE;
  }

  //---------------------------------------------------------
  // IMPLEMENTATIONS
  //---------------------------------------------------------

  @Override
  public String getColor() {
    return this.color.getCSS();
    
  }

  /**
   * Sets the marker color.
   * @param color
   */

  public void setColor(Color color) {
    this.color = color;
  }

  //---------------------------------------------------------
  // DATA IMPLEMENTATIONS
  //---------------------------------------------------------  

  private Color         color;
}
