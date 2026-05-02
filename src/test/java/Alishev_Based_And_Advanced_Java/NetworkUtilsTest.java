package Alishev_Based_And_Advanced_Java;

import Alishev_Based_And_Advanced_Java.Advanced_Java.Part_07_TestingWithJUnit_037_039.NetworkUtils;
import org.junit.Test;

public class NetworkUtilsTest {
    @Test(timeout = 1000)
    public void getConnectionShouldReturnFasterThanOneSecond() {
        NetworkUtils.getConnection();
    }
}
