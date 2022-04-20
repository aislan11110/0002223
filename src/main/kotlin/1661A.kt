import kotlin.math.abs

fun sum(a1: Int, a2: Int, b1: Int, b2: Int) = abs(a1 - a2) + abs(b1 - b2)

fun main() {
    repeat(readLine()!!.toInt()) {
        val n = readLine()!!.toInt()
        val a = readLine()!!.split(' ').map { it.toInt() }.toIntArray()
        val b = readLine()!!.split(' ').map { it.toInt() }.toIntArray()

        var sum = 0L
        for (i in 1 until n) {
            if (sum(a[i - 1], a[i], b[i - 1], b[i]) > sum(a[i - 1], b[i], b[i - 1], a[i]))
                a[i] = b[i].also { b[i] = a[i] }
            sum += sum(a[i - 1], a[i], b[i - 1], b[i])
        }
        println(sum)
    }
}