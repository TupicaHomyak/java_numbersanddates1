package practice;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Birthdays {
    public static void main(String[] args) {
        int day = 15;
        int month = 5;
        int year = 1992;
        System.out.println(collectBirthdays(year, month, day));
    }
    public static String collectBirthdays(int year, int month, int day) {

        LocalDate birthday = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();
        int count = 0;
        String text = "";
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd.MM.yyyy - E", Locale.ENGLISH);

        while ((birthday.isBefore(today))||(birthday.isEqual(today))){
            text = text + count + " - " + formatter1.format(birthday) + "\n";
            birthday = birthday.plusYears(1);
            count++;
        }
        return text;
    }
}