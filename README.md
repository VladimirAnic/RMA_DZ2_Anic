<h1>UniCon unit converter</h1>

<h2>
Task:
</h2>
<p>
Create an app that converts measurment units.  Aplication is consisted of four  Activites. First activity consists of 
4 buttons with images that describe what type of conversion will be done.  Click on a button starts a new activity using 
explicit intent to start the conversion. In every Acrtivity it is necessary to collect user input, unit of measurment(using spineer)
and calculate the result which is then sent to a new activity for displaying the result (selected measurment units are: Electrical charge, digital image resolution,
distance and temperature).
</p>

<h2>Solution review and problems:</h2>
<h4>Solution review:</h4>
<p>
For the user interface there are six activities with their .xml files. These activities represent each unit of measurment,
home screen and the result display. There is also an aditional java class that is used to pass the data from other activities
to the "Result" activity. Said class implements Parcelable interface for passing data between the activities. The way to implement this
can be found in official android documentation or <a href="http://stackoverflow.com/questions/2736389/how-to-pass-an-object-from-one-activity-to-another-on-android">stack overflow</a>
.
</p>

<p>
To use the spinner object, first, an array needs to be created and after that the spinner can be created in layout file.
When the spinner is created in layout file it needs to be initialized in the java file for the activity using ArrayAdapter and setting it static.
The way to implement spinners can be found in official android documentation or on <a href="http://stackoverflow.com/questions/33054318/android-studio-spinner-causing-app-to-crash">stack overflow</a>.
</p>

<p>
For calculating the values for unit conversion nested switch-case statements were used. In these statements each case used for spinners
were accesed using array indexes. Before that there is an if-else statement that checks if there is a value in EditText and if there is nothing
entered it opens the Result activity and displays a Toast message.
</p>

<h4>Problems:</h4>

<p>
The biggest problem was creating the parcelable class and the problem was resolved using the already attached link and using another
<a href="http://sohailaziz05.blogspot.hr/2012/04/passing-custom-objects-between-android.html">solution</a> found on the internet.
<br>
Another problem was the main activity layout which was resolved using nested linear layouts in which the first two buttons are
in first linear layout and the other two are in the second nested LinearLayout. This could be solved using tables or using the solution with linear layouts like
<a href="http://stackoverflow.com/questions/7189784/how-to-fill-screen-with-four-buttons-with-the-table-layout">here</a> was used.

</p>
