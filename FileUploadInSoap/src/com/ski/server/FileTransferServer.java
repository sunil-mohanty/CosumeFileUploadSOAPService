package com.ski.server;

import javax.xml.ws.Endpoint;

public class FileTransferServer {
	public static void main(String[] args) {
		String bindingURI = "http://localhost:8787/service/filetransfer";
		FileTransferer service = new FileTransfererImpl();
		Endpoint.publish(bindingURI, service);
		System.out.println("Server started at: " + bindingURI);
	}
}
