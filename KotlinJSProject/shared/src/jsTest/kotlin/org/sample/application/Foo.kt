import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals


class Foo() {
    @Test
    fun lambda_function_equals_is_different_JVM_vs_JS() {
        fun lambd() = { true }

        val l1 = lambd()
        val l2 = lambd()

        val m1 = { true }
        val m2 = { true }

        assertNotEquals(m1.hashCode(), m2.hashCode()) //pass JVM and JS
        assertEquals(l1.hashCode(), l2.hashCode()) // pass JVM, fail JS
    }
}
