import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;
import java.util.List;

@Service
public class GitHubService {
    private static final String GITHUB_API_URL = "https://api.github.com/search/repositories";

    @Autowired
    private RestTemplate restTemplate;

    public List<RepositoryEntity> searchRepositories(String query, String language, String sort) {
        String url = String.format("%s?q=%s+language:%s&sort=%s", GITHUB_API_URL, query, language, sort);
        GitHubApiResponse response = restTemplate.getForObject(url, GitHubApiResponse.class);
        return response != null ? response.getItems() : List.of();
    }
}
