package com.example.SpringHomeWork6.services;

import com.example.SpringHomeWork6.models.Note;

import java.util.List;

public interface NoteService {
    List<Note> findAllNotes();
    Note getNoteById(Long id);
    Note createNote(Note note);
    Note updateNote(Long id, Note note);
    void deleteNote(Long id);


}
