package jsonservice

class RouteType {

    String description

    static belongsTo = [route: Route]

    static constraints = {
    }
}
