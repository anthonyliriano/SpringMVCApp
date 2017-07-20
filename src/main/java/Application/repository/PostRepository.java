package Application.repository;

import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by aliriano on 7/19/17.
 */
@Component
public class PostRepository {

    public List<String> getAllPosts(){
        return new ArrayList<String>();
    }
}
