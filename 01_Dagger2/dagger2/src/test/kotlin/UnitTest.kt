import di.*
import di.component.*
import model.*
import org.junit.Assert.*
import org.junit.Test
import java.util.NoSuchElementException

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

    @Test
    fun named() {
        val myComponent = DaggerMyComponent.create()
        val myClass = MyClass()
        myComponent.inject(myClass)

        assertEquals(myClass.helloWorld, HELLO_WORLD)
    }

    @Test
    fun any_identity() {
        val singletonComponent = DaggerSingletonComponent.create()
        val any1 = singletonComponent.getAny()
        val any2 = singletonComponent.getAny()

        assertNotNull(any1)
        assertNotNull(any2)
        assertSame(any1, any2)
    }

    @Test
    fun foo() {
        val foo = Foo()

        DaggerStrComponent.create().inject(foo)
        assertTrue(foo.str.isPresent)
        assertEquals(foo.str.get(), HELLO_WORLD)

        DaggerNoStrComponent.create().inject(foo)
        assertFalse(foo.str.isPresent)
        assertThrows(NoSuchElementException::class.java) {
            foo.str.get()
        }
    }

    @Test
    fun bindsInstance() {
        val bind = Bind()

        val bindsComponent = DaggerBindsComponent.builder()
            .setString(HELLO_WORLD)
            .build()
        bindsComponent.inject(bind)
        assertEquals(bind.str, HELLO_WORLD)
    }

    @Test
    fun into_set_multi_binding() {
        val foo = SetFoo()

        DaggerSetComponent.create().inject(foo)

        assertEquals(foo.strings, setOf("Hello", "World", "Austen", "Lee"))
    }

    @Test
    fun into_map_multi_binding() {
        val mapComponent = DaggerMapComponent.create()
        val value = mapComponent.getLongsByString()["foo"]
        val string = mapComponent.getStringsByClass()[MapFoo::class.java]

        assertEquals(value, 100L)
        assertEquals(string, "Foo String")
    }

    @Test
    fun custom_map_key() {
        val mapKeyComponent = DaggerMapKeyComponent.create()
        val cat = mapKeyComponent.getStringsByAnimal()[Animal.CAT]
        val dog = mapKeyComponent.getStringsByAnimal()[Animal.DOG]

        assertEquals(cat, "MEOW")
        assertEquals(dog, "BOW-WOW")

        val float = mapKeyComponent.getStringsByNumber()[Float::class.java]
        val int = mapKeyComponent.getStringsByNumber()[Int::class.java]

        assertEquals(float, "100f")
        assertEquals(int, "1")
    }

    @Test
    fun multi_binding_with_subcomponent() {
        val superComponent = DaggerSuperComponent.create()

        assertEquals(superComponent.strings(), setOf("parent string 1", "parent string 2"))

        val subComponent = superComponent.subComponentBuilder().build()

        assertEquals(subComponent.strings(), setOf("parent string 1", "parent string 2", "child string 1", "child string 2"))
    }

    @Test
    fun multi_binds() {
        val multiBindsComponent = DaggerMultiBindsComponent.create()

        assertTrue(multiBindsComponent.getStrings().isEmpty())
    }

    companion object {
        private const val NAME = "Austen"
        private const val BIRTHDAY = 1991
        private const val HELLO_WORLD = "Hello World"
    }
}