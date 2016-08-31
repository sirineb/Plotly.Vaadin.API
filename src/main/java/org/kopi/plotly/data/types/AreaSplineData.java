package org.kopi.plotly.data.types;

import org.kopi.plotly.data.dataseries.AbstractDataSeries;
import org.kopi.plotly.data.line.LineShape;
/**
 * uses all the properties of AreaData except for its line shape that needs to be spline.
 * @author sbchini
 *
 */

public class AreaSplineData extends AreaData{

  public AreaSplineData(String name, AbstractDataSeries series){
    super(name, series);
    this.getLine().setShape(LineShape.SPLINE);
  }
  public AreaSplineData(AbstractDataSeries series){
    super(series);
    this.getLine().setShape(LineShape.SPLINE);
  }
  public AreaSplineData(String name){
    super(name);
    this.getLine().setShape(LineShape.SPLINE);
  }
  public AreaSplineData(){
    super();
    this.getLine().setShape(LineShape.SPLINE);
  }
}
