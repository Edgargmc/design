package creational_patterns.factory

import creational_patterns.factory.models.Circle
import creational_patterns.factory.models.Figure
import creational_patterns.factory.models.Line
import creational_patterns.factory.models.Square

interface FigureFactory {
    enum class FigureType { Circle, Square, Line, Undefined}
    fun createFigure(figureType: FigureType): Figure
}

class ByTypeFactory: FigureFactory {
    override fun createFigure(figureType: FigureFactory.FigureType): Figure =
        when(figureType){
            FigureFactory.FigureType.Circle -> Circle()
            FigureFactory.FigureType.Square -> Square()
            FigureFactory.FigureType.Line -> Line()
            else -> throw Exception("unknown figure, don't know how to create it")
        }
}
