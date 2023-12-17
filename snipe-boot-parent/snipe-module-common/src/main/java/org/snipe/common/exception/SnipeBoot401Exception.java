package org.snipe.common.exception;

/**
 * @Description: jeecg-boot自定义401异常
 * @author: jeecg-boot
 */
public class SnipeBoot401Exception extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public SnipeBoot401Exception(String message){
		super(message);
	}

	public SnipeBoot401Exception(Throwable cause)
	{
		super(cause);
	}

	public SnipeBoot401Exception(String message, Throwable cause)
	{
		super(message,cause);
	}
}
