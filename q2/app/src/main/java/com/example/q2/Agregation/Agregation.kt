package com.example.q2.Agregation

class Agregation {

    class Person{

        fun addBook (books: Book){
            val listOfBooks = arrayListOf<Book>()
            listOfBooks.add(books)
        }
    }
    class Book{
    }
}