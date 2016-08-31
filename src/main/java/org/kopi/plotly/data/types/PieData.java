package org.kopi.plotly.data.types;

import java.util.List;

import org.kopi.plotly.data.dataseries.AbstractDataSeries;
import org.kopi.plotly.data.dataseries.CoupleOfData;
import org.kopi.plotly.data.marker.PieMarker;

import com.vaadin.shared.ui.colorpicker.Color;

/**
 * 
 * @author sbchini
 *
 */

public class PieData extends AbstractData {

  //---------------------------------------------------------
  // CONSTRUCTOR
  //---------------------------------------------------------

  public PieData(String name, AbstractDataSeries series){
    super(name, series);
    type = TypeData.PIE;
    marker = new PieMarker();
    hole = 0;
  }

  public PieData(AbstractDataSeries series){
    super(series);
    type = TypeData.PIE;
    marker = new PieMarker();
    hole = 0;
  }
  
  public PieData(){
    super(new CoupleOfData());
    type = TypeData.PIE;
    marker = new PieMarker();
    hole = 0;
  }
  
  public PieData(String name){
    super(name, new CoupleOfData());
    type = TypeData.PIE;
    marker = new PieMarker();
    hole = 0;
  }

  //---------------------------------------------------------
  // IMPLEMENTATIONS
  //---------------------------------------------------------


  public void setHole(double hole){
    this.hole=hole;
  }

  @Override
  public TypeData getType() {
    return type;
  }

  @Override
  public PieMarker getMarker() {
    return marker;
  }

  @Override
  public double getHole() {
    return hole;
  }

  /**
   * sets the marker of the data.
   * @param marker
   */

  public void setMarker(PieMarker marker) {
    this.marker = marker;
  }

  @Override
  public void setColors(List<Color> colors) {
    this.marker.setColors(colors);
  }

  @Override
  public boolean isPieOrDonut() {
    return true;
  }
  
  @Override
  public void setDomain(double x1, double x2, double y1, double y2){   
    domain = new double[4];
    this.domain[0] = x1;
    this.domain[1] = x2;
    this.domain[2] = y1;
    this.domain[3] = y2;
  }
  
  @Override
  public double[] getDomain(){
    return domain;
  }
 
  //---------------------------------------------------------
  // DATA MEMBERS
  //---------------------------------------------------------

  private TypeData		type;
  private PieMarker		marker;
  private double 		hole;
  private double[]              domain;


}
