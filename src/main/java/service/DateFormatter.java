package service;

import constants.Constant;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatter {

    /**
     * Fonction permettant de formater LocalDateTime (yyyy-MM-dd HH:mm) et le retourner format String
     * @return
     */
    public String dateAsString() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(Constant.DATETIME_FORMAT_PATTERN);
        return now.format(formatter);
    }
}
