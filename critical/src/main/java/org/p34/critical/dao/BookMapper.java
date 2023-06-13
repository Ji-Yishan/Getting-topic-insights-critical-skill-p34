package org.p34.critical.dao;

/**
 * @author: Isabella
 * @create: 2023-06-01 20:29
 **/



import org.p34.critical.pojo.Books;

import java.awt.print.Book;
import java.util.List;

public interface BookMapper {
    int insertBook(String word);
    int upDateBook(String word);

    List<Books> showTop10();
    int delete();
}

