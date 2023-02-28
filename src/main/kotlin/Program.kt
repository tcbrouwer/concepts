import concepts.Input
import concepts.Output
import ideas.Good
import ideas.Not
import programs.NamePrinter

interface Program : Concept {
    fun main( input : Input ) : Output {
        // print usage
        usage()
        // time it
        val time = runTimed( input )
        // print time
        println("Time: $time")
        // return outQueue
        val output = Output()
        output.essence.add(Not())
        output.essence.add(Not())
        output.essence.add(Good())
        // success
        return output
    }

    fun usage() {
        println("Usage: Program <args>")
    }

    // time it
    fun runTimed( input: Input ): Long {
        val start = System.currentTimeMillis()
        main( input )
        val end = System.currentTimeMillis()
        return end - start
    }

    override fun synthetize( other: Concept ): Concept {
        return main( Input().put( this ).put( other ) )
    }

    companion object {
        fun default(): Program {
            return NamePrinter()
        }

    }

}