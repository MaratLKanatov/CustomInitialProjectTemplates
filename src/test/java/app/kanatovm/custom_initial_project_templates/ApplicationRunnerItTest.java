package app.kanatovm.custom_initial_project_templates;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

/**
 * ApplicationRunnerItTest.
 *
 * @author Kanatov Marat
 * Date: 15.05.2023
 */
public class ApplicationRunnerItTest extends AbstractItTest {

    @Autowired
    private ApplicationContext context;

    @Test
    public void systemLoadingSuccessfulTest() {
        Assertions.assertNotNull(context, "Context is null");
        System.out.println("Context created!");
    }
}
