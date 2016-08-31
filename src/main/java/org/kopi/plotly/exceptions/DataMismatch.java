package org.kopi.plotly.exceptions;


public class DataMismatch extends PlotlyException {

  public DataMismatch(String message) {
    super(message);
  }

  public DataMismatch(String message, Throwable cause) {
    super(message, cause);
  }
}
