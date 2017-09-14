package priv.rdo.sdaspring.task02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.http.MediaType.APPLICATION_XML_VALUE;

@RestController
public class Task02Controller {
    @GetMapping(value = "task02", produces = APPLICATION_JSON_VALUE)
    public Animal task02() {
        return new Animal("Azor", 666);
    }

    @GetMapping(value = "task02.1", produces = APPLICATION_XML_VALUE)
    public Animal task02_1() {
        return new Animal("Azor", 666);
    }

    @GetMapping(value = "task02_2")
    public Animal task02_2() {
        return new Animal("Azor", 666);
    }
}
