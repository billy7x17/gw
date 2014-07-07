package exception;

/**
 * 密码错误异常
 * 
 * @author Billy
 * 
 */
public class PasswordIncorrectException extends Exception
{
	private static final long serialVersionUID = -4845516202549216651L;

	public PasswordIncorrectException()
	{
		super("密码错误");
	}
}
