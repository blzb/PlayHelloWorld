package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok("Hola que hace");
    }
    public static Result hello(String name){
        return ok(hello.render("Hello:"+name));
    }        
}
