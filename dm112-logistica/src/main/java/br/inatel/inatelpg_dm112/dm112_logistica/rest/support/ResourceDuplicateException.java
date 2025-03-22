package br.inatel.inatelpg_dm112.dm112_logistica.rest.support;

public class ResourceDuplicateException extends RuntimeException {

	private static final long serialVersionUID = -3151493885576933825L;

	public ResourceDuplicateException() {
	}

	public ResourceDuplicateException(String message) {
		super(message);
	}

	public ResourceDuplicateException(Throwable cause) {
		super(cause);
	}

	public ResourceDuplicateException(String message, Throwable cause) {
		super(message, cause);
	}

	public ResourceDuplicateException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
