package testingpractice

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Usuario)
class UsuarioSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
    }

    def "crear usuario nombre valido"(){
        when: 'creacion usuario nombre correcto'
        def u = new Usuario()
        then:
        u.validate(['nombre'])
    }

    def "crear usuario apellido valido"(){
        when: 'creacion usuario apellido correcto'
        def u = new Usuario()
        then:
        u.validate(['apellido'])
    }

    def "crear usuario edad valida"(){
        when: 'creacion usuario edad correcta'
        def u = new Usuario()
        then:
        u.validate(['edad'])
    }

    def "crear usuario genero valido"(){
        when: 'creacion usuario genero correcto'
        def u = new Usuario()
        then:
        u.validate(['genero'])
    }

    def "crear usuario cedula valida"(){
        when: 'creacion usuario cedula correcta'
        def u = new Usuario()
        then:
        u.validate(['cedula'])
    }
}
