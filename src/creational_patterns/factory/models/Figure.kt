package creational_patterns.factory.models

import creational_patterns.factory.CircleManipulator
import creational_patterns.factory.FigureManipulator
import creational_patterns.factory.LineManipulator
import creational_patterns.factory.SquareManipulator

interface Figure {
    fun createManipulator(): FigureManipulator<out Figure>
}

internal class Circle: Figure {
    override fun createManipulator() = CircleManipulator(this)
}

internal class Square: Figure {
    override fun createManipulator() = SquareManipulator(this)
}

internal class Line: Figure {
    override fun createManipulator() = LineManipulator(this)
}