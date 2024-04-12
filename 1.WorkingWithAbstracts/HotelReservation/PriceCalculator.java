package L_01_WorkingWithAbstracts.hotelReservation;

public class PriceCalculator {

    public static double calculateHolidayPrice(double pricePerDay, int numberOfDays, Season season, DiscountType discountType){
        //цената за всички дни
        double priceForAllDays = pricePerDay * numberOfDays;
        //увеличени спрямо сезона
        priceForAllDays = priceForAllDays * season.getMultiplyCoefficient();
        //отстъпка
        priceForAllDays = priceForAllDays - (priceForAllDays * (discountType.getPercent() / 100));

        return priceForAllDays;
    }
}
