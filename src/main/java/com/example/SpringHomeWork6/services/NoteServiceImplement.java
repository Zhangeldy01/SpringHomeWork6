package com.example.SpringHomeWork6.services;

import com.example.SpringHomeWork6.models.Note;
import com.example.SpringHomeWork6.repositories.NoteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@AllArgsConstructor
public class NoteServiceImplement implements NoteService {

    private final NoteRepository noteRepository;

    /**
     * Метод получения списка задач
     * @return возвращает список заметок
     */
    @Override
    public List<Note> findAllNotes() {
        return noteRepository.findAll();
    }

    /**
     * Метод получения заметки по id
     * @param id
     * @return
     */
    @Override
    public Note getNoteById(Long id) {
        return noteRepository.findById(id).orElseThrow(null);
    }

    /**
     * Метод создания заметки
     * @param note новая заметка
     * @return возвращает новую сохранненую заметку
     */
    @Override
    public Note createNote(Note note) {
        return noteRepository.save(note);
    }

    /**
     * Метод обновления заметки
     * @param id
     * @param note
     * @return обновленная заметка
     */
    @Override
    public Note updateNote(Long id, Note note) {
        Note noteById = getNoteById(id);
        noteById.setHeader(note.getHeader());
        noteById.setContent(note.getContent());
        return noteRepository.save(noteById);
    }

    /**
     * Метод удаления заметки по id
     * @param id
     */
    @Override
    public void deleteNote(Long id) {
        Note noteById = getNoteById(id);
        noteRepository.delete(noteById);
    }
}
