/* https://www.hackerrank.com/challenges/funny-string/ */

import java.util.*
import kotlin.math.abs

private fun funnyString(s: String): Boolean {
    fun String.represent() = zipWithNext { a, b -> abs(b - a) }

    val straightRepresentation = s
        .represent()
    val reversedRepresentation = s.reversed()
        .represent()

    return straightRepresentation == reversedRepresentation
}

fun main() {
    val scan = Scanner(System.`in`)
    val q = scan.nextLine().trim().toInt()

    for (i in 1..q) {
        val s = scan.nextLine().trim()

        val result = if (funnyString(s)) "Funny" else "Not Funny"
        println(result)
    }
}
