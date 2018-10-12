package jsonservice


import grails.rest.*
import grails.converters.*

class RouteController {
    def routeService
	static responseFormats = ['json', 'xml']
	
    def registerRoute(Route route) {
        respond routeService.registerNewRoute(route)
    }
}
