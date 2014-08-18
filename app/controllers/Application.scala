package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  
  def hello(name:String) = Action {
    Ok(views.html.hello(name))
  }
  
  def index = Action{
    Redirect(routes.Products.list())
  }
}