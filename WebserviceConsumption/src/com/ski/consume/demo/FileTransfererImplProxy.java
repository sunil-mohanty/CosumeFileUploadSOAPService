package com.ski.consume.demo;

public class FileTransfererImplProxy implements com.ski.consume.demo.FileTransfererImpl {
  private String _endpoint = null;
  private com.ski.consume.demo.FileTransfererImpl fileTransfererImpl = null;
  
  public FileTransfererImplProxy() {
    _initFileTransfererImplProxy();
  }
  
  public FileTransfererImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initFileTransfererImplProxy();
  }
  
  private void _initFileTransfererImplProxy() {
    try {
      fileTransfererImpl = (new com.ski.consume.demo.FileTransfererImplServiceLocator()).getFileTransfererImplPort();
      if (fileTransfererImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)fileTransfererImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)fileTransfererImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (fileTransfererImpl != null)
      ((javax.xml.rpc.Stub)fileTransfererImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.ski.consume.demo.FileTransfererImpl getFileTransfererImpl() {
    if (fileTransfererImpl == null)
      _initFileTransfererImplProxy();
    return fileTransfererImpl;
  }
  
  public byte[] download(java.lang.String arg0) throws java.rmi.RemoteException{
    if (fileTransfererImpl == null)
      _initFileTransfererImplProxy();
    return fileTransfererImpl.download(arg0);
  }
  
  public void upload(java.lang.String arg0, byte[] arg1) throws java.rmi.RemoteException{
    if (fileTransfererImpl == null)
      _initFileTransfererImplProxy();
    fileTransfererImpl.upload(arg0, arg1);
  }
  
  
}