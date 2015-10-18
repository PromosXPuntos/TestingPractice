package testingpractice

import grails.test.mixin.TestFor
import spock.lang.Specification
import spock.lang.Unroll

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

    @Unroll ("#a tiene al menos 3 caracteres, no mas de 50 y no es nulo")
    def "crear usuario nombre valido"(){
        when: 'creacion usuario nombre correcto'
        def u = new Usuario()
        u.nombre=a
        then:
        u.validate(['nombre'])
        where:
        a << ["Juan","Rob","Pa","",null,"Doctor Roberto Alirio el de cincuenta caracteres Y","Doctor Roberto Alirio el de cincuenta caracteres +1"]
    }

    @Unroll ("#a tiene al menos 3 caracteres y no es nulo")
    def "crear usuario apellido valido"(){
        when: 'creacion usuario apellido correcto'
        def u = new Usuario()
        u.apellido=a
        then:
        u.validate(['apellido'])
        where:
        a << ["Rodriguez","Zea","Mc","",null]
    }

    @Unroll ("#a mayor o igual que 18")
    def "crear usuario edad valida"(){
        when: 'creacion usuario edad correcta'
        def u = new Usuario()
        u.edad=a
        then:
        u.validate(['edad'])
        where:
        a<<[0,15,17,18,19,100]
    }

    @Unroll ("#a es valido, M o F")
    def "crear usuario genero valido"(){
        when: 'creacion usuario genero correcto'
        def u = new Usuario()
        u.genero=a
        then:
        u.validate(['genero'])
        where:
        a << ["M","F","m","f","Fem",null,""]


    }

    @Unroll ("#a no es nulo")
    def "crear usuario cedula valida"(){
        when: 'creacion usuario cedula correcta'
        def u = new Usuario()
        u.cedula=a
        then:
        u.validate(['cedula'])
        where:
        a << [12345,35460,null]
    }
}
