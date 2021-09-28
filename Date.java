import java.util.StringTokenizer;
import java.util.Calendar;
public class Date implements Comparable<Date> {
 Calendar c;
 private int year;
 private int month;
 private int day;
 public static final int quadrennial = 4;
 public static final int centennial = 100;
 public static final int quartercentennial = 25;
 public static final int the_eightys = 1980;
 StringTokenizer splitter = new StringTokenizer(]);
 int[] datearray = new int[3];
 public Date(String date) {
     splitter = (date);
     for (int i=0;i<datearray.lenth;i++) {
       datearray[i] = Integer.parseInt(splitter.nextToken("/")); 
     }
     month =datearray[0];
     day = datearray[1];
     year =datearray[2];
 } //take “mm/dd/yyyy” and create a Date object
 public Date() {
  c.getInstance();
  year = c.get(Calendar.YEAR);
  month = c.get(Calendar.MONTH);
  day = c.get(Calendar.DAY_OF_MONTH);
 } //create an object with today’s date (see Calendar class)
public boolean isValid() {



if (album.year< 2021) && (album.year>1980)
switch (album.month) {

case 1 : if (album.days>0) && album.days<31)
            return true;
        else return false;
         break;

case 2 : boolean leap = false;
        if (album.year%4==0) 
            if (album.year%100=0){
                if (album.year%400=0)
                    leap = true;
            }
            else leap = true;
        if (leap==true) {
            if (album.days>0) && album.days<30)
            return true;
        else return false;
        }
        else {if (album.days>0) && album.days<29)
            return true;
        else return false;}
        break;


case 3 : if (album.days>0) && album.days<=30)
            return true;
        else return false;
         break;
case 4 : if (album.days>0) && album.days<=31)
            return true;
        else return false;
         break;
case 5 : if (album.days>0) && album.days<=30)
            return true;
        else return false;
         break;
case 6: if (album.days>0) && album.days<=31)
            return true;
        else return false;
         break;

case 7: if (album.days>0) && album.days<=31)
            return true;
        else return false;
         break;
case 8: if (album.days>0) && album.days<=30)
            return true;
        else return false;
         break;
case 9: if (album.days>0) && album.days<=31)
            return true;
        else return false;
         break;
case 10: if (album.days>0) && album.days<=30)
            return true;
        else return false;
         break;
case 11: if (album.days>0) && album.days<=31)
            return true;
        else return false;
         break;
case 12: if (album.days>0) && album.days<=31)
            return true;
        else return false;
         break;






}
}
else return false;


 @Override
public int compareTo(Date date) {
    if (date.year>year)
        return true;
    if (date.year<year)
        return false;
    if (date.year==year){
        if (date.month>month)
            return true;
        if (date.month<month) 
            return false;
        if (date.month==month){
            if (date.day>day)
                return true;
            if (date.day<day)
                return false;
        }
    }
}
}
