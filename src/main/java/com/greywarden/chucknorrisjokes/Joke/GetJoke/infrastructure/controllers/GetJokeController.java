package com.greywarden.chucknorrisjokes.Joke.GetJoke.infrastructure.controllers;

import com.greywarden.chucknorrisjokes.Joke.GetJoke.domain.repository.JokeGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public final class GetJokeController {
    private JokeGenerator jokeGenerator;

    public GetJokeController(JokeGenerator jokeGenerator) {
        this.jokeGenerator = jokeGenerator;
    }

    @GetMapping("/")
    public String getJoke(Model model) {
        model.addAttribute("joke", this.jokeGenerator.generate());
        return "chucknorrisjoke";
    }
}
