package org.kopi.plotly.data.types;

import org.kopi.plotly.data.line.LineShape;
/**
 * uses all the properties of AreaRangeData except for its line shape that needs to be spline.
 * @author sbchini
 *
 */

public class AreaSplineRangeData extends AreaRangeData{

  public AreaSplineRangeData(String name) { 
    super(name);
    this.getLine().setShape(LineShape.SPLINE);
  }
  public AreaSplineRangeData() { 
    super();
    this.getLine().setShape(LineShape.SPLINE);
  }

}
