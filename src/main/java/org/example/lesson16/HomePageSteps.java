package org.example.lesson16;

import lombok.Data;
import org.example.lesson16.HomePage;
import org.openqa.selenium.WebDriver;

@Data
public class HomePageSteps {
    private HomePage mtsPage;
    public static WebDriver driver;

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

    public void clickLink() {
        mtsPage.clickLink();
    }
}