package royalties.api

import grails.converters.JSON

class AuthorController {

    def index() {
        render Author.summonAuthors() as JSON
    }
}
