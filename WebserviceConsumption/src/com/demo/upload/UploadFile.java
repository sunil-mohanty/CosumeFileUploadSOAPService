package com.demo.upload;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import javax.xml.rpc.ServiceException;

import com.ski.consume.demo.FileTransfererImpl;
import com.ski.consume.demo.FileTransfererImplService;
import com.ski.consume.demo.FileTransfererImplServiceLocator;

public class UploadFile {
	public static void main(String[] args) throws ServiceException, IOException {
		FileTransfererImplService transferService = new FileTransfererImplServiceLocator();
		FileTransfererImpl transferImpl = transferService.getFileTransfererImplPort();
		
		File file = new File("test.txt");
		
		byte[] content = Files.readAllBytes(file.toPath());
		transferImpl.upload("test.txt", content);
	}

}
