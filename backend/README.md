# Banking Application SDA

<a name="readme-top"></a>

<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#uml-class-diagram">UML Class Diagram</a>
        <ul>
        <li><a href="#technologies-used">Technology Used</a></li>
      </ul>
</li>
      </ul>
    </li>
    <li>
      <a href="#controllers-and-routes-structure">Controller</a>
    </li>
    <ul>
        <li><a href="#links">Links</a></li>
      </ul>
    </li>
    <li><a href="#future-work">Future Work</a></li>
    <li><a href="#resources">Resource</a></li>
  </ol>
</details>



This project is a banking application system management built with Java and Spring Boot, following REST API best practices. It provides all CRUD operations and implements various routes for GET, POST, PUT/PATCH, and DELETE actions. The application utilizes a MYSQL database to store and manage data through JPA in the Java application. Bearer authentication is implemented for secure access to the system.


## About the Project
The banking application system management aims to provide a comprehensive solution for managing banking operations. It allows users to perform various banking tasks such as creating accounts, making transactions, managing customer information, and generating reports. The system provides a secure and efficient way to handle banking operations.

<!-- CLASS DIAGRAM -->
## UML Class Diagram
refer to the following class diagram to visualize the structure and relationships of the classes in the banking application system management:


![Untitled](https://github.com/w88d/BankingApp-project1-SDA/assets/140564404/750d5975-4045-4d47-9626-ec78fbf6c717)





<!-- TECHNOLOGIES USED -->
## Technologies Used
The following technologies are used in this project:

- Java
- Spring Boot
- MySQL
- JPA
- REST API
- Lambok
- Postman
- Git & Github


<p align="center">
  <a href="https://skillicons.dev">
    <img src="https://skillicons.dev/icons?i=git,github,java,spring,mysql,postman,hibernate" />
  </a>
</p>



<!-- SETUP -->
## Setup
To set up the project locally, follow these steps:

1. Clone the repository from [repository URL].
2. Install intelliJ IDEA if not already installed.
3. Install [MySQL](https://www.mysql.com/downloads/) database server if not already installed.
4. Create a new database in MySQL for the application.
5. Update the database configuration in `application.properties` file with your MySQL database credentials.
6. Build the project using your preferred build tool (Spring boot Maven with wep tools).
7. Run the application.



<!-- CONTROLLER -->
## Controllers and Routes Structure
The application follows a structured approach for defining controllers and routes. The routes are mapped to corresponding controller methods to handle different HTTP requests. Below is an example of the routes structure:

- `GET /api/banking`: Retrieve all banking.
- `POST /api/banking`: Create a new banking.
- `GET /api/banking/{id}`: Retrieve an bank by ID.
- `PUT /api/banking/{id}`: Update an bank by name or ID.
- `DELETE /api/banking/{id}`: Delete an bank by ID.
- `GET /api/accounts`: Retrieve all accounts.
- `POST /api/accounts`: Create a new account.
- `GET /api/accounts/{id}`: Retrieve an account by ID.
- `PUT /api/accounts/{id}`: Update an account by ID.
- `DELETE /api/accounts/{id}`: Delete an account by ID.

Please refer to the source code for the complete list of routes and their corresponding controllers.

<!-- LINKS -->
## Links
- [Presentation Slides](https://www.canva.com/design/DAFyZxkCXzc/OvU3IxELO20o_BUS5N11Iw/view?utm_content=DAFyZxkCXzc&utm_campaign=designshare&utm_medium=link&utm_source=editor): Access the presentation slides for the project.

<!-- FUTURE WORK -->
## Future Work
Here are some potential areas for future enhancements and improvements:

- Implement additional banking features such as fund transfers, bill payments, and account statements.
- Enhance security measures by implementing encryption and further authentication mechanisms.
- Integrate with external services such as payment gateways and credit bureaus.
- Implement a frontend application for a complete user interface.

<!-- RESOURCES -->
## Resources
- [Java Documentation](https://docs.oracle.com/en/java/)
- [Spring Boot Documentation](https://docs.spring.io/spring-boot/docs/current/reference/html/)
- [MySQL Documentation](https://dev.mysql.com/doc/)

##  By
- Wedad Alotaibi

