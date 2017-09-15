package priv.rdo.sdaspring.task04

import priv.rdo.sdaspring.task02.Animal
import spock.lang.Specification

class AnimalServiceSpockTest extends Specification {
    AnimalService sut = new AnimalService()

    def "should find Azazel"() {
        when:
            Animal found = sut.findOne()

        then:
            found.age == 666
            found.name == "Azazel"
    }
}
