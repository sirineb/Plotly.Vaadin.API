package org.kopi.plotly.data.types;

import org.kopi.plotly.data.dataseries.AbstractDataSeries;
import org.kopi.plotly.data.dataseries.CoupleOfData;
import org.kopi.plotly.data.features.modeData;
import org.kopi.plotly.data.marker.BarMarker;


import com.vaadin.shared.ui.colorpicker.Color;

/**
 * 
 * @author sbchini
 *
 */

public class BarData extends AbstractData {
  
  //---------------------------------------------------------
  // CONSTRUCTOR
  //---------------------------------------------------------

  public BarData(String name, AbstractDataSeries series) {
    super(name, series);
    type = TypeData.BAR;
    mode = modeData.LINESANDMARKERS;
    marker = new BarMarker();
    orientation = "h";
  }
  
  public BarData(AbstractDataSeries series){
    super(series);
    type = TypeData.BAR;
    mode = modeData.LINESANDMARKERS;
    marker = new BarMarker();
    orientation = "h";
  }
  
  public BarData(String name) {
    super(name, new CoupleOfData());
    type = TypeData.BAR;
    mode = modeData.LINESANDMARKERS;
    marker = new BarMarker();
    orientation = "h";
  }
  
  public BarData(){
    super(new CoupleOfData());
    type = TypeData.BAR;
    mode = modeData.LINESANDMARKERS;
    marker = new BarMarker();
    orientation = "h";
  }
  
  //---------------------------------------------------------
  // IMPLEMNTATIONS
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
  public BarMarker getMarker() {
    return marker;
  }
  
  /**
   * Sets the mode. 
   * @param mode
   */

  public void setMode(String mode) {
    this.mode = mode;
  }
  
  /**
   * Sets the data color.
   * @param color.
   */

  public void setColor(Color color) {
    this.marker.setColor(color);
    this.marker.getLine().setColor(color);
  }
  
  /**
   * sets the bars orientation
   * @param orientation
   */
  
  public void setOrientation(String orientation){
    this.orientation = orientation;
  }
  
  @Override
  public String getOrientation(){
    return orientation;
  }
  
  @Override
  public String getColor() {
    return marker.getColor();
  }
 
  
  //---------------------------------------------------------
  // DATA MEMBERS
  //---------------------------------------------------------

  private TypeData		type;
  private String		mode;
  private BarMarker		marker;
  private String		orientation;

}
