package Isaacdle.Isaacdle.repositories;

import Isaacdle.Isaacdle.models.Word;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WordRepository extends MongoRepository<Word, String> {
}
