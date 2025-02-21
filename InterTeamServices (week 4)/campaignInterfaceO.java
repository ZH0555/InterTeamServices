import java.util.List;
import java.time.LocalDateTime;

public interface campaignInterfaceO {
    //Fetches a list of active promotions currently happening
    List<activePromotion> getActivePromotions();
    //Fetches a specific promotion by ID
    activePromotion getPromotionByID(String promotionID);
    //Calculates the revenue impact of an active promotion
    double revenueImpact(String promotionID);
}

