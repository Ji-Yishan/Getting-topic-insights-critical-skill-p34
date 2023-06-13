package org.p34.critical.utils;

import org.ansj.domain.Result;
import org.ansj.domain.Term;
import org.ansj.splitWord.analysis.ToAnalysis;
import org.p34.critical.pojo.Books;
import org.p34.critical.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * @author: Isabella
 * @create: 2023-06-11 18:36
 **/
@Deprecated
public class Analyse {

    public static void main(String[] args){
        Map<String,String> comments=new HashMap<>();
        comments.put("0","温柔可爱的猫猫好电影");
        comments.put("1","为什么要写这个东西然后还要赶死线啊气死我了");
//        analyse(comments);
    }
//    public static void analyse(Map<String, String> comments) {
////        String str="";
////        for (int i=0;i<comments.size();i++){
////            str=comments.get(i+"");
////        }
//
//        Result result = ToAnalysis.parse(comments.toString());
//        System.out.println("parse.getTerms() = " + result.getTerms());
//        Set<String> expectedNature = new HashSet<String>();
//        Map<String, Integer> map = new HashMap<>();
//        // spliterator.
//        System.out.println(ToAnalysis.parse(comments.toString()));
//        List<Term> terms = result.getTerms(); // 拿到terms
//        System.out.println(terms.size());
//        int num = 0;
//        for (int i = 0; i < terms.size(); i++) {
//            String word = terms.get(i).getName(); // 拿到词
//            expectedNature.add(terms.get(i).toString());
//            String natureStr = terms.get(i).getNatureStr(); // 拿到词性
//            System.out.println("natureStr = " + natureStr);
//            if (natureStr.equals("a")) {
//                num = 1;
//                if (map.get(word) == null) {
//                    map.put(word, num);
//
//                } else {
//                    Integer integer = map.get(word);
//                    map.put(word, integer+1);
//                }
//            }
//
//            if (expectedNature.contains(natureStr)) {
//                System.out.println(word + ":" + natureStr);
//            }
//        }
//        map.forEach((k,v)->{
//            System.out.println(k + "-------------->" + v);
//        });
//        // System.out.println("map.get(\"v\") = " + map.get("v"));
//    }

}
