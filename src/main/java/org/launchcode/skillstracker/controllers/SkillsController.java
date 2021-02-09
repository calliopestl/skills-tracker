package org.launchcode.skillstracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class SkillsController {

    @GetMapping("")
    @ResponseBody
    public String index() {
       return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list:</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";

    }

    @GetMapping("form")
    @ResponseBody
    public String skillsForm() {
        return "<html>" +
                "<body>" +
                "<form method = 'post' action='/form'>" +
                "<h2>Name: </h2>" +
                "<input type = 'text' name = 'name' />" +
                "<h2>My favorite language: </h2>" +
                "<select name= 'skill1'>" +
                "   <option value='java'>Java</option>" +
                "   <option value='javascript'>JavaScript</option>" +
                "   <option value='python'>Python</option>" +
                "</select>" +
                "<h2>My second favorite language: </h2>" +
                "<select name= 'skill2'>" +
                "   <option value='java'>Java</option>" +
                "   <option value='javascript'>JavaScript</option>" +
                "   <option value='python'>Python</option>" +
                "</select>" +
                "<h2>My third favorite language: </h2>" +
                "<select name= 'skill3'>" +
                "   <option value='java'>Java</option>" +
                "   <option value='javascript'>JavaScript</option>" +
                "   <option value='python'>Python</option>" +
                "</select>" +

                "<input type='submit' value='Add skill'>" +
                "</form>" +
                "</body>" +
                "<html>";

    }

    @PostMapping("form")
    @ResponseBody
    public String formChoices(@RequestParam String name, String skill1, String skill2, String skill3) {
        return "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + skill1 + "</li>" +
                "<li>" + skill2 + "</li>" +
                "<li>" + skill3 + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }


}
