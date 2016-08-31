package org.kopi.plotly.data.types;

import org.kopi.plotly.data.dataseries.RangeOfData;
import org.kopi.plotly.data.features.modeData;
import org.kopi.plotly.data.marker.BubbleMarker;

import com.vaadin.shared.ui.colorpicker.Color;

public class BubbleData extends AbstractData {
  
  //---------------------------------------------------------
  // CONSTRUCTOR
  //---------------------------------------------------------

  public BubbleData(String name){
    super(name, new RangeOfData());
    type = TypeData.SCATTER;
    mode = modeData.MARKERS;
    marker = new BubbleMarker();
  }
  
  public BubbleData(){
    super(null,new RangeOfData());
    type = TypeData.SCATTER;
    mode = modeData.MARKERS;
    marker = new BubbleMarker();
  }
  
  //---------------------------------------------------------
  // IMPLEMENTATIONS
  //---------------------------------------------------------
  @Override
  public TypeData getType() {
    return type;
  }

  @Override
  public String getMode() {
    return mode;
  }

  @Override
  public BubbleMarker getMarker() {
    return marker;
  }
  
  @Override
  public boolean isBubble(){
    return true;
  }
  
  /**
   * sets the data mode.
   * @param mode
   */

  public void setMode(String mode) {
    this.mode = mode;
  }
  
  /**
   * sets the marker.
   * @param marker
   */

  public void setMarker(BubbleMarker marker) {
    this.marker = marker;
  }
  
  /**
   * Sets the color of the data.
   * @param color
   */

  public void setColor(Color color) {
    this.marker.setColor(color);
  }
  
  @Override
  public String getColor() {
    return marker.getColor();
  }
  //---------------------------------------------------------
  // DATA MEMBERS
  //---------------------------------------------------------

  private TypeData		        type;
  private String			mode;
  private BubbleMarker	                marker;

}
