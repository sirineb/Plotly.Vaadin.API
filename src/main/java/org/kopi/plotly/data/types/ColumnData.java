package org.kopi.plotly.data.types;

import org.kopi.plotly.data.dataseries.AbstractDataSeries;
import org.kopi.plotly.data.dataseries.CoupleOfData;

/**
 * uses all the properties of BarData except for its orientation that needs to be set to null instead of 'h'.
 * @author sbchini
 *
 */

public class ColumnData extends BarData{

  public ColumnData(String name, AbstractDataSeries series){
    super(name, series);
    this.setOrientation(null);
  }
  
  public ColumnData(AbstractDataSeries series){
    super(series);
    this.setOrientation(null);
  }
  
  public ColumnData(String name){
    super(name, new CoupleOfData());
    this.setOrientation(null);
  }
  
  public ColumnData(){
    super();
    this.setOrientation(null);
  }
}
