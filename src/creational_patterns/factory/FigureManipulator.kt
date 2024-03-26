package creational_patterns.factory

import creational_patterns.factory.models.Circle
import creational_patterns.factory.models.Figure
import creational_patterns.factory.models.Line
import creational_patterns.factory.models.Square

interface FigureManipulator<T : Figure> {
    fun drag()
    fun resize(scale: Float)
}

internal class CircleManipulator<T>(private val figure: T): FigureManipulator<Circle> {
    override fun drag() = println("CircleManipulator is manipulating circle $figure")
    override fun resize(scale: Float) = println("CircleManipulator is resizing circle $figure")
}

internal class SquareManipulator<T>(private val figure: T): FigureManipulator<Square> {
    override fun drag() = println("SquareManipulator is manipulating Square $figure")
    override fun resize(scale: Float) = println("SquareManipulator is resizing Square $figure")
}

internal class LineManipulator<T>(private val figure: T): FigureManipulator<Line> {
    override fun drag() = println("LineManipulator is manipulating Line $figure")
    override fun resize(scale: Float) = println("LineManipulator is resizing Line $figure")
}