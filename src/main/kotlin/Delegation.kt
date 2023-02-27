class Delegation (
    override var name: String,
    override var description: String,
    override var examples: List<String>,
    override var refs: Set<Concept>
) : Concept {
}