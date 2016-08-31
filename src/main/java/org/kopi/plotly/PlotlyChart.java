package org.kopi.plotly;


import org.kopi.plotly.configuration.DataConfiguration;
import org.kopi.plotly.configuration.LayoutConfiguration;

import com.vaadin.annotations.JavaScript;
import com.vaadin.ui.AbstractJavaScriptComponent;

/**
 * @author sbchini
 *
 */
@JavaScript({"plotly-latest.min.js","connector.js"})
public class PlotlyChart extends AbstractJavaScriptComponent {

  //---------------------------------------------------------
  // CONSTRUCTOR
  //---------------------------------------------------------

  /*package*/ PlotlyChart() {
    chartId = nextChartId();
    setId(getDomId());
    getState().domId = getDomId();
    getState().data = "";
    this.addStyleName("animation");
    getState().layout = "";
    
  }

  //---------------------------------------------------------
  // IMPLEMENTATIONS
  //---------------------------------------------------------
  
  /**
   * Returns the next chart id for its attribution in the layout.
   * @return The next chart id for its attribution in the layout.
   */

  public static int nextChartId() {
    return ++currChartId;
  }
  
  @Override
  protected PlotlyState getState() {
    return (PlotlyState) super.getState();
  }

  /**
   * Returns the chart id for its attribution in the layout.
   * @return The chart id for its attribution in the layout.
   */

  public String getDomId() {
    return "plotly_" + chartId;
  }
  
  /**
   * 
   * @param data represents the data configuration.
   * @param layout represents the layout configuration.
   */

  public void setChartConfiguration(DataConfiguration data, LayoutConfiguration layout) {
    getState().data = "var data = " + data.toString();
    getState().layout = "var layout = " + layout.toString();
  }

  //---------------------------------------------------------
  // DATA MEMBERS
  //---------------------------------------------------------

  public static int                     currChartId;
  protected int                         chartId;
  private static final long             serialVersionUID = 6578878015922250803L;
}
