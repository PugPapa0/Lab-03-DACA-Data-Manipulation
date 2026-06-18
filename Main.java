// STUDENT NAME: Travis Becker
// DATE: 6/18/2026

public class Main 
{
  public static int julianDayNumber(int year, int month, int day) {
      int a = (14 - month) / 12;
      int y = year + 4000 - a;
      int m = month + 12 * a - 3;

      int jdn = day
              + (153 * m + 2) / 5
              + 365 * y
              + y / 4
              - y / 100
              + y / 400
              - 32045;
      return jdn;
  }

  public static void main(String[] args) {

      int todayMonth = 2;
      int todayDay = 2;
      int todayYear = 2020;

      int birthMonth = 8;
      int birthDay = 26;
      int birthYear = 1918;

		
		/***** INPUT SECTION *****/
		// N/A (no input for this lab)
		
		/***** CALCULATION & PROCESSING SECTION *****/
      int jdnToday = julianDayNumber(todayYear, todayMonth, todayDay);
      int jdnBirth = julianDayNumber(birthYear, birthMonth, birthDay);

      int diff = jdnToday - jdnBirth;
      int approxYears = diff / 365; // whole years

		
		/***** OUTPUT SECTION *****/
      System.out.println("Julian Day Number for today's date, 2/2/2020, is " + jdnToday);
      System.out.println();
      System.out.println("Julian Day Number for birthday, 8/26/1918 is " + jdnBirth);
      System.out.println();
      System.out.println("The difference in days is " + diff + ", which makes you approximately " + approxYears + " years old!");
  }
}