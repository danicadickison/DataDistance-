public class DateDistance {

    /**
     * Returns whether the given year is a leap year.
     */
    public static boolean isLeapYear ( long year ) {
        if (year % 4 == 0 && year % 100 != 0 && year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Returns the number of days in the given month in the given year.
     */
    public static long daysInMonth ( long month, long year ) {
        long days = 0;
        boolean isLeapYear = isLeapYear(year);

        switch ((int)month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                    break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                    break;
            case 2: if (isLeapYear) {
                       days = 29;
                    } else {
                       days = 28;
                    }
                    break;
            default: days = 0
                    break;
        }
      return days
    }

    /**
     * Returns whether the given date is a valid date.
     */
    public static boolean isValidDate ( long day, long month, long year ) {
        if ( month < 1 || month > 12 ) {
            System.out.println("Please imput a valid month");
            return false;
        } else if ( day < 1 || day > daysInMonth(month) ) {
            System.out.println("Please imput a valid day");
            return false;
        } else if ( year < 0 ) {
            System.out.println("Please imput a valid year");
            return false;
        } else {
            return true;
        }
    }

    /**
     * Returns the number of days between the two provided dates, regardless of
     * the order they were provided.
     */
    public static long daysBetween ( long day0, long month0, long year0,
            long day1, long month1, long year1 ) {
        days = 0
        boolean isLeapYear = isLeapYear(year);

        for (long i = year0 + 1; i < year1; i++) {
            if (!isLeapYear(i)) {
                days += 365;
            } else {
                days += 366;
            }

        for (long j = month0 + 1; j < month1; j++) {
            days + (daysInMonth(month))
        }
            days + day0 + day1
        }
            return days
    }


    /**
     * Returns the day of the week the given date occured on as a String.
     */
    public static String dayOfTheWeek ( long day, long month, long year ) {
        return ""; // TODO: Finish this method!
    }

    /**
     * Returns the long form of the given date as a String.
     */
    public static String longformDate ( long day, long month, long year ) {
        return ""; // TODO: Finish this method!
    }

    public static void main ( String[] args ) {

    }
}
