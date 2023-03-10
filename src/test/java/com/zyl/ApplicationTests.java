package com.zyl;

import com.zyl.controller.BorrowLogController;
import com.zyl.domain.Book;
import com.zyl.domain.BorrowLog;
import com.zyl.domain.User;
import com.zyl.service.IBookService;
import com.zyl.service.ILoginService;
import com.zyl.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {


    @Autowired
    private ILoginService loginService;

    @Autowired
    private IBookService bookService;

    @Autowired
    private IUserService userService;

    @Autowired
    private BorrowLogController borrowLogController;


    @Test
    void BorrowLogControllerTest() {
        BorrowLog borrowLog = new BorrowLog();
        borrowLog.setBookName("user");
        // borrowLog.setUserName("admin");
        borrowLogController.getLogPage(1, 10, borrowLog);
    }


    @Test
    void userServiceTest() {
        System.out.println(userService.getUserPageByCondition(1, 10, new User()));
    }


    @Test
    void contextLoads() {
        User user = loginService.getById(1);
        System.out.println(user);
    }


    @Test
    void getPages() {

        Book book = new Book();
        bookService.getBooksPageByCondition(2, 5, book);
        System.out.println(book);

    }
}
