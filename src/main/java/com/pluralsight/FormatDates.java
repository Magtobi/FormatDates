package com.pluralsight;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class FormatDates {
    public static void main(String[] args) {
        LocalDateTime currentDate = LocalDateTime.now();

        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("MMMM dd yyyy");
        DateTimeFormatter format4 = DateTimeFormatter.ofPattern("E, MMMM dd yyyy HH:mm");
        

        String formattedFormat1 = currentDate.format(format1);
        String formattedFormat2 = currentDate.format(format2);
        String formattedFormat3 = currentDate.format(format3);
        String formattedFormat4 = currentDate.format(format4);

        System.out.println("Today's date is: ");

        System.out.println(formattedFormat1);
        System.out.println(formattedFormat2);
        System.out.println(formattedFormat3);
        System.out.println(formattedFormat4);
    }
}
