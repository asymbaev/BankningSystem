# BankningSystem
# Simple Banking System in Java

Welcome to the Simple Banking System in Java! This project demonstrates a basic implementation of a banking system that allows customers to create accounts, deposit funds, withdraw funds, and view their account balances.

## Approach

The approach taken for this project involves creating three main classes: `Bank`, `Customer`, and `Account`. The classes are organized to achieve clarity, separation of concerns, and reusability.

### Bank Class
The `Bank` class acts as the central manager, responsible for customer accounts and transactions. It follows the Singleton pattern to ensure there's only one instance of the bank. This design choice simplifies access to the bank across the application and ensures data consistency.

#### `createCustomer` Method
The `createCustomer` method is used to create a new customer. Customers are stored in a list for future reference.

#### `performTransaction` Method
The `performTransaction` method handles deposit and withdrawal transactions for a customer. By passing a `TransactionType` argument, the method can accurately perform the desired transaction.

#### `askAmount` Method
The `askAmount` method provides a way to prompt the user for deposit and withdrawal amounts. This approach enhances user interaction and encapsulates user input logic.

### Customer Class
The `Customer` class represents individual bank customers. Each customer is associated with an account. This class encapsulates customer-related data and behavior.

### Account Class
The `Account` class manages a customer's financial information. It provides methods for depositing and withdrawing funds while ensuring proper validation.

## Technologies Used

- Java SE 8
- Visual Studio Code (IDE)

## Getting Started

Follow these steps to set up and run the project:

1. Open Visual Studio Code.
2. Create a new folder named "BankingSystem".
3. Inside the "BankingSystem" folder, create a "src" folder.
4. Inside the "src" folder, create a package named "com.banking".
5. Create the following Java files inside the "com.banking" package:
   - `Bank.java`
   - `Customer.java`
   - `Account.java`
   - `Main.java`
6. Copy and paste the provided code snippets into the respective Java files.

## Step-by-Step Explanation

Let's walk through the code snippets to understand the functionality and design decisions.

1. `Bank.java`:
   - Manages customer accounts and transactions.
   - Utilizes the Singleton pattern for a single instance of the bank.
   - Provides methods to create customers and perform transactions.
   - Includes an `askAmount` method for user input.

2. `Customer.java`:
   - Represents a bank customer with attributes like name and account number.
   - Links a customer to their respective account upon creation.

3. `Account.java`:
   - Represents a customer account with deposit and withdrawal methods.
   - Ensures proper validation for deposits and withdrawals.

4. `Main.java`:
   - Implements the main driver program.
   - Takes user input for customer name, deposit amount, and withdrawal amount.
   - Creates a customer, performs transactions, and displays the final balance.

## Usage

1. Compile the Java code by opening the integrated terminal in VSCode and navigating to the "BankingSystem" folder using the `cd` command.
2. Compile the code by entering: `javac src/com/banking/*.java`.
3. Run the application by entering: `java -cp src com.banking.Main`.
4. Follow the prompts to input customer name, deposit amount, and withdrawal amount.
5. The application will display transaction details and the final account balance.

## Code Quality

The provided code prioritizes functionality, core requirements, readability, and maintainability over advanced features. Comments are added to explain design decisions and provide clarity.

## Conclusion

The Simple Banking System in Java provides a foundation for understanding core concepts such as classes, objects, inheritance, and basic user interactions. Developers can build upon this project to create more sophisticated banking applications with extended features,
