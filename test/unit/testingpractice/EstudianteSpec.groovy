package testingpractice

import grails.test.mixin.TestFor
import spock.lang.Specification

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

    def "crear estudiante semestre valido"(){
        when: 'creacion estudiante semestre correcto'
        def u = new Usuario()
        then:
        u.validate(['semestre'])
    }

    def "crear estudiante codigo valido"(){
        when: 'creacion estudiante codigo correcto'
        def u = new Usuario()
        then:
        u.validate(['codigoInst'])
    }

    //Falta una prueba
}
