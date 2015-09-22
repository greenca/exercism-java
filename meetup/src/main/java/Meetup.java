import org.joda.time.DateTime;

public class Meetup {

    private int month;
    private int year;

    public Meetup(int m, int y) {
        month = m;
        year = y;
    }

    public DateTime day(int day, MeetupSchedule type) {

        DateTime first;

        switch (type) {
            case LAST:
                first = new DateTime(year, month, 1, 0, 0).plusMonths(1);
                break;
            case TEENTH:
                first = new DateTime(year, month, 13, 0, 0);
                break;
            default:
                first = new DateTime(year, month, 1, 0, 0);
                break;
        }

        int interval = day - first.getDayOfWeek();
        if (interval < 0) {
            interval += 7;
        }
        switch (type) {
            case SECOND:
                interval += 7;
                break;
            case THIRD:
                interval += 14;
                break;
            case FOURTH:
                interval += 21;
                break;
            case LAST:
                interval -= 7;
                break;
        }

        return first.plusDays(interval);
    }

}
