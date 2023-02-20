package com.zyl.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.zyl.domain.Book;
import com.zyl.domain.Result;
import com.zyl.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author yx
 * @date 2023/2/17
 */
@CrossOrigin
@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private IBookService bookService;

    @GetMapping("/{currentPage}/{pageSize}")
    public Result<IPage> getBooks(@PathVariable int currentPage, @PathVariable int pageSize, Book book) {

        IPage<Book> page = bookService.getBooksPageByCondition(currentPage, pageSize, book);
        if (currentPage > page.getPages()) {
            page = bookService.getBooksPageByCondition((int) page.getPages(), pageSize, book);
        }
        return new Result<>(200, "success", page);
    }

    @PutMapping
    public Result<String> modifyBook(@RequestBody Book book) {
        boolean b = bookService.updateById(book);
        if (b) {
            return new Result<>(200, "success");
        }
        return new Result<>(201, "failed");
    }

    @PostMapping
    public Result<String> insertBook(@RequestBody Book book) {
        boolean b = bookService.save(book);
        if (b) {
            return new Result<>(200, "success");
        }
        return new Result<>(201, "failed");
    }

    @DeleteMapping("/{id}")
    public Result<String> deleteBook(@PathVariable Integer id){
        boolean b = bookService.removeById(id);
        if (b){
            return new Result<>(200, "success");
        }
        return new Result<>(201,"failed");
    }
}
