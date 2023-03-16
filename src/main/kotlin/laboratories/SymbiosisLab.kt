package laboratories

import Concept
import computers.Computer
import concepts.Input
import concepts.Output
import ideas.Clock
import ideas.Good
import programs.Noop
import programs.physicals.ConceptPrinter
import texts.Essay

class SymbiosisLab : ProtoLab() {
    fun main(args: Array<String>) {

        // take a computer
        val computer = Computer(name = "fastComputer1", clock = Clock(wavelength = 0.5))
        val output = Output()

        computer.printAsConcept(" -- Starting -- ")

        // Convert the program arguments to a list of concepts
        val input = Input()
        // args.forEach { input.essence.add( Concept.actualize(it, "Program argument", )) }

        // Create a new concept
        val concept = Concept.actualize("Hello World", "A simple program that prints 'Hello World' to the console.")

        val tweet = Concept.actualize("Tweet", "A tweet is a message that is sent to the Twitter social network.")
        val tweetConcept = Concept.actualize("Tweet Concept", "A tweet concept is a concept that represents a tweet.")
        val tweetProgram = Concept.actualize("Tweet Program", "A tweet program is a program that tweets.")
        val tweetProgramConcept = Concept.actualize(
            "Tweet Program Concept",
            "A tweet program concept is a concept that represents a tweet program."
        )
        val tweetProgramProgram =
            Concept.actualize(
                "Tweet Program Program",
                "A tweet program program is a program that tweets a tweet program."
            )

        tweetConcept.addRef(tweet)
        tweetProgramConcept.addRef(tweetProgram)
        tweetProgramProgram.addRef(tweetProgramProgram)

        val essay = Essay()
        essay.add(tweet)
        essay.add(tweetConcept)
        val symbiosis = Concept.actualize(name = "Symbiosis", "To live together is harmony", setOf(Good()))
        essay.add(symbiosis)

        // set the assay as input
        input.essence.add(essay)

        // create a new program
        val program = ConceptPrinter()

        // run the program
        output.essence.addAll(program.main(input).essence)

    }

    override fun tick(input: Input): Output {
        return Output().put(Noop())
    }
}