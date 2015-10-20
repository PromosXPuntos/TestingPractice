package testingpractice


import grails.test.mixin.*
import spock.lang.*

@TestFor(UsuarioController)
@Mock(Usuario)
class UsuarioControllerSpec extends Specification {
    def "Numero de instancias"(){
        when: 'Comprobar las instancias'
        def a = new Usuario()
        def e = new UsuarioController()
        println "numero de instancias"
        then:
        e.numeroDeInstancias() == a.getAll().size()
    }
}
