# CV Generation Program

## Overview
This Java application collects user data to generate a CV (Curriculum Vitae) in a Word document format using Apache POI. The program prompts the user for various personal details, educational background, work experience, and skills, and then compiles this information into a structured document.

## Features
- Collects user input for personal information, education, work experience, and language skills.
- Validates email input.
- Generates a Word document with the collected information formatted appropriately.

## Requirements
- Java Development Kit (JDK) 8 or higher
- Apache POI library for handling Word documents

## Getting Started

### Installation
1. **Clone the repository** or download the source code.
2. **Add Apache POI dependencies** to your project. You can use Maven or manually add the JAR files:
   - `poi-ooxml`
   - `poi-ooxml-schemas`
   - `xmlbeans`
   - `commons-collections4`
   - `commons-compress`
   - `stax-api`
   - `commons-io`
   - `poi`

### Running the Program
1. Compile the Java source file:
   ```bash
   javac Worddocum.java
    ```
2. Run the program:
   ```bash
   javac Worddocum
   ```
## User Input
The program prompts the user for the following information:

- **Name**: Full name (e.g., Jana Ozolniece)
- **Address**: Home address (e.g., Brīvības iela 29-4, Talsi)
- **Phone Number**: Contact number
- **Email**: Valid email address
- **Job Title/Field**: Position applied for
- **Education Level**: Input options include:
  - P: Primary education
  - V: Secondary education
  - A: Higher education
  - C: Other education
- **Work Experience**: User can indicate if they have work experience and provide details.
- **Professional Achievements**: List any notable achievements.
- **Additional Education**: Input any supplementary education.
- **Languages**: Specify languages spoken and proficiency levels.
- **Other Skills**: Specify any other relevant skills.

## Output
The program generates a Word document titled `[Name] cv.doc`, where `[Name]` is replaced by the user's name. The document includes:

- A header with "CV"
- User's personal details
- Education details
- Work experience (if applicable)
- Professional achievements
- Additional education
- Language skills with proficiency
- Other skills

### Other documents (PDF)  
I have added my scientific paper for referance and documentation purposes 

### Author
Yours truly - Jana Ozolniece - aka Janchuks
