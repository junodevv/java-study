package prob03;

public class CurrencyConverter {
	private static double rate;
	
	
	public static void setRate(double r) {
		//환율 설정 (KRW/$1)
		rate = r;
	}

	public static double toDollar(double won) {
		// 한국 원화를 달러로 변환
		double result = won / rate;
		return result;
	}

	public static double toKRW(double dollar) {
		// 미국 달러를 원화로 변환
		double result = dollar * rate;
		return result;
	}
	
}
