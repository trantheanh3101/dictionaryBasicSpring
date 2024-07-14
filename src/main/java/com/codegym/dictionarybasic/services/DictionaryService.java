package com.codegym.dictionarybasic.services;

import com.codegym.dictionarybasic.repositories.DictionaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DictionaryService {

    @Autowired
    DictionaryRepository dictionaryRepository;

    public String translate(String word) {
        return dictionaryRepository.translate(word);
    }
}
