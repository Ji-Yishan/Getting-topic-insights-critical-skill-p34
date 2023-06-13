package org.p34.critical.service;

import org.p34.critical.pojo.Books;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.List;
import java.util.Map;

/**
 * @author: Isabella
 * @create: 2023-06-01 20:30
 **/
//BookService:底下需要去实现,调用dao层
@Service
public interface BookService {
    int insertBook(String word);
    int upDateBook(String word);

    List<Books> showTop10();
    int delete();
    void analyse(Map<String, String> comments);
}
