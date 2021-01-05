package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping
    public String landing() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "<li>R</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    public String skillsForm() {
        return "<html>" +
                "<body>" +
                "<form action='skills' method='post'>" +
                "<label for='name-label'>Name:</label></br>" +
                "<input type='text' name='name' id='name-label'></br>" +
                "<label for='language-one'>My Favorite Language:</label></br>" +
                "<select name='languageOne' id='language-one'>" +
                "<option value='Javascript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "<option value='R'>R</option>" +
                "</select></br>" +
                "<label for='language-two'>My Second Favorite Language:</label></br>" +
                "<select name='languageTwo' id='language-two'></br>" +
                "<option value='Javascript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "<option value='R'>R</option>" +
                "</select></br>" +
                "<label for='language-three'>My Third Favorite Language:</label></br>" +
                "<select name='languageThree' id='language-three'></br>" +
                "<option value='Javascript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "<option value='R'>R</option>" +
                "</select></br>" +
                "<input type='submit' value='Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("skills")
    public static String createMessage(@RequestParam String name, @RequestParam String languageOne, @RequestParam String languageTwo, @RequestParam String languageThree) {
        return "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" +
                languageOne +
                "</li>" +
                "<li>" +
                languageTwo +
                "</li>" +
                "<li>" +
                languageThree +
                "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }
}
