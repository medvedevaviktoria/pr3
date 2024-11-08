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

        val userChoice = readln().toIntOrNull() // 1,2 или 3

        //проверка на ответ от пользователя
        if ((userChoice == null) || ((userChoice != 1) && (userChoice != 2) && (userChoice != 3))) {
            println("Такого варианта не существует")
            return
        }

        val compChoice = Random.nextInt(1..3)


       game(userChoice, compChoice)

    } while ( userChoice == compChoice)
}

fun game(userChoice: Int, compChoice: Int) {
    when (userChoice) {
        //камень
        1 -> {
            if (compChoice == 1) println("Ничья. Попробуйте снова.")
            if (compChoice == 2) println("Выбор компьютера - ножницы. Камень побеждает ножницы. Вы победили.")
            if (compChoice == 3) println("Выбор компьютера - бумага. Бумага побеждает камень. Вы проиграли.")
        }
        //ножницы
        2 -> {
            if (compChoice == 1) println("Выбор компьютера - камень. Камень побеждает ножницы. Вы проиграли.")
            if (compChoice == 2) println("Ничья. Попробуйте снова.")
            if (compChoice == 3) println("Выбор компьютера - бумага. Ножницы побеждают бумагу. Вы победили.")
        }
        //бумага
        3 -> {
            if (compChoice == 1) println("Выбор компьютера - камень. Бумага побеждает камень. Вы выиграли.")
            if (compChoice == 2) println("Выбор компьютера - ножницы. Ножницы побеждают бумагу. Вы проиграли.")
            if (compChoice == 3) println("Ничья. Попробуйте снова.")

        }
    }
}
