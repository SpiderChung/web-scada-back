package javafish.clients.opc.exception;

import javafish.clients.opc.exception.OpcException;

/**
 * Opc activity exception 
 */
public class OpcActivityException extends OpcException {
  private static final long serialVersionUID = -6565899252098518050L;
  
  public OpcActivityException(String message) {
    super(message);
  }

}
