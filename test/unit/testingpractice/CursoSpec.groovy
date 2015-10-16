package testingpractice

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Curso)
class CursoSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
    }

    def "crear curso codigo valido"(){
        when: 'creacion curso codigo correcto'
        def u = new Usuario()
        then:
        u.validate(['codigo'])
    }

    def "crear curso nombre valido"(){
        when: 'creacion curso nombre correcto'
        def u = new Usuario()
        then:
        u.validate(['nombre'])
    }

    def "crear curso creditos validos"(){
        when: 'creacion curso creditos correctos'
        def u = new Usuario()
        then:
        u.validate(['creditos'])
    }

    def "crear curso descripcion valida"(){
        when: 'creacion curso descripcion correcta'
        def u = new Usuario()
        then:
        u.validate(['descripcion'])
    }
}
