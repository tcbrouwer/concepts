package laboratories

import concepts.Input
import ideas.Good
import programs.physicals.NamePrinter

fun main(args: Array<String>) {

    val hwLab = HelloWorldLab()

    fun runLab( lab: ProtoLab ) {
        lab.insertProgam( NamePrinter() )
        lab.tick( Input() )
        lab.computer.churn( program = NamePrinter(), input = Input().put( Good() ) )
    }

    runLab( hwLab )

    val symbiosisLab = SymbiosisLab()
    runLab( symbiosisLab )



}
