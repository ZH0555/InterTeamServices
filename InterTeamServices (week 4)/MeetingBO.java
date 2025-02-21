import java.time.LocalDateTime;

public interface VenueMeetingsAPI {
    //Fetches a record of all upcoming meetings within the venue.
    ArrayList<Meeting> getUpcomingMeetings();


    /**
     * Creates a new meeting booking.
     *
     * @param meetingID  - The unique identifier for the meeting.
     * @param roomBooked - The room booked for the meeting.
     * @param attendees  - The number of attendees expected.
     * @param dateBooked - The date and time of the meeting.
     * @return - The created Meeting object.
     */
    Meeting createMeeting(String meetingID, String roomBooked, int attendees, Date dateBooked);
}

public class Meeting {
    private String meetingID;
    private String roomBooked;
    private int attendees;
    private LocalDateTime dateBooked;

    // Constructor
    public Meeting(String meetingID, String roomBooked, int attendees, LocalDateTime dateBooked) {
        this.meetingID = meetingID;
        this.roomBooked = roomBooked;
        this.attendees = attendees;
        this.dateBooked = dateBooked;
    }

    //.. (getter and setter methods)
}