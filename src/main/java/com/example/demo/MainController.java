package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping ("/")
    public String showFirstRoute () {
        return "index";
    }

    @RequestMapping("/gallery")
    public String showGalleryRoute () {
        return "gallery";
    }

    @RequestMapping("/Recipe1")
    public String showRecipeOneRoute () {
        return "Recipe1";
    }

    @RequestMapping("/Recipe2")
    public String showRecipeTwoRoute () {
        return "Recipe2";
    }

    @RequestMapping("/Recipe3")
    public String showRecipeThreeRoute () {
        return "Recipe3";
    }

    @RequestMapping("/Recipe4")
    public String showRecipeFourRoute () {
        return "Recipe4";
    }

    @RequestMapping("/Recipe5")
    public String showRecipeFiveRoute () {
        return "Recipe5";
    }

    @RequestMapping("/Recipe6")
    public String showRecipeSixRoute () {
        return "Recipe6";
    }
}
