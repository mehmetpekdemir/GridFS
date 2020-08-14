package com.mehmetpekdemir.gridfs.shared;

import java.time.LocalDate;

/**
 * 
 * @author MEHMET PEKDEMIR
 * @since 1.0
 */
public final class GenericResponse {

	private String message;

	private LocalDate localDate;

	public GenericResponse(String message) {
		this.message = message;
		this.localDate = LocalDate.now();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LocalDate getLocalDate() {
		return localDate;
	}

}
