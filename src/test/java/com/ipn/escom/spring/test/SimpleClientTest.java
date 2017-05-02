package com.ipn.escom.spring.test;

import com.ipn.escom.spring.model.Customer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleClientTest {

    private static final Logger logger = LoggerFactory.getLogger(SimpleClientTest.class);

    public void readOneTegraLog(String id) {
        if (id == null) {
            logger.debug("Element " + id + " was not found");
        }
        logger.debug("reading one code " + id);
    }

    public SimpleClientTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

}
