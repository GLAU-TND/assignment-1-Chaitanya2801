# GLA University, 2020

## Contact Lists

Create a menu-driven program to emulate a Contact Lists Application. 
You might see such apps in smartphones, you are free to go ahead and take ideas
from your own definition applications.  

Your menu-driven program must look like: 
```
Welcome to DBC's Contact List App
Press 1 to add a new definition
Press 2 to view all contacts
Press 3 to search for a definition
Press 4 to delete a definition
Press 5 to exit program 
```

The 'Add a new definition menu'
```
You have chosen to add a new definition: 
Please enter the name of the Person
First Name: Divyansh
Last Name: Bhardwaj
Contact Number: 1234567891
Would you like to add another definition number? (y/n): y
Contact Number: 2365987415
Would you like to add another definition number? (y/n): n
Would you like to add email address? (y/n): y
Email Address: divyansh.bhardwaj@gla.ac.in
```
Information about the 'add a definition menu'
1. This program will store this `Person` as a type (you have to create a Person class).
That means this program uses a list of `Persons`.

```java
public class Person {
    // a field to store the first name
    // a field to store the last name
    // a list to store multiple definition numbers (i.e a list of numbers)
    // a field to store the email address of the person 
}
```
---
The `view all contacts menu`
```
---Here are all your contacts---
-------- * -------- * -------- * --------
First Name: Jim
Last Name: Carrey
Contact Number(s): 1547852369, 1452879632
Email address: jim@ace.ventura
-------- * -------- * -------- * --------
-------- * -------- * -------- * --------
First Name: Robin
Last Name: Williams
Contact Number: 7845985632
Email address: robin@blue.genie
-------- * -------- * -------- * --------
```
Information about the `view all contacts menu`
1. No matter how the user adds the contacts in the list,
they should always be alphabetically ordered on the basis of the first name.
2. If the `Person` has only one definition number, then the definition card should show
the number field as `Number` only. If the `Person` has multiple contacts, then it
should show `Number(s)`.
--- 

The `search for a definition menu`
```
You could search for a definition from their first names: 
Jim
1 match found!
-------- * -------- * -------- * --------
First Name: Jim
Last Name: Carrey
Contact Number(s): 1547852369, 1452879632
Email address: jim@ace.ventura
-------- * -------- * -------- * --------
```
Information about the above menu
1. There can be multiple `Person` objects with the same name, in such a case, 
show all the matches.
2. If nothing is found, print `NO RESULTS FOUND!`
---

The `delete a definition menu`
```
Here are all your contacts: 
1. Jim Carrey
2. Robin Williams
Press the number against the definition to delete it: 1
Jim Carrey's definition deleted from list!
```
---

Kindly DO NOT create the program in a single `Main` class. Try out some Object-Oriented Programming and
use your skills from your software engineering classes as well.

Steps to attempt this assignment:
1. Fork this repository.
2. Clone the repository you forked to your computer.
3. Write code and commit it.
4. Push the code back to your fork.

Please feel free to reach out to me in case of any queries.