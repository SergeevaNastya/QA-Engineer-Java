package org.example.lesson16;

import lombok.Data;
import org.example.lesson16.HomePage;

@Data
public class HomePageSteps {
    private HomePage mtsPage;

    public HomePageSteps(HomePage mtsPage) {
        this.mtsPage = mtsPage;
    }

    public void fillPaymentSection(PaySectionBuilder builder) {
        mtsPage.fillPhoneField(builder.getSpecialField());
        mtsPage.fillSumField(builder.getPaymentSum());
    }

    public void clickContinueButton() {
        mtsPage.clickButton();
    }
}
