package com.tests;

import com.pages.ToolsSQAPracticeFormPageLinks;
import com.pages.ToolsSQAPracticeSwitchWindowsPage;
import org.testng.annotations.Test;

public class ToolsSQAPracticeSwitchWindowsPageTest {

    @Test
    public void newWindowTest(){
        ToolsSQAPracticeSwitchWindowsPage toolsSQAPracticeSwitchWindowsPage = new ToolsSQAPracticeSwitchWindowsPage();
        toolsSQAPracticeSwitchWindowsPage.opensAs("http://toolsqa.com/automation-practice-switch-windows/");
        toolsSQAPracticeSwitchWindowsPage.clickNewMessageWindow();

        toolsSQAPracticeSwitchWindowsPage.quitWebDriver();
    }

    @Test
    public void alertBoxTest(){
        ToolsSQAPracticeSwitchWindowsPage toolsSQAPracticeSwitchWindowsPage = new ToolsSQAPracticeSwitchWindowsPage();
        toolsSQAPracticeSwitchWindowsPage.opensAs("http://toolsqa.com/automation-practice-switch-windows/");
        toolsSQAPracticeSwitchWindowsPage.clickAlertBox();

        toolsSQAPracticeSwitchWindowsPage.quitWebDriver();
    }



}
