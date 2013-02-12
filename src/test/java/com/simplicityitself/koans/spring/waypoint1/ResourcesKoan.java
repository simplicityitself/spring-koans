package com.simplicityitself.koans.spring.waypoint1;

import com.simplicityitself.koans.spring.Repository;
import com.simplicityitself.koans.spring.Service;
import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ResourcesKoan extends TestCase {

    public void testApplicationContextFromNonClasspathFile() {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext();
        TestCase.assertNotNull("Please create an ApplicationContext from the 'multi-file-context-repository.xml' file, which is not on the classpath", applicationContext.getBean("multiRepository", Repository.class));
    }

    public void testApplicationContextFromMultipleFiles() {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("chapter-1-introduction/src/test/resources/multi-file-context-service.xml");
        TestCase.assertNotNull("Please create an ApplicationContext from the 2 files: 'multi-file-context-repository.xml' and 'src/test/resources/multi-file-context-service.xml'", applicationContext.getBean("multiService", Service.class));
    }

    public void testApplicationContextFromFileSystemAndClassPath() {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("chapter-1-introduction/src/test/not-on-classpath/multi-file-context-repository.xml", "classpath:");
        assertNotNull("Please create an ApplicationContext from the 2 files: 'multi-file-context-repository.xml' and 'src/test/resources/multi-file-context-service.xml', using the 'classpath:' prefix for the second one", applicationContext.getBean("multiService", Service.class));
    }

    public void testApplicationContextFromClassPathAndFileSystem() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("file:", "multi-file-context-service.xml");
        assertNotNull("Please create an ApplicationContext from the 2 files: 'multi-file-context-repository.xml' and 'src/test/resources/multi-file-context-service.xml', using the 'file:' prefix for the first one", applicationContext.getBean("multiService", Service.class));
    }

    public void testApplicationContextUsingWildcards() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext();
        assertNotNull("Please create an ApplicationContext from all the files with names ending with '-wildcard-context.xml'", applicationContext.getBean("wildService", Service.class));
    }
}
