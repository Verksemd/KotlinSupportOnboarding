inline fun <A, R> context(context: A, block: context(A) () -> R): R = block(context)
context(context: T) fun <T> implicit(): T = context

class Foo { fun foo() { } }
fun <A> withFoo(block: context(Foo) () -> A): A = context(Foo()) { block() }

fun box(): String {
    return withFoo {
        implicit<Foo>().foo()
        "OK"
    }
}
fun main() {
    println(box())
}
