

fun main() {
    singletonPattern()
}

private fun singletonPattern() {
    for (i in 1..10) {
        println(CounterSingleton.increment())
    }
}