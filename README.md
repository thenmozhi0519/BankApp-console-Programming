#  Console-Based Banking System (Java)

##  Project Overview

This is a simple **console-based banking application** developed using Java.
It simulates basic banking operations like account creation, login, deposit, withdrawal, and transaction history.

This project is built to understand **core programming concepts** and **basic system design flow**.

---

##  Features

* ✅ Create Bank Account
* 🔐 Secure Login using Account Number & PIN
* 💰 Deposit Money
* 💸 Withdraw Money (Minimum balance: 500)
* 📊 Check Balance
* 📜 View Transaction History

---

##  Technologies Used

* Java
* OOP (Object-Oriented Programming)
* HashMap (used as in-memory database)
* Console-based input/output

---

##  Concepts Covered

* Classes & Objects
* Encapsulation
* Static Variables (Auto Account Number Generation)
* Methods (Function-based design)
* Conditional Statements
* Loops (Menu-driven system)
* Data Structures (HashMap)

---

##  Project Structure

```
BankApp (Main Class)
   ↓
BankService (Business Logic)
   ↓
Account (Data Model)
```

---

##  Working Flow

1. User creates an account (gets unique Account Number)
2. User logs in using Account Number + PIN
3. After login, user can:

   * Deposit money
   * Withdraw money
   * Check balance
   * View transaction history
4. All data is stored temporarily using HashMap

---

##  Key Highlights

* Account numbers are auto-generated using a static counter
* HashMap is used to simulate a database
* StringBuilder is used for efficient transaction history storage
* Minimum balance constraint is implemented

---

##  Sample Output

```
1.Create 2.Login 3.Exit

Username: Ram
Set 4-digit PIN: 1234

Account created!
Your Account Number: 1001

Login:
Account Number: 1001
Enter PIN: 1234

1.Deposit 2.Withdraw 3.Balance 4.History 5.Logout

Deposit: 1000
Withdraw: 300

Balance: 700.0

Transactions:
Deposited: 1000
Withdrawn: 300
```

---

##  Future Enhancements

* Add money transfer between accounts
* Store data using files or database
* Add PIN encryption for security
* Build REST APIs using Spring Boot
* Create frontend UI (Web/App)

---

##  Conclusion

This project demonstrates how real-world banking systems can be simplified into basic programming logic.
It helps in understanding how **input → processing → output flow works in real applications**.

---
