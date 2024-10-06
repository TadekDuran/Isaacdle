package Isaacdle.Isaacdle.controllers;

import Isaacdle.Isaacdle.models.Word;
import Isaacdle.Isaacdle.repositories.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/word")
public class WordController {

    @Autowired
    private WordRepository wordRepository;

    @PostMapping
    public ResponseEntity<?> saveWord(@RequestBody Word word) {
        try {
            Word savedWord = wordRepository.save(word);
            return new ResponseEntity<Word>(savedWord, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<String>(e.getCause().toString(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping
    public ResponseEntity<?> getWords() {
        try {
            List<Word> words = wordRepository.findAll();
            return new ResponseEntity<>(words, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<String>(e.getCause().toString(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
