# Microservice-example

## :sparkles: Introduction
This repository contains an API made in Spring boot that follows an architecture based on microservices.

For this application we can find 5 microservices
- Eureka Service: Service that acts as a discovery server for microservices
- Gategay Service: Service that serves as an entry point to the rest of the microservices for security
- Config Service: Service that serves as a configuration server, to have a centralized configuration system
- Bike Service: Functional microservice used as an example for the project
- Car Service: Functional microservice used as an example for the project

## 🛠 Stack
<p align="left"> 
   <a href="#" rel="noreferrer"> <img src="https://skillicons.dev/icons?i=java,spring,maven,mysql,kafka"/> </a>
</p>

## 💪 Project Status
I plan to make some changes to the project to refine the microservices code.

## ℹ️ Read More
In this section you can read more information about the content of the project. I hope you like it and can learn something.
### API Rest Full
A RESTful API (Representational State Transfer) is a set of architectural rules and principles used to create web services. These web services follow a specific approach to creating services that are scalable, maintainable, and reliable. Some of the key concepts of a RESTful API include:
<ul>
   <li>
      <h3>Client-Server Architecture</h3>
      <p>The RESTful API follows a client-server architecture where the client and server are separated and communicate with each other through the HTTP protocol.   </p>
   </li>
   <li>
      <h3>Stateless</h3>
      <p>
         Each HTTP request contains all the information necessary to execute and does not store client state information on the server. This allows requests to be processed independently, facilitating scalability.
      </p>
   </li>
   <li>
      <h3>Defined HTTP operations</h3>
      <p>
         Uses standard HTTP methods such as GET,HEAD, POST, PUT, DELETE,PATH,TRACE,etc to perform operations on resources. Each method has a specific purpose, such as       obtaining data, adding new data, updating existing data, or deleting data.
      </p>
   </li>
   <li>
      <h3>Resources as objects</h3>
      <p>
         Data is presented as resources, which can be accessed and manipulated through specific URLs. Each resource must have a unique identification (URI) to be accessible.
      </p>
   </li>
      <li>
      <h3>Resource representations</h3>
      <p>
         Resources can have different representations, such as JSON, XML, HTML, among others. The client can request the desired representation of the resource using the 'Accept' HTTP header.
      </p>
   </li>
</ul>

### Monolithic architecture
An architecture is the classic and most common way of realizing an API, in this approach the application is built as a single unit, usually as a single operating system and runs as a single process on a single machine. In a monolithic architecture, different application components are designed to work together and are deployed as a single entity.
Some key features of a monolithic architecture are:
<ul>
   <li>
      Tight coupling
   </li>
   <li>
      Limited scalability
   </li>
   <li>
      Single deployment
   </li>
   <li>
      Complex maintenance
   </li>
</ul>

Although monolithic architectures are simpler to design and develop, they can become unwieldy as applications grow in complexity and scale. However, they are still widely used, especially for smaller or less complex applications that do not require massive scale or extreme flexibility.

But it is for this reason that this architecture also exists:
### Microservices architecture
A microservices-based architecture is a software development approach in which an application is built as a set of small, independent services that run individually and communicate with each other through well-defined APIs. Each service in a microservices architecture focuses on completing a specific task and is developed, deployed, and scaled independently.
Some key features of a microservices-based architecture are:
<ul>
   <li>
      <h3>Decentralization</h3>
      <p>
         Services are independent and autonomous, allowing development teams to work independently on each service.
      </p>
   </li>
   <li>
      <h3>Flexibility and agility</h3>
      <p>
         Services can be developed, tested and deployed independently, making it easier to implement changes and updates.
      </p>
   </li>
   <li>
      <h3>Resilience and fault tolerance</h3>
      <p>
         The architecture allows fault management in isolation, which prevents a failure in one service from affecting the application as a whole.
      </p>
   </li>
</ul>

Although microservices-based architectures offer greater flexibility and scalability compared to monolithic architectures, they also introduce additional complexity in managing communication between services and monitoring the entire ecosystem of services. This architecture is ideal for complex, large-scale enterprise applications that require rapid innovation and continuous deployment. However, all is not yet rosy either...

### Why not always use microservices-oriented architecture?
While microservices-based architectures offer numerous advantages in terms of flexibility, scalability, and agility, they also present challenges and are not suitable for all use cases. Some of the reasons why it is not recommended to always use microservices-oriented architectures include:

<ul>
   <li>
      <h3>System complexity</h3>
      <p>
         Managing a microservices-based architecture can be more complex compared to monolithic architectures, requiring a higher level of technical knowledge and management skills.
      </p>
   </li>
      <li>
      <h3>Operating costs</h3>
      <p>
         The implementation and maintenance of a microservices architecture can be significantly more expensive than an application built on a normal architecture, due to the additional infrastructure requirements, monitoring tools and management of the complexity of the distributed environment.
      </p>
   </li>
   <li>
      <h3>Inter-service communication issues</h3>
      <p>
         Communication between different services can be challenging, especially in high-load and high-concurrency environments, which may require careful planning and design to avoid bottlenecks, performance issues, and security flaws.
      </p>
   </li>
   <li>
      <h3>Need for advanced management tools</h3>
      <p>
         Implementing a microservices-based architecture often requires advanced management tools and platforms to facilitate monitoring, management, and coordination of different services, which can increase complexity and costs.
      </p>
   </li>
   <li>
      <h3>Data consistency issues</h3>
      <p>
         Maintaining data consistency across multiple services can be challenging, especially in distributed systems, requiring carefully planned data synchronization and transaction management strategies.
      </p>
   </li>
</ul>

In summary, although microservices-based architectures are beneficial in many scenarios, it is crucial to carefully evaluate the specific needs of the project and weigh the challenges and complexities associated with this architecture before adopting it. Less complex applications or those that do not require extreme scalability may find more benefits in monolithic architectures or other software design approaches.
