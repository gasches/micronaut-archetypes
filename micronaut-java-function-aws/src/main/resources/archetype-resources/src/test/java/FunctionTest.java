package ${package};

import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest
public class FunctionTest {

    @Inject
    Client client;

//    @Test
    public void testFunction() throws Exception {
        assertEquals(client.index().blockingGet(), "${artifactId}");
    }
}
