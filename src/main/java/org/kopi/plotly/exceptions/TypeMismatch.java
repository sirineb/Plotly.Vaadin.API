package org.kopi.plotly.exceptions;

public class TypeMismatch extends PlotlyException {

  public TypeMismatch(String message) {
    super(message);
  }

  public TypeMismatch(String message, Throwable cause) {
    super(message, cause);
  }
}
