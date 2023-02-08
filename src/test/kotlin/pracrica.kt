import kotlin.random.Random
fun Array(array: IntArray): Double {
    var sred = 0
    var count = 0
    for (element in array) {
        if (element % 2 != 0)
        {
            sred += element
            count++
        }
    }
    return sred.toDouble() / count
}
fun main(array: Array<String>) {
    val array = IntArray(25)
    for (i in array.indices){
        array[i] = Random.nextInt(0, 10)
    }
    println("Массив: ${array.joinToString()}")
    println("Среднее арифметических элементов: ${Array(array)}")
}