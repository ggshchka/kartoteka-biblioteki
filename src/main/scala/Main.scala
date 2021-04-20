import scala.io.StdIn.readLine

case class Book(author: String, name: String, publ: String, typeOfBook: String, isAvailable: Boolean)

object Main {

  def main(args: Array[String]): Unit = {
    val bufferOfBooks: List[Book] = List(
      Book("Булгаков","Мастер и Маргарита","Азбука","Роман",true),
      Book("Булгаков","Собачье сердце","НИГМА","Роман",false),
      Book("Артемьева","История метафизики в России XVIII века","Науч",true),
      Book("Васильева","Отечественная философия","РАГС","Науч",false),
      Book("Скрипник","Управленческая деятельность: структура, функции, навыки персонала","Приор","Науч",true)
    )
    println("Библиотека")
    println("1 - Вывод книг")
    println("2 - Редактирование")
    println("3 - Добавление книги")
    println("4 - Удаление книги")
    println("5 - Загрузка в файл")
    val firstCommand = readLine()

    firstCommand match {
      case "1" =>
        println("1 - По автору")
        println("2 - По разделу")
        println("3 - По наличию")
        val secondCommand = readLine()
        secondCommand match {
          case "1" =>
            println("Введите имя автора: ")
            val authorNameCommand = readLine()
            for (el <- bufferOfBooks) {
              if (el.author == authorNameCommand)
                println(el)
            }
          case "2" =>
            println("Введите раздел: ")
            val typeOfBookCommand = readLine()
            for (el <- bufferOfBooks) {
              if (el.typeOfBook == typeOfBookCommand)
                println(el)
            }
          case "3" =>
            println("Введите наличие: (true или false)")
            val isAvailableCommand = readLine().toBoolean
            for (el <- bufferOfBooks) {
              if (el.isAvailable == isAvailableCommand)
                println(el)
            }
          case _ => println("Ошибка")
        }
      case "2" =>
        bufferOfBooks.zipWithIndex.
          foreach{case(a, b) => println(b + ". " + a)}
        println("Введите номер книги:")
        val changedBookNumCommand = readLine().toInt
        println("Менять:")
        println("1 - автора")
        println("2 - название")
        println("3 - издательство")
        println("4 - раздел")
        println("5 - наличие")
        val changedCommand = readLine()
        changedCommand match {
          case "1" =>
            println("Введите новое: ")
            val changeAuthorCommand = readLine()

          case "2" =>
            println("Введите новое: ")
            val changeNameCommand = readLine()
          case "3" =>
            println("Введите новое: ")
            val changePublCommand = readLine()
          case "4" =>
            println("Введите новое: ")
            val changeTypeCommand = readLine()
          case "5" =>
            println("Введите новое: (true или false)")
            val changeisAvaibCommand = readLine().toBoolean
        }
//      case "3" => _
//      case "4" => _
//      case "5" => _
//      case "6" => _
      case _ => println("Ошибка")
    }

  }
}
