package org.kopi.plotly.data.types;

import org.kopi.plotly.data.dataseries.AbstractDataSeries;
import org.kopi.plotly.data.dataseries.SingleData;
import org.kopi.plotly.data.marker.AbstractMarker;
import org.kopi.plotly.data.marker.BoxPlotMarker;

import com.vaadin.shared.ui.colorpicker.Color;


public class BoxPlotData extends AbstractData {  
  
  //---------------------------------------------------------
  // CONSTRUCTOR
  //---------------------------------------------------------
   
  public BoxPlotData(String name) { 
    
    super(name,new SingleData());
    type = TypeData.BOX;
    marker = new BoxPlotMarker();
  }

  public BoxPlotData(){
    super(null, new SingleData());
    type = TypeData.BOX;
    marker = new BoxPlotMarker();
  }


  //---------------------------------------------------------
  // IMPLEMENTATIONS
  //---------------------------------------------------------

  @Override
  public TypeData getType() {
    return type;
  }
  

  public boolean isBoxPlot(){
    return true;
  }
  
  @Override
  public void setColor(Color color){
    this.marker.setColor(color);
  }
  
  @Override
  public AbstractMarker getMarker(){
    return this.marker;
  }
  
  @Override
  public String getColor() {
    return marker.getColor();
  }
  
  @Override
  public void setDataSeries(AbstractDataSeries series) throws Exception{
    throw new Exception ();
  }
  


  //---------------------------------------------------------
  // DATA MEMBERS
  //---------------------------------------------------------

  private TypeData                      type;
  private BoxPlotMarker                 marker;
}
