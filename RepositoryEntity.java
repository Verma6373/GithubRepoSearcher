import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class RepositoryEntity {
    @Id
    private Long id; // Repository ID from GitHub
    private String name;
    private String description;
    private String owner;
    private String language;
    private Integer stars;
    private Integer forks;
    private LocalDateTime lastUpdated;

    // Getters and Setters
}
