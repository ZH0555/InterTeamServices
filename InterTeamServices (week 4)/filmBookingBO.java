import java.time.LocalDateTime;

public interface upcomingBookingsBO {
    ArrayList<filmBooking> getUpcomingBookings();
}

public class filmBooking {
    private double showID;
    private String showTitle;
    private LocalDateTime showDate;
    private LocalDateTime showTime;
    private double roomID;

    public filmBooking(double id, String title, LocalDateTime date, LocalDateTime time, double room) {
        this.showID = id;
        this.showTitle = title;
        this.showDate = date;
        this.showTime = time;
        this.roomID = room;
    }

    //... (getter and setter methods here)

    //Returns all of the object's fields, not individual fields
    public String filmInfo() {
        return "Film booking {" +
               "Film ID: " + showID + '\'' +
               ", Film title: " + showTitle + '\'' +
               ", Film date: " + showDate + '\'' +
               ", Film time: " + showTime + '\'' +
               ", Film room: " + roomID + '\'' +
               '}';
    }
}
