public class APCalendar {
    private static boolean isLeapYear(int year)
    {
        return true;
    }
    public static int numberOfLeapYears(int year1, int year2)
    {
        int count = 0;
        for(int i=year1;i<=year2;i++)
        {
            if(isLeapYear(i))
                count++;
        }
        return count;
    }
    private static int firstDayOfYear(int year)
    {
        return 0;
    }
    private static int dayOfYear(int month, int day, int year)
    {
        return 0;
    }
    public static int dayOfWeek(int month, int day, int year)
    {
        int firstYearDay = firstDayOfYear(year);
        int yearDay = dayOfYear(month, day, year);
        //int startingDay = yearDay-firstYearDay;  132
        //startingDay%=7; 6
        return (firstYearDay+yearDay-1)%7;
    }

}
