package org.kopi.plotly.data.marker;

import java.util.Collection;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObjectBuilder;
import javax.json.JsonValue;

import org.kopi.plotly.data.line.Line;
import org.kopi.plotly.exceptions.DataMismatch;

import com.vaadin.shared.ui.colorpicker.Color;

public abstract class AbstractMarker implements IMarker {

  @Override
  public JsonValue getValue() {
    JsonObjectBuilder           builder;
    
    builder = Json.createObjectBuilder();
    if (getColors() != null && !getColors().isEmpty()) {
      builder.add("colors", toJsonArrayColors(getColors()));
    }
    
    if (getColor() != null) {
      builder.add("color", getColor());
    }
    
    if (getSize() != 0) {
      builder.add("size", getSize());
    }
    
    if (getSizes() != null) {
      builder.add("size", getSizes());
    }
    
    if (getLine() != null) {
      builder.add("line", getLine().getValue());
    }
    
    if (getOpacity() != 0) {
      builder.add("opacity", getOpacity());
    }
    
    return builder.build();
  }
  
  @Override
  public Collection<Color> getColors() {
    return null;
  }
  
  @Override
  public String getColor() {
    return null;
  }

  @Override
  public JsonArray getSizes() {
    return null;
  }
  
  @Override
  public double getOpacity() {
    return 0;
  }
  
  protected Line getLine() {
    return null;
  }
  
  protected int getSize() {
    return 0;
  }
  public JsonArray toJsonArrayColors(Collection<Color> colors) {
	    JsonArrayBuilder      builder;

	    builder = Json.createArrayBuilder();
	    for (Color color : colors){
	      builder.add(color.getCSS());
	    }
	    
	    return builder.build();
	  }
  
  @Override
  public void setSizes(JsonArray sizes) throws DataMismatch{
    throw new DataMismatch("setSizes only used in case of BubbleData");
    
  }
}
