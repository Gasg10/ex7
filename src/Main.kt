fun main() {
    println("Introduza uma frase:")
    val frase = readln()

    val fraseCorreta = frase.firstOrNull()?.isUpperCase() == true &&
            frase.lastOrNull() in listOf('.', '!', '?')

    if (fraseCorreta) {
        println("Frase correta")
    } else {
        println("Frase incorreta")
    }
}
