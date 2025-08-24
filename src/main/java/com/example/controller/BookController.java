package com.example.controller;

import com.example.model.Book;
import com.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/list")
    public ModelAndView listBooks() {
        List<Book> books = bookService.getAllBooks();
        ModelAndView modelAndView = new ModelAndView("book-details");
        modelAndView.addObject("books", books);
        return modelAndView;
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model model) {
        Book book = new Book();
        model.addAttribute("book", book);
        return "book-form";
    }

    @PostMapping("/saveBook")
    public String saveBook(@ModelAttribute("book") Book book) {
        bookService.saveBook(book);
        return "redirect:/book/list";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("bookId") int bookId, Model model) {
        Book book = bookService.getBookById(bookId);
        model.addAttribute("book", book);
        return "book-form";
    }

    @GetMapping("/delete")
    public String deleteBook(@RequestParam("bookId") int bookId) {
        bookService.deleteBook(bookId);
        return "redirect:/book/list";
    }
}