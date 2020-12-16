import di.DaggerCounterComponent
import di.DaggerMyComponent
import di.DaggerPersonComponent
import model.Counter
import model.MyClass
import model.PersonB
import org.junit.Assert.*
import org.junit.Test

class UnitTest {
    @Test
    fun hello_world() {
        val myComponent = DaggerMyComponent.create()
        assertEquals(myComponent.getString(), NAME)
    }

    @Test
    fun get_null() {
        val myComponent = DaggerMyComponent.create()
        assertEquals(myComponent.getDouble(), null)
    }

    @Test
    fun member_injection() {
        val myClass = MyClass()

        var string = try {
            myClass.string
        } catch (e: UninitializedPropertyAccessException) {
            null
        }
        assertNull("조회 결과 null", string)

        val myComponent = DaggerMyComponent.create()
        myComponent.inject(myClass)

        string = myClass.string

        assertEquals(string, NAME)
    }

    @Test
    fun person_injection() {
        val personComponent = DaggerPersonComponent.create()

        val personA = personComponent.getPersonA()
        assertEquals(personA.name, NAME)
        assertEquals(personA.birthday, BIRTHDAY)

        val personB = PersonB()
        personComponent.inject(personB)
        assertEquals(personB.name, NAME)
        assertEquals(personB.birthday, BIRTHDAY)
    }
    
    @Test
    fun print_lazy() {
        val counterComponent = DaggerCounterComponent.create()
        val counter = Counter()
        counterComponent.inject(counter)
        counter.printLazy()
    }

    @Test
    fun print_provider() {
        val counterComponent = DaggerCounterComponent.create()
        val counter = Counter()
        counterComponent.inject(counter)
        counter.printProvider()
    }

    companion object {
        private const val NAME = "Austen"
        private const val BIRTHDAY = 1991
    }
}