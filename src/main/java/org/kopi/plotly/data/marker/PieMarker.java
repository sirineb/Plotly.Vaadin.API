package org.kopi.plotly.data.marker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.kopi.plotly.data.features.Colors;

import com.vaadin.shared.ui.colorpicker.Color;


public class PieMarker extends AbstractMarker {
  
  //---------------------------------------------------------
  // CONSTRUCTOR
  //---------------------------------------------------------

  public PieMarker() {
    colors = new ArrayList<>();
    colors.add(Colors.LIGHTSKYBLUE);
    colors.add(Colors.LIGHTGREEN);
    colors.add(Colors.LIGHTSALMON);
    colors.add(Colors.LIGHTCORAL);
    colors.add(Colors.LIGHTSTEELBLUE);
    colors.add(Colors.LIGHTGRAY);
  }
  
  public PieMarker(List<Color> colors) {
    this.colors = colors;
  }
  
  //---------------------------------------------------------
  // IMPLEMENTATIONS
  //---------------------------------------------------------
 
  /**
   * Used to set the colors of the pie markers.
   * @param colors
   */
  public void setColors(List<Color> colors) {
    this.colors = colors;
  }

  @Override
  public Collection<Color> getColors() {
    return colors;
  }

  
  //---------------------------------------------------------
  // DATA MEMBERS
  //---------------------------------------------------------

  private List<Color> 	         colors;

}
