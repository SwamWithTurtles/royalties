package royalties.api

import grails.converters.JSON

class AuthorController {

    def authors = ["author1", "author2"]

    def index() {
        render authors as JSON
    }
}
