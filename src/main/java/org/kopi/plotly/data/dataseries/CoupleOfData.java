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

public class CoupleOfData extends AbstractDataSeries {

  //---------------------------------------------------------
  // CONSTRUCTOR
  //---------------------------------------------------------

  public CoupleOfData(){
    numbers = new HashMap <Integer,Number>();
    objects = new HashMap <Integer,Object>();

  }

  public CoupleOfData(String name){
    super(name);
    numbers = new HashMap <Integer,Number>();
    objects = new HashMap <Integer,Object>();
  }

  //---------------------------------------------------------
  // IMPLEMENTATIONS
  //---------------------------------------------------------

  @Override
  public JsonArray getDimensions() {
    JsonArrayBuilder            builder;
    builder = Json.createArrayBuilder();
    for(int index = 0; index< objects.size();index++){

      if (objects.get(index) instanceof String){
        builder.add((String)objects.get(index));
      }

      if (objects.get(index)instanceof Number){
        builder.add(((Number)objects.get(index)).doubleValue());
      }
    }

    return builder.build();
  }

  @Override
  public JsonArray  getMeasures() {
    JsonArrayBuilder            builder;
    builder = Json.createArrayBuilder();
    for(int index = 0; index< numbers.size();index++){
      builder.add(numbers.get(index).doubleValue());
    }

    return builder.build();
  }
  
  @Override
  public void addData(Object value1, int value2){
    int                 index;
    index = objects.size();
    objects.put(index, value1);
    numbers.put(index, value2);
  }

  @Override
  public void addData(Object value1, double value2){
    int                 index;
    index = objects.size();
    objects.put(index, value1);
    numbers.put(index, value2);
  }
  
  @Override
  public DataSeriesType getType() {
    return DataSeriesType.COUPLE;
  }

  //---------------------------------------------------------
  // DATA MEMBERS
  //---------------------------------------------------------

  private Map<Integer,Number> 	          numbers;
  private Map<Integer,Object>             objects;

}
