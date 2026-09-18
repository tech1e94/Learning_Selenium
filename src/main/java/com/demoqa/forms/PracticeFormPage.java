package com.demoqa.forms;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class PracticeFormPage extends FormsPage {
    private By maleRadioButton = By.id("gender-radio-1");

    public void clickMaleRadioButton() {
        scrollToElementJS(maleRadioButton);
        click(maleRadioButton);
    }
}
