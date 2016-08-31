package org.kopi.plotly.data.dataseries;

import javax.json.JsonArray;

import org.kopi.plotly.exceptions.DataMismatch;

public abstract class AbstractDataSeries implements IDataSeries{

  //---------------------------------------------------------
  // CONSTRUCTOR
  //---------------------------------------------------------

  public AbstractDataSeries(){
  }

  public AbstractDataSeries(String name){
    this.name = name;
  }

  //---------------------------------------------------------
  // IMPLEMENTATIONS
  //---------------------------------------------------------

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void setName(String name) {
    this.name=name;
  }

  @Override
  public JsonArray getDimensions() {
    return null;
  }

  @Override
  public JsonArray  getRange() {

    return null;
  }

  @Override
  public void addData(int value) throws DataMismatch {
    throw new DataMismatch("Not enough data for a "+ getType().name());
  }

  @Override
  public void addData(double value) throws DataMismatch {
    throw new DataMismatch("Not enough data for a "+ getType().name());
  }

  @Override
  public void addData(Object value1, int value2) throws DataMismatch {
    if(getType().name().equals(DataSeriesType.RANGE.name())){
      throw new DataMismatch("Not enough data for a "+ getType().name());
    }
    if(getType().name().equals(DataSeriesType.SINGLE.name())){
      throw new DataMismatch("Too much data for a "+ getType().name());
    }
  }

  @Override
  public void addData(Object value1, double value2) throws DataMismatch {

    if(getType().name().equals(DataSeriesType.RANGE.name())){
      throw new DataMismatch("Not enough data for a "+ getType().name());
    }
    if(getType().name().equals(DataSeriesType.SINGLE.name())){
      throw new DataMismatch("Too much data for a "+ getType().name());
    }

  }

  @Override
  public void addData(Object value1, int value2, int value3) throws DataMismatch {
    throw new DataMismatch("Too much data for a "+ getType().name());
  }

  @Override
  public void addData(Object value1, double value2, double value3) throws DataMismatch {
    throw new DataMismatch("Too much data for a "+ getType().name());
  }

  @Override
  public void addData(Object value1, int value2, double value3) throws DataMismatch {
    throw new DataMismatch("Too much data for a "+ getType().name());
  }

  @Override
  public void addData(Object value1, double value2, int value3) throws DataMismatch {
    throw new DataMismatch("Too much data for a "+ getType().name());
  }

  //---------------------------------------------------------
  // DATA MEMBERS
  //---------------------------------------------------------

  private String                          name;

}
