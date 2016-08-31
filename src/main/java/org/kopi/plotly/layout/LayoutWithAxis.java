package org.kopi.plotly.layout;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;

/**
 * 
 * @author sbchini
 *
 */

public class LayoutWithAxis extends Layout {

  //---------------------------------------------------------
  // CONSTRUCTORS
  //---------------------------------------------------------

  public LayoutWithAxis(int height, int width, String title, String xTitle, String yTitle) {
    super(height, width, title);
    xaxis = new Axis(xTitle);
    yaxis = new Axis(yTitle);
  }

  public LayoutWithAxis(int height, int width, String title) {
    super(height, width, title);
    xaxis = new Axis();
    yaxis = new Axis();
  }

  public LayoutWithAxis(String title, String xTitle, String yTitle) {
    super(title);
    xaxis = new Axis(xTitle);
    yaxis = new Axis(yTitle);
  }

  public LayoutWithAxis(String title) {
    super(title);
    xaxis = new Axis();
    yaxis = new Axis();
  }

  public LayoutWithAxis(int height, int width, String xTitle, String yTitle) {
    super(height, width);
    xaxis = new Axis(xTitle);
    yaxis = new Axis(yTitle);
  }

  public LayoutWithAxis(int height, int width) {
    super(height, width);
    xaxis = new Axis();
    yaxis = new Axis();
  }

  public LayoutWithAxis(String xTitle, String yTitle) {
    super();
    xaxis = new Axis(xTitle);
    yaxis = new Axis(yTitle);
  }

  public LayoutWithAxis() {
    super();
    xaxis = new Axis();
    yaxis = new Axis();
  }

  //---------------------------------------------------------
  // IMPLEMENTATIONS
  //---------------------------------------------------------

  /**
   * 
   * @return The x Axis.
   */

  public Axis getXaxis() {
    return xaxis;
  }

  /**
   * 
   * @return The y Axis.
   */

  public Axis getYaxis() {
    return yaxis;
  }

  /**
   * Sets the x Axis tile.
   * @param xAxisTitle
   */

  public void setxAxisTitle(String xAxisTitle){
    this.xaxis.setTitle(xAxisTitle);
  }

  /**
   * Sets the y Axis title.
   * @param yAxisTitle
   */

  public void setyAxisTitle(String yAxisTitle){
    this.yaxis.setTitle(yAxisTitle);
  }

  /**
   *  Enables x grid.
   */

  public void enableXGrid() {
    this.xaxis.enableGrid();
  }

  /**
   * Disables x grid.
   */

  public void disableXGrid() {
    this.xaxis.disableGrid();
  }

  /**
   * Shows the x axis.
   */

  public void showXAxis() {
    this.xaxis.showAxis();
  }

  /**
   * Hides the X axis.
   */

  public void hideXAxis()  {
    this.xaxis.hideAxis();
  }

  /**
   * Enables the Y grid.
   */

  public void enableYGrid() {
    this.yaxis.enableGrid();
  }
  /**
   * Disables the Y grid.
   */

  public void disableYGrid() {
    this.yaxis.disableGrid();
  }

  /**
   * Shows the y axis.
   */

  public void showYAxis() {
    this.yaxis.showAxis();
  }

  /**
   * Hides the y axis.
   */

  public void hideYAxis()  {
    this.yaxis.hideAxis();
  }

  @Override
  public JsonObject getValue() {
    JsonObjectBuilder 		obj;
    obj = Json.createObjectBuilder();
    if (this.getHeight()!=0) obj.add("height", this.getHeight());
    if (this.getWidth()!=0) obj.add("width", this.getWidth());
    if (this.getGraphTitle()!=null) obj.add("title", this.getGraphTitle());
    obj.add("showlegend", this.isLegendShowed());
    obj.add("barmode","group");
    obj.add("xaxis", this.xaxis.getValue());
    obj.add("yaxis", this.yaxis.getValue());
    if (this.getBackgroundColor()!= null) {
      obj.add("paper_bgcolor", this.getBackgroundColor().getCSS());
      obj.add("plot_bgcolor", this.getBackgroundColor().getCSS());
    }
    return obj.build();
  }

  //---------------------------------------------------------
  // DATA MEMBERS
  //---------------------------------------------------------

  private Axis	         xaxis;
  private Axis	         yaxis;

}
