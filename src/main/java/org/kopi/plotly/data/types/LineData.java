package org.kopi.plotly.data.types;

import org.kopi.plotly.data.dataseries.AbstractDataSeries;
import org.kopi.plotly.data.dataseries.CoupleOfData;
import org.kopi.plotly.data.features.modeData;
import org.kopi.plotly.data.line.Line;

import com.vaadin.shared.ui.colorpicker.Color;

/**
 * 
 * @author sbchini
 *
 */

public class LineData extends AbstractData {

  //---------------------------------------------------------
  // CONSTRUCTOR
  //---------------------------------------------------------

  public LineData(String name, AbstractDataSeries series){
    super(name, series);
    type = TypeData.SCATTER;
    mode = modeData.LINESANDMARKERS;
    line = new Line();
  }

  public LineData(AbstractDataSeries series){
    super(series);
    type = TypeData.SCATTER;
    mode = modeData.LINESANDMARKERS;
    line = new Line();
  }
  public LineData(String name){
    super(name, new CoupleOfData());
    type = TypeData.SCATTER;
    mode = modeData.LINESANDMARKERS;
    line = new Line();
  }

  public LineData(){
    super(new CoupleOfData());
    type = TypeData.SCATTER;
    mode = modeData.LINESANDMARKERS;
    line = new Line();
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

  /**
   * Sets the mode of the data.
   * @param mode
   */

  public void setMode(String mode) {
    this.mode = mode;
  }

  /**
   * Sets the line of the graph.
   * @param line
   */

  public void setLine(Line line) {
    this.line = line;
  }

  /**
   * 
   */

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

  private TypeData		type;
  private String		mode;
  private Line			line;

}
