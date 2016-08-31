package org.kopi.plotly.layout;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;

import com.vaadin.shared.ui.colorpicker.Color;

/**
 * 
 * @author sbchini
 *
 */
public class Axis {
  
  //---------------------------------------------------------
  // CONSTRUCTORS
  //---------------------------------------------------------
  
  public Axis(String title) {
    super();
    this.gridcolor = "rgba(102, 102, 102,0.4)";
    this.gridwidth = 1;
    this.linecolor = "rgba(102, 102, 102,0.4)";
    this.linewidth = 1;
    this.mirror = false;
    this.showgrid = true;
    this.showline = true;
    this.showticklabels = true;
    this.tickwidth = 1;
    this.title = title;
  }

  public Axis() {
    super();
    this.gridcolor = "rgba(102, 102, 102,0.4)";
    this.gridwidth = 1;
    this.linecolor = "rgba(102, 102, 102,0.4)";
    this.linewidth = 1;
    this.mirror = true;
    this.showgrid = true;
    this.showline = true;
    this.showticklabels = true;
    this.tickwidth = 1;
  }
  
  //---------------------------------------------------------
  // IMPLEMENTATIONS
  //---------------------------------------------------------
  
  /**
   * 
   * @return the grid color.
   */
  
  public String getGridcolor() {
    return gridcolor;
  }
  
  /**
   * 
   * @return the grid's width.
   */
  
  public int getGridwidth() {
    return gridwidth;
  }
  
  /**
   * 
   * @return the Tickwidth.
   */
  
  public int getTickwidth() {
    return tickwidth;
  }
  
  /**
   * 
   * @return the line color.
   */
  
  public String getLinecolor() {
    return linecolor;
  }
  
  /**
   * 
   * @return the axis line width.
   */
  
  public int getLinewidth() {
    return linewidth;
  }
  
  /**
   * 
   * @return if the mirror is enabled or not.
   */
  
  public boolean isMirror() {
    return mirror;
  }
  
  /**
   * 
   * @return if the grid is showen or not.
   */
  
  public boolean isShowgrid() {
    return showgrid;
  }
  
  /**
   * 
   * @return if the axis line is shown or not.
   */
  
  public boolean isShowline() {
    return showline;
  }
  
  /**
   * 
   * @return if the tick labels are shown or not.
   */
  
  public boolean isShowticklabels() {
    return showticklabels;
  }
  
  /**
   * 
   * @return the title.
   */
  
  public String getTitle() {
    return title;
  }
  
  /**
   * Sets the grid color.
   * @param gridcolor
   */
  
  public void setGridcolor(Color gridcolor) {
    this.gridcolor = "rgba("+gridcolor.getRed()+","+gridcolor.getGreen()+","+gridcolor.getBlue()+",0.4)";
  }
  
  /**
   * sets the grids width.
   * @param gridwidth
   */
  
  public void setGridwidth(int gridwidth) {
    this.gridwidth = gridwidth;
  }
  
  /**
   * Sets the axis line color.
   * @param linecolor
   */
  
  public void setLinecolor(Color linecolor) {
    this.gridcolor = "rgba("+linecolor.getRed()+","+linecolor.getGreen()+","+linecolor.getBlue()+",0.4)";
  }
  
  /**
   * sets the axis line width.
   * @param linewidth
   */
  
  public void setLinewidth(int linewidth) {
    this.linewidth = linewidth;
  }
  
  /**
   * Disables the Mirror.
   */
  
  public void disableMirror() {
    this.mirror = false;
  }
  
  /**
   * Enables the mirror.
   */
  
  public void enableMirror() {
    this.mirror = true;
  }
  
  /**
   * enables the grid
   */
  
  public void enableGrid() {
    this.showgrid = true;
  }
  
  /**
   * Disables the grid.
   */
  
  public void disableGrid() {
    this.showgrid = false;
  }
  
  /**
   * SHowing the axis.
   */
  
  public void showAxis() {
    this.showline = true;
  }
  
  /**
   * Hiding the axis.
   */
  
  public void hideAxis()  {
    this.showline = false;
  }
  
  /**
   * Hiding the tick labels.
   */

  public void hideTicklabels() {
    this.showticklabels = false;
  }
  
  /**
   * Showing the the labels.
   */
  
  public void ShowTicklabels() {
    this.showticklabels = true;
  }
  
  /**
   * setting the title
   * @param title
   */
  
  public void setTitle(String title) {
    this.title = title;
  }
  
  public JsonObject getValue() {
    JsonObjectBuilder		obj;

    obj = Json.createObjectBuilder();
    obj.add("gridcolor",this.getGridcolor());
    obj.add("gridwidth",this.getGridwidth()); 
    obj.add("linecolor", this.getLinecolor()); 
    obj.add("linewidth", this.getLinewidth()); 
    obj.add("mirror", this.isMirror());
    obj.add("showticklabels", this.isShowticklabels());
    obj.add("showgrid", this.isShowgrid());
    obj.add("showline", this.isShowline());
    obj.add("tickwidth", this.getTickwidth()); 
    if (this.getTitle()!=null)obj.add("title", this.getTitle());

    return obj.build();
  }
  
  //---------------------------------------------------------
  // DATA MEMBERS
  //---------------------------------------------------------
  
  private String	 	gridcolor;
  private int                   gridwidth; 
  private String 		linecolor; 
  private int                   linewidth;
  private boolean		mirror; 
  private boolean		showgrid;
  private boolean               showline;
  private boolean		showticklabels; 
  private int                   tickwidth;
  private String		title;
}
