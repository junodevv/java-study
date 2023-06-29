package chapter04;

import java.text.SimpleDateFormat;
import java.util.Date;
// ctrl + shft + o
public class DateTest {

	public static void main(String[] args) {

		// 지금 시간!!
		Date now = new Date();
		printDate01(now);
		printDate02(now);
	}
	
	public static void printDate01(Date d) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date = sdf.format(d);
		
		System.out.println(date);
	}
	
	public static void printDate02(Date d) {
		//년도 (+1900) y2k의 흔적
		int year = d.getYear();
		
		//월 0~11 (+1)
		int month = d.getMonth();
		
		//일
		int date = d.getDate();
		//시
		int hours = d.getHours();
		//분
		int minutes = d.getMinutes();
		//초
		int seconds = d.getSeconds();
		System.out.println(
				(year+1900) + "-"+
				(month+1)+"-" +
				date + " " +
				hours + ":" +
				minutes + ":" +
				seconds
				);
	}

}
