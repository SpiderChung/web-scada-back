package javafish.clients.opc.exception;

import javafish.clients.opc.exception.OpcSignException;

/**
 * Unable to remove item exception 
 */
public class UnableRemoveItemException extends OpcSignException {
  private static final long serialVersionUID = -3216497377472675539L;
  
  public UnableRemoveItemException(String message) {
    super(message);
  }

}
