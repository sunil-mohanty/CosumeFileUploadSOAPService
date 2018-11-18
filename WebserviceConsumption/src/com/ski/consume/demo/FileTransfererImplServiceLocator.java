/**
 * FileTransfererImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ski.consume.demo;

public class FileTransfererImplServiceLocator extends org.apache.axis.client.Service implements com.ski.consume.demo.FileTransfererImplService {

    public FileTransfererImplServiceLocator() {
    }


    public FileTransfererImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public FileTransfererImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for FileTransfererImplPort
    private java.lang.String FileTransfererImplPort_address = "http://localhost:9898/codejava/fileService";

    public java.lang.String getFileTransfererImplPortAddress() {
        return FileTransfererImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String FileTransfererImplPortWSDDServiceName = "FileTransfererImplPort";

    public java.lang.String getFileTransfererImplPortWSDDServiceName() {
        return FileTransfererImplPortWSDDServiceName;
    }

    public void setFileTransfererImplPortWSDDServiceName(java.lang.String name) {
        FileTransfererImplPortWSDDServiceName = name;
    }

    public com.ski.consume.demo.FileTransfererImpl getFileTransfererImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(FileTransfererImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getFileTransfererImplPort(endpoint);
    }

    public com.ski.consume.demo.FileTransfererImpl getFileTransfererImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.ski.consume.demo.FileTransfererImplPortBindingStub _stub = new com.ski.consume.demo.FileTransfererImplPortBindingStub(portAddress, this);
            _stub.setPortName(getFileTransfererImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setFileTransfererImplPortEndpointAddress(java.lang.String address) {
        FileTransfererImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.ski.consume.demo.FileTransfererImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                com.ski.consume.demo.FileTransfererImplPortBindingStub _stub = new com.ski.consume.demo.FileTransfererImplPortBindingStub(new java.net.URL(FileTransfererImplPort_address), this);
                _stub.setPortName(getFileTransfererImplPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("FileTransfererImplPort".equals(inputPortName)) {
            return getFileTransfererImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://server.binary.ws.codejava.net/", "FileTransfererImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://server.binary.ws.codejava.net/", "FileTransfererImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("FileTransfererImplPort".equals(portName)) {
            setFileTransfererImplPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
