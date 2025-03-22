package br.inatel.inatelpg_dm112.dm112_logistica.rest.support;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	@ResponseBody
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public ResourceStandardError handlerException(ResourceNotFoundException ex) {

		ResourceStandardError error = new ResourceStandardError();
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMessage(ex.getMessage());
		error.setTimeStamp(System.currentTimeMillis());
		return error;
	}

	@ExceptionHandler(ResourceDuplicateException.class)
	@ResponseBody
	@ResponseStatus(HttpStatus.CONFLICT)
	public ResourceStandardError handlerException(ResourceDuplicateException ex) {

		ResourceStandardError error = new ResourceStandardError();
		error.setStatus(HttpStatus.CONFLICT.value());
		error.setMessage(ex.getMessage());
		error.setTimeStamp(System.currentTimeMillis());
		return error;
	}

	@ExceptionHandler(InvalidOperationException.class)
	@ResponseBody
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ResourceStandardError handlerException(InvalidOperationException ex) {

		ResourceStandardError error = new ResourceStandardError();
		error.setStatus(HttpStatus.BAD_REQUEST.value());
		error.setMessage(ex.getMessage());
		error.setTimeStamp(System.currentTimeMillis());
		return error;
	}

	@ExceptionHandler(Exception.class)
	@ResponseBody
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public ResourceStandardError authorization(Exception ex, HttpServletRequest request) {
		return new ResourceStandardError(HttpStatus.INTERNAL_SERVER_ERROR.value(), ex.getMessage(),
				System.currentTimeMillis());
	}
}
