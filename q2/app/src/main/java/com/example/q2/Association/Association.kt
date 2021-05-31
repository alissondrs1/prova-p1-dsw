package com.example.q2.Association

class Association {
    class Person {
        fun relatesBook(book: Book) {
        }
    }

    class Book {
        fun relatesPerson(person: Person) {

        }

    }
}

fun main(){
    val person = Association.Person()
    val book = Association.Book()

    person.relatesBook(book)
    book.relatesPerson(person)
}