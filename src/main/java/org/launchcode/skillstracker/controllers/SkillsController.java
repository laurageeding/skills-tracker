package org.launchcode.skillstracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@ResponseBody
@RequestMapping
public class SkillsController {

    @GetMapping
    public String text() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>Here's a list of skills to learn!</h2>" +
                "<ol> <li>Java</li> <li>Javascript</li> <li>Python</li> </ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    public String skillsForm() {
        return "<html>" +
                "<body>" +
                "<form action = '' method = 'post'>" +
                "<label>Name: </label>" +
                "<input type = 'text' name = 'name' >" +
                "<br>" +

                "<label>My favorite language: </label>" +
                "<select name='lang1' id='lang1'>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>Javascript</option>" +
                "<option value='python'>Python</option>" +
                "</select>"+
                "<br>" +

                "<label>My second favorite language: </label>" +
                "<select name='lang2' id='lang2'>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>Javascript</option>" +
                "<option value='python'>Python</option>" +
                "</select>" +
                "<br>" +

                "<label>My third favorite language: </label>" +
                "<select name='lang3' id='lang3'>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>Javascript</option>" +
                "<option value='python'>Python</option>" +
                "</select>"+
                "<br>" +

                "<input type = 'submit' value = 'Submit' >" +
                "</form>" +
                "</body>" +
                "</html>";
    }


    @PostMapping("form")
    @ResponseBody
    public static String postToSkillsForm(@RequestParam String name, @RequestParam String lang1, @RequestParam String lang2, @RequestParam String lang3){
        return "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + lang1 + "</li>" +
                "<li>" + lang2 + "</li>" +
                "<li>" + lang3 + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";

    }
}
