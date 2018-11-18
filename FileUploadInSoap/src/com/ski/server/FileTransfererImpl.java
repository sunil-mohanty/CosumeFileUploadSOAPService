package com.ski.server;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.WebServiceException;

@WebService
public class FileTransfererImpl implements FileTransferer {
	@WebMethod
	public void upload(String fileName, byte[] imageBytes) {
		
		String filePath = "/Users/sunilmohanty/Documents/MyDrive/" + fileName;
		
		try {
			FileOutputStream fos = new FileOutputStream(filePath);
			BufferedOutputStream outputStream = new BufferedOutputStream(fos);
			outputStream.write(imageBytes);
			outputStream.close();
			
			System.out.println("File dumped: " + filePath);
			
		} catch (IOException ex) {
			System.err.println(ex);
			throw new WebServiceException(ex);
		}
	}
	
	@WebMethod
	public byte[] download(String fileName) {
		String filePath = "/Users/sunilmohanty/Documents/MyDrive/projects/" + fileName;
		System.out.println("Picking the file from: " + filePath);
		
		try {
			File file = new File(filePath);
			FileInputStream fis = new FileInputStream(file);
			BufferedInputStream inputStream = new BufferedInputStream(fis);
			byte[] fileBytes = new byte[(int) file.length()];
			inputStream.read(fileBytes);
			inputStream.close();
			
			return fileBytes;
		} catch (IOException ex) {
			System.err.println(ex);
			throw new WebServiceException(ex);
		}		
	}
}