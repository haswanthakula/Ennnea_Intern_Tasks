### Simple Static Website with API Integration
This project demonstrates the creation of a functional static website using HTML, CSS, and JavaScript, with a focus on API integration. The website consists of multiple linked pages, providing a seamless user experience and showcasing dynamic data fetched from a dummy API.

## Development Steps:

### 1. Login Page
* Purpose: Entry point to the website.
* Features:
  * Form with input fields for username and password.
  * Front-end validation to ensure both fields are filled.
  * Redirects to the homepage on successful login.
* UI: Professionally styled with CSS for a user-friendly experience

  ###  2. Homepage
* Purpose: Introduces the website and explains APIs.
* Content:
 * Definition and examples of APIs (e.g., fetching data from a server).
 * Overview of project workflow, explaining how data is fetched and displayed.

### 3. API Working Page
* Purpose: Demonstrates dynamic data fetching.
* Features:
 * Fetches and displays data from a dummy JSON API.
 * Data categories include:
  * Users: Names, emails, and other user details.
  * Recipes: Titles, descriptions, and ingredients.
  * Products: Names, prices, and descriptions.
 * Uses the fetch method with basic promise chaining.
* UI: Data is dynamically rendered using DOM manipulation.

### 4. Contact Page
* Purpose: Collects user feedback and queries.
* Features:
 * A form with fields for Name, Email (validated), and Message.
 * Submit button (non-functional, with scope for backend integration).
UI: Modern and responsive design with CSS styling.

### 5. Logout Button
* Purpose: Safely exits the website.
* Feature: Redirects users back to the login page.


##Technical Details

###Technologies Used
* HTML: Structures the website.
* CSS: Provides responsive and modern styling.
* JavaScript:
 * Implements API fetching and interactivity.
 * Handles navigation logic and user validations.

### API Integration
* Fetch Method:
 * Used to call the dummy JSON API.
 * Data categories fetched: Users, Recipes, Products.
 * Example usage with promise chaining:

 fetch('https://jsonplaceholder.typicode.com/users')  
  .then(response => response.json())  
  .then(data => {  
    console.log(data); // Render data dynamically here  
  })  
  .catch(error => {  
    console.error('Error fetching data:', error);  
  });  

