package org.kopi.plotly.data.types;

import java.util.List;

import javax.json.JsonObject;

import org.kopi.plotly.data.dataseries.AbstractDataSeries;
import org.kopi.plotly.data.dataseries.IDataSeries;
import org.kopi.plotly.data.line.Line;
import org.kopi.plotly.data.marker.IMarker;
import org.kopi.plotly.exceptions.DataMismatch;
import org.kopi.plotly.exceptions.TypeMismatch;

import com.vaadin.shared.ui.colorpicker.Color;

/**
 * 
 * @author sbchini
 *
 */
public interface IData {

  /**
   * 
   * @return the data to be added to the configuration.
   * @throws DataMismatch 
   */

  List<JsonObject> getValue() throws DataMismatch;

  /**
   * 
   * @return the type of data: bar, scatter or pie.
   */

  TypeData getType();

  /**
   * 
   * @return The data's name.
   */

  String getName();

  /**
   * 
   * @return The mode line, markers or lines+markers.
   */

  String getMode();

  /**
   * 
   * @return the graph's marker.
   */

  IMarker getMarker();

  /**
   * 
   * @return the graph's line.
   */

  Line getLine();

  /**
   * 
   * @return the hover info.
   */

  String getHoverInfo();
  /**
   * 
   * @return the color.
   */

  String getColor();

  /**
   * 
   * @return the pie hole in case of pie type.
   */

  double getHole();

  /**
   * 
   * @return the fill type 'tonexty' or 'tozeroy' in case of area.
   */

  String getFill();

  /**
   * 
   * @return the values to be displayed on the chart.
   */

  IDataSeries getData();

  /**
   * 
   * @return a boolean value representing if it is a pie or donut or not. 
   * This is necessary to construct the data configuration. 
   */

  boolean isPieOrDonut();

  /**
   *  sets the graphs color in case of any chart except pie or donut.
   * @param color
   * @throws TypeMismatch 
   */
  void setColor(Color color) throws TypeMismatch;

  /**
   *  sets the data name.
   * @param title
   */
  void setName(String title);

  /**
   * 
   * @return the graph orientation
   */
  String getOrientation();


  /**
   * sets the hover info of the graph.
   * @param hoverinfo
   */

  void setHoverinfo(String hoverinfo);

  /**
   * 
   * @return a boolean value representing if a RangeArea. 
   * This is necessary to construct the data configuration. 
   */

  boolean isRangeArea();

  /**
   * 
   * @return a boolean value representing if a Bubble. 
   * This is necessary to construct the data configuration. 
   */

  boolean isBubble();
  
  /**
   * 
   * @return a boolean value representing if a BoxPlot. 
   * This is necessary to construct the data configuration. 
   */

  boolean isBoxPlot();
  
  /**
   * sets the colors in case of a pie
   * @param colors
   */

  void setColors(List<Color> colors);
  
  /**
   * Adds series to the data.
   * @param series
   * @throws Exception 
   */
  void setDataSeries(AbstractDataSeries series) throws Exception;
  
  /**
   * sets the domain of each graph in case of pie or donut type.
   * @param x1
   * @param x2
   * @param y1
   * @param y2
   * @throws TypeMismatch
   */

  void setDomain(double x1, double x2, double y1, double y2) throws TypeMismatch;
  
  /**
   * 
   * @return the domain table
   */
  double[] getDomain();



}
