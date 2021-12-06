package com.testjunit.test.core;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.GenericXmlWebContextLoader;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader = GenericXmlWebContextLoader.class,
        locations = "classpath:project-springapp-test.xml", initializers = com.wavemaker.runtime.security.DefaultBootStrapPropertySourceInitializer.class)
@WebAppConfiguration
public abstract class BaseTest {

}
