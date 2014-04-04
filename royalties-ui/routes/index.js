
/*
 * GET home page.
 */

var rest = require("restler");
var _ = require('lodash');

var authors;
rest.get('http://localhost:8080/royalties-api/author').on('complete', function(response) {
    console.log(response);
    authors = _.pluck(response, "name").join(", ");
});

exports.index = function(req, res){
  res.render('index', { title: authors });
};