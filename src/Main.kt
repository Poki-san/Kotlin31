//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Задание 1")
    val one = arrayNumber(arrayOf(1,5,6,2,8))
    println("Среднее значение - $one")
    val two = arrayNumber(arrayOf(5.2,5.6,6.1,2.5,8.8))
    println("Среднее значение - $two")
    val three= arrayNumber(arrayOf(2,6.1,1,3,4.7))
    println("Среднее значение - $three")

    println("\nЗадание 2")
    val obj = GenericMethod()
    println(obj.isItIncluded(arrayOf("Привет","Как","Дела"),"Привет"))
    println(obj.isItIncluded(arrayOf("Привет","Как","2"),2))
}

fun <T:Number> arrayNumber(array: Array<T>):Double{
    val sum = array.sumOf { it.toDouble() }
    return sum/array.size
}
