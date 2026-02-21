package library;

import library.books.Book;
import library.members.Member;
import library.transactions.Transaction;

public class LibraryMain {
    public static void main(String[] args) {
        Book b = new Book();
        Member m = new Member();
        Transaction t = new Transaction();

        b.add();
        m.register();
        t.issue();
    }
}
