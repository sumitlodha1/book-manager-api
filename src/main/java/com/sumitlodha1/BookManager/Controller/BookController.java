package com.sumitlodha1.BookManager.Controller;

import com.sumitlodha1.BookManager.dto.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/books")
public class BookController {
    HashMap<Integer, Book> BooksCollection = new HashMap<>();

    @GetMapping("")
    public ResponseEntity<HashMap<Integer, Book>> showAllBooks(){
        return ResponseEntity.ok(BooksCollection);
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> showBookFromId(@PathVariable int id){
        if(!BooksCollection.containsKey(id))
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Book with Id: "+id+" Not Found");

        return ResponseEntity.ok(BooksCollection.get(id).toString());
    }

    @PostMapping("")
    public ResponseEntity<String> addBookFromId(@RequestBody Book bookDetails){
        Book book = new Book();
        book.setAuthor(bookDetails.getAuthor());
        book.setId(bookDetails.getId());
        book.setName(bookDetails.getName());

        BooksCollection.put(bookDetails.getId(), book);
        return ResponseEntity.ok("Book "+bookDetails.getId()+" is Added");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> modifyBook(@PathVariable int id, @RequestBody Book bookDetails){
        BooksCollection.put(id, bookDetails);
        return ResponseEntity.ok("Book "+id+ "'s Details Modified");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> DeleteBook(@PathVariable int id){
        if(!BooksCollection.containsKey(id))
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Book with Id: "+id+" Not Found");

        BooksCollection.remove(id);
        return ResponseEntity.ok("Book Deleted");
    }
}
