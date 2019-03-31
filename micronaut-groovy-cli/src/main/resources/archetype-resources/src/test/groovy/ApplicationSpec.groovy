package ${package}

import io.micronaut.configuration.picocli.PicocliRunner
import io.micronaut.context.ApplicationContext
import io.micronaut.context.env.Environment

import spock.lang.AutoCleanup
import spock.lang.Shared
import spock.lang.Specification

class ApplicationCommandSpec extends Specification {

    @Shared
    @AutoCleanup
    ApplicationContext ctx = ApplicationContext.run(Environment.CLI, Environment.TEST)

    void "test ${artifactId} with command line option"() {
        given:
            ByteArrayOutputStream baos = new ByteArrayOutputStream()
            System.setOut(new PrintStream(baos))

            String[] args = ['-v'] as String[]
            PicocliRunner.run(Application, ctx, args)

        expect:
            baos.toString().contains('Hi!')
    }
}
