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
       Month months[] = Month.values();

       public String toString() {
           for (Month item : months) {
               if (item.getAbbr() == getMonth())
                   return getDay() + " " + item + " " + getYear();
           }
           return null;
       }
       public void next (){
           if (getMonthLastDay(getMonth())!=getDay()){
               setDay(getDay()+1);
           }
           else {
               if (getMonthLastDay(getMonth())==getDay()&& getMonth()!=12 ){
                   setDay(1);
                   setMonth(getMonth()+1);
               }
               else {
                   setMonth(1);
                   setDay(1);
                   setYear(getYear()+1);
               }
           }
       }
       public int getDay() {
           return day;
       }

       public int getMonth() {
           return month;
       }

       public int getYear() {
           return year;
       }

       public void setDay(int day) {
           this.day = day;
       }

       public void setMonth(int month) {
           this.month = month;
       }

       public void setYear(int year) {
           this.year = year;
       }
       }
