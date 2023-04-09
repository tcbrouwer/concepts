package laboratories

import concepts.Input
import concepts.Output
import ideas.Good
import programs.physicals.ConceptPrinter

fun main(args: Array<String>) {

    val hwLab = HelloWorldLab()

    fun runLab( lab: ProtoLab ): Output {
        lab.insertProgam( ConceptPrinter() )
        lab.tick( Input() )
        return lab.computer.churn( program = ConceptPrinter(), input = Input().put( Good() ) )
    }

    runLab( hwLab )

    val symbiosisLab = SymbiosisLab()
    runLab( symbiosisLab )

    val essayLab = EssayLab()
    val essay = runLab( essayLab )
    runLab( essayLab )
    runLab( essayLab )
    runLab( essayLab )

    // Print the essay
    essay.essence.forEach {
        println( it.name )
    }
    println( essay.essence[0].name )

//    val gitlab = GitLab()
//    runLab( gitlab )



}
