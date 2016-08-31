package org.kopi.plotly.configuration;

import java.util.ArrayList;
import java.util.List;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;

import org.kopi.plotly.IChartProprety;
import org.kopi.plotly.data.features.Colors;
import org.kopi.plotly.data.features.HoverInfo;
import org.kopi.plotly.data.types.IData;
import org.kopi.plotly.exceptions.DataMismatch;
import org.kopi.plotly.exceptions.TypeMismatch;

import com.vaadin.shared.ui.colorpicker.Color;

/**
 * @author sbchini
 *
 */
public class DataConfiguration implements  IChartProprety {

  //---------------------------------------------------------
  // CONSTRUCTOR
  //---------------------------------------------------------

  public DataConfiguration() {
    this.dataConfiguraion = new ArrayList<>();
    colors = new ArrayList<>();
    colors.add(Colors.LIGHTGREEN);
    colors.add(Colors.LIGHTSALMON);
    colors.add(Colors.LIGHTCORAL);
    colors.add(Colors.LIGHTSTEELBLUE);
    colors.add(Colors.LIGHTGRAY);
    isPieOrDonut = false;
    isBoxPlot = false;
  }

  //---------------------------------------------------------
  // IMPLEMENTATIONS
  //---------------------------------------------------------

  @Override
  public JsonArray getValue() {
    JsonArrayBuilder 	  arr;

    arr = Json.createArrayBuilder();
    if (isPieOrDonut) { 
      setDomain(this.dataConfiguraion.size());
    }
    for (IData data: dataConfiguraion){
      try {
        for (JsonObject o : data.getValue()){
          arr.add(o);
        }
      } catch (DataMismatch e) {
        e.printStackTrace();
      }
    }
    JsonArray a =arr.build();
    System.out.println(a.toString());
    return a;
  }

  /**
   * Adds data to the configuration.
   * @param data
   */
  public void addDataConfiguration(IData data) {
    if (dataConfiguraion.isEmpty()){
      if((!data.isPieOrDonut())&&((data.getColor().equals(Colors.LIGHTSKYBLUE.getCSS()))||(data.getColor().equals("rgba("+Colors.LIGHTSKYBLUE.getRed()+","+Colors.LIGHTSKYBLUE.getGreen()+","+Colors.LIGHTSKYBLUE.getBlue()+",0.5)")))){
        try {
          data.setColor(colors.get(0));
        } catch (TypeMismatch e) {
          e.printStackTrace();
        }
      };
      this.dataConfiguraion.add(data);
      isPieOrDonut = data.isPieOrDonut();
      isBoxPlot = data.isBoxPlot();
    } else{
      if(!data.isPieOrDonut()&&!isPieOrDonut){
        if((!data.isPieOrDonut())&&(data.getColor().equals(Colors.LIGHTSKYBLUE.getCSS()))||(data.getColor().equals("rgba("+Colors.LIGHTSKYBLUE.getRed()+","+Colors.LIGHTSKYBLUE.getGreen()+","+Colors.LIGHTSKYBLUE.getBlue()+",0.5)"))){
          try {
            data.setColor(colors.get(dataConfiguraion.size()));
          } catch (TypeMismatch e) {
            e.printStackTrace();
          }
        }
        this.dataConfiguraion.add(data);
      }else if(data.isPieOrDonut()&&isPieOrDonut){
        this.dataConfiguraion.add(data);
      }

    }
  }

