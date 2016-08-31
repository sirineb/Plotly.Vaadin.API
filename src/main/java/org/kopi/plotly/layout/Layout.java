package org.kopi.plotly.layout;

import com.vaadin.shared.ui.colorpicker.Color;

/**
 * 
 * @author sbchini
 *
 */

public abstract class Layout implements ILayout {

  //---------------------------------------------------------
  // CONSTRUCTORS
  //---------------------------------------------------------


  public Layout(int height, int width, String title) {
    this.height = height;
    this.width = width;
    this.showlegend = true;
    this.title = title;
  }

  public Layout(String title) {
    this.showlegend = true;
    this.title = title;
  }

  public Layout(int height, int width) {
    this.height = height;
    this.width = width;
    this.showlegend = true;
  }

  public Layout() {
    this.showlegend = true;
  }

  //---------------------------------------------------------
  // IMPLEMNTATIONS
  //---------------------------------------------------------


  public void disableLegend(){
    this.showlegend=false;
  }

  public void enableLegend(){
    this.showlegend=true;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public void setLayoutTitle(String title) {
    this.title = title;
  }

  public void setBackgroundColor(Color color) {
    this.bgcolor = color;
  }

  @Override
  public int getWidth() {
    return width;
  }

  @Override
  public int getHeight() {
    return height;
  }

  @Override
  public boolean isLegendShowed() {
    return showlegend;
  }

  @Override
  public String getGraphTitle() {
    return title;
  }

  @Override
  public Color getBackgroundColor() {
    return this.bgcolor;
  }
  //---------------------------------------------------------
  // DATA MEMBERS
  //---------------------------------------------------------

  private int 		        height;
  private int 		        width;
  private boolean 	        showlegend;
  private Color             bgcolor;
  private String 			title;

}
