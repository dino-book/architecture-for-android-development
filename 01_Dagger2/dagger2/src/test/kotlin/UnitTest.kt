import di.DaggerMyComponent
import org.junit.Assert.assertEquals
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
}