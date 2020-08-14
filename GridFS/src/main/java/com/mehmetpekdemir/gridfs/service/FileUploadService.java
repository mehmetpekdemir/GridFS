package com.mehmetpekdemir.gridfs.service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

/**
 * 
 * @author MEHMET PEKDEMIR
 * @since 1.0
 */
public interface FileUploadService {

	void uploadFile(MultipartFile multipartFile) throws IOException;
	
}
