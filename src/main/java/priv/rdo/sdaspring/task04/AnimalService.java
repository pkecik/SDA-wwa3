package priv.rdo.sdaspring.task04;

import org.springframework.stereotype.Service;
import priv.rdo.sdaspring.task02.Animal;

@Service
public class AnimalService {

    public Animal findOne() {
        return new Animal("Azazel", 666);
    }
}
