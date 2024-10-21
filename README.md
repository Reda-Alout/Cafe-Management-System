# Cafe Management System

## About The Project

### Purpose
The purpose of this project is to facilitate the management of a cafeteria through a system that enables the owner to easily create, modify, and print invoices. It also allows for easy addition of items and products, along with user management capabilities.

### Key Features

#### Admin Features:
- **Admin Dashboard**
- **Category Management**: Add, edit, and filter products by category.
- **Product Management**: Add, edit, delete, and filter products.
- **Order Management**: Add orders.
- **Bill Management**: View bill details, download, cancel bills, and filter products.
- **User Management**: Ping users and filter them.
- **Password Management**: Change password.

#### User Features:
- **Login & Sign Up**
- **User Dashboard**
- **Order Management**: Add orders.
- **Bill Management**: View bill details, download, cancel bills, and filter products.
- **Profile Management**: Update profile.
- **Password Management**: Change password.

## Built With
- Java (Spring Boot - REST API)
- Angular
- MySQL Database

## How To Run

### Angular Part
1. Open terminal in VS Code and run:
    ```bash
    $env:NODE_OPTIONS = "--openssl-legacy-provider"
    ng s
    ```
2. Open [localhost:4200](http://localhost:4200) in your browser.

### Spring Boot Part
1. Use the URL [localhost:8081](http://localhost:8081).
2. Use Postman API Platform to run backend URLs:
    - First, sign up, then log in to get the user token.
    - Some features are accessible only to admin users. You can check the role-based features in the `ServiceImpl` folder, where the implementation of the relevant functions is provided.

## Note
This project is for educational purposes and was developed according to an educational course on YouTube.
