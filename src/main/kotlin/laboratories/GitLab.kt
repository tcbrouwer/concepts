package laboratories

import concepts.Input
import concepts.Output
import programs.Noop
import java.io.File
import java.io.IOException
import java.util.concurrent.TimeUnit

fun String.runCommand(workingDir: File): String? {
    try {
        val parts = this.split("\\s".toRegex())
        val proc = ProcessBuilder(*parts.toTypedArray())
            .directory(workingDir)
            .redirectOutput(ProcessBuilder.Redirect.PIPE)
            .redirectError(ProcessBuilder.Redirect.PIPE)
            .start()

        proc.waitFor(60, TimeUnit.MINUTES)
        return proc.inputStream.bufferedReader().readText()
    } catch(e: IOException) {
        e.printStackTrace()
        return null
    }
}

class GitLab : ProtoLab() {
    fun main(args: Array<String>) {



        println("Hello, World!")
        println("git status")
        println("git add -A")
        println("git git commit -m \"commit message\"")
        println("git push")

    }

    override fun tick(input: Input): Output {
        fun gitStatus() {
            println("^^ status ^^")
            val status = "git status".runCommand(File("."))
            println(status)
        }
        gitStatus()
        println("adding")
        val add = "git add --force .".runCommand(File(".")) //nbl;egh
        println(add)
        gitStatus()
        println("committing")
        val commit = "git commit -am \"commit message\"".runCommand(File("."))
        println(commit)
        gitStatus()
        println("pushing")
        val push ="git push".runCommand(File("."))
        println(push)
        gitStatus()
        return Output().put(Noop())
    }

}