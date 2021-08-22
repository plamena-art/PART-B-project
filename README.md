PART B - MICROSERVICES(MS)

CR12. REQUIREMENT AND PLANNING DOCUMENT.

![Planning img-1](https://user-images.githubusercontent.com/81399590/130353291-72a0df6d-9627-4393-a1e5-df892655e245.jpg)


CR13. STATEMENT OF PURPOSE. (WHAT THE SERVICE WILL DO, BUSINESS PROBLEM, TARGET AUDIENCE.

WHAT THE SERVICE WILL DO:
My Part B project in microservice will work as a Low Carbohydrate dessert recipes web application where the user will be able to store their delicious recipes with visible nutrition info (kilocalories) on the first page, also ingredients, instructions on how desserts to be prepared and lastly but not least nutrition information. With this information the user can keep track on their macros during the day or the week. Also, the user will be able to create a new recipe, or just Edit their own recipes when they wish to. 

BUSINESS PROBLEM: Many people who are loving sweets but trying to avoid sugar or unhealthy food including myself are preparing their own desserts at home, which helps them to keep track on their daily nutrition intake and having a very healthy lifestyle. Most of the times users (or people like me) prepare sweets every second day, people find different recipes from different resources all the time, I found that once somebody cook/bake something they do not keep a data on their delicious recipes and when decide to prepare the same food again they do not remember where they got the recipe from, so it is very nice every person who enjoys cooking, baking eating desserts to have their own app where they can add favourite low carbs desserts or any other food recipes with low carbohydrates.
 
TARGET AUDIENCE: 
The target audience for this web application includes people in any type of gender, age or nationality. For those who enjoys cooking, preparing food and eating healthy sweet desserts or any other food.

CR14. LIST OF FEATURES INCLUDED IN THE MS.
•	Displays “Welcome/Hello to my dessert page” message to the user.
•	Displays a table named “Low Carb Desserts” with Recipe’s name, nutrition info such as kilocalories. 
•	Plus Go To Recipe’s view which takes the user to a new page where he can see all ingredients and instructions for the recipe. From there the user is able to edit the recipe if he likes or to go back to the Home page where if he wishes he can add( create ) a new recipe or just pick up one from the table(list) with low crab dessert recipes.
•	If user decides to create a new recipe, the data will be automatically stored to the submitted data within H2 database.
•	When user decides to Edit a recipe, once he click on “Edit” a new page will be opened with all information about the current recipe. After changes made the user could press an “Update recipe” button in order to update the recipe or if user decide not to make any changes, he could simply use “Go to Home Page” link and go back to the main web page. 


CR15. DEVELOP AN IMPLEMENTATION PLAN WHICH DETAILS THE STEPS AND TASKS REQUIRED TO IMPLEMENT YOUR MS.
1.	Firstly, I started my Microservice PART B project by creating a GitHub repository named “PARTBproject”
2.	Secondly, I created a Maven Spring Boot project using Spring Initializer with the following dependencies: 
2.1. Spring web.
2.2. H2 database.
2.3. Thymeleaf.
3.	Once I created my project I added more dependencies in my PARTB project pom.xml file to make sure my project was running perfectly. 
4.	Spring Boot Web, Thymeleaf, JPA and H2 dependencies serving as our in-memory database.
5.	Then by using GitBash I created an empty repository, made my first commit with creating packages such as the following: -Entity named com.example.PARTBproject.Entity; 
-Controller named com.example.PARTBproject.Controller
-Repository named 
com.example.PARTBproject.Repositories
-Service named com.example.PARTBproject.Services

and pushed it to GitHub.
6.	I started my project by creating two Entity classes in order to be able to store information about my project such as “Recipe” class and “Nutrition” class.
7.	I set/generated constructor, getters, and setters for all variables in the above classes.
8.	Then both “Recipe” and “Nutrition” are defined as Java classes with some annotations. So by adding @Entity before classes, I am able to make instances available to JPA. 
9.	After that I created @Id and @GenerateValue annotations that allowed me to indicate the unique ID field for the Entity and its value generated automatically when store in the H2 database. 
10.	Then I created @OneToMany as the relationship between my entity models “Recipe” and “Nutrition” in which an element of “Recipe” may be linked to many elements of “Nutrition”.
11.	Next I created my variables within “Recipe” such as the following: 
Long id; String description(recipe’s name); String ingredients(ingredients of the recipe); String Method Steps(instructions of how to prepare the recipe), int total(number of kilocalories);
12.	In the next package called Repositories  I created “Recipe” and “Nutrition” interfaces which allowed me to access stored Recipes and Nutrition’s through method calls, such as the following: findAll, findByIdI (returns a recipe with given ID)
13.	In my Controller package I started with @Controller which purpose is to map request URI-s to view templates and perform all processing in my web application.
14.	Then created two classes “Recipe” and “Nutrition” in my Controller package. 
15.	Within the Controller I’ve written @Autowired annotations which automatically assigns a valid instance of my defined repository in the corresponding field. This allows access to my relevant H2 database from within the Controller.
16.	By creating @GetMapping annotation I can handle Get types of @Request method.
17.	@PostMapping is being used in my project to handle Post type of the required method. 
18.	Mapping of the URI-s to my methods is done by @RequiestMapping. In this scenario every method of my Controller is mapped to a URI. Then inside @RequiestMapping I’ve created @PathVariable which is use for data passed in the web services. And @RequestParam to extract the data found in the query parameters.
19.	Then after I’ve finished writing my source code I started creating Junit test in my Service class as following: 
•	Junit test on save recipe
•	Junit test on get by id
•	Junit test on get all recipes
I was able to see if everything in source code is running smoothly and working properly without any errors or bugs. And needed to make sure all test passed.  
20.	Then I implemented CSS style files with dashboard, table and some different styles templates. Also Javascript, html (under templates directory) uploaded desserts images in recourses-Static folders to be able to use them as a background photos in my web application pages. All those files made my web page look very presentable.
21.	My templates folder has four files responding to all different pages on my web application such: CreateRecipe, editRecipe,recipe and recipes. 
22.	Then I checked everything all over again and run one more junit test as following.
23.	Then started working on the documentational part by creating Readme markdown file, added some photos with charts to my markdown file.
24.	Then by using GitBash I pushed my repository in GutHub and created a zip file ready for submission. 

CR16. CODE(IMPLEMENT) ALL THE FEATURES OF YOUR MS USING A VARIETY OF JAVA AND SPRING PROGRAMMING CONCEPTS.
CR17. CREATE A MS WHICH RUNS WITHOUT ERROR AND HAS THE FEATURES CONSISTENT WITH THE PLANNING DOCUMENT.
CR18. USE SOURCE CONTROL - 15 COMMITS MINIMUM.
CR19. USE INDUSTRY STANDARD STYLE AND NAMING CONVENTIONS FOR YOUR JAVA CODE. ( APPLIES INDUSTRY STANDARD STYLE AND NAMING CONVENTIONS CONSISTENTLY TO ALL CODE WITH NO OMISSIONS.
CR20. APPLY THE DRY (DO NOT REPLAY YOURSELF) TO ALL YOUR CODE.

CR21. DESIGN, DOCUMENT AND RUN SIMPLE TESTS ON YOUR MS. 
I have created 3 tests on my Service class as following: 
•	Junit test on save recipe
•	Junit test on get by id
•	Junit test on get all recipes 

CR22. PRESENT YOUR MS TO AN AUDIENCE. PROVIDE A WALK THROUGH OF:
        1. PURPOSE OF MS,
        2. FUNCTIONALITY AND FEATURES OF MS.
        3. DESIGN OF MS.
        4. WALK THROUGH DEMONSTRATION OF MS.

