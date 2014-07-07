package exception;

/**
 * 用户名或邮箱不存在异常
 * 
 * @author Billy
 * 
 */
public class UserNameNotExistException extends Exception
{
	private static final long serialVersionUID = 944883003156430358L;

	public UserNameNotExistException()
	{
		super("用户名或邮箱不存在");
	}
}
