# HeroMe
This is a Dummy App which doesnt do anything, but was built to understand exactly how Fragments are used and how to transition from one fragment to another.
This app also uses a custom ToolBar(or ActionBar).


# How Does the App Work?
When the MainActivity starts, it loads the MainFragment and displays it on to the screen, and when the Select Power Button is pressed the 2nd Fragment is loaded 
and replaces the MainFragment from the Screen and stores it in BackStack so that if the User presses the back button the Previous fragment is displayed.


# How does the Custom ToolBar works?
.noActionBar theme is applied on the project to get rid of the Default actionBar, then there is an imageView(in MainActivity layout) on the top which has a minimum Height same as that of the default ActionBar
 and has the custom Image of the ActionBar applied on it. thus this is how the Custom ActionBar is made and implemented

# Flaws in the App
1) There is some transparent Pixels in the ToolBar image which makes it look as if there is some Margins in the toolBar but its totally the fault of the Image and not the app or anything else.

2) This app is a Dummy app and doesnt actually have a Functionality -- It just explains how Fragments work.

3) UI isnt layed the best way Possible, some UI elements may also bleed out of the screen on smaller Devices, Which can be fixed by using Constraints.

# Conclution

App made by - Raghav Vashisht

Course enrolled - Devslopes Course for Android
