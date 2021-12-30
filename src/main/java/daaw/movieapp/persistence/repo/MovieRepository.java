package daaw.movieapp.persistence.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;
import daaw.movieapp.persistence.model.Movie;

public interface MovieRepository extends CrudRepository<Movie, String> {
    
    @Query("{title:'?0'}")
    List<Movie> findByTitle(String title);

    @Query("{actor:'?0'}")
    List<Movie> findByActor(String actor);
    
    @Query(value="{actor:'?0'}", fields="{'title' : 1, 'quantity' : 1}")
    List<Movie> findAll(String category);
    
    public long count();
}
