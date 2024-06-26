package creational_patterns

import java.util.concurrent.atomic.AtomicInteger

object CounterSingleton {
    init {
        println("Singleton Created")
    }
    private val counter = AtomicInteger(0)

    fun increment() = counter.incrementAndGet()
}