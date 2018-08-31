# MyApplication20067214 Kacper Morawski

Student App is an app designed to help student's stay on track with their college work, it allows user to register & log in,
view existing assigments, delete or edit given assigment. It will provide timetable function where a user will pick their course and day and it will display
their timetable for given day. It will also helps students keep track of their assigment score under result section showing the percentage they got in given assigment.

What works:
Login in compares given username and password to hardcoded username and password
Login:Admin
Password:root
It does not use SQL database just yet, if the data gets inputed incorrectly 5 times the button 'Login" get's disabled. 
It also checks if the fields are empty and prompts warning if they are.

Option register takes user through form of registration, it checks to see if any of the boxes are empty and if they are it's gonna warn user and not allow to the next screen.
After all boxes are filled the user information does NOT get stored just yet. Once all fields are filled it allows to Home Screen. 

Home screen does not allows user to use the 'Back' button. To go back to login screen the user can use the top menu and choose option "Logout". 
Home screen has three sections (three pictures) Assigments, Timetable, Results.
All of pictures are clickable and bring user to new section.

Sections
	 Assigments
Gets a drop down menu that alows user to log out or brings it to main screen.
Section assigments display two buttons and input text box for user, it takes the name of assigment and saves it onto SQLiteDatabase if pressed 'save'.
If button 'View Assigments' is pressed user gets moved onto new screen where he/she gets displayed the array of assigments, each of elements is clickable and if clicked
it gets the ID of object and creates new screen where it passes its ID&Name for Edit or delete purpose. The array gets updated and needs to be Viewed again to see the changes.


	Timetable
Section timetable is work in progress, curently it only has a layout and no functionality behind. The idea behind this one is that user will choose their course - or even this can be
read through the registration form when user inputs that anyway and then it asks the user for particular day the would like to get their timetable for, eventually providing user
with an picture of given timetable.

	Results
Result section is also work in progress, curently it only has the layout of what the activity supposed to look like, it will provide user with spinner that will have inputs from
assigments array and once the assigment gets choosen it will populate the progress bar indicating how much the user got in it.

Persistance
The whole app is easy to navigate and is not too complex for new user, buttons tend to stay at the bottom of the app and only get move for add or delete feature.

UX Approach
The Ux approach for this app is to make it clear and easy to use, I didint want user to be sitting there and be thinking for half day how to use the app, therefore i implemeted
clickable images as buttons to redict to new activities, self explaining pictures
DX Approach
The Dx approach for this app is to make it easy to see through and not to complicated to edit i try to force in simplicity of things rather than big blocks of code.


Github Repo:
https://github.com/Latte6/MyApplication


https://www.youtube.com/watch?v=lF5m4o_CuNg - Used for log-in screen
https://www.youtube.com/watch?annotation_id=annotation_245689227&feature=iv&src_vid=aQAIMY-HzL8&v=nY2bYJyGty8 - Used for hooking database and displaying arrays.
