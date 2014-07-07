package util;

/**
 * 字符串处理工具类
 * 
 * @author Billy
 * 
 */
public class StringUtil
{

	/**
	 * 字符串trim判空
	 * 
	 * @param str
	 * @return 是否为空
	 */
	public static Boolean isNull(String str)
	{
		if(null != str) // 判空
		{
			if(!"".equals(str.trim())) // 判断空字符串
			{
				return Boolean.FALSE;
			}
			return Boolean.TRUE;
		}
		return Boolean.TRUE;
	}
}
