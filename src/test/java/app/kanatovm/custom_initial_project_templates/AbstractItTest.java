package app.kanatovm.custom_initial_project_templates;

import org.junit.ClassRule;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.util.TestPropertyValues;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.testcontainers.containers.PostgreSQLContainer;

/**
 * AbstractItTest.
 *
 * @author Kanatov Marat
 * Date: 15.05.2023
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public abstract class AbstractItTest {

}
