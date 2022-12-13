package app.prog.repository;

import app.prog.model.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

<<<<<<< HEAD
public interface BookRepository extends JpaRepository<BookEntity, String> {
=======
public interface BookRepository extends JpaRepository<Book, Integer> {
>>>>>>> ae8b2d2c0b8706bdc2293019773641da0bf540e0
}
