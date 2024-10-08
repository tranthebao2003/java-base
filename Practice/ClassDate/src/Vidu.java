import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

//không sử dụng java.until.Date vì lỗi thời rồi
public class Vidu {
	public static void main(String[] args) {
//		lấy ra thời gian hiện tại ms tính từ
//		1-1-1970. timestamp ấy
		long t1 = System.currentTimeMillis();
		System.out.println(t1);

//		time unit
//		chuyển từ DAY sang HOURS
		System.out.println(TimeUnit.DAYS.toHours(2));
//		tương tự nếu chuyển ngược lại thì nó lấy phần
//		nguyên thôi
		System.out.println(TimeUnit.HOURS.toDays(45));
		
//		Date
		Date d = new Date(System.currentTimeMillis());
		System.out.println(d);
//		month + 1 vì bắt đầu từ 0, năm + 1900
		System.out.println(d.getDate()+"/"+(d.getMonth()+1)+"/"+(d.getYear()+1900));
		
		
//		calendar
		Calendar c = Calendar.getInstance();
//		month vẫn phải + 1 nhưng xài này ok hơn Date
		System.out.println(c.get(Calendar.DATE)+"-"+(c.get(Calendar.MONTH)+1)+"-"+c.get(Calendar.YEAR));
		
//		thay đổi giờ
		c.add(Calendar.HOUR, 30);
		System.out.println(c.get(Calendar.DATE)+"-"+(c.get(Calendar.MONTH)+1)+"-"+c.get(Calendar.YEAR));
		
//		thay đổi ngày
		c.add(Calendar.DATE, 5);
		System.out.println(c.get(Calendar.DATE)+"-"+(c.get(Calendar.MONTH)+1)+"-"+c.get(Calendar.YEAR));
		
//		Date format
		DateFormat df = new SimpleDateFormat();
//		chỉ xài được cho kiểu Date
		System.out.println("format default: " + df.format(d));
		
//		làm 1 format khác
		df = new SimpleDateFormat("dd-MM-yyyy H:m:s");
		System.out.println("format default: " + df.format(d));
	}
}
