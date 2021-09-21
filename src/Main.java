
import java.util.Scanner;
                    public class Main {
                        public static void main(String[] args) {
                            Scanner scanner = new Scanner(System.in);
                            while (true) {
                                System.out.println("Enter a date\nEnter day :");
                                int day = scanner.nextInt();
                                System.out.println("Enter month:");
                                int month = scanner.nextInt();
                                System.out.println("Enter year:");
                                int year = scanner.nextInt();
                                MyDate myDate = new MyDate(day, month, year);
                                if (myDate.isValidDate(day, month, year)) {
                                    System.out.println("your date is valid");
                                    System.out.println(myDate.toString());
                                } else
                                    System.out.println("your date is not valid");
                                myDate.getMonthLastDay(month);
                            myDate.next();
                                System.out.println(myDate);
                            }

                        }
                    }
