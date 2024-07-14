package com.codegym.dictionarybasic.controller;

import com.codegym.dictionarybasic.services.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class dictionaryController {

    @Autowired
    private DictionaryService dictionaryService;

    @GetMapping("/")
    public String home() {
        return "dictionary/dictionaryBasic";
    }

    @PostMapping("/translate")
    public String translate(@RequestParam("word") String word, Model model) {
        String result = dictionaryService.translate(word);
        model.addAttribute("word", word);
        model.addAttribute("result", result);
        return "dictionary/dictionaryBasic";
    }
}
