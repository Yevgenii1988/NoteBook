package com.notebook.domain;

import org.springframework.stereotype.Component;

@Component
public class SearchEngine {
    private  String keyword;

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}
