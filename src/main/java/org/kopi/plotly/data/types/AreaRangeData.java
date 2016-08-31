package org.kopi.plotly.data.types;

import org.kopi.plotly.data.dataseries.AbstractDataSeries;
import org.kopi.plotly.data.dataseries.RangeOfData;
import org.kopi.plotly.data.features.modeData;
import org.kopi.plotly.data.line.Line;

import com.vaadin.shared.ui.colorpicker.Color;

public class AreaRangeData extends AbstractData {

  //---------------------------------------------------------
  // CONSTRUCTOR
  //---------------------------------------------------------
  
  public AreaRangeData(String name) { 
    super(name, new RangeOfData());
    type = TypeData.SCATTER;
    mode = modeData.LINESANDMARKERS;
    line = new Line();
    fill = "tonexty";
  }
  
  public AreaRangeData() { 
    super(new RangeOfData());
    type = TypeData.SCATTER;
    mode = modeData.LINESANDMARKERS;
    line = new Line();
    fill = "tonexty";
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
  public Line getLine() {
    return line;
  }


  @Override
  public String getFill() {
    return fill;
  }

  /**
   * sets the mode of the data
   * @param mode
   */

  public void setMode(String mode) {
    this.mode = mode;
  }

  /**
   * Sets the line of the data.
   * @param line
   */

  public void setLine(Line line) {
    this.line = line;
  }

  @Override
  public void setColor(Color color) {
    this.line.setColor(color);
  }
  
  @Override
  public String getColor() {
    return line.getColor().getCSS();
  }

  @Override
  public boolean isRangeArea() {
    return true;
  }
  
  @Override
  public void setDataSeries(AbstractDataSeries series){
  }


  //---------------------------------------------------------
  // DATA MEMBERS
  //---------------------------------------------------------

  private TypeData		type;
  private String		mode;
  private Line			line;
  private String		fill;

}
