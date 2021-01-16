import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class TimeUtils {
	@OriginalMember(owner = "client!sj", name = "x", descriptor = "[Ljava/lang/String;")
	private static final String[] MONTHS = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!hn", name = "m", descriptor = "[Ljava/lang/String;")
	private static final String[] DAYS = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!jk", name = "o", descriptor = "Ljava/util/Calendar;")
	private static final Calendar gmtCalendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String formatHttpDate(@OriginalArg(0) long millis) {
		gmtCalendar.setTime(new Date(millis));
		@Pc(9) int day = gmtCalendar.get(Calendar.DAY_OF_WEEK);
		@Pc(17) int date = gmtCalendar.get(Calendar.DATE);
		@Pc(21) int month = gmtCalendar.get(Calendar.MONTH);
		@Pc(25) int year = gmtCalendar.get(Calendar.YEAR);
		@Pc(29) int hour = gmtCalendar.get(Calendar.HOUR_OF_DAY);
		@Pc(33) int min = gmtCalendar.get(Calendar.MINUTE);
		@Pc(37) int sec = gmtCalendar.get(Calendar.SECOND);
		return DAYS[day - 1] + ", " + date / 10 + date % 10 + "-" + MONTHS[month] + "-" + year + " " + hour / 10 + hour % 10 + ":" + min / 10 + min % 10 + ":" + sec / 10 + sec % 10 + " GMT";
	}
}
