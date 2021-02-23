
package Useful;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class JavaUseful {
    
    public static String convertDate(String dateGiven) {
        // from -> "October 05 2020" to "05-10-2020";
        String dateInDatePickerFormat = "";
        String[] dateArray = dateGiven.split(" ");
        
        String day = dateArray[1];
        String year = dateArray[2];
        String monthName = dateArray[0];
        String month = "";
        
        if (monthName.equals("January")) {
            month = "01";
        } else if (monthName.equals("February")) {
            month = "02";
        } else if (monthName.equals("March")) {
            month = "03";
        } else if (monthName.equals("April")) {
            month = "04";
        } else if (monthName.equals("May")) {
            month = "05";
        } else if (monthName.equals("June")) {
            month = "06";
        } else if (monthName.equals("July")) {
            month = "07";
        } else if (monthName.equals("August")) {
            month = "08";
        } else if (monthName.equals("September")) {
            month = "09";
        } else if (monthName.equals("October")) {
            month = "10";
        } else if (monthName.equals("November")) {
            month = "11";
        } else if (monthName.equals("December")) {
            month = "12";
        }
        
        dateInDatePickerFormat = day + "-" + month + "-" + year;
        
        return dateInDatePickerFormat;
    }
    
    public static String getDateFormatForDatabase(String date) {
        String dateInDatabaseFormat = "";
        String[] dateArray = date.split("-");
        
        String monthNumber = dateArray[1];
        String month = "";
        String day = dateArray[2];
        String year = dateArray[0];
        
        if (monthNumber.equals("01")) {
            month = "January";
        } else if (monthNumber.equals("02")) {
            month = "February";
        } else if (monthNumber.equals("03")) {
            month = "March";
        } else if (monthNumber.equals("04")) {
            month = "April";
        } else if (monthNumber.equals("05")) {
            month = "May";
        } else if (monthNumber.equals("06")) {
            month = "June";
        } else if (monthNumber.equals("07")) {
            month = "July";
        } else if (monthNumber.equals("08")) {
            month = "August";
        } else if (monthNumber.equals("09")) {
            month = "September";
        } else if (monthNumber.equals("10")) {
            month = "October";
        } else if (monthNumber.equals("11")) {
            month = "November";
        } else if (monthNumber.equals("12")) {
            month = "December";
        }
        
        dateInDatabaseFormat = month + " " + day + " " + year;
        
        return dateInDatabaseFormat;
    }
    
    public static String getCurrentDate() {
        //DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime now = LocalDateTime.now();  
        // System.out.println(dtf.format(now));  // 2020/09/21 22:45:58
        return dtf.format(now);
    }
    
    public static String[] date(String date) {
        String[] words = date.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("[^\\w]", "");
            // System.out.println(words[i]);
        }
        return words;
    }
    
    public static int compareDates(String date01[], String date02[]) throws ParseException {
        
        LocalDate dateBefore = LocalDate.of(2020, Month.JULY, 01);
        LocalDate dateAfter = LocalDate.of(2020, Month.JULY, 01);
        
        // date01 -> 2020 09 21
        // date02 -> November 11 2020
        
        int date01Year = Integer.parseInt(date01[0]);
        int date01Day = Integer.parseInt(date01[2]);
        
        int date02Year = Integer.parseInt(date02[2]);
        int date02Day = Integer.parseInt(date02[1]);
        
        if (date01[1].equals("01")) {
            dateBefore = LocalDate.of(date01Year, Month.JANUARY, date01Day);
        } else if (date01[1].equals("02")) {
            dateBefore = LocalDate.of(date01Year, Month.FEBRUARY, date01Day);
        } else if (date01[1].equals("03")) {
            dateBefore = LocalDate.of(date01Year, Month.MARCH, date01Day);
        } else if (date01[1].equals("04")) {
            dateBefore = LocalDate.of(date01Year, Month.APRIL, date01Day);
        } else if (date01[1].equals("05")) {
            dateBefore = LocalDate.of(date01Year, Month.MAY, date01Day);
        } else if (date01[1].equals("06")) {
            dateBefore = LocalDate.of(date01Year, Month.JUNE, date01Day);
        } else if (date01[1].equals("07")) {
            dateBefore = LocalDate.of(date01Year, Month.JULY, date01Day);
        } else if (date01[1].equals("08")) {
            dateBefore = LocalDate.of(date01Year, Month.AUGUST, date01Day);
        } else if (date01[1].equals("09")) {
            dateBefore = LocalDate.of(date01Year, Month.SEPTEMBER, date01Day);
        } else if (date01[1].equals("10")) {
            dateBefore = LocalDate.of(date01Year, Month.OCTOBER, date01Day);
        } else if (date01[1].equals("11")) {
            dateBefore = LocalDate.of(date01Year, Month.NOVEMBER, date01Day);
        } else if (date01[1].equals("12")) {
            dateBefore = LocalDate.of(date01Year, Month.DECEMBER, date01Day);
        }
        
        if (date02[0].equals("January")) {
            dateAfter = LocalDate.of(date02Year, Month.JANUARY, date02Day);
        } else if (date02[0].equals("February")) {
            dateAfter = LocalDate.of(date02Year, Month.FEBRUARY, date02Day);
        } else if (date02[0].equals("March")) {
            dateAfter = LocalDate.of(date02Year, Month.MARCH, date02Day);
        } else if (date02[0].equals("April")) {
            dateAfter = LocalDate.of(date02Year, Month.APRIL, date02Day);
        } else if (date02[0].equals("May")) {
            dateAfter = LocalDate.of(date02Year, Month.MAY, date02Day);
        } else if (date02[0].equals("June")) {
            dateAfter = LocalDate.of(date02Year, Month.JUNE, date02Day);
        } else if (date02[0].equals("July")) {
            dateAfter = LocalDate.of(date02Year, Month.JULY, date02Day);
        } else if (date02[0].equals("August")) {
            dateAfter = LocalDate.of(date02Year, Month.AUGUST, date02Day);
        } else if (date02[0].equals("September")) {
            dateAfter = LocalDate.of(date02Year, Month.SEPTEMBER, date02Day);
        } else if (date02[0].equals("October")) {
            dateAfter = LocalDate.of(date02Year, Month.OCTOBER, date02Day);
        } else if (date02[0].equals("November")) {
            dateAfter = LocalDate.of(date02Year, Month.NOVEMBER, date02Day);
        } else if (date02[0].equals("December")) {
            dateAfter = LocalDate.of(date02Year, Month.DECEMBER, date02Day);
        }
        
        
	int noOfDaysBetween = (int) ChronoUnit.DAYS.between(dateBefore, dateAfter);
        
        return noOfDaysBetween;
        
    }
    
}
