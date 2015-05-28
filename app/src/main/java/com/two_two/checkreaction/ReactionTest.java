package com.two_two.checkreaction;
import java.util.Random;

/**
 * Created by DmitryBorodin on 25.05.2015.
 * This will hold publicly available constants and so on.
 */
public class ReactionTest {
    public static final String TAG = "myLogs";
    public static final int COMPLEXTRYTESTCOUNTER = 6;

    public enum testType {simpleTest, complexTryTest}
    public static testType currentTestType=testType.complexTryTest;

    static private Random random = new Random();
    static int getRandomTime(){
        return random.nextInt(5000) + random.nextInt(1000) + 500;
    }

}
