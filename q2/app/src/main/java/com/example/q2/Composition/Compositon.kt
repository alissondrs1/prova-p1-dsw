package com.example.q2.Composition

class Compositon {
    class Person{
        private val listOfBooks = arrayListOf<Book>()
        fun addBook(book: Book){
            listOfBooks.add(book)
        }
    }
    class Book{

    }
fun main(){

}
}
