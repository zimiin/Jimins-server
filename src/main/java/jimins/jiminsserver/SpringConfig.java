package jimins.jiminsserver;

import jimins.jiminsserver.repository.JpaWordRepository;
import jimins.jiminsserver.repository.WordRepository;
import jimins.jiminsserver.service.WordService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    private final DataSource dataSource;
    private final EntityManager entityManager;

    public SpringConfig(DataSource dataSource, EntityManager entityManager) {
        this.dataSource = dataSource;
        this.entityManager = entityManager;
    }

    @Bean
    public WordService memberService() {
        return new WordService(wordRepository());
    }

    @Bean
    public WordRepository wordRepository() {
        return new JpaWordRepository(entityManager);
    }
}
