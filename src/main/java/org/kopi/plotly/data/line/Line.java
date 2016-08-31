package org.kopi.plotly.data.line;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;

import org.kopi.plotly.IChartProprety;
import org.kopi.plotly.data.features.Colors;

import com.vaadin.shared.ui.colorpicker.Color;

/**
 * @author sbchini
 *
 */
public class Line implements IChartProprety{
  
  //---------------------------------------------------------
  // CONSTRUCTOR
  //---------------------------------------------------------
  
  public Line() {
    width = 1.5;
    color = Colors.LIGHTSKYBLUE;
    style = LineStyle.SOLID;
    shape = LineShape.NONE;
  }
  
  //---------------------------------------------------------
  // IMPLEMENTED METHODS
  //---------------------------------------------------------

  @Override
  public JsonObject getValue() {
    JsonObjectBuilder builder = Json.createObjectBuilder();
    builder.add("color", getColor().getCSS());
    builder.add("width", getWidth());
    builder.add("dash", getStyle().name().toLowerCase());
    builder.add("shape", getShape().name().toLowerCase());
    return builder.build();
  }
  
  /**
   * 
   * @return The line color.
   */

  public Color getColor() {
    return color;
  }
  
  /**
   *  sets the line color.
   * @param color 
   */
  
  public void setColor(Color color) {
    this.color = color;
  }
  
  /**
   * 
   * @return The line width.
   */
  
  public double getWidth() {
    return width;
  }
  
  /**
   *  Sets the line width
   * @param width
   */
  
  public void setWidth(int width) {
    this.width = width;
  }
  
  /**
   * 
   * @return The line style DASH, DOT, SOLID or DASHDOT;
   */
  
  public LineStyle getStyle() {
    return style;
  }
  
  /**
   * Sets the line style.
   * @param style
   */
  
  public void setStyle(LineStyle style) {
    this.style = style;
  }
  /**
   * 
   * @return The line shape.
   */
  
  public LineShape getShape() {
    return shape;
  }
  
  /**
   * Sets the line shape.
   * @param shape
   */
  
  public void setShape(LineShape shape) {
    this.shape = shape;
  }
  
  //---------------------------------------------------------
  // DATA MEMBERS
  //---------------------------------------------------------


  private Color                 color;
  private double                width;
  private LineStyle             style;
  private LineShape             shape;
}
