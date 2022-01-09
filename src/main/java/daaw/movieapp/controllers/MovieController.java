package daaw.movieapp.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import daaw.movieapp.controllers.exception.MovieNotFoundException;
import daaw.movieapp.persistence.model.Movie;
import daaw.movieapp.persistence.repo.MovieRepository;
import org.springframework.ui.Model;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    @GetMapping("/listmovies")
    public String listMovies(Model model) {
        Iterable<Movie> movies = movieRepository.findAll();
        model.addAttribute("movies", movies);
        return "listmovies";
    }
    @Autowired
    private MovieRepository movieRepository;

    @GetMapping
    public Iterable<Movie> findAll() {
        return movieRepository.findAll();
    }

    @GetMapping("/test")
    public Iterable<Movie> findAllTest() {
        return movieRepository.findAll();
    }

    @GetMapping("/{id}")
    public Movie findOne(@PathVariable String id) {
        return movieRepository.findById(id)
            .orElseThrow(MovieNotFoundException::new);
    }

    @GetMapping("/title/{title}")
    public List<Movie> findByTitle(@PathVariable String title) {
        return movieRepository.findByTitle(title);
    }

    @GetMapping("/actor/{actor}")
    public List<Movie> findByActor(@PathVariable String actor) {
        return movieRepository.findByActor(actor);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Movie create(@RequestBody Movie movie) {
        return movieRepository.save(movie);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        movieRepository.findById(id)
            .orElseThrow(MovieNotFoundException::new);
        movieRepository.deleteById(id);
    }


    
}