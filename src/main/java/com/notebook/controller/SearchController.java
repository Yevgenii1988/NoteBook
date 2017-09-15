package com.notebook.controller;

import com.notebook.domain.SearchEngine;
import com.notebook.service.NotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SearchController {

    @Autowired
    NotesService notesService;
    @Autowired
    SearchEngine searchEngine;

    @RequestMapping(value = "/notes/search", method = RequestMethod.GET)
    public String getSearchForm(Model model) {
        model.addAttribute("searchEngine", searchEngine);
        return "searchForm";
    }

    @RequestMapping(value = "/notes/search", method = RequestMethod.POST)
    public String search(@ModelAttribute("searchEngine") SearchEngine searchEngine, Model model) {
        String keyword = searchEngine.getKeyword();
        model.addAttribute("notes", notesService.searchByKeyword(keyword));
        return "notes";
    }
}
