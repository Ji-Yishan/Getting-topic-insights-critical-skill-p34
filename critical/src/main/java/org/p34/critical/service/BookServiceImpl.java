package org.p34.critical.service;

import org.ansj.domain.Result;
import org.ansj.domain.Term;
import org.ansj.splitWord.analysis.ToAnalysis;
import org.p34.critical.dao.BookMapper;
import org.p34.critical.pojo.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.*;

/**
 * @author: Isabella
 * @create: 2023-06-01 20:31
 **/
@Service
public class BookServiceImpl implements BookService {

    //调用dao层的操作，设置一个set接口，方便Spring管理
    @Autowired
    BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int insertBook(String word){return bookMapper.insertBook(word);}
    public int upDateBook(String word){return bookMapper.upDateBook(word);}

    public List<Books> showTop10() {
        return bookMapper.showTop10();
    }
    public int delete(){
        return bookMapper.delete();
    }
    public void analyse(Map<String, String> comments) {
        Result result = ToAnalysis.parse(comments.toString());
        System.out.println("parse.getTerms() = " + result.getTerms());
        Set<String> expectedNature = new HashSet<String>();
        Map<String, Integer> map = new HashMap<>();
        // spliterator.
        System.out.println(ToAnalysis.parse(comments.toString()));
        List<Term> terms = result.getTerms(); // 拿到terms
        System.out.println(terms.size());
        int num = 0;
        for (int i = 0; i < terms.size(); i++) {
            String word = terms.get(i).getName(); // 拿到词
            expectedNature.add(terms.get(i).toString());
            String natureStr = terms.get(i).getNatureStr(); // 拿到词性
            System.out.println("natureStr = " + natureStr);
            if (natureStr.equals("a")) {
                num = 1;
                if (map.get(word) == null) {
                        map.put(word, num);
                        bookMapper.insertBook(word);
                } else {
                    Integer integer = map.get(word);
                    map.put(word, integer+1);
                    bookMapper.upDateBook(word);
                }
            }

            if (expectedNature.contains(natureStr)) {
                System.out.println(word + ":" + natureStr);
            }
        }
        map.forEach((k,v)->{
            System.out.println(k + "-------------->" + v);
        });
        // System.out.println("map.get(\"v\") = " + map.get("v"));
    }
}