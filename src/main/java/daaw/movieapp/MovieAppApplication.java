package daaw.movieapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import daaw.movieapp.persistence.repo.MovieRepository;

@SpringBootApplication
@EnableMongoRepositories
public class MovieAppApplication implements CommandLineRunner{


	@Autowired
    MovieRepository movieRepo;
	public static void main(String[] args) {
		SpringApplication.run(MovieAppApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
