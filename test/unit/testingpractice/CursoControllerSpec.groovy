package testingpractice


import grails.test.mixin.*
import spock.lang.*

@TestFor(CursoController)
@Mock(Curso)
class CursoControllerSpec extends Specification {

    def "Numero de instancias"(){
        when: 'Comprobar las instancias'
        def a = new Curso()
        def e = new CursoController()
        println "numero de instancias"
        then:
        e.numeroDeInstancias() == a.getAll().size()
    }
}
