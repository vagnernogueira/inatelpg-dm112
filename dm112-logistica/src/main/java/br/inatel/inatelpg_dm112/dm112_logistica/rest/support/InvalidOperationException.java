package br.inatel.inatelpg_dm112.dm112_logistica.rest.support;

public class InvalidOperationException extends RuntimeException {

	private static final long serialVersionUID = 2395990166903658498L;

	public InvalidOperationException() {
	}

	public InvalidOperationException(String message) {
		super(message);
	}

	public InvalidOperationException(Throwable cause) {
		super(cause);
	}

	public InvalidOperationException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidOperationException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
