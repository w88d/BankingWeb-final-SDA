![pngwing com](https://github.com/w88d/BankingWeb-final-SDA/assets/140564404/b9c60891-795c-408a-8f1b-5555e5fa1ecf)

[
](https://github.com/w88d/BankingApp-project1-SDA/edit/master/README.md)


# SDA Banking Application 

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


- This is a Simple full-stack banking web application developed using Java Spring Boot API for the backend and Angular for the frontend.


## About the Project
The banking application system management aims to provide a comprehensive solution for managing banking operations. It allows users to perform various banking tasks such as creating accounts, making transactions, managing customer information, and generating reports. The system provides a secure and efficient way to handle banking operations.

![d5a06319-d0da-447b-ad74-de459f083de7](https://github.com/w88d/BankingWeb-final-SDA/assets/140564404/2b2af5c0-f9ba-405d-b3bb-d6d413087c2c)
![d6b78d3f-22b1-45e2-ba64-b6f454ae73b6](https://github.com/w88d/BankingWeb-final-SDA/assets/140564404/d3ed1142-c0c6-4707-b5b1-c622613e87fd)

![50f5ce9c-26df-41db-ac90-e11f2ad61f4e](https://github.com/w88d/BankingWeb-final-SDA/assets/140564404/397f1776-457d-4b36-870f-a1de75b04a34)

<!-- CLASS DIAGRAM -->
## UML Class Diagram
refer to the following class diagram to visualize the structure and relationships of the classes in the banking application system management:


![Untitled](https://github.com/w88d/BankingApp-project1-SDA/assets/140564404/750d5975-4045-4d47-9626-ec78fbf6c717)





<!-- TECHNOLOGIES USED -->
## Technologies Used
The following technologies are used in this project:

### Backend
- Java
- Spring Boot
- MySQL
- JPA
- REST API
- Lambok
- Postman

### Frontend
- VScode
- Angular CLI
- CSS & HTML
- TypeScript
- Git & Github


<p align="center">
  <a href="https://skillicons.dev">
    <img src="https://skillicons.dev/icons?i=vscode,angular,css,html,git,github,java,spring,mysql,postman,hibernate" />
  </a>
</p>





## Prerequisites

Before running the application, ensure that you have the following installed:

- Java Development Kit (JDK) 11 or higher
- Node.js and npm (Node Package Manager)
- MySQL or any other preferred database server


 <!-- SETUP -->

## Installation

### Backend (Java Spring Boot API)

1. Clone the repository.
2. Open the project in your preferred IDE (e.g., IntelliJ, Eclipse).
3. Configure the database connection in the `application.properties` file located in the `src/main/resources` directory.
4. Build the project using Maven or your IDE's build tools.
5. Run the application.

### Frontend (Angular)

1. Navigate to the `frontend` directory.
2. Run `npm install` to install the required dependencies.
3. Update the API endpoint in the `environment.ts` file to match your backend server configuration.
4. Run `ng serve` to start the Angular development server.

 
 ### Development server

To run the development server, follow these steps:

1. Clone the repository to your local machine.

   ````shell
   git clone <repository-url>
   ````
   
2. Open a terminal and navigate to the project's root directory.

3. Run the following command to install the dependencies:

   ````shell
   npm install
   ````
   
4. Once the dependencies are installed, start the development server by running the following command:

   ````shell
   ng server
   ````


5. Open your web browser and navigate to http://localhost:4200/ to access the application. The page will automatically reload if you make any changes to the source files.



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
- [Java Spring Boot](https://spring.io/projects/spring-boot)
- [Angular](https://angular.io/)

##  By
- Wedad Alotaibi


 We hope you enjoy using the SDA Bank!♥️