  private void setDomain(int size) {
    if (isPieOrDonut){
      if(size>9) size = 9;
      if(size>1){
        for (IData data: this.dataConfiguraion){
          data.setHoverinfo(HoverInfo.PIE_PERCENT_LABEL_NAME);
        }
      }

      try {
        if (size == 2){

          this.dataConfiguraion.get(0).setDomain(0,0.48,0,1);

          this.dataConfiguraion.get(1).setDomain(0.52,1,0,1);
        } else if (size == 3){
          this.dataConfiguraion.get(2).setDomain(0,0.48,0,0.48);
          this.dataConfiguraion.get(1).setDomain(0.52,1,0.52,1);
          this.dataConfiguraion.get(0).setDomain(0,0.48,0.52,1);
        } else if (size == 4){
          this.dataConfiguraion.get(0).setDomain(0,0.48,0,0.48);
          this.dataConfiguraion.get(1).setDomain(0.52,1,0,0.48);
          this.dataConfiguraion.get(2).setDomain(0,0.48,0.52,1);
          this.dataConfiguraion.get(3).setDomain(0.52,1,0.52,1);
        }else if (size == 5){
          this.dataConfiguraion.get(0).setDomain(0,0.32,0,0.48);
          this.dataConfiguraion.get(1).setDomain(0.34,0.65,0,0.48);
          this.dataConfiguraion.get(2).setDomain(0.67,1,0.52,1);
          this.dataConfiguraion.get(3).setDomain(0,0.32,0.52,1);
          this.dataConfiguraion.get(4).setDomain(0.34,0.65,0.52,1);
        }else if (size == 6){
          this.dataConfiguraion.get(0).setDomain(0,0.32,0,0.48);
          this.dataConfiguraion.get(1).setDomain(0.34,0.65,0,0.48);
          this.dataConfiguraion.get(2).setDomain(0.67,1,0,0.48);
          this.dataConfiguraion.get(3).setDomain(0,0.32,0.52,1);
          this.dataConfiguraion.get(4).setDomain(0.34,0.65,0.52,1);
          this.dataConfiguraion.get(5).setDomain(0.67,1,0.52,1);
        }else if (size == 7){
          this.dataConfiguraion.get(0).setDomain(0,0.32,0,0.32);
          this.dataConfiguraion.get(1).setDomain(0.34,0.65,0.67,1);
          this.dataConfiguraion.get(2).setDomain(0.67,1,0.67,1);
          this.dataConfiguraion.get(3).setDomain(0,0.32,0.34,0.65);
          this.dataConfiguraion.get(4).setDomain(0.34,0.65,0.34,0.65);
          this.dataConfiguraion.get(5).setDomain(0.67,1,0.34,0.65);
          this.dataConfiguraion.get(6).setDomain(0,0.32,0.67,1);
        }else if (size == 8){
          this.dataConfiguraion.get(0).setDomain(0,0.32,0,0.32);
          this.dataConfiguraion.get(1).setDomain(0.34,0.65,0,0.32);
          this.dataConfiguraion.get(2).setDomain(0.67,1,0.67,1);
          this.dataConfiguraion.get(3).setDomain(0,0.32,0.34,0.65);
          this.dataConfiguraion.get(4).setDomain(0.34,0.65,0.34,0.65);
          this.dataConfiguraion.get(5).setDomain(0.67,1,0.34,0.65);
          this.dataConfiguraion.get(6).setDomain(0,0.32,0.67,1);
          this.dataConfiguraion.get(7).setDomain(0.34,0.65,0.67,1);
        }else if (size == 9){
          this.dataConfiguraion.get(0).setDomain(0,0.32,0,0.32);
          this.dataConfiguraion.get(1).setDomain(0.34,0.65,0,0.32);
          this.dataConfiguraion.get(2).setDomain(0.67,1,0,0.32);
          this.dataConfiguraion.get(3).setDomain(0,0.32,0.34,0.65);
          this.dataConfiguraion.get(4).setDomain(0.34,0.65,0.34,0.65);
          this.dataConfiguraion.get(5).setDomain(0.67,1,0.34,0.65);
          this.dataConfiguraion.get(6).setDomain(0,0.32,0.67,1);
          this.dataConfiguraion.get(7).setDomain(0.34,0.65,0.67,1);
          this.dataConfiguraion.get(8).setDomain(0.67,1,0.67,1);
        }
      } catch (TypeMismatch e) {

        e.printStackTrace();
      }

    }

  }

  /**
   * returns if the configuration is set to be a pie or donut set. 
   * @return boolean value of the configuration type.
   */
  public boolean isPieOrDonut(){
    return isPieOrDonut;
  }

  /**
   * returns if the configuration is set to be a boxplot set. 
   * @return boolean value of the configuration type.
   */
  public boolean isBoxPlot(){
    return isBoxPlot;
  }

  /**
   * sets the colors of the different charts on the graph of the configuration
   * @param colors
   */

  public void setColors(List<Color> colors){
    this.colors = colors;
    if (isPieOrDonut){
      dataConfiguraion.get(0).setColors(colors);
    }
  }

  @Override
  public String toString() {
    return getValue().toString();
  }

  //---------------------------------------------------------
  // DATA MEMBERS
  //---------------------------------------------------------

  private List<IData>			dataConfiguraion;
  private List<Color>			colors;
  private boolean               isPieOrDonut;
  private boolean               isBoxPlot;
}

