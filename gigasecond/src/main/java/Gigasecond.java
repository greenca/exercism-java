import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Gigasecond {

    private LocalDateTime anniversary;

    public Gigasecond(LocalDate birthday) {
        anniversary = LocalDateTime.from(birthday.atStartOfDay()).plus(1000000000, ChronoUnit.SECONDS);
    }

    public Gigasecond(LocalDateTime birthday) {
        anniversary = birthday.plus(1000000000, ChronoUnit.SECONDS);
    }

    public LocalDateTime getDate() {
        return anniversary;
    }
}
