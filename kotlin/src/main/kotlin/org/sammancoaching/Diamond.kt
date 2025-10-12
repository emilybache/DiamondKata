package org.sammancoaching

class Diamond(private val middleLetter: Char) {
    fun printDiamond(): String {
        return diamondRows().joinToString("\n")
    }

    fun diamondRows(): List<String> {
        return listOf("A")
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            if (args.size > 0) {
                println(Diamond(args[0].get(0)).printDiamond())
            } else {
                println("please supply one argument: the char of the diamond middle")
            }
        }
    }
}