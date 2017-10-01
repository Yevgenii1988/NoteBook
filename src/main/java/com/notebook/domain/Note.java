package com.notebook.domain;

import javax.persistence.*;

@Entity
@Table(name = "NOTES")
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int noteId;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "CATEGORY")
    private String category;

    @Column(name = "BODY")
    private String body;

    public int getNoteId() {
        return noteId;
    }

    public void setNoteId(int noteId) {
        this.noteId = noteId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
