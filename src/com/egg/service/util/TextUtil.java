package util;

/**
 * <b>Application describing: 文本操作类</b> <br>
 * <b>Copyright:</b>Copyright &copy; 2014 东软 移动互联网事业部版权所有。<br>
 * <b>Company:</b>Neusoft<br>
 * 
 * @author <a href="mailto:li-zr@neusoft.com">Zongrui.Li </a>
 * @version Revision 1.0 2014-5-12 下午05:05:36
 */
public class TextUtil {

	private static final int stringStandardlength = 15;// 自定义标准字符串长

	/**
	 * 字符串省略
	 * 
	 * @param str
	 * @return 指定长度的字符串 如果字符串本身长度超过指定长度，超过长度用...代替
	 */
	public static String stringEllipsis(String str) {
		if (null != str && str.length() > stringStandardlength)
			str = str.substring(0, stringStandardlength).concat("...");
		return null == str ? "" : str;
	}

	/**
	 * json字符串处理，以便于作为页面上标签属性显示
	 * 
	 * @param json
	 * @return 处理后的json字符串
	 */
	public static String jsonTranslate(String json) {

		if (null != json) {
			/* 单引号 */
			json = json.replace('\"', '\'');
			/* 标签 */
			json = json.replace("<", "&lt;");
			json = json.replace(">", "&gt;");
			json = json.replace(" ", "&nbsp;");
			json = json.replace("\n", "<br>");
			json = json.replace("&", "&amp;");
		}

		return json;
	}

}
