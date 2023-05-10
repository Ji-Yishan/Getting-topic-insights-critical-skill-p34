package com.critical_skill.service;

import com.critical_skill.dao.BookMapper;
import com.critical_skill.pojo.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookMapper bookMapper;
    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper=bookMapper;
    }
}
