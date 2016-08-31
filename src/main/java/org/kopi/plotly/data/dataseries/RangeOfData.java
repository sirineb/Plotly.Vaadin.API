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
public class RangeOfData extends AbstractDataSeries {

  //---------------------------------------------------------
  // CONSTRUCTOR
  //---------------------------------------------------------

  public RangeOfData(){
    numbers = new HashMap <Integer,Number>();
    range = new HashMap <Integer,Number>();
    objects = new HashMap <Integer,Object>();

  }

  public RangeOfData(String name){
    super(name);
    numbers = new HashMap <Integer,Number>();
    range = new HashMap <Integer,Number>();
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
  public JsonArray  getRange() {
    JsonArrayBuilder            builder;
    builder = Json.createArrayBuilder();
    for(int index = 0; index< range.size();index++){
      builder.add(range.get(index).doubleValue());
    }

    return builder.build();
  }

  
  // ADDING DATA OF DIFFERNT TYPES

  @Override
  public void addData(Object value1, int value2, int value3){
    int                 index;
    index = objects.size();
    objects.put(index, value1);
    numbers.put(index, value2);
    range.put(index, value3);
  }

  @Override
  public void addData(Object value1, int value2, double value3){
    int                 index;
    index = objects.size();
    objects.put(index, value1);
    numbers.put(index, value2);
    range.put(index, value3);
  }

  @Override
  public void addData(Object value1, double value2, int value3){
    int                 index;
    index = objects.size();
    objects.put(index, value1);
    numbers.put(index, value2);
    range.put(index, value3);
  }

  @Override
  public void addData(Object value1, double value2, double value3){
    int                 index;
    index = objects.size();
    objects.put(index, value1);
    numbers.put(index, value2);
    range.put(index, value3);
  }
  
  @Override
  public DataSeriesType getType() {
    return DataSeriesType.RANGE;
  }

  //---------------------------------------------------------
  // DATA MEMBERS
  //---------------------------------------------------------

  private Map<Integer,Number>             numbers;
  private Map<Integer,Number>             range;
  private Map<Integer,Object>             objects;
}
