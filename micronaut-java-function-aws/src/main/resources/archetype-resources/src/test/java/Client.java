package ${package};

import io.micronaut.function.client.FunctionClient;
import io.reactivex.Single;

import javax.inject.Named;

@FunctionClient
public interface Client {

    @Named("${artifactId}")
    Single<String> index();

}