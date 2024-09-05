package org.example.lesson16;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class PaySectionBuilder {
    private String specialField;
    private String paymentSum;
}
