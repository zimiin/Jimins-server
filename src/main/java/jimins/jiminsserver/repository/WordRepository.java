package jimins.jiminsserver.repository;

import jimins.jiminsserver.domain.Word;

import java.util.List;
import java.util.Optional;

public interface WordRepository {

    Word save(Word word);

    List<Word> findAll();

    Optional<Word> findByWord(String word);
}
