package org.kopi.plotly;

import org.kopi.plotly.configuration.DataConfiguration;
import org.kopi.plotly.configuration.LayoutConfiguration;

/**
 * 
 * @author sbchini
 *
 */

public class PlotlyFactory {

  /**
   * Returns  the JavaScriptComponent from getState
   * @param data represents the data configuration.
   * @param layout represents the layout configuration.
   * @return The JavaScriptComponent from getState
   */

  public static PlotlyChart renderChart(DataConfiguration data, LayoutConfiguration layout) {
    PlotlyChart         chart;
    
    chart = new PlotlyChart();
    chart.setChartConfiguration(data,layout);
    
    return chart;
  }
}