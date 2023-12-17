package org.snipe.common.exception;

/**
 * @Description: jeecg-boot自定义SQL注入异常
 * @author: jeecg-boot
 */
public class SnipeSqlInjectionException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public SnipeSqlInjectionException(String message){
		super(message);
	}
	
	public SnipeSqlInjectionException(Throwable cause)
	{
		super(cause);
	}
	
	public SnipeSqlInjectionException(String message, Throwable cause)
	{
		super(message,cause);
	}
}
