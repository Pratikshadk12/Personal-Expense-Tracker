# 💰 Personal Expense Tracker (Java)

A simple **console-based Java application** to track personal expenses with **file storage**. Perfect for beginners to practice **Java basics**, **ArrayList usage**, and **File I/O** operations!

---

## 🚀 Features

* ➕ **Add** a new expense
* 📋 **View** all expenses
* 📂 **View total by category**
* 📅 **View total by date**
* 💾 **Data persistence** (saves expenses to a CSV file)

---

## 🛠️ Technologies Used

* **Java** (JDK 17 or later)
* **File I/O** (CSV file for storage)
* **VS Code** (for coding and running)
* **Git & GitHub** (for version control)

---

## 📁 Folder Structure

personal-expense-tracker/
│
├── src/
│   ├── PersonalExpenseTracker.java
│
├── expenses.csv                 # Stores expenses data
├── README.md
└── .gitignore

---

## 🧩 Setup Instructions (VS Code)

### 1️⃣ Install Required Tools

* [Java JDK 17+](https://www.oracle.com/java/technologies/javase-downloads.html)
* [VS Code](https://code.visualstudio.com/)
* **Java Extension Pack** in VS Code
* [Git](https://git-scm.com/)

---

### 2️⃣ Verify Installations

Open your terminal and run:

```bash
java -version
javac -version
git --version
```

---

## 🖥️ How to Run the Project

### 1️⃣ Create Folder Structure

```
personal-expense-tracker/
├── src/
```

---

### 2️⃣ Add Code

* Save the provided `PersonalExpenseTracker.java` file inside `src/`
* Create an **empty** file named `expenses.csv` in the root folder (same place as `src/`)

---

### 3️⃣ Compile and Run

In the terminal, from **src** folder:

```bash
javac PersonalExpenseTracker.java
java PersonalExpenseTracker
```

If running from project root, specify the file path:

```bash
cd src
javac PersonalExpenseTracker.java
java PersonalExpenseTracker
```

---

## ⬆️ How to Push Code to GitHub

### 1️⃣ Create a New Repository on GitHub

* Go to **GitHub → New Repository** → Name: `personal-expense-tracker`

---

### 2️⃣ Initialize Git and Push

From your project root folder:

```bash
git init
git add .
git commit -m "Initial commit - Personal Expense Tracker"
git branch -M main
git remote add origin https://github.com/your-username/personal-expense-tracker.git
git push -u origin main
```

---

## 📌 Future Enhancements

* 📊 Generate expense summary reports
* 📈 Add charts for visual representation
* 🗄️ Switch to database storage (MySQL/SQLite)
* 🛡️ Input validation and error handling improvements

---

## 🙌 Author

Created by **Pratiksha** – 2nd Year AIML Student, Reva University
GitHub: [pratikshadk12](https://github.com/pratikshadk12)

---

## ⚠️ .gitignore Recommendation

Add a `.gitignore` file to exclude compiled files and CSV data if needed:

```
# Compiled Java classes
*.class

# Data file (optional)
expenses.csv
```

---

Happy Expense Tracking! 🎯

---

If you want, I can also **add small example inputs/outputs** in the README so you remember how the menu works without opening the code.
Do you want me to add that?
