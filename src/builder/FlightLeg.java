package builder;

import java.math.BigDecimal;

class FlightLeg {
    private String from;
    private String to;
    private boolean delayed;
    private BigDecimal price;

    private FlightLeg(FlightLegBuilder builder) {
        this.from = builder.from;
        this.to = builder.to;
        this.delayed = builder.delayed;
        this.price = builder.price;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public boolean isDelayed() {
        return delayed;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "FlightLeg{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", delayed=" + delayed +
                ", price=" + price +
                '}';
    }

    static class FlightLegBuilder {
        private String from;
        private String to;
        private boolean delayed;
        private BigDecimal price;

        FlightLegBuilder(String from, String to) {
            this.from = from;
            this.to = to;
        }

        FlightLegBuilder delayed(boolean delayed) {
            this.delayed = delayed;
            return this;
        }

        FlightLegBuilder price(BigDecimal price) {
            this.price = price;
            return this;
        }

        public FlightLeg build() {
            return new FlightLeg(this);
        }
    }
}
