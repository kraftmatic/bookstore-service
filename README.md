# RESTful Bookstore Service

This is a demo service layer that uses a combination of Spring 4 MVC and Jackson to create a RESTful interface to a MySQL database.  The libraries for the JDBC/MySQL connection are present but the code currently isn't written.

Right now the following endpoints are available:

GET /books
Running on a local machine with a default Tomcat install you can point your browser to http://localhost:8080/bookstoreservice/books to access this endpoint

GET /books/author/{authorname}
Retrieve a list of books by specific author name.

PUT /submitBook
Request body will be a Book object in JSON form.

