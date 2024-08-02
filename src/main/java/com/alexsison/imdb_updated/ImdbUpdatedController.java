package com.alexsison.imdb_updated;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ImdbUpdatedController {

  @GetMapping("/shows")
  public String getShows(Model model) {
    model.addAttribute("first", new Shows("Breaking Bad", "Ozymandias", 10));
    model.addAttribute("second", new Shows("Attack On Titan", "Hero", 9.9));
    model.addAttribute("third", new Shows("Attack On Titan", "Perfect Game", 9.9));
    model.addAttribute("fourth", new Shows("Star Wars: The Clone Wars", "Victory and Death", 9.9));
    model.addAttribute("fifth", new Shows("Mr.Robot", "407 Proxy Authentication Required", 9.9));
      return "shows";
  }
  
}
