
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Gustavo/Desktop/laboratorio/reservando/conf/routes
// @DATE:Tue Jul 11 18:34:53 ART 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_2: controllers.HomeController,
  // @LINE:10
  Assets_12: controllers.Assets,
  // @LINE:12
  RegisterController_9: controllers.RegisterController,
  // @LINE:14
  LoginController_13: controllers.LoginController,
  // @LINE:21
  ClientProfileController_11: controllers.ClientProfileController,
  // @LINE:23
  ClientHomeController_7: controllers.ClientHomeController,
  // @LINE:29
  RestaurantController_4: controllers.RestaurantController,
  // @LINE:41
  MealController_3: controllers.MealController,
  // @LINE:52
  OwnerProfileController_0: controllers.OwnerProfileController,
  // @LINE:56
  UserController_5: controllers.UserController,
  // @LINE:64
  QualificationController_14: controllers.QualificationController,
  // @LINE:69
  OrderController_15: controllers.OrderController,
  // @LINE:79
  ReservationController_8: controllers.ReservationController,
  // @LINE:91
  DiscountController_10: controllers.DiscountController,
  // @LINE:94
  DebugController_6: controllers.DebugController,
  // @LINE:101
  MessageController_1: controllers.MessageController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_2: controllers.HomeController,
    // @LINE:10
    Assets_12: controllers.Assets,
    // @LINE:12
    RegisterController_9: controllers.RegisterController,
    // @LINE:14
    LoginController_13: controllers.LoginController,
    // @LINE:21
    ClientProfileController_11: controllers.ClientProfileController,
    // @LINE:23
    ClientHomeController_7: controllers.ClientHomeController,
    // @LINE:29
    RestaurantController_4: controllers.RestaurantController,
    // @LINE:41
    MealController_3: controllers.MealController,
    // @LINE:52
    OwnerProfileController_0: controllers.OwnerProfileController,
    // @LINE:56
    UserController_5: controllers.UserController,
    // @LINE:64
    QualificationController_14: controllers.QualificationController,
    // @LINE:69
    OrderController_15: controllers.OrderController,
    // @LINE:79
    ReservationController_8: controllers.ReservationController,
    // @LINE:91
    DiscountController_10: controllers.DiscountController,
    // @LINE:94
    DebugController_6: controllers.DebugController,
    // @LINE:101
    MessageController_1: controllers.MessageController
  ) = this(errorHandler, HomeController_2, Assets_12, RegisterController_9, LoginController_13, ClientProfileController_11, ClientHomeController_7, RestaurantController_4, MealController_3, OwnerProfileController_0, UserController_5, QualificationController_14, OrderController_15, ReservationController_8, DiscountController_10, DebugController_6, MessageController_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_2, Assets_12, RegisterController_9, LoginController_13, ClientProfileController_11, ClientHomeController_7, RestaurantController_4, MealController_3, OwnerProfileController_0, UserController_5, QualificationController_14, OrderController_15, ReservationController_8, DiscountController_10, DebugController_6, MessageController_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.RegisterController.registerUser"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.login"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.LoginController.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """client/home""", """controllers.HomeController.clientHome"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """client/profile""", """controllers.HomeController.clientProfile"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """client/profile/user""", """controllers.ClientProfileController.getClient"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """client/restaurant""", """controllers.HomeController.clientRestaurant"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """client/searchAllRestaurants""", """controllers.ClientHomeController.searchAllRestaurants"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """client/deleteAccount""", """controllers.ClientProfileController.deleteAccount"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """client/search""", """controllers.ClientHomeController.search"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """client/getRecommendations""", """controllers.ClientHomeController.getRecommendations"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restaurant""", """controllers.RestaurantController.addRestaurant"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restaurants/all""", """controllers.RestaurantController.getAll"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restaurants/firsts""", """controllers.RestaurantController.getFirsts"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restaurants/of-owner""", """controllers.RestaurantController.getRestaurantsFromOwner()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restaurant/""" + "$" + """rid<[^/]+>""", """controllers.RestaurantController.getRestaurant(rid:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restaurant/state/""" + "$" + """rid<[^/]+>""", """controllers.RestaurantController.changeState(rid:String)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restaurant/""" + "$" + """rid<[^/]+>""", """controllers.RestaurantController.update(rid:String)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restaurant/""" + "$" + """rid<[^/]+>/photo""", """controllers.RestaurantController.updatePhoto(rid:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restaurant/""" + "$" + """rid<[^/]+>""", """controllers.RestaurantController.delete(rid:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restaurants/nearMe/""" + "$" + """lat<[^/]+>/""" + "$" + """lng<[^/]+>""", """controllers.RestaurantController.searchNearMe(lat:String, lng:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """menu/""" + "$" + """rid<[^/]+>""", """controllers.MealController.getMenu(rid:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """meal/""" + "$" + """rid<[^/]+>""", """controllers.MealController.newMeal(rid:String)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """meal/""" + "$" + """mid<[^/]+>""", """controllers.MealController.update(mid:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """meal/""" + "$" + """mid<[^/]+>""", """controllers.MealController.delete(mid:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """owner/home""", """controllers.HomeController.ownerHome"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """owner/new-restaurant""", """controllers.HomeController.newRestaurant"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """owner/profile""", """controllers.HomeController.ownerProfile"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """owner/restaurant""", """controllers.HomeController.ownerRestaurant"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """owner/restaurants""", """controllers.HomeController.ownerRestaurants"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """owner/profile/user""", """controllers.OwnerProfileController.getOwner"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """owner/deleteAccount""", """controllers.OwnerProfileController.deleteAccount"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/photo""", """controllers.UserController.changePhoto"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/info""", """controllers.UserController.changeInfo"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/password""", """controllers.UserController.changePassword"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """all/days""", """controllers.HomeController.getDays"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """all/cuisines""", """controllers.HomeController.getCuisines"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """qualification/client/""" + "$" + """rid<[^/]+>""", """controllers.QualificationController.getUserRestaurantQualification(rid:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """qualification/""" + "$" + """rid<[^/]+>""", """controllers.QualificationController.getRestaurantQualification(rid:String)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """qualification""", """controllers.QualificationController.addQualification"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """order""", """controllers.OrderController.view"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """owner/my-orders""", """controllers.OrderController.ownerOrdersView"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """my-orders""", """controllers.OrderController.myOrdersView"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """orders/client""", """controllers.OrderController.getClientOrders"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """orders/owner""", """controllers.OrderController.getOwnerOrders"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """orders/owner/firsts""", """controllers.OrderController.getOwnerFirsts"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """order/""" + "$" + """oId<[^/]+>""", """controllers.OrderController.getOrder(oId:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """order""", """controllers.OrderController.newOrder"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reservation""", """controllers.ReservationController.view"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reservation/client""", """controllers.ReservationController.getClientReservations"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reservation/owner""", """controllers.ReservationController.getOwnerReservations"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reservation/owner/firsts""", """controllers.ReservationController.getOwnerFirsts"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reservation/owner/firsts""", """controllers.ReservationController.getOwnerFirsts"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """my-reservations""", """controllers.ReservationController.viewClientReservations"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """owner/my-reservations""", """controllers.ReservationController.viewOwnerReservations"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reservation/""" + "$" + """rId<[^/]+>""", """controllers.ReservationController.getReservation(rId:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reservation""", """controllers.ReservationController.save"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reservation/""" + "$" + """id<[^/]+>""", """controllers.ReservationController.delete(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """discount/""" + "$" + """code<[^/]+>""", """controllers.DiscountController.getDiscount(code:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """all/users""", """controllers.DebugController.getUsers"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """all/restaurants""", """controllers.DebugController.getRestaurants"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """all/days""", """controllers.DebugController.getDays"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """all/cuisines""", """controllers.DebugController.getCuisines"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """all/meals""", """controllers.DebugController.getMeals"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """messages.js""", """controllers.MessageController.messages()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """language""", """controllers.MessageController.getCurrentLang"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """language/change""", """controllers.MessageController.changeLang"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_2.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """ An example controller showing a sample clientHome page""",
      this.prefix + """"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Assets_versioned1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned1_invoker = createInvoker(
    Assets_12.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_RegisterController_registerUser2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_RegisterController_registerUser2_invoker = createInvoker(
    RegisterController_9.registerUser,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RegisterController",
      "registerUser",
      Nil,
      "POST",
      """""",
      this.prefix + """register"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_LoginController_login3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_login3_invoker = createInvoker(
    LoginController_13.login,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "login",
      Nil,
      "POST",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_LoginController_logout4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_LoginController_logout4_invoker = createInvoker(
    LoginController_13.logout,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "logout",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_HomeController_clientHome5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("client/home")))
  )
  private[this] lazy val controllers_HomeController_clientHome5_invoker = createInvoker(
    HomeController_2.clientHome,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "clientHome",
      Nil,
      "GET",
      """Client""",
      this.prefix + """client/home"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_HomeController_clientProfile6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("client/profile")))
  )
  private[this] lazy val controllers_HomeController_clientProfile6_invoker = createInvoker(
    HomeController_2.clientProfile,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "clientProfile",
      Nil,
      "GET",
      """GET     /client/profile                         controllers.ClientProfileController.clientProfile""",
      this.prefix + """client/profile"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_ClientProfileController_getClient7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("client/profile/user")))
  )
  private[this] lazy val controllers_ClientProfileController_getClient7_invoker = createInvoker(
    ClientProfileController_11.getClient,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ClientProfileController",
      "getClient",
      Nil,
      "GET",
      """""",
      this.prefix + """client/profile/user"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_HomeController_clientRestaurant8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("client/restaurant")))
  )
  private[this] lazy val controllers_HomeController_clientRestaurant8_invoker = createInvoker(
    HomeController_2.clientRestaurant,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "clientRestaurant",
      Nil,
      "GET",
      """""",
      this.prefix + """client/restaurant"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_ClientHomeController_searchAllRestaurants9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("client/searchAllRestaurants")))
  )
  private[this] lazy val controllers_ClientHomeController_searchAllRestaurants9_invoker = createInvoker(
    ClientHomeController_7.searchAllRestaurants,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ClientHomeController",
      "searchAllRestaurants",
      Nil,
      "GET",
      """""",
      this.prefix + """client/searchAllRestaurants"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_ClientProfileController_deleteAccount10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("client/deleteAccount")))
  )
  private[this] lazy val controllers_ClientProfileController_deleteAccount10_invoker = createInvoker(
    ClientProfileController_11.deleteAccount,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ClientProfileController",
      "deleteAccount",
      Nil,
      "POST",
      """""",
      this.prefix + """client/deleteAccount"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_ClientHomeController_search11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("client/search")))
  )
  private[this] lazy val controllers_ClientHomeController_search11_invoker = createInvoker(
    ClientHomeController_7.search,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ClientHomeController",
      "search",
      Nil,
      "POST",
      """""",
      this.prefix + """client/search"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_ClientHomeController_getRecommendations12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("client/getRecommendations")))
  )
  private[this] lazy val controllers_ClientHomeController_getRecommendations12_invoker = createInvoker(
    ClientHomeController_7.getRecommendations,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ClientHomeController",
      "getRecommendations",
      Nil,
      "POST",
      """""",
      this.prefix + """client/getRecommendations"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_RestaurantController_addRestaurant13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restaurant")))
  )
  private[this] lazy val controllers_RestaurantController_addRestaurant13_invoker = createInvoker(
    RestaurantController_4.addRestaurant,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "addRestaurant",
      Nil,
      "POST",
      """Restaurant""",
      this.prefix + """restaurant"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_RestaurantController_getAll14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restaurants/all")))
  )
  private[this] lazy val controllers_RestaurantController_getAll14_invoker = createInvoker(
    RestaurantController_4.getAll,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "getAll",
      Nil,
      "GET",
      """""",
      this.prefix + """restaurants/all"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_RestaurantController_getFirsts15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restaurants/firsts")))
  )
  private[this] lazy val controllers_RestaurantController_getFirsts15_invoker = createInvoker(
    RestaurantController_4.getFirsts,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "getFirsts",
      Nil,
      "GET",
      """""",
      this.prefix + """restaurants/firsts"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_RestaurantController_getRestaurantsFromOwner16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restaurants/of-owner")))
  )
  private[this] lazy val controllers_RestaurantController_getRestaurantsFromOwner16_invoker = createInvoker(
    RestaurantController_4.getRestaurantsFromOwner(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "getRestaurantsFromOwner",
      Nil,
      "GET",
      """""",
      this.prefix + """restaurants/of-owner"""
    )
  )

  // @LINE:33
  private[this] lazy val controllers_RestaurantController_getRestaurant17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restaurant/"), DynamicPart("rid", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RestaurantController_getRestaurant17_invoker = createInvoker(
    RestaurantController_4.getRestaurant(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "getRestaurant",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """restaurant/""" + "$" + """rid<[^/]+>"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_RestaurantController_changeState18_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restaurant/state/"), DynamicPart("rid", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RestaurantController_changeState18_invoker = createInvoker(
    RestaurantController_4.changeState(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "changeState",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """restaurant/state/""" + "$" + """rid<[^/]+>"""
    )
  )

  // @LINE:35
  private[this] lazy val controllers_RestaurantController_update19_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restaurant/"), DynamicPart("rid", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RestaurantController_update19_invoker = createInvoker(
    RestaurantController_4.update(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "update",
      Seq(classOf[String]),
      "PUT",
      """""",
      this.prefix + """restaurant/""" + "$" + """rid<[^/]+>"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_RestaurantController_updatePhoto20_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restaurant/"), DynamicPart("rid", """[^/]+""",true), StaticPart("/photo")))
  )
  private[this] lazy val controllers_RestaurantController_updatePhoto20_invoker = createInvoker(
    RestaurantController_4.updatePhoto(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "updatePhoto",
      Seq(classOf[String]),
      "PUT",
      """""",
      this.prefix + """restaurant/""" + "$" + """rid<[^/]+>/photo"""
    )
  )

  // @LINE:37
  private[this] lazy val controllers_RestaurantController_delete21_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restaurant/"), DynamicPart("rid", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RestaurantController_delete21_invoker = createInvoker(
    RestaurantController_4.delete(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "delete",
      Seq(classOf[String]),
      "DELETE",
      """""",
      this.prefix + """restaurant/""" + "$" + """rid<[^/]+>"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_RestaurantController_searchNearMe22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restaurants/nearMe/"), DynamicPart("lat", """[^/]+""",true), StaticPart("/"), DynamicPart("lng", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RestaurantController_searchNearMe22_invoker = createInvoker(
    RestaurantController_4.searchNearMe(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "searchNearMe",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """restaurants/nearMe/""" + "$" + """lat<[^/]+>/""" + "$" + """lng<[^/]+>"""
    )
  )

  // @LINE:41
  private[this] lazy val controllers_MealController_getMenu23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("menu/"), DynamicPart("rid", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MealController_getMenu23_invoker = createInvoker(
    MealController_3.getMenu(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MealController",
      "getMenu",
      Seq(classOf[String]),
      "GET",
      """Meal""",
      this.prefix + """menu/""" + "$" + """rid<[^/]+>"""
    )
  )

  // @LINE:42
  private[this] lazy val controllers_MealController_newMeal24_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("meal/"), DynamicPart("rid", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MealController_newMeal24_invoker = createInvoker(
    MealController_3.newMeal(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MealController",
      "newMeal",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """meal/""" + "$" + """rid<[^/]+>"""
    )
  )

  // @LINE:43
  private[this] lazy val controllers_MealController_update25_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("meal/"), DynamicPart("mid", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MealController_update25_invoker = createInvoker(
    MealController_3.update(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MealController",
      "update",
      Seq(classOf[String]),
      "PUT",
      """""",
      this.prefix + """meal/""" + "$" + """mid<[^/]+>"""
    )
  )

  // @LINE:44
  private[this] lazy val controllers_MealController_delete26_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("meal/"), DynamicPart("mid", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MealController_delete26_invoker = createInvoker(
    MealController_3.delete(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MealController",
      "delete",
      Seq(classOf[String]),
      "DELETE",
      """""",
      this.prefix + """meal/""" + "$" + """mid<[^/]+>"""
    )
  )

  // @LINE:47
  private[this] lazy val controllers_HomeController_ownerHome27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("owner/home")))
  )
  private[this] lazy val controllers_HomeController_ownerHome27_invoker = createInvoker(
    HomeController_2.ownerHome,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "ownerHome",
      Nil,
      "GET",
      """Owner""",
      this.prefix + """owner/home"""
    )
  )

  // @LINE:48
  private[this] lazy val controllers_HomeController_newRestaurant28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("owner/new-restaurant")))
  )
  private[this] lazy val controllers_HomeController_newRestaurant28_invoker = createInvoker(
    HomeController_2.newRestaurant,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "newRestaurant",
      Nil,
      "GET",
      """""",
      this.prefix + """owner/new-restaurant"""
    )
  )

  // @LINE:49
  private[this] lazy val controllers_HomeController_ownerProfile29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("owner/profile")))
  )
  private[this] lazy val controllers_HomeController_ownerProfile29_invoker = createInvoker(
    HomeController_2.ownerProfile,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "ownerProfile",
      Nil,
      "GET",
      """""",
      this.prefix + """owner/profile"""
    )
  )

  // @LINE:50
  private[this] lazy val controllers_HomeController_ownerRestaurant30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("owner/restaurant")))
  )
  private[this] lazy val controllers_HomeController_ownerRestaurant30_invoker = createInvoker(
    HomeController_2.ownerRestaurant,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "ownerRestaurant",
      Nil,
      "GET",
      """""",
      this.prefix + """owner/restaurant"""
    )
  )

  // @LINE:51
  private[this] lazy val controllers_HomeController_ownerRestaurants31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("owner/restaurants")))
  )
  private[this] lazy val controllers_HomeController_ownerRestaurants31_invoker = createInvoker(
    HomeController_2.ownerRestaurants,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "ownerRestaurants",
      Nil,
      "GET",
      """""",
      this.prefix + """owner/restaurants"""
    )
  )

  // @LINE:52
  private[this] lazy val controllers_OwnerProfileController_getOwner32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("owner/profile/user")))
  )
  private[this] lazy val controllers_OwnerProfileController_getOwner32_invoker = createInvoker(
    OwnerProfileController_0.getOwner,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OwnerProfileController",
      "getOwner",
      Nil,
      "GET",
      """""",
      this.prefix + """owner/profile/user"""
    )
  )

  // @LINE:53
  private[this] lazy val controllers_OwnerProfileController_deleteAccount33_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("owner/deleteAccount")))
  )
  private[this] lazy val controllers_OwnerProfileController_deleteAccount33_invoker = createInvoker(
    OwnerProfileController_0.deleteAccount,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OwnerProfileController",
      "deleteAccount",
      Nil,
      "POST",
      """""",
      this.prefix + """owner/deleteAccount"""
    )
  )

  // @LINE:56
  private[this] lazy val controllers_UserController_changePhoto34_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/photo")))
  )
  private[this] lazy val controllers_UserController_changePhoto34_invoker = createInvoker(
    UserController_5.changePhoto,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "changePhoto",
      Nil,
      "PUT",
      """User""",
      this.prefix + """user/photo"""
    )
  )

  // @LINE:57
  private[this] lazy val controllers_UserController_changeInfo35_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/info")))
  )
  private[this] lazy val controllers_UserController_changeInfo35_invoker = createInvoker(
    UserController_5.changeInfo,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "changeInfo",
      Nil,
      "PUT",
      """""",
      this.prefix + """user/info"""
    )
  )

  // @LINE:58
  private[this] lazy val controllers_UserController_changePassword36_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/password")))
  )
  private[this] lazy val controllers_UserController_changePassword36_invoker = createInvoker(
    UserController_5.changePassword,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "changePassword",
      Nil,
      "PUT",
      """""",
      this.prefix + """user/password"""
    )
  )

  // @LINE:60
  private[this] lazy val controllers_HomeController_getDays37_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("all/days")))
  )
  private[this] lazy val controllers_HomeController_getDays37_invoker = createInvoker(
    HomeController_2.getDays,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "getDays",
      Nil,
      "GET",
      """""",
      this.prefix + """all/days"""
    )
  )

  // @LINE:61
  private[this] lazy val controllers_HomeController_getCuisines38_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("all/cuisines")))
  )
  private[this] lazy val controllers_HomeController_getCuisines38_invoker = createInvoker(
    HomeController_2.getCuisines,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "getCuisines",
      Nil,
      "GET",
      """""",
      this.prefix + """all/cuisines"""
    )
  )

  // @LINE:64
  private[this] lazy val controllers_QualificationController_getUserRestaurantQualification39_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("qualification/client/"), DynamicPart("rid", """[^/]+""",true)))
  )
  private[this] lazy val controllers_QualificationController_getUserRestaurantQualification39_invoker = createInvoker(
    QualificationController_14.getUserRestaurantQualification(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.QualificationController",
      "getUserRestaurantQualification",
      Seq(classOf[String]),
      "GET",
      """Qualification""",
      this.prefix + """qualification/client/""" + "$" + """rid<[^/]+>"""
    )
  )

  // @LINE:65
  private[this] lazy val controllers_QualificationController_getRestaurantQualification40_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("qualification/"), DynamicPart("rid", """[^/]+""",true)))
  )
  private[this] lazy val controllers_QualificationController_getRestaurantQualification40_invoker = createInvoker(
    QualificationController_14.getRestaurantQualification(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.QualificationController",
      "getRestaurantQualification",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """qualification/""" + "$" + """rid<[^/]+>"""
    )
  )

  // @LINE:66
  private[this] lazy val controllers_QualificationController_addQualification41_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("qualification")))
  )
  private[this] lazy val controllers_QualificationController_addQualification41_invoker = createInvoker(
    QualificationController_14.addQualification,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.QualificationController",
      "addQualification",
      Nil,
      "PUT",
      """""",
      this.prefix + """qualification"""
    )
  )

  // @LINE:69
  private[this] lazy val controllers_OrderController_view42_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("order")))
  )
  private[this] lazy val controllers_OrderController_view42_invoker = createInvoker(
    OrderController_15.view,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "view",
      Nil,
      "GET",
      """Order""",
      this.prefix + """order"""
    )
  )

  // @LINE:70
  private[this] lazy val controllers_OrderController_ownerOrdersView43_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("owner/my-orders")))
  )
  private[this] lazy val controllers_OrderController_ownerOrdersView43_invoker = createInvoker(
    OrderController_15.ownerOrdersView,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "ownerOrdersView",
      Nil,
      "GET",
      """""",
      this.prefix + """owner/my-orders"""
    )
  )

  // @LINE:71
  private[this] lazy val controllers_OrderController_myOrdersView44_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("my-orders")))
  )
  private[this] lazy val controllers_OrderController_myOrdersView44_invoker = createInvoker(
    OrderController_15.myOrdersView,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "myOrdersView",
      Nil,
      "GET",
      """""",
      this.prefix + """my-orders"""
    )
  )

  // @LINE:72
  private[this] lazy val controllers_OrderController_getClientOrders45_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("orders/client")))
  )
  private[this] lazy val controllers_OrderController_getClientOrders45_invoker = createInvoker(
    OrderController_15.getClientOrders,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "getClientOrders",
      Nil,
      "GET",
      """""",
      this.prefix + """orders/client"""
    )
  )

  // @LINE:73
  private[this] lazy val controllers_OrderController_getOwnerOrders46_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("orders/owner")))
  )
  private[this] lazy val controllers_OrderController_getOwnerOrders46_invoker = createInvoker(
    OrderController_15.getOwnerOrders,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "getOwnerOrders",
      Nil,
      "GET",
      """""",
      this.prefix + """orders/owner"""
    )
  )

  // @LINE:74
  private[this] lazy val controllers_OrderController_getOwnerFirsts47_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("orders/owner/firsts")))
  )
  private[this] lazy val controllers_OrderController_getOwnerFirsts47_invoker = createInvoker(
    OrderController_15.getOwnerFirsts,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "getOwnerFirsts",
      Nil,
      "GET",
      """""",
      this.prefix + """orders/owner/firsts"""
    )
  )

  // @LINE:75
  private[this] lazy val controllers_OrderController_getOrder48_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("order/"), DynamicPart("oId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_OrderController_getOrder48_invoker = createInvoker(
    OrderController_15.getOrder(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "getOrder",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """order/""" + "$" + """oId<[^/]+>"""
    )
  )

  // @LINE:76
  private[this] lazy val controllers_OrderController_newOrder49_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("order")))
  )
  private[this] lazy val controllers_OrderController_newOrder49_invoker = createInvoker(
    OrderController_15.newOrder,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "newOrder",
      Nil,
      "POST",
      """""",
      this.prefix + """order"""
    )
  )

  // @LINE:79
  private[this] lazy val controllers_ReservationController_view50_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reservation")))
  )
  private[this] lazy val controllers_ReservationController_view50_invoker = createInvoker(
    ReservationController_8.view,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ReservationController",
      "view",
      Nil,
      "GET",
      """Reservation""",
      this.prefix + """reservation"""
    )
  )

  // @LINE:80
  private[this] lazy val controllers_ReservationController_getClientReservations51_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reservation/client")))
  )
  private[this] lazy val controllers_ReservationController_getClientReservations51_invoker = createInvoker(
    ReservationController_8.getClientReservations,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ReservationController",
      "getClientReservations",
      Nil,
      "GET",
      """""",
      this.prefix + """reservation/client"""
    )
  )

  // @LINE:81
  private[this] lazy val controllers_ReservationController_getOwnerReservations52_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reservation/owner")))
  )
  private[this] lazy val controllers_ReservationController_getOwnerReservations52_invoker = createInvoker(
    ReservationController_8.getOwnerReservations,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ReservationController",
      "getOwnerReservations",
      Nil,
      "GET",
      """""",
      this.prefix + """reservation/owner"""
    )
  )

  // @LINE:82
  private[this] lazy val controllers_ReservationController_getOwnerFirsts53_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reservation/owner/firsts")))
  )
  private[this] lazy val controllers_ReservationController_getOwnerFirsts53_invoker = createInvoker(
    ReservationController_8.getOwnerFirsts,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ReservationController",
      "getOwnerFirsts",
      Nil,
      "GET",
      """""",
      this.prefix + """reservation/owner/firsts"""
    )
  )

  // @LINE:83
  private[this] lazy val controllers_ReservationController_getOwnerFirsts54_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reservation/owner/firsts")))
  )
  private[this] lazy val controllers_ReservationController_getOwnerFirsts54_invoker = createInvoker(
    ReservationController_8.getOwnerFirsts,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ReservationController",
      "getOwnerFirsts",
      Nil,
      "GET",
      """""",
      this.prefix + """reservation/owner/firsts"""
    )
  )

  // @LINE:84
  private[this] lazy val controllers_ReservationController_viewClientReservations55_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("my-reservations")))
  )
  private[this] lazy val controllers_ReservationController_viewClientReservations55_invoker = createInvoker(
    ReservationController_8.viewClientReservations,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ReservationController",
      "viewClientReservations",
      Nil,
      "GET",
      """""",
      this.prefix + """my-reservations"""
    )
  )

  // @LINE:85
  private[this] lazy val controllers_ReservationController_viewOwnerReservations56_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("owner/my-reservations")))
  )
  private[this] lazy val controllers_ReservationController_viewOwnerReservations56_invoker = createInvoker(
    ReservationController_8.viewOwnerReservations,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ReservationController",
      "viewOwnerReservations",
      Nil,
      "GET",
      """""",
      this.prefix + """owner/my-reservations"""
    )
  )

  // @LINE:86
  private[this] lazy val controllers_ReservationController_getReservation57_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reservation/"), DynamicPart("rId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ReservationController_getReservation57_invoker = createInvoker(
    ReservationController_8.getReservation(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ReservationController",
      "getReservation",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """reservation/""" + "$" + """rId<[^/]+>"""
    )
  )

  // @LINE:87
  private[this] lazy val controllers_ReservationController_save58_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reservation")))
  )
  private[this] lazy val controllers_ReservationController_save58_invoker = createInvoker(
    ReservationController_8.save,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ReservationController",
      "save",
      Nil,
      "POST",
      """""",
      this.prefix + """reservation"""
    )
  )

  // @LINE:88
  private[this] lazy val controllers_ReservationController_delete59_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reservation/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ReservationController_delete59_invoker = createInvoker(
    ReservationController_8.delete(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ReservationController",
      "delete",
      Seq(classOf[String]),
      "DELETE",
      """""",
      this.prefix + """reservation/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:91
  private[this] lazy val controllers_DiscountController_getDiscount60_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("discount/"), DynamicPart("code", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DiscountController_getDiscount60_invoker = createInvoker(
    DiscountController_10.getDiscount(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DiscountController",
      "getDiscount",
      Seq(classOf[String]),
      "GET",
      """Discount""",
      this.prefix + """discount/""" + "$" + """code<[^/]+>"""
    )
  )

  // @LINE:94
  private[this] lazy val controllers_DebugController_getUsers61_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("all/users")))
  )
  private[this] lazy val controllers_DebugController_getUsers61_invoker = createInvoker(
    DebugController_6.getUsers,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DebugController",
      "getUsers",
      Nil,
      "GET",
      """Debug""",
      this.prefix + """all/users"""
    )
  )

  // @LINE:95
  private[this] lazy val controllers_DebugController_getRestaurants62_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("all/restaurants")))
  )
  private[this] lazy val controllers_DebugController_getRestaurants62_invoker = createInvoker(
    DebugController_6.getRestaurants,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DebugController",
      "getRestaurants",
      Nil,
      "GET",
      """""",
      this.prefix + """all/restaurants"""
    )
  )

  // @LINE:96
  private[this] lazy val controllers_DebugController_getDays63_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("all/days")))
  )
  private[this] lazy val controllers_DebugController_getDays63_invoker = createInvoker(
    DebugController_6.getDays,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DebugController",
      "getDays",
      Nil,
      "GET",
      """""",
      this.prefix + """all/days"""
    )
  )

  // @LINE:97
  private[this] lazy val controllers_DebugController_getCuisines64_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("all/cuisines")))
  )
  private[this] lazy val controllers_DebugController_getCuisines64_invoker = createInvoker(
    DebugController_6.getCuisines,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DebugController",
      "getCuisines",
      Nil,
      "GET",
      """""",
      this.prefix + """all/cuisines"""
    )
  )

  // @LINE:98
  private[this] lazy val controllers_DebugController_getMeals65_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("all/meals")))
  )
  private[this] lazy val controllers_DebugController_getMeals65_invoker = createInvoker(
    DebugController_6.getMeals,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DebugController",
      "getMeals",
      Nil,
      "GET",
      """""",
      this.prefix + """all/meals"""
    )
  )

  // @LINE:101
  private[this] lazy val controllers_MessageController_messages66_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("messages.js")))
  )
  private[this] lazy val controllers_MessageController_messages66_invoker = createInvoker(
    MessageController_1.messages(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MessageController",
      "messages",
      Nil,
      "GET",
      """Messages (I18N)""",
      this.prefix + """messages.js"""
    )
  )

  // @LINE:102
  private[this] lazy val controllers_MessageController_getCurrentLang67_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("language")))
  )
  private[this] lazy val controllers_MessageController_getCurrentLang67_invoker = createInvoker(
    MessageController_1.getCurrentLang,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MessageController",
      "getCurrentLang",
      Nil,
      "GET",
      """""",
      this.prefix + """language"""
    )
  )

  // @LINE:103
  private[this] lazy val controllers_MessageController_changeLang68_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("language/change")))
  )
  private[this] lazy val controllers_MessageController_changeLang68_invoker = createInvoker(
    MessageController_1.changeLang,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MessageController",
      "changeLang",
      Nil,
      "POST",
      """""",
      this.prefix + """language/change"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_2.index)
      }
  
    // @LINE:10
    case controllers_Assets_versioned1_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned1_invoker.call(Assets_12.versioned(path, file))
      }
  
    // @LINE:12
    case controllers_RegisterController_registerUser2_route(params) =>
      call { 
        controllers_RegisterController_registerUser2_invoker.call(RegisterController_9.registerUser)
      }
  
    // @LINE:14
    case controllers_LoginController_login3_route(params) =>
      call { 
        controllers_LoginController_login3_invoker.call(LoginController_13.login)
      }
  
    // @LINE:15
    case controllers_LoginController_logout4_route(params) =>
      call { 
        controllers_LoginController_logout4_invoker.call(LoginController_13.logout)
      }
  
    // @LINE:18
    case controllers_HomeController_clientHome5_route(params) =>
      call { 
        controllers_HomeController_clientHome5_invoker.call(HomeController_2.clientHome)
      }
  
    // @LINE:20
    case controllers_HomeController_clientProfile6_route(params) =>
      call { 
        controllers_HomeController_clientProfile6_invoker.call(HomeController_2.clientProfile)
      }
  
    // @LINE:21
    case controllers_ClientProfileController_getClient7_route(params) =>
      call { 
        controllers_ClientProfileController_getClient7_invoker.call(ClientProfileController_11.getClient)
      }
  
    // @LINE:22
    case controllers_HomeController_clientRestaurant8_route(params) =>
      call { 
        controllers_HomeController_clientRestaurant8_invoker.call(HomeController_2.clientRestaurant)
      }
  
    // @LINE:23
    case controllers_ClientHomeController_searchAllRestaurants9_route(params) =>
      call { 
        controllers_ClientHomeController_searchAllRestaurants9_invoker.call(ClientHomeController_7.searchAllRestaurants)
      }
  
    // @LINE:24
    case controllers_ClientProfileController_deleteAccount10_route(params) =>
      call { 
        controllers_ClientProfileController_deleteAccount10_invoker.call(ClientProfileController_11.deleteAccount)
      }
  
    // @LINE:25
    case controllers_ClientHomeController_search11_route(params) =>
      call { 
        controllers_ClientHomeController_search11_invoker.call(ClientHomeController_7.search)
      }
  
    // @LINE:26
    case controllers_ClientHomeController_getRecommendations12_route(params) =>
      call { 
        controllers_ClientHomeController_getRecommendations12_invoker.call(ClientHomeController_7.getRecommendations)
      }
  
    // @LINE:29
    case controllers_RestaurantController_addRestaurant13_route(params) =>
      call { 
        controllers_RestaurantController_addRestaurant13_invoker.call(RestaurantController_4.addRestaurant)
      }
  
    // @LINE:30
    case controllers_RestaurantController_getAll14_route(params) =>
      call { 
        controllers_RestaurantController_getAll14_invoker.call(RestaurantController_4.getAll)
      }
  
    // @LINE:31
    case controllers_RestaurantController_getFirsts15_route(params) =>
      call { 
        controllers_RestaurantController_getFirsts15_invoker.call(RestaurantController_4.getFirsts)
      }
  
    // @LINE:32
    case controllers_RestaurantController_getRestaurantsFromOwner16_route(params) =>
      call { 
        controllers_RestaurantController_getRestaurantsFromOwner16_invoker.call(RestaurantController_4.getRestaurantsFromOwner())
      }
  
    // @LINE:33
    case controllers_RestaurantController_getRestaurant17_route(params) =>
      call(params.fromPath[String]("rid", None)) { (rid) =>
        controllers_RestaurantController_getRestaurant17_invoker.call(RestaurantController_4.getRestaurant(rid))
      }
  
    // @LINE:34
    case controllers_RestaurantController_changeState18_route(params) =>
      call(params.fromPath[String]("rid", None)) { (rid) =>
        controllers_RestaurantController_changeState18_invoker.call(RestaurantController_4.changeState(rid))
      }
  
    // @LINE:35
    case controllers_RestaurantController_update19_route(params) =>
      call(params.fromPath[String]("rid", None)) { (rid) =>
        controllers_RestaurantController_update19_invoker.call(RestaurantController_4.update(rid))
      }
  
    // @LINE:36
    case controllers_RestaurantController_updatePhoto20_route(params) =>
      call(params.fromPath[String]("rid", None)) { (rid) =>
        controllers_RestaurantController_updatePhoto20_invoker.call(RestaurantController_4.updatePhoto(rid))
      }
  
    // @LINE:37
    case controllers_RestaurantController_delete21_route(params) =>
      call(params.fromPath[String]("rid", None)) { (rid) =>
        controllers_RestaurantController_delete21_invoker.call(RestaurantController_4.delete(rid))
      }
  
    // @LINE:38
    case controllers_RestaurantController_searchNearMe22_route(params) =>
      call(params.fromPath[String]("lat", None), params.fromPath[String]("lng", None)) { (lat, lng) =>
        controllers_RestaurantController_searchNearMe22_invoker.call(RestaurantController_4.searchNearMe(lat, lng))
      }
  
    // @LINE:41
    case controllers_MealController_getMenu23_route(params) =>
      call(params.fromPath[String]("rid", None)) { (rid) =>
        controllers_MealController_getMenu23_invoker.call(MealController_3.getMenu(rid))
      }
  
    // @LINE:42
    case controllers_MealController_newMeal24_route(params) =>
      call(params.fromPath[String]("rid", None)) { (rid) =>
        controllers_MealController_newMeal24_invoker.call(MealController_3.newMeal(rid))
      }
  
    // @LINE:43
    case controllers_MealController_update25_route(params) =>
      call(params.fromPath[String]("mid", None)) { (mid) =>
        controllers_MealController_update25_invoker.call(MealController_3.update(mid))
      }
  
    // @LINE:44
    case controllers_MealController_delete26_route(params) =>
      call(params.fromPath[String]("mid", None)) { (mid) =>
        controllers_MealController_delete26_invoker.call(MealController_3.delete(mid))
      }
  
    // @LINE:47
    case controllers_HomeController_ownerHome27_route(params) =>
      call { 
        controllers_HomeController_ownerHome27_invoker.call(HomeController_2.ownerHome)
      }
  
    // @LINE:48
    case controllers_HomeController_newRestaurant28_route(params) =>
      call { 
        controllers_HomeController_newRestaurant28_invoker.call(HomeController_2.newRestaurant)
      }
  
    // @LINE:49
    case controllers_HomeController_ownerProfile29_route(params) =>
      call { 
        controllers_HomeController_ownerProfile29_invoker.call(HomeController_2.ownerProfile)
      }
  
    // @LINE:50
    case controllers_HomeController_ownerRestaurant30_route(params) =>
      call { 
        controllers_HomeController_ownerRestaurant30_invoker.call(HomeController_2.ownerRestaurant)
      }
  
    // @LINE:51
    case controllers_HomeController_ownerRestaurants31_route(params) =>
      call { 
        controllers_HomeController_ownerRestaurants31_invoker.call(HomeController_2.ownerRestaurants)
      }
  
    // @LINE:52
    case controllers_OwnerProfileController_getOwner32_route(params) =>
      call { 
        controllers_OwnerProfileController_getOwner32_invoker.call(OwnerProfileController_0.getOwner)
      }
  
    // @LINE:53
    case controllers_OwnerProfileController_deleteAccount33_route(params) =>
      call { 
        controllers_OwnerProfileController_deleteAccount33_invoker.call(OwnerProfileController_0.deleteAccount)
      }
  
    // @LINE:56
    case controllers_UserController_changePhoto34_route(params) =>
      call { 
        controllers_UserController_changePhoto34_invoker.call(UserController_5.changePhoto)
      }
  
    // @LINE:57
    case controllers_UserController_changeInfo35_route(params) =>
      call { 
        controllers_UserController_changeInfo35_invoker.call(UserController_5.changeInfo)
      }
  
    // @LINE:58
    case controllers_UserController_changePassword36_route(params) =>
      call { 
        controllers_UserController_changePassword36_invoker.call(UserController_5.changePassword)
      }
  
    // @LINE:60
    case controllers_HomeController_getDays37_route(params) =>
      call { 
        controllers_HomeController_getDays37_invoker.call(HomeController_2.getDays)
      }
  
    // @LINE:61
    case controllers_HomeController_getCuisines38_route(params) =>
      call { 
        controllers_HomeController_getCuisines38_invoker.call(HomeController_2.getCuisines)
      }
  
    // @LINE:64
    case controllers_QualificationController_getUserRestaurantQualification39_route(params) =>
      call(params.fromPath[String]("rid", None)) { (rid) =>
        controllers_QualificationController_getUserRestaurantQualification39_invoker.call(QualificationController_14.getUserRestaurantQualification(rid))
      }
  
    // @LINE:65
    case controllers_QualificationController_getRestaurantQualification40_route(params) =>
      call(params.fromPath[String]("rid", None)) { (rid) =>
        controllers_QualificationController_getRestaurantQualification40_invoker.call(QualificationController_14.getRestaurantQualification(rid))
      }
  
    // @LINE:66
    case controllers_QualificationController_addQualification41_route(params) =>
      call { 
        controllers_QualificationController_addQualification41_invoker.call(QualificationController_14.addQualification)
      }
  
    // @LINE:69
    case controllers_OrderController_view42_route(params) =>
      call { 
        controllers_OrderController_view42_invoker.call(OrderController_15.view)
      }
  
    // @LINE:70
    case controllers_OrderController_ownerOrdersView43_route(params) =>
      call { 
        controllers_OrderController_ownerOrdersView43_invoker.call(OrderController_15.ownerOrdersView)
      }
  
    // @LINE:71
    case controllers_OrderController_myOrdersView44_route(params) =>
      call { 
        controllers_OrderController_myOrdersView44_invoker.call(OrderController_15.myOrdersView)
      }
  
    // @LINE:72
    case controllers_OrderController_getClientOrders45_route(params) =>
      call { 
        controllers_OrderController_getClientOrders45_invoker.call(OrderController_15.getClientOrders)
      }
  
    // @LINE:73
    case controllers_OrderController_getOwnerOrders46_route(params) =>
      call { 
        controllers_OrderController_getOwnerOrders46_invoker.call(OrderController_15.getOwnerOrders)
      }
  
    // @LINE:74
    case controllers_OrderController_getOwnerFirsts47_route(params) =>
      call { 
        controllers_OrderController_getOwnerFirsts47_invoker.call(OrderController_15.getOwnerFirsts)
      }
  
    // @LINE:75
    case controllers_OrderController_getOrder48_route(params) =>
      call(params.fromPath[String]("oId", None)) { (oId) =>
        controllers_OrderController_getOrder48_invoker.call(OrderController_15.getOrder(oId))
      }
  
    // @LINE:76
    case controllers_OrderController_newOrder49_route(params) =>
      call { 
        controllers_OrderController_newOrder49_invoker.call(OrderController_15.newOrder)
      }
  
    // @LINE:79
    case controllers_ReservationController_view50_route(params) =>
      call { 
        controllers_ReservationController_view50_invoker.call(ReservationController_8.view)
      }
  
    // @LINE:80
    case controllers_ReservationController_getClientReservations51_route(params) =>
      call { 
        controllers_ReservationController_getClientReservations51_invoker.call(ReservationController_8.getClientReservations)
      }
  
    // @LINE:81
    case controllers_ReservationController_getOwnerReservations52_route(params) =>
      call { 
        controllers_ReservationController_getOwnerReservations52_invoker.call(ReservationController_8.getOwnerReservations)
      }
  
    // @LINE:82
    case controllers_ReservationController_getOwnerFirsts53_route(params) =>
      call { 
        controllers_ReservationController_getOwnerFirsts53_invoker.call(ReservationController_8.getOwnerFirsts)
      }
  
    // @LINE:83
    case controllers_ReservationController_getOwnerFirsts54_route(params) =>
      call { 
        controllers_ReservationController_getOwnerFirsts54_invoker.call(ReservationController_8.getOwnerFirsts)
      }
  
    // @LINE:84
    case controllers_ReservationController_viewClientReservations55_route(params) =>
      call { 
        controllers_ReservationController_viewClientReservations55_invoker.call(ReservationController_8.viewClientReservations)
      }
  
    // @LINE:85
    case controllers_ReservationController_viewOwnerReservations56_route(params) =>
      call { 
        controllers_ReservationController_viewOwnerReservations56_invoker.call(ReservationController_8.viewOwnerReservations)
      }
  
    // @LINE:86
    case controllers_ReservationController_getReservation57_route(params) =>
      call(params.fromPath[String]("rId", None)) { (rId) =>
        controllers_ReservationController_getReservation57_invoker.call(ReservationController_8.getReservation(rId))
      }
  
    // @LINE:87
    case controllers_ReservationController_save58_route(params) =>
      call { 
        controllers_ReservationController_save58_invoker.call(ReservationController_8.save)
      }
  
    // @LINE:88
    case controllers_ReservationController_delete59_route(params) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_ReservationController_delete59_invoker.call(ReservationController_8.delete(id))
      }
  
    // @LINE:91
    case controllers_DiscountController_getDiscount60_route(params) =>
      call(params.fromPath[String]("code", None)) { (code) =>
        controllers_DiscountController_getDiscount60_invoker.call(DiscountController_10.getDiscount(code))
      }
  
    // @LINE:94
    case controllers_DebugController_getUsers61_route(params) =>
      call { 
        controllers_DebugController_getUsers61_invoker.call(DebugController_6.getUsers)
      }
  
    // @LINE:95
    case controllers_DebugController_getRestaurants62_route(params) =>
      call { 
        controllers_DebugController_getRestaurants62_invoker.call(DebugController_6.getRestaurants)
      }
  
    // @LINE:96
    case controllers_DebugController_getDays63_route(params) =>
      call { 
        controllers_DebugController_getDays63_invoker.call(DebugController_6.getDays)
      }
  
    // @LINE:97
    case controllers_DebugController_getCuisines64_route(params) =>
      call { 
        controllers_DebugController_getCuisines64_invoker.call(DebugController_6.getCuisines)
      }
  
    // @LINE:98
    case controllers_DebugController_getMeals65_route(params) =>
      call { 
        controllers_DebugController_getMeals65_invoker.call(DebugController_6.getMeals)
      }
  
    // @LINE:101
    case controllers_MessageController_messages66_route(params) =>
      call { 
        controllers_MessageController_messages66_invoker.call(MessageController_1.messages())
      }
  
    // @LINE:102
    case controllers_MessageController_getCurrentLang67_route(params) =>
      call { 
        controllers_MessageController_getCurrentLang67_invoker.call(MessageController_1.getCurrentLang)
      }
  
    // @LINE:103
    case controllers_MessageController_changeLang68_route(params) =>
      call { 
        controllers_MessageController_changeLang68_invoker.call(MessageController_1.changeLang)
      }
  }
}
