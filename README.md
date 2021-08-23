# **PART B - MICROSERVICES(MS)**

### *CR12. REQUIREMENT AND PLANNING DOCUMENT.*

![Planning img-1](https://user-images.githubusercontent.com/81399590/130353291-72a0df6d-9627-4393-a1e5-df892655e245.jpg)


### *CR13. STATEMENT OF PURPOSE. (WHAT THE SERVICE WILL DO, BUSINESS PROBLEM, TARGET AUDIENCE.*

_**WHAT THE SERVICE WILL DO:**_
My Part B project in microservice will work as a Low Carbohydrate dessert recipes web application where the user will be able to store their delicious recipes with visible nutrition info (kilocalories) on the first page, also ingredients, instructions on how desserts to be prepared and lastly but not least nutrition information. With this information, the user can keep track of their macros during the day or the week. Also, the user will be able to create a new recipe, or just Edit their recipes when they wish to.

_**BUSINESS PROBLEM:**_ Many people who are loving sweets but trying to avoid sugar or unhealthy food including myself are preparing their desserts at home, which helps them to keep track of their daily nutrition intake and having a very healthy lifestyle. Most of the time users (or people like me) prepare sweets every second day, people find different recipes from different resources all the time, I found that once somebody cook/bake something they do not keep data on their delicious recipes and when decide to prepare the same food again they do not remember where they got the recipe from, so it is very nice every person who enjoys cooking, baking eating desserts to have their app where they can add favourite low carbs desserts or any other food recipes with low carbohydrates.

_**TARGET AUDIENCE:**_
The target audience for this web application includes people of any type of gender, age or nationality. For those who enjoy cooking, preparing food and eating healthy sweet desserts or any other food.

### *CR14. LIST OF FEATURES INCLUDED IN THE MS.*
#### 1. Displays the “Welcome/Hello to my dessert page” message to the user.
#### 2. Displays a table named “Low Carb Desserts” with Recipe’s name, nutrition info such as kilocalories.
#### 3. Plus Go-To Recipe’s view takes the user to a new page where he can see all ingredients and instructions for the recipe. From there the user can edit the recipe if he likes or go back to the Home page where if he wishes he can add( create ) a new recipe or just pick up one from the table(list) with low crab dessert recipes.
#### 4. If the user decides to create a new recipe, the data will be automatically stored to the submitted data within the H2 database.
#### 5. When the user decides to edit a recipe, once he clicks on “Edit” a new page will be opened with all information about the current recipe. After changes are made the user could press an “Update recipe” button to update the recipe or if the user decides not to make any changes, he could simply use the “Go to Home Page” link and go back to the main web page.


### *CR15. DEVELOP AN IMPLEMENTATION PLAN WHICH DETAILS THE STEPS AND TASKS REQUIRED TO IMPLEMENT YOUR MS.*
1. Firstly, I started my Microservice PART B project by creating a GitHub repository named “PARTBproject”
2. Secondly, I created a Maven Spring Boot project using Spring Initializer with the following dependencies:
-[x] _Spring web._
-[x] _H2 database._
-[x] _Thymeleaf._
3. Once I created my project I added more dependencies in my PARTB project pom.xml file to make sure my project was running perfectly.
4.  Spring Boot Web, Thymeleaf, JPA and H2 dependencies serving as our in-memory database.
5. Then by using GitBash I created an empty repository, made my first commit with creating packages such as the following:
-     Entity named com.example.PARTBproject.Entity; 
-     Controller named com.example.PARTBproject.Controller
-     Repository named com.example.PARTBproject.Repositories
-     Service named com.example.PARTBproject.Services and pushed all of them to GitHub.

6. I started my project by creating two Entity classes to be able to store information about my project such as the “Recipe” class and “Nutrition” class.
7. I set/generated constructor, getters, and setters for all variables in the above classes.
8. Then both “Recipe” and “Nutrition” are defined as Java classes with some annotations. So by adding **@Entity** before classes, I can make instances available to JPA.
9. After that I created **@Id** and **@GenerateValue** annotations that allowed me to indicate the unique ID field for the Entity and its value generated automatically when storing in the H2 database.
10.    Then I created **@OneToMany** as the relationship between my entity models “Recipe” and “Nutrition” in which an element of “Recipe” may be linked to many elements of “Nutrition”.
11.    Next I created my variables within “Recipe” such as the following:
       Long id; String description(recipe’s name); String ingredients(ingredients of the recipe); String Method Steps(instructions of how to prepare the recipe), int total(number of kilocalories);
12.    In the next package called Repositories  I created “Recipe” and “Nutrition” interfaces which allowed me to access stored Recipes and Nutrition’s through method calls, such as the following: findAll, findByIdI (returns a recipe with given ID)
13.    In my Controller package I started with **@Controller** which purpose is to map request URI-s to view templates and perform all processing in my web application.
14.    Then created two classes “Recipe” and “Nutrition” in my Controller package.
15.    Within the Controller I’ve written **@Autowired** annotations which automatically assigns a valid instance of my defined repository in the corresponding field. This allows access to my relevant H2 database from within the Controller.
16.    By creating **@GetMapping** annotation I can handle the Get types of **@Request method.**
17.    **@PostMapping** is being used in my project to handle the Post type of the required method.
18.    Mapping of the URI-s to my methods is done by **@RequiestMapping.** In this scenario, every method of my Controller is mapped to a URI. Then inside **@RequiestMapping** I’ve created **@PathVariable** which is used for data passed in the web services. And **@RequestParam** to extract the data found in the query parameters.
19.    Then after I’ve finished writing my source code I started creating the Junit test in my Service class as following:
       •  Junit test on save recipe
       •  Junit test on get by id
       •  Junit test on get all recipes
       I was able to see if everything in the source code is running smoothly and working properly without any errors or bugs. And needed to make sure all tests passed.
20.    Then I implemented CSS style files with dashboard, table and some different styles templates. Also Javascript, HTML (under templates directory) uploaded desserts images in recourses-Static folders to be able to use them as background photos in my web application pages. All those files made my web page look very presentable.
21.    My templates folder has four files responding to all different pages on my web application such: CreateRecipe, editRecipe, recipe and recipes.
22.    Then I checked everything all over again and run one more JUnit test as following.
23.    Then started working on the documentation part by creating a Readme markdown file, added some photos with charts to my markdown file.
24.    Then by using GitBash I pushed my repository in GitHub and created a zip file ready for submission.

### *CR16. CODE(IMPLEMENT) ALL THE FEATURES OF YOUR MS USING A VARIETY OF JAVA AND SPRING PROGRAMMING CONCEPTS.*
### *CR17. CREATE A MS WHICH RUNS WITHOUT ERROR AND HAS THE FEATURES CONSISTENT WITH THE PLANNING DOCUMENT.*
### *CR18. USE SOURCE CONTROL - 15 COMMITS MINIMUM.*
### *CR19. USE INDUSTRY-STANDARD STYLE AND NAMING CONVENTIONS FOR YOUR JAVA CODE. ( APPLIES INDUSTRY-STANDARD STYLE AND NAMING CONVENTIONS CONSISTENTLY TO ALL CODE WITH NO OMISSIONS.*
### *CR20. APPLY THE DRY (DO NOT REPLAY YOURSELF) TO ALL YOUR CODE.*

### *CR21. DESIGN, DOCUMENT AND RUN SIMPLE TESTS ON YOUR MS.*
###I have created *3 tests* on my *Service* class as following:
1. Junit test on save recipe
2. Junit test on get by id
3. Junit test on get all recipes
>Mentioned on my Implementation point CR15 as well.
### *CR22. PRESENT YOUR MS TO AN AUDIENCE. PROVIDE A WALKTHROUGH OF:*
        1. PURPOSE OF MS,
        2. FUNCTIONALITY AND FEATURES OF MS.
        3. DESIGN OF MS.
        4. WALKTHROUGH DEMONSTRATION OF MS.

