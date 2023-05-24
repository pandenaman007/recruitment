# Instructions for Full Stack Developer Test

## Submission Process

### Link to Submission Form: [https://forms.gle/C2U6DvGi8z74AkWW8](https://forms.gle/C2U6DvGi8z74AkWW8)

The submission process will be through a Google Form, which will close at the designated deadline. The form will ask for your name, SRN, email address, GitHub repository link, .env file, and other necessary information.

### Deadline: Thursday, May 25th, 2023, at 9:00 pm IST (Indian Standard Time)

<br />

## Instructions

You will be developing a simple web application that will allow users to create, read, update and delete (CRUD) a list of items. The problem statement is the following:

> Goblo is a company that provides a blogging platform for its users. The company has a list of users and each user can have a list of blog posts. Each blog post has a title, a description, timestamp of creation, timestamp of updation and likes count. The company wants to create a web application that will allow users to manage their blog posts. The web application should allow users to add, edit, delete and view their blog posts. They are expecting 1 million users to use this web application. The web application should be able to handle this load.

<br />

## Requirements

-   The frontend should be developed using ReactJS. You are free to use any libraries and modules that you find suitable for the task. However, the frontend must be built using function-based components (class-based components are not allowed). The design of the website is not emphasized as much as functionality and working.
-   The backend can be developed using any language/framework of your choice.
-   Your project's repository should include a README.md file with instructions to run the development server locally, along with well-written documentation.
-   The final code must be uploaded to your personal GitHub repository.
-   **The GitHub repository must be set as private until the deadline. Once the deadline has passed, you must make it public so that we can evaluate your solution.**

<br />

## Functionality Specifications

-   The web application should have a home page where users can view their blog posts.
-   The web application should have a page/component where users can add a new blog post.
-   Each blog should be deletable and editable. Method and process of deletion and editing is up to you, but any changes should be reflected in the database.
-   The web application should have a page/component where users can view a single blog post.
-   The timestamp of creation and updation should be displayed in a human-readable format.
-   Your backend should have appropriate APIs for performing CRUD operations. The number of APIs and their specifications is up to you.
-   The expected API endpoints are as follows:
    -   `GET /api/posts` - Returns a list of all blog posts (with a limit of 10 posts per page)
    -   `GET /api/posts/:id` - Returns a single blog post with the specified ID.
    -   `POST /api/posts` - Creates a new blog post.
    -   `PUT /api/posts/:id` - Updates the blog post with the specified ID.
    -   `DELETE /api/posts/:id` - Deletes the blog post with the specified ID.
-   You are free to add or remove any API endpoints as you see fit. Make sure to document them in your README.md file.
-   You can use either MongoDB or PostgreSQL for data storage.
-   Storing sensitive information, such as database credentials, directly in your code poses a security risk and is prohibited. Instead, it is recommended to utilize environment variables for storing such information. These variables can be saved in a separate .env file, and you should submit this file through the provided Google Form. By following this practice, you ensure that sensitive data remains protected and separate from the codebase.

<br />

## Bonus Points

-   Implementing Next.js in your solution for the frontend.
-   Implementing any form of authentication (e.g., JWT, OAuth, etc.).
-   Dockerize your application.
-   Deploy the web application to a hosting platform of your choice.

<br />

## Additional Information

-   While the design of the website is not emphasized as much as functionality and working, feel free to incorporate any additional features or techniques that you think will enhance your solution and showcase your skills effectively. Make sure to document them in your README.md file.
-   Feel free to utilize resources such as ChatGPT, GitHub Copilot, online courses, documentation, and other reference materials to assist you in solving the problem statements.
-   However, please note that while using online resources is encouraged, directly copying code from others, including your friends, is considered unethical and not allowed.

<br />

Best of luck for the test! We look forward to seeing your solution. If you have any questions, feel free to raise an issue on the repository [here](https://github.com/Consuma/recruitment/issues) with the [full stack](https://github.com/Consuma/recruitment/labels/full%20stack) label for easier tracking.
