package daaw.movieapp.persistence.model;

import javax.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("movie")
public class Movie {

        @Id
        private String id;

        private String title;
        private String actor[];
        private String gender;
        private String publication_date;

        
        public Movie(String id, String title, String actor[], String gender, String publication_date) {
            super();
            this.id = id;
            this.title = title;
            this.actor = actor;
            this.gender = gender;
            this.publication_date = publication_date;
        }


        public String getId() {
            return id;
        }


        public void setId(String id) {
            this.id = id;
        }


        public String getTitle() {
            return title;
        }


        public void setTitle(String title) {
            this.title = title;
        }


        public String[] getActor() {
            return actor;
        }


        public void setActor(String[] actor) {
            this.actor = actor;
        }


        public String getGender() {
            return gender;
        }


        public void setGender(String gender) {
            this.gender = gender;
        }


        public String getPublication_date() {
            return publication_date;
        }


        public void setPublication_date(String publication_date) {
            this.publication_date = publication_date;
        }
       
}