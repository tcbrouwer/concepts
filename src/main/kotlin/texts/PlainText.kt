package texts

import Concept

open class PlainText (
    val length: Int
) : Concept {
    override val name: String = "PlainText"
    override val description: String = "some plain text"
    override val refs: MutableSet<Concept> = mutableSetOf()

    override fun synthetize(other: Concept): Concept {
        TODO("Not yet implemented")
    }
}