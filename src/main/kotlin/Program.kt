import concepts.Input
import concepts.Output
import programs.physicals.ConceptPrinter

interface Program : Concept {
    fun main( input : Input ) : Output

    fun usage(): String // Program <arg1> <arg2> <arg3> ...

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
            return ConceptPrinter()
        }

    }

}