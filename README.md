# HeroMe
This is a Dummy App which doesnt do anything, but was built to understand exactly how Fragments are used and how to transition from one fragment to another.
This app also uses a custom ToolBar(or ActionBar).


# How Does the App Work?
When the MainActivity starts, it loads the MainFragment and displays it on to the screen, and when the Select Power Button is pressed the 2nd Fragment is loaded 
and replaces the MainFragment from the Screen and stores it in BackStack so that if the User presses the back button the Previous fragment is displayed.


# How does the Custom ToolBar works?
.noActionBar theme is applied on the project to get rid of the Default actionBar, then there is an imageView(in MainActivity layout) on the top which has a minimum Height same as that of the default ActionBar
 and has the custom Image of the ActionBar applied on it. thus this is how the Custom ActionBar is made and implemented
