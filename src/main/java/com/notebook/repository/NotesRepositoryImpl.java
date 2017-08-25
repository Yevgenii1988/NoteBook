package com.notebook.repository;

import com.notebook.domain.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class NotesRepositoryImpl implements NotesRepository {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Override
    public List<Note> getAllNotes() {
        Map<String, Object> params = new HashMap<>();
        List<Note> notes = jdbcTemplate.query("SELECT * FROM NOTES", params, new NoteMapper());
        return notes;
    }

    @Override
    public List<Note> getNotesByCategory(String category) {
        String sql = "SELECT * FROM NOTES WHERE CATEGORY = :category";
        Map<String, Object> params = new HashMap<>();
        params.put("category", category);

        return jdbcTemplate.query(sql, params, new NoteMapper());
    }

    @Override
    public Note getNoteById(int noteId) {
        String sql = "SELECT * FROM NOTES WHERE ID = :id";
        Map<String, Object> params = new HashMap<>();
        params.put("id", noteId);
        return jdbcTemplate.queryForObject(sql, params, new NoteMapper());
    }

    @Override
    public void addNote(Note note) {
        String sql = "INSERT INTO NOTES (TITLE, CATEGORY, BODY) VALUES (:title, :category, :body)";
        Map<String, Object> params = new HashMap<>();
        params.put("title", note.getTitle());
        params.put("category", note.getCategory());
        params.put("body", note.getBody());
        jdbcTemplate.update(sql, params);
    }

    @Override
    public void updateNote(int noteId, Note note) {
        String sql = "UPDATE NOTES SET TITLE = :title, CATEGORY = :category, BODY = :body WHERE ID = :id";
        Map<String, Object> params = new HashMap<>();
        params.put("title", note.getTitle());
        params.put("category", note.getCategory());
        params.put("body", note.getBody());
        params.put("id", noteId);
        jdbcTemplate.update(sql, params);
    }

    @Override
    public void deleteNote(Note note) {
        String sql = "DELETE FROM NOTES WHERE ID = :id";
        Map<String, Object> params = new HashMap<>();
        params.put("id", note.getNoteId());
        jdbcTemplate.update(sql, params);
    }

    private static final class NoteMapper implements RowMapper<Note> {

        @Override
        public Note mapRow(ResultSet rs, int rowNum) throws SQLException {
            Note note = new Note();
            note.setNoteId(rs.getInt("ID"));
            note.setTitle(rs.getString("TITLE"));
            note.setCategory(rs.getString("CATEGORY"));
            note.setBody(rs.getString("BODY"));
            return note;
        }
    }
}
