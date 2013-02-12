package com.simplicityitself.koans.spring.waypoint1;

import com.simplicityitself.koans.spring.Repository;
import com.simplicityitself.koans.spring.SampleRepository;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import java.util.Map;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class ApplicationContextKoans {

    public void koan1CreateEmptyApplicationContext() {
        ApplicationContext applicationContext = null;

        assertNotNull("ApplicationContext is null. " +
                "Please create an empty ApplicationContext.", applicationContext);

        assertTrue("ApplicationContext should be of type" + "" +
                " org.springframework.context.support.GenericApplicationContext",
                applicationContext.getClass() == GenericApplicationContext.class);
    }

    public void koan2CreateARootBeanDefinition() {

        Class<SampleRepository> beanClass = SampleRepository.class;

        // Use BeanDefinitionBuilder to create a root bean definition based on the SampleRepository class
        BeanDefinitionBuilder builder = null;

        assertNotNull("BeanDefinitionBuilder is null. Please initialize with a root bean definition.",
                builder);

        assertTrue("Bean Definition should include the SampleRepository class",
                builder.getBeanDefinition().getBeanClass() == beanClass);
    }

    public void koan3AddASpringBeanProgrammaticallyToAnApplicationContextRetrievingByType() {
        GenericApplicationContext applicationContext = new GenericApplicationContext();

        BeanDefinitionBuilder builder = BeanDefinitionBuilder
                .rootBeanDefinition(SampleRepository.class);

        // Register the bean definition with the name 'repository' with the applicationContext

        Repository beanRetrievedByType = applicationContext.getBean(Repository.class);

        assertNotNull("Bean retrieved from the ApplicationContext should not be null", beanRetrievedByType);
    }

    public void koan4CreateApplicationContextWithValidBeansDocumentAndNoBeans() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("no-beans.xml");
        assertNotNull("ApplicationContext is null. Please create an ApplicationContext with no beans.", applicationContext);
    }

    public void testKoan5CreateApplicationContextWithOneBeanRetrievingByType() {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("single-bean.xml");

        Repository beanRetrievedByType = applicationContext.getBean(Repository.class);
        assertNotNull("Bean retrieved from the ApplicationContext should not be null",
                beanRetrievedByType);
    }

    public void koan6CreateApplicationContextWithTwoQualifyingBeansRetrievedByType() {

        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("two-bean.xml");

        // Deal with the fact that you may retrieve more than one bean that qualifies...
        // Use the getBeansOfType(Repository.class) method to retrieve a map of qualifying Spring Beans

        Map<String, Repository> beansRetrievedByType = null;

        assertNotNull("Beans retrieved from the ApplicationContext should not be null",
                beansRetrievedByType);

        assertTrue("Should have two beans of the Repository type in the ApplicationContext",
                beansRetrievedByType.size() == 2);

        assertNotNull("Should have a bean with an id of sampleBean1",
                beansRetrievedByType.get("sampleBean1"));

        assertNotNull("Should have a bean with an id of sampleBean2",
                beansRetrievedByType.get("sampleBean2"));
    }

    public void koan7CreateApplicationContextWithOneBeanRetrievingByName() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("single-bean.xml");

        // Use the applicationContext's getBean method, specifying the ID as a String
        Repository beanRetrievedByName = null;
        assertNotNull("Bean retrieved from the ApplicationContext should not be null", beanRetrievedByName);
    }

    public void koan75CreateApplicationContextWithOneBeanRetrievingByName() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("single-bean-complete.xml");

        // Use the applicationContext's getBean method, specifying the ID as a String AND the Repository class
        // to avoid having to cast the method's return object to Repository.
        Repository beanRetrievedByName = null;
        assertNotNull("Bean retrieved from the ApplicationContext should not be null", beanRetrievedByName);
    }
}
