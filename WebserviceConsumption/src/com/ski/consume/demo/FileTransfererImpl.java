/**
 * FileTransfererImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ski.consume.demo;

public interface FileTransfererImpl extends java.rmi.Remote {
    public byte[] download(java.lang.String arg0) throws java.rmi.RemoteException;
    public void upload(java.lang.String arg0, byte[] arg1) throws java.rmi.RemoteException;
}
