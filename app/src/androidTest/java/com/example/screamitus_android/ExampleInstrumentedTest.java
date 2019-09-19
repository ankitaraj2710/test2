package com.example.screamitus_android;
import android.support.test.rule.ActivityTestRule;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.example.screamitus_android", appContext.getPackageName());
    }

    // name of the screen to start on
    @Rule
    public ActivityTestRule activityRule =
            new ActivityTestRule<>(MainActivity.class);
    // TC1: When the app loads, text box and button are visible,but result label is hidden
    @Test
    public void testTextBox() throws InterruptedException {
        // 1. find the button (button_main)

        onView(withId(R.id.AppCompat_Button)).check(matches(isVisible()));
        onView(withId(R.id.days_Text_Box)).check(matches(isVisible()));
        onView(withId(R.id.results_Label)).check(matches(isHidden()));


        Thread.sleep(5000);
        //TC2 when user add value and calculate , it displays correct number
        onView(withId(R.id.AppCpmpat_Button)).perform(click());
        onView(withId(R.id.AppCompat_Button)).check(matches(isDisplayed()));
        onView(withId(R.id.results_label)).check(matches(isDisplayed()));

        Thread.sleep(3000);


    }
