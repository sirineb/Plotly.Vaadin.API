package org.kopi.plotly.data.dataseries;

import javax.json.JsonArray;

import org.kopi.plotly.exceptions.DataMismatch;

/**
 * @author sbchini
 *
 */
public interface IDataSeries {
  /**
   * 
   * @return an array of the dimensions of the data to be displayed as labels or X axis values.
   */
  JsonArray getDimensions();

  /**
   * 
   * @return an array of the measures of the data to be displayed as values or Y axis values.
   */

  JsonArray getMeasures();

  /**
   * 
   * @return an array of the range of the data to be displayed.
   */

  JsonArray getRange();

  /**
   * 
   * @return the name of the series 
   */
  String getName();

  /**
   * 
   * @return the name of the series 
   */
  DataSeriesType getType();

  /**
   * 
   * @param name
   */
  void setName(String name);

  /**
   * adds singular data of int.
   * @param value
   * @throws DataMismatch 
   */

  void addData(int value) throws DataMismatch;

  /**
   * adds singular data of double.
   * @param value
   * @throws DataMismatch 
   */

  void addData(double value) throws DataMismatch;

  /**
   * adds a couple of data with int measure.
   * @param value
   * @throws DataMismatch 
   */

  void addData(Object value1, int value2) throws DataMismatch;

  /**
   * adds a couple of data of double measure.
   * @param value
   * @throws DataMismatch 
   */

  void addData(Object value1, double value2) throws DataMismatch;

  /**
   * adds a range of data with int measures.
   * @param value
   * @throws DataMismatch 
   */

  void addData(Object value1, int value2, int value3) throws DataMismatch;

  /**
   * adds a range of data of double measures.
   * @param value
   * @throws DataMismatch 
   */

  void addData(Object value1, double value2, double value3) throws DataMismatch;

  /**
   * adds a range of data with int and double measures.
   * @param value
   * @throws DataMismatch 
   */

  void addData(Object value1, int value2, double value3) throws DataMismatch;

  /**
   * adds a range of data of double and int measures.
   * @param value
   * @throws DataMismatch 
   */

  void addData(Object value1, double value2, int value3) throws DataMismatch;

}
