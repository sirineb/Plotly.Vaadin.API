package org.kopi.plotly.data.types;

import org.kopi.plotly.data.dataseries.AbstractDataSeries;
import org.kopi.plotly.data.dataseries.CoupleOfData;
import org.kopi.plotly.data.features.modeData;
import org.kopi.plotly.data.marker.ScatterMarker;

import com.vaadin.shared.ui.colorpicker.Color;

public class ScatterData extends AbstractData {

  //---------------------------------------------------------
  // CONSTRUCTOR
  //---------------------------------------------------------

  public ScatterData(String name, AbstractDataSeries series){
    super(name, series);
    type = TypeData.SCATTER;
    mode = modeData.MARKERS;
    marker = new ScatterMarker();
  }

  public ScatterData(AbstractDataSeries series){
    super(series);
    type = TypeData.SCATTER;
    mode = modeData.MARKERS;
    marker = new ScatterMarker();
  }
  
  public ScatterData(String name){
    super(name, new CoupleOfData());
    type = TypeData.SCATTER;
    mode = modeData.MARKERS;
    marker = new ScatterMarker();
  }

  public ScatterData(){
    super( new CoupleOfData());
    type = TypeData.SCATTER;
    mode = modeData.MARKERS;
    marker = new ScatterMarker();
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
  public ScatterMarker getMarker() {
    return marker;
  }

  /**
   * Sets the mode of the data.
   * @param mode
   */

  public void setMode(String mode) {
    this.mode = mode;
  }

  /**
   * Sets the marker of the data.
   * @param marker
   */

  public void setMarker(ScatterMarker marker) {
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

  private TypeData		type;
  private String		mode;
  private ScatterMarker	        marker;

}
