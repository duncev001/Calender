public class Calender {
    final static int FIRSTSUNDAYDAY = 2; //Date of the first sunday of the month
    final static int TOTALDAYS = 31; //total days in month

    public static void main(String[] args) {
        makeCalenderMonth(FIRSTSUNDAYDAY, TOTALDAYS);
    }

    public static void makeCalenderMonth(int sunday, int days) {
        //header and days of the week
        System.out.println("  Sun    Mon    Tue    Wed    Thu    Fri    Sat");
        System.out.println("+------+------+------+------+------+------+------+");
        int date = 1;

        //week 1
        System.out.print("|");
        int start;

        //converting first sunday to first weekday
        if(sunday==1){
            start = 1;
        }
        else if(sunday==2){
            start = 7;
        }
        else if(sunday==3){
            start = 6;
        }
        else if(sunday==4){
            start = 5;
        }
        else if(sunday==5){
            start = 4;
        }
        else if(sunday==6){
            start = 3;
        }
        else{
            start = 2;
        }

        //printing week 1
        for (int k = 1; k < (start); k++) {
            System.out.print("      |");
        }
        for (int k = 0; k < (8 - start); k++) {
            System.out.print("   " + date + "  |");
            date++;
        }

        //week 2
        System.out.print("\n|");
        for (int k = 0; k < 7; k++) {
            //for correct spacing
            if (date > 9) {
                System.out.print("  " + date + "  |");
            } else {
                System.out.print("   " + date + "  |");
            }
            date++;
        }

        //week 3
        System.out.print("\n|");
        for (int k = 0; k < 7; k++) {
            //for correct spacing
            if (date > 9) {
                System.out.print("  " + date + "  |");
            } else {
                System.out.print("   " + date + "  |");
            }
            date++;
        }

        //week 4
        int daysofweekleft = 7;
        System.out.print("\n|");
        while (date <= days) {
            System.out.print("  " + date + "  |");
            date++;
            daysofweekleft--;
            if (daysofweekleft == 0) {
                break;
            }
        }
        while (daysofweekleft > 0) {
            System.out.print("      |");
            daysofweekleft--;
        }

        //week 5
        daysofweekleft = 7;
        if (date < TOTALDAYS) {
            System.out.print("\n|");
            while (date <= days) {
                System.out.print("  " + date + "  |");
                date++;
                daysofweekleft--;
                if (daysofweekleft == 0) {
                    break;
                }
            }
            while (daysofweekleft > 0) {
                System.out.print("      |");
                daysofweekleft--; //printing out blanks to finish calender
            }
        }

        //week 6
        daysofweekleft = 7;
        if (date <= TOTALDAYS) {
            System.out.print("\n|");
            while (date <= days) {      //as to not print too many total days
                System.out.print("  " + date + "  |");
                date++;
                daysofweekleft--;
                if (daysofweekleft == 0) {
                    break;      //as to not print too many days in the week
                }
            }
            while (daysofweekleft > 0) {
                System.out.print("      |");
                daysofweekleft--; //printing out blanks to finish calender
            }
        }
        //closer
        System.out.println("\n+------+------+------+------+------+------+------+");
    }
}
