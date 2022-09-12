package jimins.jiminsserver.service;

import jimins.jiminsserver.domain.Word;
import jimins.jiminsserver.repository.WordRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

public class WordService {

    private final WordRepository wordRepository;

    public WordService(WordRepository wordRepository) {
        this.wordRepository = wordRepository;
    }

    @Transactional
    public String addWord(Word word) {
        wordRepository.save(word);
        return word.getWord();
    }

    public Optional<Word> findOne(String word) {
        return wordRepository.findByWord(word);
    }

    public List<Word> findWords() {
        return wordRepository.findAll();
    }
}
