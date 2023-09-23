package org.launchcode.skillstracker.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {
    @GetMapping
    public String skillTracker(){
        return "<html>" +
                "<body>" +
                "<h1> Skills Tracker </h1>"+
                "<h2> we have a few skills we would like to learn. Here is the list! </h2>" +
                "<ol> "+
                "<li> Java </li>" +
                "<li> JavaScript </li>"+
                "<li> Python </li>"+
                "</ol>"+
                "</body>" +
                "</html>";
    }
    @GetMapping("form")
    public String skillsForm() {
        return "<html>" +
                "<body>" +
                "<form action = '/skillTracker' method = 'post'>" + // submit a request to /hello
                "Name : <input type = 'text' name = 'name' >" +
                "<br></br>"+

                "My favorite language : " +
                "<select name='firstLanguage' id ='firstLanguage'>" +
                "<option value = 'Java'> Java </option>"+
                "<option value = 'JavaScript'> JavaScript </option>"+
                "<option value = 'Python'> Python </option>"+
                "</select>" +

                "<br></br>"+
                "My second favorite language : " +
                "<select name='secondLanguage' id ='secondLanguage'>" +
                "<option value = 'Java'> Java </option>"+
                "<option value = 'JavaScript'> JavaScript </option>"+
                "<option value = 'Python'> Python </option>"+
                "</select>" +
                "<br></br>"+

                "My third favorite language : " +
                "<select name='thirdLanguage' id ='thirdLanguage'>" +
                "<option value = 'Java'> Java </option>"+
                "<option value = 'JavaScript'> JavaScript </option>"+
                "<option value = 'Python'> Python </option>"+
                "</select>" +
                "<br></br>"+

                "<input type = 'submit' value = 'Submit' >" +
                "</form>" +
                "</body>" +
                "</html>";
    }
    @RequestMapping(value = "skillTracker" , method = {RequestMethod.GET , RequestMethod.POST})
    public String trackSkills(@RequestParam String name , @RequestParam String firstLanguage, @RequestParam String secondLanguage , @RequestParam String thirdLanguage){
        return "<html>" +
                "<body>" +
                "<h1> "+ name +"</h1>"+
                "<table> "+
                "<tr style='outline: thin solid'>" +
                "<td> First favorite Language : </td> "+
                "<td>" + firstLanguage + " </td>" +
                "</tr>"+
                "<tr style='outline: thin solid'>" +
                "<td> Second favorite Language : </td> "+
                "<td>" + secondLanguage + " </td>" +
                "</tr>"+
                "<tr style='outline: thin solid'>" +
                "<td> Third favorite Language : </td> "+
                "<td>" + thirdLanguage + " </td>" +
                "</tr>" +
                "</table>" +
                "</body>" +
                "</html>";
    }


}
