package io.sterritt.spring4.validation;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Set;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class HibernateBeanTest {


    private Validator validator;

     @Before
    public void setup() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Test
    public void testNullName() {
        HibernateBean bean = new HibernateBean();
        bean.setName(null);
        validator.validate(bean);
        Set<ConstraintViolation<HibernateBean>> violations = validator.validate(bean);
        violations.size();
        assertEquals(violations.isEmpty(), false);
    }

    @Test
    public void testEmptyAddress() {
        LombokBean bean = new LombokBean();
        assertThrows(IllegalArgumentException.class, () -> {bean.setAddress("");});
    }

}