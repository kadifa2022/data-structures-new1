package co.cydeo.lab13_commerce_project.discount;

import java.util.UUID;

public class RateBaseDiscount extends Discount{
    private Double rateDiscount;

    public RateBaseDiscount(UUID id, String name, Double thresholdAmount, Double rateDiscount) {
        super(id, name, thresholdAmount);
        this.rateDiscount = rateDiscount;
    }

    @Override
    public Double calculateCartAmountAfterDiscountApplied(Double amount) {
        return null;
    }

    public Double getRateDiscount() {
        return rateDiscount;
    }
}
