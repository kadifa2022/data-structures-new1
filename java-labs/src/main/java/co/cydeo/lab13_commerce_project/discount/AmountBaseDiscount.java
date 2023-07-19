package co.cydeo.lab13_commerce_project.discount;

import java.util.UUID;

public class AmountBaseDiscount extends Discount{

    private Double discountAmount;

    public AmountBaseDiscount(UUID id, String name, Double thresholdAmount, Double discountAmount) {
        super(id, name, thresholdAmount);
        this.discountAmount = discountAmount;
    }

    @Override
    public Double calculateCartAmountAfterDiscountApplied(Double amount) {
        return null;
    }

    public Double getDiscountAmount() {
        return discountAmount;
    }
}
