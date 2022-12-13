package app.prog.controller.mapper;

import app.prog.controller.request.BookRequest;
import app.prog.controller.request.BookUpdateRequest;
import app.prog.controller.response.BookResponse;
<<<<<<< HEAD
import app.prog.controller.response.CreateBookResponse;
import app.prog.controller.response.UpdateBookResponse;
import app.prog.model.BookEntity;
=======
import app.prog.model.Book;
import app.prog.service.BookService;
import lombok.AllArgsConstructor;
>>>>>>> ae8b2d2c0b8706bdc2293019773641da0bf540e0
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class BookRestMapper {
<<<<<<< HEAD
    public BookResponse toRest(BookEntity domain) {
=======
    private final BookService bookService;
    public BookResponse toRest(Book domain) {
>>>>>>> ae8b2d2c0b8706bdc2293019773641da0bf540e0
        return BookResponse.builder()
                .id(domain.getId())
                .title(domain.getTitle())
                .author(domain.getAuthor())
                .hasAuthor(domain.hasAuthor())
                .build();
    }
<<<<<<< HEAD

    public BookEntity toDomain(CreateBookResponse rest) {
        return BookEntity.builder()
                .author(rest.getAuthor())
                .title(rest.getTitle())
                .pageNumber(0) //Constraint not null in database, default value is 0
                .build();
    }

    public BookEntity toDomain(UpdateBookResponse rest) {
        return BookEntity.builder()
                .id(rest.getId())
                .author(rest.getAuthor())
                .title(rest.getTitle())
                .pageNumber(0) //Constraint not null in database, default value is 0
                .build();
=======
    public Book toCreate(BookRequest data) {
        return Book.builder()
                .title(data.getTitle())
                .pageNumber(100)
                .author(data.getAuthor())
                .build();
    }
    public Book toUpdate(BookUpdateRequest domain) {
        Book toUpdate = bookService.getBookById(Math.toIntExact(domain.getId()));
        toUpdate.setAuthor(domain.getAuthor());
        toUpdate.setTitle(domain.getTitle());
        return toUpdate;
>>>>>>> ae8b2d2c0b8706bdc2293019773641da0bf540e0
    }
}
