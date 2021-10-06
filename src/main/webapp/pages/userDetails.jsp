<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User</title>
</head>
<body>
      <h2>Congratulations!!</h2>
      <h3>See below User Form details</h3>
      <h4>
       UserID: ${regObj.UID}<br>
       Name:${regObj.name}<br>
       Email:${regObj.email}<br>
       Password: ${regObj.password}<br>
       Gender: ${regObj.gender}<br>
       Hobbies: ${regObj.hobbies[0]}, ${regObj.hobbies[1]},${regObj.hobbies[2]}<br>
       Message: ${regObj.message}
      </h4>
</body>
</html>