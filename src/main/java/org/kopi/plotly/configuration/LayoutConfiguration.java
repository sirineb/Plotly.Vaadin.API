package org.kopi.plotly.configuration;

import javax.json.JsonValue;

import org.kopi.plotly.IChartProprety;
import org.kopi.plotly.layout.ILayout;

/**
 * @author sbchini
 *
 */
public class LayoutConfiguration implements  IChartProprety{
  
  //---------------------------------------------------------
  // CONSTRUCTOR
  //---------------------------------------------------------

  public LayoutConfiguration(ILayout layout) {
    this.layoutConfiguraion = layout;
  }
  
  //---------------------------------------------------------
  // IMPLEMENTATIONS
  //---------------------------------------------------------

  @Override
  public JsonValue getValue() {
    return this.layoutConfiguraion.getValue();	
  }
  
  @Override
  public String toString() {
    return getValue().toString();
  }
  
  //---------------------------------------------------------
  // DATA MEMBERS
  //---------------------------------------------------------

  private ILayout	layoutConfiguraion;	

}
