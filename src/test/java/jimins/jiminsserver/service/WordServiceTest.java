package jimins.jiminsserver.service;

import jimins.jiminsserver.domain.Word;
import jimins.jiminsserver.repository.WordRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class WordServiceTest {

    @Autowired
    WordService wordService;
    @Autowired WordRepository wordRepository;

    @Test
    public void addWord() throws Exception {
        // Given
        Word word = new Word();
        word.setWord("test");

        // When
        String savedWord = wordService.addWord(word);

        // Then
        Word foundWord = wordService.findOne(savedWord).get();
        assertThat(word.getWord()).isEqualTo(foundWord.getWord());
    }
}
