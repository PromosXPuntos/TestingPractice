package testingpractice

import grails.test.mixin.TestFor
import spock.lang.Specification
import spock.lang.Unroll

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

    //Hace falta revisar que se cumpla la unicidad
    @Unroll()
    def "crear curso codigo valido"(){
        when: 'creacion curso codigo correcto'
        def c = new Curso()
        then:
        c.validate(['codigo'])
    }

    @Unroll("#a tiene el tamano adecuado, [3, 50]")
    def "crear curso nombre valido"(){
        when: 'creacion curso nombre correcto'
        def c = new Curso()
        c.nombre=a
        then:
        c.validate(['nombre'])
        where:
        a <<[null,"Po","IS2","Cadena realizada con exactamente -50- caracetres!!", "Nombre normal" ,"Cadena realizada con exactamente --51-- caracetres!"]
    }

    @Unroll("#a es valido, [1,5]")
    def "crear curso creditos validos"(){
        when: 'creacion curso creditos correctos'
        def c = new Curso()
        c.creditos=a
        then:
        c.validate(['creditos'])
        where:
        a <<[0,1,3,5,6,-16573123695]
    }

    @Unroll("#a tiene tamano mayor que 10")
    def "crear curso descripcion valida"(){
        when: 'creacion curso descripcion correcta'
        def c = new Curso()
        c.descripcion=a
        then:
        c.validate(['descripcion'])
        where:
        a <<["diez carac","menos","","mas de diez caracteres, es decir ningun problema en lo absoluto"]
    }
}
