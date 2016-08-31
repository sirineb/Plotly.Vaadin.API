package org.kopi.plotly.data.types;

import org.kopi.plotly.data.dataseries.AbstractDataSeries;
import org.kopi.plotly.data.dataseries.CoupleOfData;
import org.kopi.plotly.data.features.modeData;
import org.kopi.plotly.data.line.Line;

import com.vaadin.shared.ui.colorpicker.Color;

public class AreaData extends AbstractData {

  //---------------------------------------------------------
  // CONSTRUCTOR
  //---------------------------------------------------------

  public AreaData(String name, AbstractDataSeries series) { 
    super(name, series);
    type = TypeData.SCATTER;
    mode = modeData.LINESANDMARKERS;
    line = new Line();
    fill = "tozeroy";
  }

  public AreaData(AbstractDataSeries series){
    super(null, series);
    type = TypeData.SCATTER;
    mode = modeData.LINESANDMARKERS;
    line = new Line();
    fill = "tozeroy";
  }
  
  public AreaData(String name) { 
    super(name, new CoupleOfData());
    type = TypeData.SCATTER;
    mode = modeData.LINESANDMARKERS;
    line = new Line();
    fill = "tozeroy";
  }

  public AreaData(){
    super(null, new CoupleOfData());
    type = TypeData.SCATTER;
    mode = modeData.LINESANDMARKERS;
    line = new Line();
    fill = "tozeroy";
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
  public Line getLine() {
    return line;
  }

  @Override
  public String getFill() {
    return fill;
  }

  /**
   * Sets the mode of the data.
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

  //---------------------------------------------------------
  // DATA MEMBERS
  //---------------------------------------------------------

  private TypeData                      type;
  private String                        mode;
  private Line                          line;
  private String                        fill;


}
