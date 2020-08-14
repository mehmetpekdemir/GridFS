package com.mehmetpekdemir.gridfs.api;

import java.io.IOException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.mehmetpekdemir.gridfs.service.FileUploadService;
import com.mehmetpekdemir.gridfs.shared.GenericResponse;

/**
 * 
 * @author MEHMET PEKDEMIR
 * @since 1.0
 */
@RestController
@RequestMapping("/upload")
public class FileUploadAPI {

	private final FileUploadService fileUploadService;

	public FileUploadAPI(FileUploadService fileUploadService) {
		this.fileUploadService = fileUploadService;
	}

	@PostMapping("/v1")
	public ResponseEntity<?> uploadFile(@RequestParam(value = "file", required = true) MultipartFile multipartFile)
			throws IOException {
		fileUploadService.uploadFile(multipartFile);
		return ResponseEntity.ok(new GenericResponse("Uploaded Successfully."));
	}

}
