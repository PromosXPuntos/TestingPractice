package testingpractice

import grails.test.mixin.TestFor
import spock.lang.Specification
import spock.lang.Unroll

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Estudiante)
class EstudianteSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
    }

    @Unroll("#a es valido, [0, 20]")
    def "crear estudiante semestre valido"(){
        when: 'creacion estudiante semestre correcto'
        def e = new Estudiante()
        e.semestre=a
        then:
        e.validate(['semestre'])
        where:
        a<<[0,1,2,8,19,20,21,-15]
    }

    @Unroll("#a no nulo")
    def "crear estudiante codigo valido"(){
        when: 'creacion estudiante codigo correcto'
        def e = new Estudiante()
        e.codigoInst=a
        then:
        e.validate(['codigoInst'])
        where:
        a << [null,1198,6160,0]
    }

    //Falta una prueba
}
