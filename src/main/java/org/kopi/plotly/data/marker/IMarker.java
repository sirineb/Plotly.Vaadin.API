package org.kopi.plotly.data.marker;

import java.util.Collection;

import javax.json.JsonArray;

import org.kopi.plotly.IChartProprety;
import org.kopi.plotly.exceptions.DataMismatch;

import com.vaadin.shared.ui.colorpicker.Color;

/**
 * @author sbchini
 *
 */
public interface IMarker extends IChartProprety {
  
  /**
   * 
   * @return the series of colors in case of pie or donut.
   */
  
  Collection<Color> getColors();
  
  /**
   * 
   * @return The sizes of the marker in case or bubble.
   */
  
  JsonArray getSizes();
  
  /**
   * 
   * @return the color code in form of a string. 
   */
  
  String getColor();
  
  /**
   * 
   * @return the opacity of the marker. 
   */
  
  double getOpacity();
  
  /**
   * Sets the sizes of a marker.
   * @param sizes
   * @throws DataMismatch 
   */
  
  void setSizes(JsonArray sizes) throws DataMismatch;
}
