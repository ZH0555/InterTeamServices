import java.util.List;
import java.util.Map;

public interface engagementInterfaceO {
    //Fetches customer preferences for seating, i.e. seat type, location
    Map<String, String> getSeatingPreferences(String customerID);

    //Fetches customer event attendance history
    List<String> getCustomerAttendance(String customerID);

    //Fetches a specific customer's feedbacks/ratings for previous events attended
    Map<String, Integer> getPreviousFeedback(String customerID);

    //Fetches a customer's interaction data (i.e. frequency of attendance, engagement levels)
    Map<String, String> getCustomerInteractionData(String customerID);
}
