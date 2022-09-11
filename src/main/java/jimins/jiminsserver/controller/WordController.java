package jimins.jiminsserver.controller;

import jimins.jiminsserver.domain.Word;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class WordController {

    @GetMapping("/word")
    public List<Word> words() {
        List<Word> wordList = new ArrayList<>();
        wordList.add(new Word("test"));
        return wordList;
    }
}
