package com.address.app.errorhandler;

import java.util.Date;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.address.app.dto.ErrorDetails;
import com.address.app.exception.AddressNotFoundExceptionHandler;

@ControllerAdvice
public class CustomeErrorHandler {

	@ExceptionHandler(AddressNotFoundExceptionHandler.class)
	public ErrorDetails addreessNotFound(AddressNotFoundExceptionHandler addressNotFoundExceptionHandler) {
		return new ErrorDetails(new Date(), addressNotFoundExceptionHandler.getMessage(), "204", "No Content");
	}
}
