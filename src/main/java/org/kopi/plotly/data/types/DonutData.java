package org.kopi.plotly.data.types;

import org.kopi.plotly.data.dataseries.AbstractDataSeries;

/**
 * uses all the properties of PieData except for its hole that needs to be around 0.4.
 * @author sbchini
 *
 */

public class DonutData extends PieData{
  public DonutData(String name, AbstractDataSeries series){
    super(name, series);
    this.setHole(0.4);
  }
  
  public DonutData(AbstractDataSeries series){
    super(series);
    this.setHole(0.4);
  }
  public DonutData(String name){
    super(name);
    this.setHole(0.4);
  }
  
  public DonutData(){
    super();
    this.setHole(0.4);
  }
}
