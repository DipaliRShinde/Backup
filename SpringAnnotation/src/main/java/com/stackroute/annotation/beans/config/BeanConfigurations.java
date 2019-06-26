package com.stackroute.annotation.beans.config;

import com.stackroute.annotation.beans.Actor;
import com.stackroute.annotation.beans.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfigurations {
    @Bean(name="movie")
    public Movie getMovieBean()
    {
        return new Movie(new Actor("Shah Rukh Khan","Male",50));
    }

    @Bean(name="actor")
    public Actor getActorBean()
    {
        return new Actor("Allu arjun","Male",40);
    }
}
