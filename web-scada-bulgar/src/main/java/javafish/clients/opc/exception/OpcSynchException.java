package javafish.clients.opc.exception;

import javafish.clients.opc.exception.OpcException;

/**
 * Opc synchronous exception 
 */
public class OpcSynchException extends OpcException {
  private static final long serialVersionUID = 5345883388459301928L;
  
  public OpcSynchException(String message) {
    super(message);
  }

}
