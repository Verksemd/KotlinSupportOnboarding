class FunctionObject: suspend () -> Unit {
    override suspend fun invoke() {
        println("Hello world!")
    }
}

suspend fun callFunction(f: suspend () -> Unit) {
    f()
}

suspend fun main() {
    callFunction(FunctionObject())
}