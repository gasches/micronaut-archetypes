package ${package}

import io.micronaut.configuration.picocli.PicocliRunner
import io.micronaut.context.ApplicationContext
import io.micronaut.context.env.Environment

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.junit.jupiter.api.Assertions.*

import java.io.ByteArrayOutputStream
import java.io.PrintStream

object ApplicationTest : Spek({

    describe("${artifactId}") {
        val ctx = ApplicationContext.run(Environment.CLI, Environment.TEST)

        on("invocation with -v") {
            val baos = ByteArrayOutputStream()
            System.setOut(PrintStream(baos))

            val args = arrayOf("-v")
            PicocliRunner.run(Application::class.java, ctx, *args)

            it("should display greeting") {
                assertTrue(baos.toString().contains("Hi!"))
            }
        }

        on("other") {
            // add more tests...
        }
    }
})
