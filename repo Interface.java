import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface RepositoryRepository extends JpaRepository<RepositoryEntity, Long> {
    List<RepositoryEntity> findByLanguageAndStarsGreaterThanEqual(String language, int minStars);
}
