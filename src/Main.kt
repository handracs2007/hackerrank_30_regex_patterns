// https://www.hackerrank.com/challenges/30-regex-patterns/problem

fun main() {
    val numOfCases = readLine()!!.toInt()
    val gmailRegex = "^[a-z.]+@gmail\\.com$".toRegex()
    val firstNameList = mutableListOf<String>()

    for (i in 1..numOfCases) {
        val (name, email) = readLine()!!.split(" ")

        if (gmailRegex.matches(email))
            firstNameList.add(name)
    }

    // Sort the first name
    firstNameList.sorted().forEach(::println)
}