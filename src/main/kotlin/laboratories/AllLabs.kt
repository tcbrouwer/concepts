package laboratories

import concepts.Input
import ideas.Good
import programs.physicals.ConceptPrinter

fun main(args: Array<String>) {

    val hwLab = HelloWorldLab()

    fun runLab( lab: ProtoLab ) {
        lab.insertProgam( ConceptPrinter() )
        lab.tick( Input() )
        lab.computer.churn( program = ConceptPrinter(), input = Input().put( Good() ) )
    }

    runLab( hwLab )

    val symbiosisLab = SymbiosisLab()
    runLab( symbiosisLab )



}
