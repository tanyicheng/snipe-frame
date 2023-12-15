package org.snipe.common.exception;

/**
 * 自定义异常
 * @author created by barrett in 2023/12/15 10:51
 */
public class SnipeBootException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public SnipeBootException(String message){
		super(message);
	}
	
	public SnipeBootException(Throwable cause)
	{
		super(cause);
	}
	
	public SnipeBootException(String message, Throwable cause)
	{
		super(message,cause);
	}
}
