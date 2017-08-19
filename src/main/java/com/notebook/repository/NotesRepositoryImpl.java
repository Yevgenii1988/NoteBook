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

    private static final class NoteMapper implements RowMapper {

        @Override
        public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
            Note note = new Note();
            note.setNoteId(rs.getInt("ID"));
            note.setTitle(rs.getString("TITLE"));
            note.setCategory(rs.getString("CATEGORY"));
            note.setBody(rs.getString("BODY"));
            return note;
        }
    }
}
