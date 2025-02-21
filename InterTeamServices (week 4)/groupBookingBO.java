public interface groupBooking {
    //Returns the group bookings (for groups with more than 12)
    ArrayList<GroupBooking> getGroupBookings();

    /** Creates a new group booking
     * 
     * @param groupID - group booking ID
     * @param groupName - name of person who booking is under
     * @param ticketQuantity - number of tickets booked (min 12)
     * @param rowsHeld - number of rows held by the group booking
     */
    GroupBooking createGroupBooking(double groupID, String groupName, double ticketQuantity, double rowsHeld);
}

