package org.kopi.plotly.data.dataseries;


import java.util.HashMap;
import java.util.Map;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;

/**
 * 
 * @author sbchini
 *
 */

public class SingleData extends AbstractDataSeries {

  //---------------------------------------------------------
  // CONSTRUCTOR
  //---------------------------------------------------------

  public SingleData(){
    values = new HashMap <Integer,Number>();
  }

  public SingleData(String name){
    super(name);
    values = new HashMap <Integer,Number>();
  }

  //---------------------------------------------------------
  // IMPLEMENTATIONS
  //---------------------------------------------------------

  @Override
  public JsonArray  getMeasures() {
    JsonArrayBuilder            builder;
    builder = Json.createArrayBuilder();
    for(int index = 0; index< values.size();index++){
      builder.add(values.get(index).doubleValue());
    }

    return builder.build();
  }
  
  @Override
  public void addData(int value){
    int                 index;
    index = values.size();
    values.put(index, value);
  }

  @Override
  public void addData(double value){
    int                 index;
    index = values.size();
    values.put(index, value);
  }
  
  @Override
  public DataSeriesType getType() {
    return DataSeriesType.SINGLE;
  }

  //---------------------------------------------------------
  // DATA MEMBERS
  //---------------------------------------------------------

  private Map<Integer,Number>             values;

}
