package jsonservice

import grails.gorm.transactions.Transactional

@Transactional
class RouteService {

    def registerNewRoute(Route route) {
        route.save(flush: true, failOnError: true)
    }
}
