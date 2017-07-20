package Application.repository;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by aliriano on 7/19/17.
 */
@Repository
public interface PostRepository {
    List<String> getAllPosts();
}
