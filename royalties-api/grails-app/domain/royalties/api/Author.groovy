package royalties.api

class Author {


    static Author[] summonAuthors() {
        [new Author("author1"), new Author("author2")]
    }

    String name

    Author(def name) {
        this.name = name;
    }
}
