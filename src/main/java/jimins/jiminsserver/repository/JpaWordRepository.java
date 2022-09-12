package jimins.jiminsserver.repository;

import jimins.jiminsserver.domain.Word;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class JpaWordRepository implements WordRepository {

    private final EntityManager em;

    public JpaWordRepository(EntityManager em) {
        this.em = em;
    }

    public Word save(Word word) {
        em.persist(word);
        return word;
    }

    public List<Word> findAll() {
        return em.createQuery("select w from Word w", Word.class)
                .getResultList();
    }

    public Optional<Word> findByWord(String word) {
        List<Word> result = em.createQuery("select w from Word w where w.word = :word", Word.class)
                .setParameter("word", word)
                .getResultList();
        return result.stream().findAny();
    }
}
