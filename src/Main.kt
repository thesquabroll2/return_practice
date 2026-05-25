fun addNumber(a: Int, b: Int, c: Int): Int {
    return a + b + c
}

fun multiply(a: Int, b: Int, c: Int): Int {
    return a * b * c
}

fun main() {
    val a = 2
    val b = 3
    val c = 4
    val sum = addNumber(a, b, c)
    println("The sum of $a, $b, and $c is $sum")

    val product = multiply(a, b, c)
    println("The product of $a, $b, and $c is $product")
}