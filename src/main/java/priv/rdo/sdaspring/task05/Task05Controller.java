package priv.rdo.sdaspring.task05;

import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import priv.rdo.sdaspring.task02.Animal;

@RestController
public class Task05Controller {
    private final ApplicationContext ctx;

    public Task05Controller(ApplicationContext ctx) {
        this.ctx = ctx;
    }

    @GetMapping(value = "context")
    public String task04() {
        return "fafarafa";
    }
}
