package testingpractice


import grails.test.mixin.*
import spock.lang.*

@TestFor(EstudianteController)
@Mock(Estudiante)
class EstudianteControllerSpec extends Specification {

    def "Numero de instancias"(){
        when: 'Comprobar las instancias'
        def a = new Estudiante()
        def e = new EstudianteController()
        println "numero de instancias"
        then:
        e.numeroDeInstancias() == a.getAll().size()
    }
}

