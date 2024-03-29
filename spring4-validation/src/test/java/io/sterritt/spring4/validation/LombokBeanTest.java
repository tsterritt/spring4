package io.sterritt.spring4.validation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class LombokBeanTest {

    @Test
    public void testNullName() {
        LombokBean bean = new LombokBean();
        assertThrows(NullPointerException.class, () -> {bean.setName(null);});
    }

    @Test
    public void testEmptyAddress() {
        LombokBean bean = new LombokBean();
        assertThrows(IllegalArgumentException.class, () -> {bean.setAddress("");});
    }

}