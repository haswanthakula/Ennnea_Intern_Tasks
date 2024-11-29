function login() {
    const username = document.getElementById('username').value;
    const password = document.getElementById('password').value;
  
    if (username === 'admin' && password === 'admin') {
      window.location.href = 'home.html';
    } else {
      document.getElementById('error').style.display = 'block';
    }
  }

 function contactAlert() {
    alert('Thank you for contacting us!');
  }

  
function fetchRecipes() {
    const recipesContainer = document.getElementById('recipes');
    recipesContainer.innerHTML = '<p>Loading recipes...</p>';
  
    fetch('https://dummyjson.com/recipes')
      .then(response => response.json())
      .then(data => {
        const recipes = data.recipes;
        recipesContainer.innerHTML = '';
  
        recipes.forEach(recipes => {
          const recipeDiv = document.createElement('div');
          recipeDiv.classList.add('recipe');
  
          recipeDiv.innerHTML = `
            <p><strong>Name:</strong> $${recipes.name}</p>
            <p><strong>Rating:</strong> ${recipes.rating}</p>
          `;
  
          recipesContainer.appendChild(recipeDiv);
        });
      })
      .catch(error => {
        recipesContainer.innerHTML = `<p>Error loading recipes: ${error.message}</p>`;
      });
  }
  
  
  function fetchProducts() {
    const productsContainer = document.getElementById('products');
    productsContainer.innerHTML = '<p>Loading products...</p>';
  
    fetch('https://dummyjson.com/products')
      .then(response => response.json())
      .then(data => {
        const products = data.products;
        productsContainer.innerHTML = '';
  
        products.forEach(product => {
          const productDiv = document.createElement('div');
          productDiv.classList.add('product');
  
          productDiv.innerHTML = `
            <p><strong>ID:</strong> ${product.id} <br> <strong>Name:</strong> ${product.title}</p> <!-- Adjusted field name -->
          `;
  
          productsContainer.appendChild(productDiv);
        });
      })
      .catch(error => {
        productsContainer.innerHTML = `<p>Error loading products: ${error.message}</p>`;
      });
  }


  function fetchUsers() {
    const usersContainer = document.getElementById('users');
    usersContainer.innerHTML = '<p>Loading products...</p>';
  
    fetch('https://dummyjson.com/users')
      .then(response => response.json())
      .then(data => {
        const users = data.users;
        usersContainer.innerHTML = ''; 
  
        users.forEach(users => {
          const usersDiv = document.createElement('div');
          usersDiv.classList.add('users');
  
          usersDiv.innerHTML = `
            <p><strong>Name:</strong> ${users.firstName} <br> <strong>Phone:</strong> ${users.phone}</p> <!-- Adjusted field name -->
          `;
  
          usersContainer.appendChild(usersDiv);
        });
      })
      .catch(error => {
        usersContainer.innerHTML = `<p>Error loading products: ${error.message}</p>`;
      });
  }
  

