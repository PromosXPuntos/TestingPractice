package testingpractice


import grails.test.mixin.*
import spock.lang.*

@TestFor(ProfesorController)
@Mock(Profesor)
class ProfesorControllerSpec extends Specification {

    def "Numero de instancias"(){
        when: 'Comprobar las instancias'
        def a = new Profesor()
        def e = new ProfesorController()
        println "numero de instancias"
        then:
        e.numeroDeInstancias() == a.getAll().size()
    }
}
