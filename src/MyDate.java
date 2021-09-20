   public class MyDate {
    private int day, month, year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
           public boolean isValidDate(int day, int month, int year) {
               if (year > 0 && year < 9999) {
                   if (month >= 1 && month <= 6) {
                       if (day >= 1 && day <= 31)
                           return true;
                   } else if (month >= 7 && month <= 11) {
                       if (day >= 1 && day <= 30)
                           return true;
                   } else if (month == 12) {
                       if (day >= 1 && day <= 29)
                           return true;
                   }

               }
               return false;
           }

           public int getMonthLastDay(int month) {
               if (month >= 0 && month <= 6)
                   return 31;
               else if (month >= 7 && month <= 11)
                   return 30;
               else if (month == 12)
                   return 29;
               else
                   return -1;
           }


       }

