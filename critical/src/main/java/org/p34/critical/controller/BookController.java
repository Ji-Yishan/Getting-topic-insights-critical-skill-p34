package org.p34.critical.controller;

import org.p34.critical.pojo.Books;
import org.p34.critical.service.BookService;
import org.p34.critical.utils.PythonInterprete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @author: Isabella
 * @create: 2023-06-01 20:39
 **/
@Controller

public class BookController {

    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    @PostMapping("/p34/search")
    public String search(String serialNumber, String pageNum) throws IOException {
        int serial=Integer.parseInt(serialNumber);
        int page=Integer.parseInt(pageNum);
        System.out.println(serial);
        System.out.println(page);
        PythonInterprete pythonInterprete=new PythonInterprete();
        Map<String,String> comments=pythonInterprete.userPython(serial,page);
        bookService.analyse(comments);
        return "allbook";
    }
    @ResponseBody
    @GetMapping("/p34/book/showTop10")
    public List<Books> showTop10() {
        List<Books> words=bookService.showTop10();
        System.out.println(words);
        bookService.delete();
        return words;
    }
}