open class Idea : Concept {

    // Path: src/main/kotlin/Idea.kt
    fun foo() {
        // Path: src/main/kotlin/Idea.kt
        val x = 1
    }

    fun lookup(): Set<Concept> {
        // wget wikipedia
        // parse wikipedia
        // get concepts
        // get refs
        return Concept.actualize("foo", "bar", listOf()).refs
    }

    override var name: String = "Idea"
    override var description: String = "A concept that is an idea"
    override var examples: List<String> = listOf("Idea")
    override var refs: Set<Concept> = setOf()

}