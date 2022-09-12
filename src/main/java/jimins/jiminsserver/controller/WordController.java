package jimins.jiminsserver.controller;

import jimins.jiminsserver.domain.Word;
import jimins.jiminsserver.service.WordService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WordController {

    private final WordService wordService;

    public WordController(WordService wordService) {
        this.wordService = wordService;
    }

    @GetMapping("/word")
    public List<Word> words() {
        return wordService.findWords();
    }
}
