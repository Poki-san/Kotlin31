class GenericMethod {
    fun <T> isItIncluded(array: Array<T>, obj:T): T? {
//      return array.find { it == obj }
        for (i in array)
            if (i == obj) return i

        return null
    }
}