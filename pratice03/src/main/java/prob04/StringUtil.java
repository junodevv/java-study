package prob04;

public class StringUtil {
	
	public static String concatenate(String[] strArr) {
		// 문자열을 결합하여 리턴
		String result ="";
		for(int i = 0; i < strArr.length; i++) {
			result += strArr[i];
		}
		return result;
	}
}
