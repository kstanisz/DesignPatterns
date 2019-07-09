package builder;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        FlightLeg flightLeg = new FlightLeg.FlightLegBuilder("Warsaw", "London")
                .price(new BigDecimal("152.50"))
                .build();

        System.out.println(flightLeg);
    }

}
