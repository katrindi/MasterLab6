package com.example.master_lab5;

import org.junit.Test;

import static org.junit.Assert.*;

import com.example.master_lab5.utils.TextCounter;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void Test01GetCharsCount(){
        String inputString = "abc";
        int expectedValue = 3;
        int actualValue = TextCounter.getCharsCount(inputString);
        assertEquals(expectedValue, actualValue);
    }

    @Test(expected = NullPointerException.class)
    public void Test02GetCharsCount(){
        String inputString = null;
        int expectedValue = -1;
        int actualValue = TextCounter.getCharsCount(inputString);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void Test03GetCharsCount(){
        String inputString = "";
        int expectedValue = 0;
        int actualValue = TextCounter.getCharsCount(inputString);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void Test04GetWordsCount(){
        String inputString = "LO d skddd kqqqq lororo";
        int expectedValue = 5;
        int actualValue = TextCounter.getWordsCount(inputString);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void Test05GetWordsCount(){
        String inputString = "How are you";
        int expectedValue = 3;
        int actualValue = TextCounter.getWordsCount(inputString);
        assertEquals(expectedValue, actualValue);
    }
}