<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form</title>
</head>
<body>
      <h1>Registration form</h1>
      <br>
      <form action="userDetail">
         User Name: <input id="UserName" name="UsrName" placeholder="Enter your name" required/><br><br>
         User Email: <input type="email" id="UserEmail" name="UsrEmail" placeholder="Enter your Email" required/><br><br>
         Password: <input type="password" id="password" name="Password" placeholder="Enter your password" required/><br><br>
         Gender: <input type="radio" name="Gender" value="1" checked=true required/>Male
                 <input type="radio" name="Gender" value="2"required />Female
                 <br><br> Hobbies:
          <input type="checkBox" name="hobby" value="Singing"/>Singing
           <input type="checkBox" name="hobby" value="dancing"/>Dancing
            <input type="checkBox" name="hobby" value="traveling"/>Traveling
            <br><br>
            <p>Please put your inquiry in the Box below-:)</p>
           <textarea id="UsrMessage" name="message" rows="4" cols="40" placeholder="Please let me know what's in your mind"></textarea
            <br><br><br>
          <input type="submit" value="Register now" />
         </form>
         
</body>
</html>