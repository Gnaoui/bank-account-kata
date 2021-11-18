package service;

import constants.Constant;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.TestInstance;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RunWith(MockitoJUnitRunner.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class DateFormatterTest {

    private DateFormatter dateFormatter;

    @Before
    public void initialise() {
        dateFormatter = new DateFormatter();
    }

    @Test
    public void format_local_date_time_to_string_test() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(Constant.DATETIME_FORMAT_PATTERN);
        Assertions.assertEquals(dateFormatter.dateAsString(), now.format(formatter));
    }
}
