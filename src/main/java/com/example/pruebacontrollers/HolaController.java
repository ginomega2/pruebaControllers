package com.example.pruebacontrollers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludos")
public class HolaController {

    @RequestMapping(value = "/basic",method = RequestMethod.GET)//puede o no llevar method = RequestMethod.GET si no lo lleva por default dera get
    public String diHola(){
        return "<h1> HOLA </h1>";
    }

    @RequestMapping(value = "/propio",method = RequestMethod.GET)
    public String diHolaPropio(){
        return "<h1> hola como esta tu??</h1>";
    }

    @RequestMapping(value = "/user_entry",method = RequestMethod.GET)
    public String userForm(){
        //https://www.w3schools.com/html/html_forms.asp
        return "\n" +
                "<form action=\"/saludos/user_greetings\" method=\"POST\">\n" +
                "  <label for=\"fname\">First name:</label><br>\n" +
                "  <input type=\"text\" name=\"firstName\"><br>\n" +
                "  <label for=\"lname\">Last name:</label><br>\n" +
                "  <input type=\"text\" name=\"lastName\"><br><br>\n" +
                "  <input type=\"submit\" value=\"Submit\">\n" +
                "</form> ";
    }
@RequestMapping(value = "/user_entry2",method = RequestMethod.GET)
    public String userForm2(){
        //https://www.w3schools.com/html/html_forms.asp
        return "<form action=\"/saludos/user_greetingsss\" method=\"POST\">\n" +
                "  First nane:<br>\n" +
                "  <input type=\"text\" id=\"firstName\" name=\"firstName\" ><br>\n" +
                "  Last name:<br>\n" +
                "  <input type=\"text\" id=\"lastName\" name=\"lastName\"><br><br>\n" +
                "  <input type=\"submit\" value=\"Submit\">\n" +
                "</form> \n";
    }

    @RequestMapping(value = "/user_greetings",method = RequestMethod.POST)
    public String printUserGreeting(){
        return "funciona la forma fue enviada " ;
    }
    @RequestMapping(value = "/user_greetingsss",method = RequestMethod.POST)
    public String printUserGreeting(@RequestParam String firstName, @RequestParam String lastName){
        return "nombre: "+firstName+" "+"last name"+lastName ;
    }

}
