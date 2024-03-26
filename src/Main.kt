import creational_patterns.CounterSingleton
import creational_patterns.factory.ByTypeFactory
import creational_patterns.factory.FigureFactory

fun main() {
    singletonPattern()
    factoryMethod()
}

private fun singletonPattern() {
    for (i in 1..11) {
        println(CounterSingleton.increment())
    }
}

private fun factoryMethod() {
    val circleManipulator = ByTypeFactory().createFigure(FigureFactory.FigureType.Circle).createManipulator()
    println(circleManipulator)
    val lineManipulator = ByTypeFactory().createFigure(FigureFactory.FigureType.Line).createManipulator()
    println(lineManipulator.drag())
}