package com.simplicityitself.koans.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class ApplicationContextKoans {

    public static void koan1CreateEmptyApplicationContext() {
        ApplicationContext applicationContext = null;

        assertNotNull("ApplicationContext is null. " +
                "Please create an empty ApplicationContext.", applicationContext);

        assertTrue("ApplicationContext should be of type" + "" +
                " org.springframework.context.support.GenericApplicationContext",
                applicationContext.getClass() == GenericApplicationContext.class);
    }
}
