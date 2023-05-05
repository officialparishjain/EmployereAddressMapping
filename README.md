# Project Name
Employee Address Mapping

# Frameworks and Language Used
**Spring Boot** 2.1.0
**Java** 17.0
**Maven** 3.8.1

# Data Flow
The following functions are used in the data flow of this project:

_**Models:**_
The Employee and Address classes are model classes that represent entities in the Employee Mapping Project. The Employee class has three instance variables representing an employee's id, first name, and last name. Additionally, it has a OneToOne relationship with the Address entity, represented by the "address" instance variable. The Address class, on the other hand, has instance variables representing the address's id, street, city, state, and zipcode.

Both classes use Lombok's annotations to generate constructors and getter/setter methods for their instance variables. Additionally, both classes are annotated with @Entity and @Table annotations, which indicate that these classes are JPA entities and are mapped to database tables.

In the Employee class, the @OneToOne annotation with CascadeType.ALL means that any changes made to the Employee entity will also be propagated to the associated Address entity. The @JoinColumn annotation specifies the foreign key column in the Employee entity that references the primary key column in the Address entity.

In the Address class, there is no reference to the Employee entity, indicating that the Address entity is independent. The Address entity is the referenced side of the OneToOne relationship with the Employee entity as the owning side.


_**Controller:**_ 
**EmployeeController:**
The EmployeeController is a Spring MVC controller responsible for handling requests related to employees. 
It has five methods that map to different HTTP methods and endpoints. 
The first method, getAllEmployee(), uses the GET method to retrieve all employees. 
The second method, getAddressById(), also uses the GET method but takes an id parameter to retrieve a specific employee. 
The third method, addEmployee(), uses the POST method to create a new employee by accepting an Employee object in the request body.
The fourth method, deleteEmployeeById(), uses the DELETE method to delete an employee based on its id. Finally, 
  the updateEmployeeById() method uses the PUT method to update an employee's last name based on its id. The controller uses an EmployeeService, which is injected through Spring's dependency injection mechanism using the @Autowired annotation.


**AddressController:**
The AddressController is a Spring MVC controller responsible for handling requests related to addresses. It has four methods that map to different HTTP methods and endpoints. 
The first method, getAllAddress(), uses the GET method to retrieve all addresses. 
The second method, getAddressById(), also uses the GET method but takes an id parameter to retrieve a specific address. 
The third method, addAddress(), uses the POST method to create a new address by accepting an Address object in the request body. 
Finally, the deleteAddressById() method uses the DELETE method to delete an address based on its id. The controller uses an AddressService, which is injected through Spring's dependency injection mechanism using the @Autowired annotation.



_**Services**:_ 
**EmployeeService**
fetchAllEmployee(): returns all employees in the database as an Iterable.
fetchEmployeeById(Long id): returns the employee with the given id.
saveEmployee(Employee employee): saves the given employee in the database and returns a message indicating success.
deleteEmployeeById(Long id): deletes the employee with the given id from the database and returns a message indicating success.
updateEmployeeById(Long id, String lastName): updates the last name of the employee with the given id and returns a message indicating success or failure.

**AddressService**
The class is annotated with @Service, indicating that it is a Spring service component.
It has an instance variable of type IAddressRepository, which is used to access the database.
fetchAllAddress() method returns all the addresses in the database.
fetchAddressById(Long id) method returns the address with the specified ID.
saveAddress(Address address) method saves the given address to the database.
deleteAddressById(Long id) method deletes the address with the specified ID from the database.


# Database Structure Used
I have used My SQL as DataBase
and My SQL workbench

# Project Summary
In this project i have create different endpoints like and used differet vaalidation for the end ponits



