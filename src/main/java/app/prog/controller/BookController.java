package app.prog.controller;

import app.prog.controller.mapper.BookRestMapper;
import app.prog.controller.request.BookRequest;
import app.prog.controller.request.BookUpdateRequest;
import app.prog.controller.response.BookResponse;
import app.prog.controller.response.CreateBookResponse;
import app.prog.controller.response.UpdateBookResponse;
import app.prog.model.BookEntity;
import app.prog.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class BookController {
    private final BookService service;
    private final BookRestMapper mapper;

    @GetMapping("/books")
    public List<BookResponse> getBooks() {
        return service.getBooks().stream()
                .map(mapper::toRest)
                .toList();
    }

    @PostMapping("/books")
<<<<<<< HEAD
    public List<BookResponse> createBooks(@RequestBody List<CreateBookResponse> toCreate) {
        List<BookEntity> domain = toCreate.stream()
                .map(mapper::toDomain)
                .toList();
        return service.createBooks(domain).stream()
=======
    public List<BookResponse> createBooks(@RequestBody List<BookRequest> toCreate) {
        return service.createBooks(toCreate.stream().map(mapper::toCreate).toList()).stream()
>>>>>>> ae8b2d2c0b8706bdc2293019773641da0bf540e0
                .map(mapper::toRest)
                .toList();
    }

    @PutMapping("/books")
<<<<<<< HEAD
    public List<BookResponse> updateBooks(@RequestBody List<UpdateBookResponse> toUpdate) {
        List<BookEntity> domain = toUpdate.stream()
                .map(mapper::toDomain)
                .toList();
        return service.updateBooks(domain).stream()
=======
    public List<BookResponse> updateBooks(@RequestBody List<BookUpdateRequest> toUpdate) {
        return service.updateBooks(toUpdate.stream().map(mapper::toUpdate).toList()).stream()
>>>>>>> ae8b2d2c0b8706bdc2293019773641da0bf540e0
                .map(mapper::toRest)
                .toList();
    }

    @DeleteMapping("/books/{bookId}")
    public BookResponse deleteBook(@PathVariable Integer bookId) {
        return mapper.toRest(service.deleteBook(bookId));
    }
}
