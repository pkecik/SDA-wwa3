package priv.rdo.sdaspring.task02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_XML_VALUE;

@RestController
public class Task02Controller {
    @GetMapping("task02")
    public Animal task02() {
        return new Animal("Azor", 666);
    }

    @GetMapping(value = "task02.1", produces = APPLICATION_XML_VALUE)
    public Animal task02_1() {
        return new Animal("Azor", 666);
    }
}
