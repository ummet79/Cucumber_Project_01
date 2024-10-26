# Techno Study Agile Software Testing Project

## Project Description
Parabank is a virtual banking application used to simulate and test various financial operations. While it’s not a real financial institution, it can be utilized as though it were, providing a realistic environment for software testing purposes.

## Technologies Used
- **Programming Language**: Java
- **Test Automation Tools**: Selenium WebDriver
- **Test Framework**: TestNG
- **BDD Framework**: Cucumber
- **Test Automation Pattern**: Page Object Model (POM)
- **Dependency Management and Build Tool**: Maven
- **Reporting Tools**: Extent Report (or a similar reporting tool)
- **Version Control System**: Git and GitHub
- **Test Management Tools**: JIRA & XRAY (or similar tools)
- **Logging Interface**: slf4j (Simple Logging Facade for Java)

## User Story and Test Case Summaries
- **US601 | User Registration**: Testing the process for registering new users on Parabank.
  - Registration Test
- **US602 | User Login**: Verifying the login process for registered users.
  - Positive Login Test
  - Negative Login Test
- **US603 | Bill Payment Functionality**: Testing the payment process for various bills such as electricity, water, and gas.
  - Bill Payment Test
- **US604 | Account Creation**: Testing the creation of both checking and savings accounts.
  - Account Creation Test
- **US605 | Inter-Account Transfer**: Testing the ability of users to transfer funds between their own accounts.
  - Transfer Fund Test
- **US606 | Contact Info Update**: Testing the process for updating contact information.
  - Info Update Test
- **US607 | Loan Application**: Testing the loan application process and its outcomes.
  - Loan Application Test

## Used Environment
- [Parabank Application](https://parabank.parasoft.com/)

## Installation Instructions
1. Clone the repository using GitHub:
   ```bash
   git clone https://github.com/yourusername/Techno-Study-Agile-Software-Testing-Project.git
2. Open IntelliJ IDEA.
3. Navigate to File > New > Project from Version Control.
4. Paste the cloned GitHub URL and load the project.

## Configuration/Setup
1. Ensure you have **Java 11** or higher installed.
2. Install the necessary plugins in **IntelliJ IDEA**:
   - **TestNG**: For test execution.
   - **Cucumber for Java**: For BDD-style tests.
   - **Gherkin**: For writing feature files in Cucumber.
3. Set up a **TestNG XML** to define and manage your test suite execution.

