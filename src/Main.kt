import creational_patterns.CounterSingleton
import creational_patterns.builder.Product
import creational_patterns.builder.ProductDsl.Companion.dslProduct
import creational_patterns.factory.ByTypeFactory
import creational_patterns.factory.FigureFactory

fun main() {
    singletonPattern()
    factoryPattern()
    builderPattern()
}

private fun singletonPattern() {
    for (i in 1..11) {
        println(CounterSingleton.increment())
    }
}

private fun factoryPattern() {
    val circleManipulator = ByTypeFactory().createFigure(FigureFactory.FigureType.Circle).createManipulator()
    println(circleManipulator)
    val lineManipulator = ByTypeFactory().createFigure(FigureFactory.FigureType.Line).createManipulator()
    println(lineManipulator.drag())
}

private fun builderPattern() {
    val product = Product.Builder("Shirt").description("some description of product").build()
    println(product.name)
    println(product.description)
    val product2 = Product.Builder("Pants", "Another Description").build()
    println(product2.name)
    println(product2.description)

    /** DSL **/
    val dslProduct = dslProduct("Shoes") {
        description("Shoes Description")
        color("Red")
    }
    println(dslProduct.name)
    println(dslProduct.description)
    println(dslProduct.color)
}