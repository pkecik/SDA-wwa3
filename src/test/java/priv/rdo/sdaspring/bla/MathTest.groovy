package priv.rdo.sdaspring.bla

import spock.lang.Specification
import spock.lang.Unroll

class MathTest extends Specification {

    @Unroll
    def "maximum of two numbers a = #a, b = #b, c = #c"(int a, int b, int c) {
        expect:
            Math.max(a, b) == c

        where:
            a | b | c
            1 | 3 | 3   //passes
            7 | 4 | 4   //fails
            0 | 0 | 0   //passes
    }
}