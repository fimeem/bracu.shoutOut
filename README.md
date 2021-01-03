# BRACU Shout Out
Our project “Bracu Shout-Out” has been created to make university life better in a orderly way for both bracu students and faculties. This is an well-controlled database for keeping the track of classes, sections and time schedules. Students and faculties can communicate with each other through this platform for any announcement or queries regarding the courses.  


Developing Tools:
1.	Front-End: Java JFrame/ Swing
2.	Back-End: Java


Features:
1.	Authorization - Students and faculties can create new account. In order to log in to the shoutout , they have to verify their account.
2.	Profile - Each students and faculties can view their profile and also they can edit. Their profile shows their name,id,department and the sections of which courses they have taken.  
3.	Shoutbox - From the shoutbox,students can see any announcement courses. Also Faculties can see any queries regarding any course. It shows the messages for one week. This platform is a many to many independent messaging system. Each student and faculties can communicate with each other.
4.	Search Box - by this we can find other students and faculties by their username.
5.	Course Panel - Students can see the class schedules, sections of the courses they are enrolled with. Faculties can also see these of the courses they are going to instruct.
6.	Comments - Students and faculties can comment regarding any course separately. 



SQL Features:
1.	Database Connection: We connected MySQL database with the Java JDK using “MySQL-connector-JAVA 8.0.14” library software. In the class file to retrieve and manipulate data; we created Connection, Statement, Resultset variables to connect with the driver manager.
2.	SELECT: It is used to show or retrieve data from the database. We used SELECT command to retrieve profile data like Name, ID, Email etc and also the courses.
For Example: “select email from stdProfile where user='niloydeb1';” this statement retrieve EMAIL address of an User name “niloydeb1”.
3.	INSERT INTO: This command is used to insert values into the database. We used INSERT INTO command to insert profile values like Name, ID, Email etc and also the courses.
For Example: “insert into stdProfile values ('Meem', '17301011', 'CSE');” this statement puts student info into stdProfile table.
4.	JOIN: This command is used to join values from two different tables using foreign key into the database. We used INNER JOIN between Courses and StdProfile tables to retrive courses details.
For Example: "select course_id, course_title, course_sec, course_instructor, schedule from courses inner join stdProfile on courses.course_id=stdProfile.course5 where stdProfile.sec5=courses.course_sec and stdProfile.course5=courses.course_id and stdProfile.user='heemel.mushfiqur' order by course_id;"
This Statement retrieve course information of an user name ‘heemel.mushfiqur’;
5.	UPDATE/DELETE: It is used to update or delete data from the database. We used UPDATE/DELETE command to update or delete profile data like Name, ID, Email etc and also the courses.
For Example: "update authentication set pass='12356' where user='sworna.roy’” this statement set new password for the user ‘sworna.roy’.

