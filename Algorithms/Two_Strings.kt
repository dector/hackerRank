/* https://www.hackerrank.com/challenges/two-strings/ */

import java.util.Scanner

fun twoStrings(s1: String, s2: String): String {
    val chars1 = s1.toSet()
    val chars2 = s2.toSet()

    return if (chars1.intersect(chars2).isNotEmpty()) "YES" else "NO"
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val s1 = scan.nextLine()

        val s2 = scan.nextLine()

        val result = twoStrings(s1, s2)

        println(result)
    }
}
