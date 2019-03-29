package ${package};

import io.micronaut.configuration.picocli.PicocliRunner;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

@Command(name = "${artifactId}",
        description = "...",
        mixinStandardHelpOptions = true)
public class Application implements Runnable {

    @Option(names = {"-v", "--verbose"}, description = "...")
    boolean verbose;

    public static void main(String[] args) throws Exception {
        PicocliRunner.run(Application.class, args);
    }

    @Override
    public void run() {
        // business logic here
        if (verbose) {
            System.out.println("Hi!");
        }
    }
}
