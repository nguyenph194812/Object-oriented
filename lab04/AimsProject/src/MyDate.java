
public class MyDate {
	private String day;
	private String month;
	private String year;
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
	private MyDate date;
	public void print() {
		if(date.getDay() == "1"|| date.getDay() == "31" | date.getDay() == "21") 
			System.out.println(date.getMonth() + " " + date.getDay() + "st " + date.getYear() );
		else if(date.getDay() == "2"||date.getDay() == "22" )
			System.out.println(date.getMonth() + " " + date.getDay() + "nd " + date.getYear() );
		else if(date.getDay() == "3" ||date.getDay() == "23" )
			System.out.println(date.getMonth() + " " + date.getDay() + "rd " + date.getYear() );
		else
			System.out.println(date.getMonth() + " " + date.getDay() + "th " + date.getYear() );
	}
	
	
}
