# My Car Shop

## Task C amaking changes to the website pages
In this task, I customized the website pages. The changes can be reached in the mainscreen.html on lines 14,19,21, 35,37, 53, and 71-73


## task D Adding About us Page
Added the about us page ( seee aboutus.html). I also added the url mapping in the MainScreenController.java in lines 56-59
A link to the aboutus page was added to mainscreen.html in lines 90-92. A commit was carried out for tasks C and D with the message 'Tasks C and D'


## Task E Adding inventory
Mock inventory was added on the BootStrapData.java in lines 70-132. The inventory comprises 5 products and 5 parts.
The inventory is only created when the database is empty. A git commit was carried for task E with the message 'Task E Completed'


## Task F Adding Buy Now Button
Added the 'Buy Now' button on the mainscreen.html in line 85
Also implemented the URL mapping and controller in AddProductController.java from line 177-199.
Clicking the button opens a confirmation page, and decrements the inventory by 1
The solution for this step is accompanied by the git commit message 'Task F'

## Task G Adding minInv and maxInv
The implementation of the minInv and maxInv begin by the creation of variables in lines 32-35
A new constructor featuring all parameters is created in lines 57-63
Changes are made to the setInv method to ensure the inv is not less than minInv and not greater than maxInv.
The changes are made in lines 93-99
The getter and setter methods for minInv and maxInv are implemented between lines 121 and 141
Corresponding changes were implemented in the mainscreen.html in lines 38-39 and 49-49
Changes were also made to the inhousepartform.html from line 18-31.
Similar changes were made to the outsourcepartform.html in lines 19-33