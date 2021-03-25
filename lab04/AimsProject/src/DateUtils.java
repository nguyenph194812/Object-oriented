
public class DateUtils {
	private static void ChangeMonth(MyDate date) {
		if(date.getMonth().toLowerCase() == "jan" || date.getMonth().toLowerCase() == "january") date.setMonth("1");
		if(date.getMonth().toLowerCase() == "feb" || date.getMonth().toLowerCase() == "february") date.setMonth("2");
		if(date.getMonth().toLowerCase() == "mar" || date.getMonth().toLowerCase() == "march") date.setMonth("3");
		if(date.getMonth().toLowerCase() == "apr" || date.getMonth().toLowerCase() == "april") date.setMonth("4");
		if(date.getMonth().toLowerCase() == "may" || date.getMonth().toLowerCase() == "may") date.setMonth("5");
		if(date.getMonth().toLowerCase() == "jun" || date.getMonth().toLowerCase() == "june") date.setMonth("6");
		if(date.getMonth().toLowerCase() == "jul" || date.getMonth().toLowerCase() == "july") date.setMonth("7");
		if(date.getMonth().toLowerCase() == "aug" || date.getMonth().toLowerCase() == "august") date.setMonth("8");
		if(date.getMonth().toLowerCase() == "sep" || date.getMonth().toLowerCase() == "september") date.setMonth("9");
		if(date.getMonth().toLowerCase() == "oct" || date.getMonth().toLowerCase() == "october") date.setMonth("10");
		if(date.getMonth().toLowerCase() == "nov" || date.getMonth().toLowerCase() == "november") date.setMonth("11");
		if(date.getMonth().toLowerCase() == "dec" || date.getMonth().toLowerCase() == "december") date.setMonth("12");
		
	}
	public static int CompareDate(MyDate date1, MyDate date2) {
		int day1 = Integer.parseInt(date1.getDay());
		int year1 = Integer.parseInt(date1.getYear());
		int day2 = Integer.parseInt(date2.getDay());
		int year2 = Integer.parseInt(date2.getYear());
		ChangeMonth(date1);
		ChangeMonth(date2);		
		int month1 = Integer.parseInt(date1.getMonth());
		int month2 = Integer.parseInt(date2.getMonth());
		if(year1 > year2) return 1;
		else if (year1 < year2) return -1;
		else if (year1 == year2) {
			if(month1 > month2) return 1;
			else if(month1 < month2) return -1;
			else if(month1 == month2) {
				if(day1 > day2) return 1;
				else if (day1 < day2) return -1;
			}
		}
		return 0;
	}
	public static void SortDate(MyDate[] array) {
		MyDate temp;
		for(int i=0; i < array.length; i++) {
			for(int j = 1 ; j < array.length - i; j++) {
				if(CompareDate(array[j], array[j-1]) == -1) {
					temp = array[j-1];
					array[j-1] = array[j];
					array[j] = temp;
				}
			}
		}
	}
}
