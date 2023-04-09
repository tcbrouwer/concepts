package laboratories

import Concept
import Program
import concepts.Input
import concepts.Output

fun main(args: Array<String>) {
    val essayLab = EssayLab()
    val essay = essayLab.tick(Input())
    essay.essence.forEach {
        println(it.name)
    }
}

class EssayLab : ProtoLab() {
    class EssayGenerator(
    ) : Program {
        override fun main(input: Input): Output {
            // Generate a random essay
            // 1. Generate a random topic
            val topic = Concept.actualize("What is evil")
            // 2. Generate a random thesis
            val thesis = Concept.actualize("Evil is interference with the natural order, interference with the Good")
            // 3. Generate a random body
            val body = Concept.actualize(
                "Evil is interference with the natural order, interference with the Good. That is what one could pose. " +
                        "However, the question is: what is the natural order? What is the Good? For we should consider such things in order of how fundamental they are " +
                        "Is the Good fundamental? Is the natural order fundamental? Or is the Good a product of the natural order? Or is the natural order a product of the Good? " +
                        "Assuming that the Good is fundamental, we can say that the natural order is a product of the Good. " +
                        "Making this assumption shows that your primary concern is the Good, and others will accept this as a valid assumption. " +
                        "However, if you assume that the natural order is fundamental, you might be seen as a fool. " +
                        "And assuming Evil makes transparent the fact that you are a fool, Since Evil is not constructive " +
                        "In fact, it is destructive. " +
                        "And destruction is not constructive. " +
                        "Therefore, Evil is not constructive. " +
                        "The Good is constructive and constructive is good. Destruction is not constructive and not constructive is not good. " +
                        "Therefore, Evil is not good. " +
                        "The Good is good. Evil is not good. Therefore, Evil is not the Good. " +
                        "Evil is what is not the Good, but what interferes with the Good. "
            )
            // 4. Generate a random conclusion
            val conclusion =
                Concept.actualize("The conclusion of this essay is: Evil is interference with the natural order, interference with the Good.")

            // 5. Return the essay
            return Output().put(setOf(topic, thesis, body, conclusion))
        }

        override fun usage(): String {
            // Give user instructions on how to use this program
            return "EssayGenerator [INPUT SIGNAL]"
        }

        override val name: String = "programs.EssayGenerator"
        override val description: String = "A program that generates an essay"
        override val refs: MutableSet<Concept> = mutableSetOf(Concept.actualize("Program"))

    }

    override fun tick(input: Input): Output {
        return EssayGenerator().main(input)
    }
}
