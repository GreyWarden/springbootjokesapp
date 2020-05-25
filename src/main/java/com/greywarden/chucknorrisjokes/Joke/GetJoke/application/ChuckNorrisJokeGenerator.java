package com.greywarden.chucknorrisjokes.Joke.GetJoke.application;

import com.greywarden.chucknorrisjokes.Joke.GetJoke.domain.repository.JokeGenerator;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public final class ChuckNorrisJokeGenerator implements JokeGenerator {
    @Override
    public String generate() {
        return new ChuckNorrisQuotes().getRandomQuote();
    }
}
