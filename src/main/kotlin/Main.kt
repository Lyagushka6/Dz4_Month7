fun main(args: Array<String>) {

    fun division(ageInDays: Int): IntArray {
        val years = ageInDays / 365
        val months = (ageInDays % 365) / 30
        val days = (ageInDays / 365) % 30
        return intArrayOf(years, months, days)
    }
    while (true) {
        print("Введите свой возраст в днях (Для того чтобы выйти из программы, введите слово «Банан»):")
        val input = readLine()
        if (input == "Банан") {
            println("Выход из программы")
            break
        }

        val ageInDays = input?.toIntOrNull()
        if (ageInDays != null) {
            val ageResult = division(ageInDays)
            println("Ваш возраст: ${ageResult[0]} лет, ${ageResult[1]} месяц, ${ageResult[2]} день")
        } else {
            println("Слишком много цифр либо вы ввели символ или букву")
        }
    }
}