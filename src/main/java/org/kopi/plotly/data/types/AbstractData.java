package org.kopi.plotly.data.types;

import java.util.ArrayList;
import java.util.List;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;

import org.kopi.plotly.data.dataseries.AbstractDataSeries;
import org.kopi.plotly.data.line.Line;
import org.kopi.plotly.data.marker.IMarker;
import org.kopi.plotly.exceptions.DataMismatch;
import org.kopi.plotly.exceptions.TypeMismatch;

import com.vaadin.shared.ui.colorpicker.Color;


public abstract class AbstractData implements IData{

  //---------------------------------------------------------
  // CONSTRUCTOR
  //---------------------------------------------------------

  public AbstractData(String name, AbstractDataSeries series) {
    this.name = name;
    this.series = series;
    if (isPieOrDonut()){
      hoverinfo = "label+value";
    }else {
      hoverinfo = "y";
    }
  }

  public AbstractData(AbstractDataSeries series) {
    this.name = null;
    this.series = series;
    if (isPieOrDonut()){
      hoverinfo = "label+value";
    }else {
      hoverinfo = "y";
    }
  }


  //---------------------------------------------------------
  // IMPLEMENTATIONS
  //---------------------------------------------------------

  @Override
  public List<JsonObject> getValue() throws DataMismatch {
    List<JsonObject>            list;
    JsonObjectBuilder           builder;

    list = new ArrayList<>();

    if (isRangeArea()){
      JsonObjectBuilder                 builderinf;

      builderinf = Json.createObjectBuilder();
      if(getData().getDimensions()!=null) {
        builderinf.add("x", getData().getDimensions());
      }
      builderinf.add("y", getData().getMeasures());
      builderinf.add("type", getType().name().toLowerCase());

      if (getName() != null) {
        builderinf.add("name", getName()+"-inf");
      }

      builderinf.add("mode", getMode());
      builderinf.add("line", getLine().getValue());
      builderinf.add("hoverinfo", getHoverInfo());

      list.add(builderinf.build());
    }

    builder = Json.createObjectBuilder();

    if( isBubble()){
      if(getMarker() != null) {
        if(getData().getRange()!=null){
          getMarker().setSizes(getData().getRange());
        }
      }
    }

    if (isPieOrDonut()){
      if(getData().getDimensions()!=null) {
        builder.add("labels", getData().getDimensions());
      }
      builder.add("values", getData().getMeasures());
      if (getDomain()!=null){
        builder.add("domain", Json.createObjectBuilder()
                    .add("x", Json.createArrayBuilder()
                         .add(getDomain()[0])
                         .add(getDomain()[1])
                         .build())
                    .add("y", Json.createArrayBuilder()
                         .add(getDomain()[2])
                         .add(getDomain()[3])
                         .build())
                    .build()
            );
      }
    }else {
      if (getOrientation() != null){
        if(getData().getDimensions()!=null) {
          builder.add("y", getData().getDimensions());
        }
        builder.add("x", getData().getMeasures());
      } else{
        if(getData().getDimensions()!=null) {
          builder.add("x", getData().getDimensions());
        }
        if (isRangeArea()){
          if(getData().getRange()!=null){
            builder.add("y", getData().getRange());
          } else {
            builder.add("y", getData().getMeasures());
          }
        }else {
          builder.add("y", getData().getMeasures());
        }
      }
    }

    builder.add("type", getType().name().toLowerCase());
    if (getName() != null){
      if (isRangeArea()){
        builder.add("name", getName()+"-sup");
      }else {
        builder.add("name", getName());
      }
    }

    if(getMode() != null) { 
      builder.add("mode", getMode());
    }

    if(getMarker() != null) {
      builder.add("marker", getMarker().getValue());
    }

    if(getLine() != null) {
      builder.add("line", getLine().getValue());
    }

    if(getFill() != null){
      builder.add("fill", getFill());
    }

    builder.add("hoverinfo", getHoverInfo());
    if(getHole() != 0){
      builder.add("hole", getHole());
    }

    if (getOrientation() != null) {
      builder.add("orientation", getOrientation());
    }

    list.add(builder.build());

    return list;
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public AbstractDataSeries  getData() {
    return this.series;
  }

  @Override
  public String getName() {
    return name;
  }
  @Override
  public double getHole() {
    return 0;
  }

  @Override
  public IMarker getMarker() {
    return null;
  }

  @Override
  public String getMode() {
    return null;
  }

  @Override
  public Line getLine() {
    return null;
  }

  @Override
  public String getFill() {
    return null;
  }
  @Override
  public String getColor() {
    return null;
  }

  @Override
  public String getOrientation() {
    return null;
  }

  @Override
  public void setHoverinfo(String hoverinfo) {
    this.hoverinfo = hoverinfo;
  }

  @Override
  public String getHoverInfo() {
    return hoverinfo;
  }

  @Override
  public boolean isPieOrDonut() {
    return false;
  }

  @Override
  public boolean isRangeArea() {
    return false;
  }

  @Override
  public boolean isBubble(){
    return false;
  }

  @Override
  public boolean isBoxPlot(){
    return false;
  }

  @Deprecated
  @Override 
  public void setColors(List<Color> colors){

  }

  @Override
  public void setColor(Color color) throws TypeMismatch {   
    if(getType().name().equals(TypeData.PIE.name())){
      throw new TypeMismatch("this function is not authotorized for Pie or donut");
    }
  }

  @Override
  public void setDomain(double x1, double x2, double y1, double y2) throws TypeMismatch {   
    if(!getType().name().equals(TypeData.PIE.name())){
      throw new TypeMismatch("this function is only authotorized for Pie or donut");
    }
  }
  @Override
  public void setDataSeries(AbstractDataSeries series) throws Exception{
    this.series = series;
  }

  @Override
  public double[] getDomain(){
    return null;
  }

  //---------------------------------------------------------
  // DATA MEMBERS
  //---------------------------------------------------------

  private String                        name;
  private String                        hoverinfo;
  private AbstractDataSeries            series;

}
