package ${package};

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.reactivex.Single;

@Controller("/")
public class HelloController {

    @Get(produces = MediaType.TEXT_PLAIN)
    public Single<String> hello() {
        return Single.just("Hello!");
    }
}