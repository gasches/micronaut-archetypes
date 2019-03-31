package ${package};

import io.micronaut.function.executor.FunctionInitializer;
import javax.inject.Inject;
import javax.inject.Singleton;
import java.io.IOException;

@Singleton
public class Function extends FunctionInitializer {

    public Message execute(Message msg) {
        return msg;
    }

    /**
     * This main method allows running the function as a CLI application using: {@code echo '{}' | java -jar ${artifactId}.jar}
     * where the argument to echo is the JSON to be parsed.
     */
    public static void main(String...args) throws IOException {
        Function function = new Function();
        function.run(args, context -> function.execute(context.get(Message.class)));
    }
}