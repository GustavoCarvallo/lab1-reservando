
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Gustavo/Desktop/laboratorio/reservando/conf/routes
// @DATE:Tue Jul 11 18:34:53 ART 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:29
  class ReverseRestaurantController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:38
    def searchNearMe: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.searchNearMe",
      """
        function(lat0,lng1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "restaurants/nearMe/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("lat", encodeURIComponent(lat0)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("lng", encodeURIComponent(lng1))})
        }
      """
    )
  
    // @LINE:34
    def changeState: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.changeState",
      """
        function(rid0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "restaurant/state/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("rid", encodeURIComponent(rid0))})
        }
      """
    )
  
    // @LINE:32
    def getRestaurantsFromOwner: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.getRestaurantsFromOwner",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "restaurants/of-owner"})
        }
      """
    )
  
    // @LINE:36
    def updatePhoto: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.updatePhoto",
      """
        function(rid0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "restaurant/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("rid", encodeURIComponent(rid0)) + "/photo"})
        }
      """
    )
  
    // @LINE:30
    def getAll: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.getAll",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "restaurants/all"})
        }
      """
    )
  
    // @LINE:29
    def addRestaurant: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.addRestaurant",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "restaurant"})
        }
      """
    )
  
    // @LINE:31
    def getFirsts: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.getFirsts",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "restaurants/firsts"})
        }
      """
    )
  
    // @LINE:37
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.delete",
      """
        function(rid0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "restaurant/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("rid", encodeURIComponent(rid0))})
        }
      """
    )
  
    // @LINE:33
    def getRestaurant: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.getRestaurant",
      """
        function(rid0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "restaurant/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("rid", encodeURIComponent(rid0))})
        }
      """
    )
  
    // @LINE:35
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.update",
      """
        function(rid0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "restaurant/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("rid", encodeURIComponent(rid0))})
        }
      """
    )
  
  }

  // @LINE:91
  class ReverseDiscountController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:91
    def getDiscount: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DiscountController.getDiscount",
      """
        function(code0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "discount/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("code", encodeURIComponent(code0))})
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:12
  class ReverseRegisterController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def registerUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RegisterController.registerUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
        }
      """
    )
  
  }

  // @LINE:41
  class ReverseMealController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:44
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MealController.delete",
      """
        function(mid0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "meal/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("mid", encodeURIComponent(mid0))})
        }
      """
    )
  
    // @LINE:42
    def newMeal: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MealController.newMeal",
      """
        function(rid0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "meal/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("rid", encodeURIComponent(rid0))})
        }
      """
    )
  
    // @LINE:41
    def getMenu: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MealController.getMenu",
      """
        function(rid0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "menu/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("rid", encodeURIComponent(rid0))})
        }
      """
    )
  
    // @LINE:43
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MealController.update",
      """
        function(mid0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "meal/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("mid", encodeURIComponent(mid0))})
        }
      """
    )
  
  }

  // @LINE:21
  class ReverseClientProfileController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def deleteAccount: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ClientProfileController.deleteAccount",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "client/deleteAccount"})
        }
      """
    )
  
    // @LINE:21
    def getClient: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ClientProfileController.getClient",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "client/profile/user"})
        }
      """
    )
  
  }

  // @LINE:79
  class ReverseReservationController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:84
    def viewClientReservations: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ReservationController.viewClientReservations",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "my-reservations"})
        }
      """
    )
  
    // @LINE:86
    def getReservation: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ReservationController.getReservation",
      """
        function(rId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reservation/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("rId", encodeURIComponent(rId0))})
        }
      """
    )
  
    // @LINE:80
    def getClientReservations: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ReservationController.getClientReservations",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reservation/client"})
        }
      """
    )
  
    // @LINE:85
    def viewOwnerReservations: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ReservationController.viewOwnerReservations",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "owner/my-reservations"})
        }
      """
    )
  
    // @LINE:82
    def getOwnerFirsts: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ReservationController.getOwnerFirsts",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reservation/owner/firsts"})
          }
        
        }
      """
    )
  
    // @LINE:81
    def getOwnerReservations: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ReservationController.getOwnerReservations",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reservation/owner"})
        }
      """
    )
  
    // @LINE:88
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ReservationController.delete",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "reservation/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id0))})
        }
      """
    )
  
    // @LINE:87
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ReservationController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "reservation"})
        }
      """
    )
  
    // @LINE:79
    def view: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ReservationController.view",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reservation"})
        }
      """
    )
  
  }

  // @LINE:56
  class ReverseUserController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:57
    def changeInfo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.changeInfo",
      """
        function() {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "user/info"})
        }
      """
    )
  
    // @LINE:58
    def changePassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.changePassword",
      """
        function() {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "user/password"})
        }
      """
    )
  
    // @LINE:56
    def changePhoto: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.changePhoto",
      """
        function() {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "user/photo"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def clientHome: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.clientHome",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "client/home"})
        }
      """
    )
  
    // @LINE:49
    def ownerProfile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.ownerProfile",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "owner/profile"})
        }
      """
    )
  
    // @LINE:51
    def ownerRestaurants: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.ownerRestaurants",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "owner/restaurants"})
        }
      """
    )
  
    // @LINE:22
    def clientRestaurant: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.clientRestaurant",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "client/restaurant"})
        }
      """
    )
  
    // @LINE:48
    def newRestaurant: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.newRestaurant",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "owner/new-restaurant"})
        }
      """
    )
  
    // @LINE:50
    def ownerRestaurant: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.ownerRestaurant",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "owner/restaurant"})
        }
      """
    )
  
    // @LINE:47
    def ownerHome: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.ownerHome",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "owner/home"})
        }
      """
    )
  
    // @LINE:60
    def getDays: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.getDays",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "all/days"})
        }
      """
    )
  
    // @LINE:20
    def clientProfile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.clientProfile",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "client/profile"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:61
    def getCuisines: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.getCuisines",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "all/cuisines"})
        }
      """
    )
  
  }

  // @LINE:14
  class ReverseLoginController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:14
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.login",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }

  // @LINE:94
  class ReverseDebugController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:94
    def getUsers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DebugController.getUsers",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "all/users"})
        }
      """
    )
  
    // @LINE:98
    def getMeals: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DebugController.getMeals",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "all/meals"})
        }
      """
    )
  
    // @LINE:95
    def getRestaurants: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DebugController.getRestaurants",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "all/restaurants"})
        }
      """
    )
  
    // @LINE:96
    def getDays: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DebugController.getDays",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "all/days"})
        }
      """
    )
  
    // @LINE:97
    def getCuisines: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DebugController.getCuisines",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "all/cuisines"})
        }
      """
    )
  
  }

  // @LINE:69
  class ReverseOrderController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:72
    def getClientOrders: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.getClientOrders",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "orders/client"})
        }
      """
    )
  
    // @LINE:70
    def ownerOrdersView: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.ownerOrdersView",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "owner/my-orders"})
        }
      """
    )
  
    // @LINE:73
    def getOwnerOrders: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.getOwnerOrders",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "orders/owner"})
        }
      """
    )
  
    // @LINE:74
    def getOwnerFirsts: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.getOwnerFirsts",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "orders/owner/firsts"})
        }
      """
    )
  
    // @LINE:76
    def newOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.newOrder",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "order"})
        }
      """
    )
  
    // @LINE:75
    def getOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.getOrder",
      """
        function(oId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "order/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("oId", encodeURIComponent(oId0))})
        }
      """
    )
  
    // @LINE:71
    def myOrdersView: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.myOrdersView",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "my-orders"})
        }
      """
    )
  
    // @LINE:69
    def view: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.view",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "order"})
        }
      """
    )
  
  }

  // @LINE:101
  class ReverseMessageController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:103
    def changeLang: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MessageController.changeLang",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "language/change"})
        }
      """
    )
  
    // @LINE:102
    def getCurrentLang: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MessageController.getCurrentLang",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "language"})
        }
      """
    )
  
    // @LINE:101
    def messages: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MessageController.messages",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "messages.js"})
        }
      """
    )
  
  }

  // @LINE:23
  class ReverseClientHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def getRecommendations: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ClientHomeController.getRecommendations",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "client/getRecommendations"})
        }
      """
    )
  
    // @LINE:23
    def searchAllRestaurants: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ClientHomeController.searchAllRestaurants",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "client/searchAllRestaurants"})
        }
      """
    )
  
    // @LINE:25
    def search: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ClientHomeController.search",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "client/search"})
        }
      """
    )
  
  }

  // @LINE:64
  class ReverseQualificationController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:65
    def getRestaurantQualification: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.QualificationController.getRestaurantQualification",
      """
        function(rid0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "qualification/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("rid", encodeURIComponent(rid0))})
        }
      """
    )
  
    // @LINE:64
    def getUserRestaurantQualification: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.QualificationController.getUserRestaurantQualification",
      """
        function(rid0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "qualification/client/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("rid", encodeURIComponent(rid0))})
        }
      """
    )
  
    // @LINE:66
    def addQualification: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.QualificationController.addQualification",
      """
        function() {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "qualification"})
        }
      """
    )
  
  }

  // @LINE:52
  class ReverseOwnerProfileController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:53
    def deleteAccount: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OwnerProfileController.deleteAccount",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "owner/deleteAccount"})
        }
      """
    )
  
    // @LINE:52
    def getOwner: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OwnerProfileController.getOwner",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "owner/profile/user"})
        }
      """
    )
  
  }


}
