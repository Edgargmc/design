

fun main() {
    singletonPattern()
}

private fun singletonPattern() {
    for (i in 1..11) {
        println(CounterSingleton.increment())
    }
}