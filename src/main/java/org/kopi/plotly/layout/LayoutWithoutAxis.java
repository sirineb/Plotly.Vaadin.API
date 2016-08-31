package org.kopi.plotly.layout;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;

/**
 * 
 * @author sbchini
 *
 */

public class LayoutWithoutAxis extends Layout {

  //---------------------------------------------------------
  // CONSTRUCTORs
  //---------------------------------------------------------

  public LayoutWithoutAxis(int height, int width, String title) {
    super(height, width, title);
  }

  public LayoutWithoutAxis(String title) {
    super(title);
  }

  public LayoutWithoutAxis(int height, int width) {
    super(height, width);
  }

  public LayoutWithoutAxis() {
    super();
  }

  //---------------------------------------------------------
  // IMPLEMENTATIONS
  //---------------------------------------------------------

  @Override
  public JsonObject getValue() {
    JsonObjectBuilder 		obj;
    obj = Json.createObjectBuilder();
    if (this.getHeight()!=0) obj.add("height", this.getHeight());
    if (this.getWidth()!=0) obj.add("width", this.getWidth());
    if (this.getGraphTitle()!=null) obj.add("title", this.getGraphTitle());
    obj.add("showlegend", this.isLegendShowed());
    if (this.getBackgroundColor()!= null) {
      obj.add("paper_bgcolor", this.getBackgroundColor().getCSS());
      obj.add("plot_bgcolor", this.getBackgroundColor().getCSS());
    }
    return obj.build();
  }

}
