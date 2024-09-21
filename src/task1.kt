import kotlin.random.Random
import kotlin.random.nextInt

//Создать консольную игру "Камень-Ножницы-Бумага" (три события).
// На консоль выводится выбор компьютера (случайное значение) и выбор игрока. Для ускорения ввода выбора игрока можно условиться, что,
// например, 1 - это камень, 2 - ножницы, 3 - бумага.







fun main() {

    do {
        print(
            "Добро пожаловать в игру Камень-Ножницы-Бумага.\n" +
                    "1 - камень\n" +
                    "2 - ножницы\n" +
                    "3 - бумага\n" +
                    "Выберите, что хотите поставить в раунде: "
        )

        val user = readln().toIntOrNull() // 1,2 или 3

        //проверка на ответ от пользователя
        if ((user == null) || ((user != 1) && (user != 2) && (user != 3))) {
            println("Такого варианта не существует")
            return
        }

        val bot = Random.nextInt(1..3)


        when (user) {
            //камень
            1 -> {
                if (bot == 1) println("Ничья. Попробуйте снова.")
                if (bot == 2) println("Выбор компьютера - ножницы. Камень побеждает ножницы. Вы победили.")
                if (bot == 3) println("Выбор компьютера - бумага. Бумага побеждает камень. Вы проиграли.")
            }
            //ножницы
            2 -> {
                if (bot == 1) println("Выбор компьютера - камень. Камень побеждает ножницы. Вы проиграли.")
                if (bot == 2) println("Ничья. Попробуйте снова.")
                if (bot == 3) println("Выбор компьютера - бумага. Ножницы побеждают бумагу. Вы победили.")
            }
            //бумага
            3 -> {
                if (bot == 1) println("Выбор компьютера - камень. Бумага побеждает камень. Вы выиграли.")
                if (bot == 2) println("Выбор компьютера - ножницы. Ножницы побеждают бумагу. Вы проиграли.")
                if (bot == 3) println("Ничья. Попробуйте снова.")

            }
        }
    } while ( user == bot)
}