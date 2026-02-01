This project is a Selenium + Java automation framework built to test a real-world contact management application.
I created this project to practice writing clean, scalable automation code and to simulate how automation frameworks are designed and executed in real QA projects.

🔗 Application Under Test  
https://thinking-tester-contact-list.herokuapp.com/  

🛠 Tech Stack
Java  
Selenium WebDriver  
TestNG  
Maven  
Git & GitHub  
GitHub Actions (CI/CD)  
Page Object Model (POM)  

🧪 Automated Scenarios  
The following end-to-end scenarios are automated:  
User login  
Add new contact  
Contact list validation  
Logout flow  

🧩 Framework Design  
Page Object Model (POM) for separating UI logic from test logic  
Base Test class to handle WebDriver setup and teardown  
Reusable page classes to improve readability and maintainability  
WebDriverManager to manage browser drivers automatically  

🚀 CI/CD with GitHub Actions  
This project is integrated with GitHub Actions.  
Tests run automatically on every push and pull request  
Selenium tests execute in headless mode  
Maven handles dependency management and execution  

📂 Project Structure  
src  
├── main  
│   └── java  
│       ├── base  
│       ├── pages  
│       └── utils  
└── test  
    └── java  
        └── tests  

🎯 Why I Built This Project  
I built this project to:  
Strengthen my Selenium + Java automation skills  
Practice framework-level thinking instead of standalone scripts  
Understand CI/CD integration for automation testing  
