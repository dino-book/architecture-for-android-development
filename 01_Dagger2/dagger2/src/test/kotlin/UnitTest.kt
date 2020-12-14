import di.DaggerMyComponent
import model.MyClass
import org.junit.Assert.*
import org.junit.Test

class UnitTest {
    @Test
    fun hello_world() {
        val myComponent = DaggerMyComponent.create()
        assertEquals(myComponent.getString(), "Austen")
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

        assertEquals(string, "Austen")
    }
}