public class HelloWorldFromMars {
	
	public static void main(String [] args) {
		System.out.print("Hello World!");
		System.out.println(" How are you doing without me?");
	
System.out.print("This is Mark Watney checking in on \u1324 ");

   


        final int CURRENT_YEAR = 2020;

        double myVal = System.currentTimeMillis();

        int numLeapYearsSince1970 = (CURRENT_YEAR-1969) / 4;

        int numDaysFrom1970ToStartOfCurrentYear =

            365*(CURRENT_YEAR-1970) + numLeapYearsSince1970;

        int secondsAtStartOfCurrentYear =

            numDaysFrom1970ToStartOfCurrentYear * 24 * 60 * 60;

        int currentTimeSeconds =

            (int)(myVal/1000) - secondsAtStartOfCurrentYear;

        int currentTimeDays = currentTimeSeconds / (24 * 60 * 60);

        int secondsIntoToday = currentTimeSeconds %

            (currentTimeDays * 24 * 60 * 60);

        int hoursRightNow = secondsIntoToday / (60 * 60);

        int secondsIntoHour = secondsIntoToday -

            (hoursRightNow * 60 * 60);

        int minutesRightNow = secondsIntoHour / 60;

        int secondsRightNow = secondsIntoHour % 60;

        System.out.print("Day " + (currentTimeDays + 1) +

            " of " + CURRENT_YEAR + ", ");

        if (hoursRightNow < 10) {

            System.out.print("0");

        }
        int hoursRightNow2;
        if (hoursRightNow - 4 > 12) {
        	hoursRightNow2 = hoursRightNow - 16;
        	System.out.print(hoursRightNow2 + ":");
        	
        }
        else {
        	System.out.print(hoursRightNow-4 + ":");
        }

        if (minutesRightNow < 10) {

            System.out.print("0");

        }

        System.out.print(minutesRightNow + ":");

        if (secondsRightNow < 10) {

            System.out.print("0");

        }

        System.out.println(secondsRightNow + " EST");   
        System.out.println("P.S. How is the old earth doing? It seemed to be in rather rough shape when we lifted off, I can't imagine what it must be like now...");

    }
}
