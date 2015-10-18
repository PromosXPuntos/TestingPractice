package testingpractice

import grails.test.mixin.TestFor
import spock.lang.Specification
import spock.lang.Unroll

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Profesor)
class ProfesorSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
    }

    @Unroll ("#a es valida [1,50]")
    def "crear profesor oficina valida"(){
        when: 'creacion profesor oficina correcta'
        def p = new Profesor()
        def p2 = new Profesor()
        p.oficina=a
        p2.oficina=1
        then:
        p.validate(['oficina'])
        where:
        a <<[-1,1,2,3,0,50,51]
    }

    //Falta una prueba
}
