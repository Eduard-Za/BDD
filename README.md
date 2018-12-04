# Candidate-task
Test Automation Engineer testing task.

<p>This project contains automation tests in BDD style for testing <b>http://the-internet.herokuapp.com</b> web application.</p>
<h3>Technology stack includes:</h3>
<ul>
<li>Java 8</li>
<li>Maven</li>
<li>Selenium and Selenide wrapper</li>
<li>JUnit</li>
<li>Cucumber for Java 8</li>
</ul>
<hr/>

<h3>Feature overview</h3>
<p>There are 3 features files in the project (<b>src\test\resources\features</b>):</p>

1. login.feature - contains tests for login verification.
2. hovers.feature - contains tests which verify that the usernames are displayed as soon as the hover is triggered.
3. table.feature - contains tests which check correct ascending/descending ordering by Last Name column.

<h3>Description of project structure</h3>

Step definitions for the features are stored in the <b>src\test\java\steps</b> package. 

Tests were written using Page Object pattern (<b>src\main\java\task\pages</b>). Also, were created a couple of
custom exceptions (<b>src\main\java\task\exceptions</b>). Package <b>src\main\java\task\utils</b> contains 
<b>PropertiesLoader.class</b> that allows to load properties from properties files (<b>src\main\resources\test.properties</b>).

<p>Testing runs using ChromeDriver with possibility to run in various environment(<b>src\main\java\task\drivers</b>).</p>

<p>Test Runner class - <b>src\test\java\TestRunner.java</b>.
<h3>How to run tests</h3>

<p>Please open a terminal and run next commands:</p>
<code>git clone https://github.com/Eduard-Za/Candidate-task.git</code><br/>
<code>cd Candidate-task</code><br/>
<code>mvn test</code><br/>
<br> 
<p>Example of report file in JSON format you can find in <b>target/cucumber-report.json</b></p>
</br>
Please send all questions to <b>eduardos1218@gmail.com</b>.
 
