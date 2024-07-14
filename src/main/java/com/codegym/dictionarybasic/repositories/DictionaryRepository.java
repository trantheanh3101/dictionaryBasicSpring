package com.codegym.dictionarybasic.repositories;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class DictionaryRepository {

    private static final Map<String, String> dictionary = new HashMap<>();


    static {
        dictionary.put("hello", "xin chào");
        dictionary.put("goodbye", "tạm biệt");
        dictionary.put("cat", "con mèo");
        dictionary.put("dog", "con chó");
        dictionary.put("book", "cuốn sách");
    }

    public String translate(String word) {
        return dictionary.getOrDefault(word.toLowerCase(), "Không tìm thấy từ này");
    }
}
