package app.prog.model;

<<<<<<< HEAD:src/main/java/app/prog/model/BookEntity.java
import jakarta.persistence.*;
=======
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
>>>>>>> ae8b2d2c0b8706bdc2293019773641da0bf540e0:src/main/java/app/prog/model/Book.java
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;

@Entity
@Table(name = "book")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
<<<<<<< HEAD:src/main/java/app/prog/model/BookEntity.java
public class BookEntity {
=======
public class Book {
    /*
    TODO-4-b: Should I map it with int ? Fix it if there is a problem
     */
>>>>>>> ae8b2d2c0b8706bdc2293019773641da0bf540e0:src/main/java/app/prog/model/Book.java
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String author;
    private Integer pageNumber = 100;
    @CreationTimestamp
    private LocalDate releaseDate;

    public boolean hasAuthor() {
        return author != null;
    }

}
