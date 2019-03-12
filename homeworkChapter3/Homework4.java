package homeworkChapter3;

class Date {
	int day;
	int month;
	int year;

	Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	int getDay() {
		return day;
	}

	int getMonth() {
		return month;
	}

	int getYear() {
		return year;
	}

	void setDay(int day) {
		if (day <= 0 || day >= 32) {
			System.out.println("incorrect day input");
			return;
		}
		this.day = day;
	}

	void setMonth(int month) {
		if (month <= 0 || month >= 13) {
			System.out.println("incorrect month input");
			return;
		}
		this.month = month;
	}

	void setYear(int year) {
		this.year = year;
	}
}

public class Homework4 {

	public static void main(String[] args) {
		Date mine = new Date(15, 10, 1993);
		System.out.println(mine.getDay() + "/" + mine.getMonth() + "/" + mine.getYear());

		mine.setDay(0);
		mine.setMonth(0);
		mine.setYear(2021);

		System.out.println(mine.getDay() + "/" + mine.getMonth() + "/" + mine.getYear());
	}
}

//3.14	(Date Class) Create a class called Date that includes three instance variables—a month (type
//int), a day (type int) and a year (type int). Provide a constructor that initializes the three instance
//variables and assumes that the values provided are correct. Provide a set and a get method for each
//instance variable. Provide a method displayDate that displays the month, day and year separated
//by forward slashes (/). Write a test app named DateTest that demonstrates class Date’s capabilities. 
