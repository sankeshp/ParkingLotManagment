package models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class Payment {
    private int paymentId;
    private double amount;
    private PaymentMode paymentMode;
}
