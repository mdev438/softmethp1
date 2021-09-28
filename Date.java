package p1;

import java.util.StringTokenizer;
import java.util.Calendar;
	/**
     	* The Date class is used to change the dates into numbers in order to compare them.
     	* 
     	* The Date class holds methods in order to check the validity of the dates
     	* as well as check the hierarchy of the different dates within the album
     	* library in order to help us in comparison of the different dates
     	* @author Rohit Krishnan, Moses Devanesan
    	 */
public class Date implements Comparable<Date> {
	Calendar c;
	private int year;
	private int month;
	private int day;
	public static final int quadrennial = 4;
	public static final int centennial = 100;
	public static final int quartercentennial = 25;
	public static final int the_eightys = 1980;
	StringTokenizer splitter = null;
	int[] datearray = new int[3];
	/**
	 * Allows us to use the Album attributes from the Date class
	 * 
	 * 
	 * @return The year of the album
	 */
	public int getYear() {
		return year;
	}
	/**
	 * Sets the year
	 * 
	 * 
	 * 
	 */
	public void setYear(int year) {
		this.year = year;
	}
	/**
	 * Allows us to use the Album attributes from the Date class
	 * 
	 * 
	 * @return The month of the album
	 */
	public int getMonth() {
		return month;
	}
	/**
	 * Sets the month
	 * 
	 * 
	 * 
	 */
	public void setMonth(int month) {
		this.month = month;
	}
	/**
	 * Allows us to use the Album attributes from the Date class
	 * 
	 * 
	 * @return The day of the album
	 */
	public int getDay() {
		return day;
	}
	/**
	 * Sets the day
	 * 
	 * 
	 * 
	 */
	public void setDay(int day) {
		this.day = day;
	}

	/**
	 * Creates a date object from the user given date
	 * 
	 * @parameter the user given date
	 * @return The year of the album
	 */
	public Date(String date) {
		splitter = new StringTokenizer(date);

		for (int i = 0; i < datearray.length; i++) {
			datearray[i] = Integer.parseInt(splitter.nextToken("/"));
		}

		month = datearray[0];
		day = datearray[1];
		year = datearray[2];
	} // take “mm/dd/yyyy” and create a Date object
	/**
	 * Creates a date object from today's date
	 * 
	 * 
	 * 
	 */
	public Date() {
		year = Calendar.getInstance().get(Calendar.YEAR);
		month = Calendar.getInstance().get(Calendar.MONTH);
		day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
	} // create an object with today’s date (see Calendar class)

public boolean isValid() {



if (year<=2021 && year>=1980)
switch (month) {

case 1 : if (day>0 && day<31)
            return true;
         break;

case 2 : boolean leap = false;
        if (year%4==0) 
            if (year%100==0){
                if (year%400==0)
                    leap = true;
            }
            else leap = true;
        if (leap==true) {
            if (day>0 && day<30)
            return true;
        }
        else {if (day>0 && day<29)
            return true;
        else return false;}
        break;


case 3 : if (day>0 && day<=30)
            return true;
            break;
case 4 : if (day>0 && day<=31)
            return true;
            break;
case 5 : if (day>0 && day<=30)
            return true;
            break;
case 6: if (day>0 && day<=31)
            return true;
            break;

case 7: if (day>0 && day<=31)
            return true;
		break;
case 8: if (day>0 && day<=30)
            return true;
			break;
case 9: if (day>0 && day<=31)
            return true;
			break;
case 10: if (day>0 && day<=30)
            return true;
			break;
case 11: if (day>0 && day<=31)
            return true;
			break;
case 12: if (day>0 && day<=31)
            return true;
			break;

default :  System.out.println("Invalid Date!");
			return false;
			
		  
}

else return false;
return false;
}

	@Override
public int compareTo(Date date) {
    if (date.year>year)
        return -1;
    if (date.year<year)
        return 1;
    if (date.year==year){
        if (date.month>month)
            return -1;
        if (date.month<month) 
            return 1;
        if (date.month==month){
            if (date.day>day)
                return -1;
            if (date.day<day)
                return 1;
        }
    }
    return 0;
}
	
 public String toString() {
	 return getMonth()+ "/" + getDay() +"/" + getYear();
 }
 
}
