package org.kopi.plotly.data.types;

import org.kopi.plotly.data.dataseries.AbstractDataSeries;
import org.kopi.plotly.data.line.LineShape;
/**
 * uses all the properties of LineData except for its line shape that needs to be spline.
 * @author sbchini
 *
 */

public class SplineData extends LineData{

  public SplineData(String name, AbstractDataSeries series){
    super(name, series); 
    this.getLine().setShape(LineShape.SPLINE);
  }

  public SplineData(AbstractDataSeries series){
    super(series);
    this.getLine().setShape(LineShape.SPLINE);
  }
  public SplineData(String name){
    super(name);
    this.getLine().setShape(LineShape.SPLINE);
  }

  public SplineData(){
    this.getLine().setShape(LineShape.SPLINE);
  }

}
