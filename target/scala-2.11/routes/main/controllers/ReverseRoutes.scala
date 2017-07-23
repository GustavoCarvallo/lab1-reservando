
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Gustavo/Desktop/laboratorio/reservando/conf/routes
// @DATE:Tue Jul 11 18:34:53 ART 2017

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:29
  class ReverseRestaurantController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:38
    def searchNearMe(lat:String, lng:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "restaurants/nearMe/" + implicitly[PathBindable[String]].unbind("lat", dynamicString(lat)) + "/" + implicitly[PathBindable[String]].unbind("lng", dynamicString(lng)))
    }
  
    // @LINE:34
    def changeState(rid:String): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "restaurant/state/" + implicitly[PathBindable[String]].unbind("rid", dynamicString(rid)))
    }
  
    // @LINE:32
    def getRestaurantsFromOwner(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "restaurants/of-owner")
    }
  
    // @LINE:36
    def updatePhoto(rid:String): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "restaurant/" + implicitly[PathBindable[String]].unbind("rid", dynamicString(rid)) + "/photo")
    }
  
    // @LINE:30
    def getAll(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "restaurants/all")
    }
  
    // @LINE:29
    def addRestaurant(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "restaurant")
    }
  
    // @LINE:31
    def getFirsts(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "restaurants/firsts")
    }
  
    // @LINE:37
    def delete(rid:String): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "restaurant/" + implicitly[PathBindable[String]].unbind("rid", dynamicString(rid)))
    }
  
    // @LINE:33
    def getRestaurant(rid:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "restaurant/" + implicitly[PathBindable[String]].unbind("rid", dynamicString(rid)))
    }
  
    // @LINE:35
    def update(rid:String): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "restaurant/" + implicitly[PathBindable[String]].unbind("rid", dynamicString(rid)))
    }
  
  }

  // @LINE:91
  class ReverseDiscountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:91
    def getDiscount(code:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "discount/" + implicitly[PathBindable[String]].unbind("code", dynamicString(code)))
    }
  
  }

  // @LINE:10
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:12
  class ReverseRegisterController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def registerUser(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "register")
    }
  
  }

  // @LINE:41
  class ReverseMealController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:44
    def delete(mid:String): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "meal/" + implicitly[PathBindable[String]].unbind("mid", dynamicString(mid)))
    }
  
    // @LINE:42
    def newMeal(rid:String): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "meal/" + implicitly[PathBindable[String]].unbind("rid", dynamicString(rid)))
    }
  
    // @LINE:41
    def getMenu(rid:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "menu/" + implicitly[PathBindable[String]].unbind("rid", dynamicString(rid)))
    }
  
    // @LINE:43
    def update(mid:String): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "meal/" + implicitly[PathBindable[String]].unbind("mid", dynamicString(mid)))
    }
  
  }

  // @LINE:21
  class ReverseClientProfileController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def deleteAccount(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "client/deleteAccount")
    }
  
    // @LINE:21
    def getClient(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "client/profile/user")
    }
  
  }

  // @LINE:79
  class ReverseReservationController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:84
    def viewClientReservations(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "my-reservations")
    }
  
    // @LINE:86
    def getReservation(rId:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "reservation/" + implicitly[PathBindable[String]].unbind("rId", dynamicString(rId)))
    }
  
    // @LINE:80
    def getClientReservations(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "reservation/client")
    }
  
    // @LINE:85
    def viewOwnerReservations(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "owner/my-reservations")
    }
  
    // @LINE:82
    def getOwnerFirsts(): Call = {
    
      () match {
      
        // @LINE:82
        case ()  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "reservation/owner/firsts")
      
      }
    
    }
  
    // @LINE:81
    def getOwnerReservations(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "reservation/owner")
    }
  
    // @LINE:88
    def delete(id:String): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "reservation/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
    }
  
    // @LINE:87
    def save(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "reservation")
    }
  
    // @LINE:79
    def view(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "reservation")
    }
  
  }

  // @LINE:56
  class ReverseUserController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:57
    def changeInfo(): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "user/info")
    }
  
    // @LINE:58
    def changePassword(): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "user/password")
    }
  
    // @LINE:56
    def changePhoto(): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "user/photo")
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def clientHome(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "client/home")
    }
  
    // @LINE:49
    def ownerProfile(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "owner/profile")
    }
  
    // @LINE:51
    def ownerRestaurants(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "owner/restaurants")
    }
  
    // @LINE:22
    def clientRestaurant(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "client/restaurant")
    }
  
    // @LINE:48
    def newRestaurant(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "owner/new-restaurant")
    }
  
    // @LINE:50
    def ownerRestaurant(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "owner/restaurant")
    }
  
    // @LINE:47
    def ownerHome(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "owner/home")
    }
  
    // @LINE:60
    def getDays(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "all/days")
    }
  
    // @LINE:20
    def clientProfile(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "client/profile")
    }
  
    // @LINE:6
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
    // @LINE:61
    def getCuisines(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "all/cuisines")
    }
  
  }

  // @LINE:14
  class ReverseLoginController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def logout(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:14
    def login(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:94
  class ReverseDebugController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:94
    def getUsers(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "all/users")
    }
  
    // @LINE:98
    def getMeals(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "all/meals")
    }
  
    // @LINE:95
    def getRestaurants(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "all/restaurants")
    }
  
    // @LINE:96
    def getDays(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "all/days")
    }
  
    // @LINE:97
    def getCuisines(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "all/cuisines")
    }
  
  }

  // @LINE:69
  class ReverseOrderController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:72
    def getClientOrders(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "orders/client")
    }
  
    // @LINE:70
    def ownerOrdersView(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "owner/my-orders")
    }
  
    // @LINE:73
    def getOwnerOrders(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "orders/owner")
    }
  
    // @LINE:74
    def getOwnerFirsts(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "orders/owner/firsts")
    }
  
    // @LINE:76
    def newOrder(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "order")
    }
  
    // @LINE:75
    def getOrder(oId:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "order/" + implicitly[PathBindable[String]].unbind("oId", dynamicString(oId)))
    }
  
    // @LINE:71
    def myOrdersView(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "my-orders")
    }
  
    // @LINE:69
    def view(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "order")
    }
  
  }

  // @LINE:101
  class ReverseMessageController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:103
    def changeLang(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "language/change")
    }
  
    // @LINE:102
    def getCurrentLang(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "language")
    }
  
    // @LINE:101
    def messages(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "messages.js")
    }
  
  }

  // @LINE:23
  class ReverseClientHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def getRecommendations(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "client/getRecommendations")
    }
  
    // @LINE:23
    def searchAllRestaurants(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "client/searchAllRestaurants")
    }
  
    // @LINE:25
    def search(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "client/search")
    }
  
  }

  // @LINE:64
  class ReverseQualificationController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:65
    def getRestaurantQualification(rid:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "qualification/" + implicitly[PathBindable[String]].unbind("rid", dynamicString(rid)))
    }
  
    // @LINE:64
    def getUserRestaurantQualification(rid:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "qualification/client/" + implicitly[PathBindable[String]].unbind("rid", dynamicString(rid)))
    }
  
    // @LINE:66
    def addQualification(): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "qualification")
    }
  
  }

  // @LINE:52
  class ReverseOwnerProfileController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:53
    def deleteAccount(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "owner/deleteAccount")
    }
  
    // @LINE:52
    def getOwner(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "owner/profile/user")
    }
  
  }


}
