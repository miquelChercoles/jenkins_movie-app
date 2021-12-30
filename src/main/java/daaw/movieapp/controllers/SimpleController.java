package daaw.movieapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import daaw.movieapp.persistence.model.Movie;
import daaw.movieapp.persistence.repo.MovieRepository;

@Controller
public class SimpleController {
    @Value("${spring.application.name}")
    String appName;
    @Autowired
    private MovieRepository movieRepository;

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("appName", appName);

        return "home";
    }

    @GetMapping("/listmovies")
    public String listMovies(Model model) {
        Iterable<Movie> movies = movieRepository.findAll();
        model.addAttribute("movies", movies);
        return "listmovies";
    }
}