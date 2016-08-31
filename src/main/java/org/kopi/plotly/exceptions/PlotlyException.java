package org.kopi.plotly.exceptions;

public class PlotlyException extends Exception {

  public PlotlyException(String message) {
    super(message);
  }

  public PlotlyException(String message, Throwable cause) {
    super(message, cause);
  }
}