<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

      <script>
            alert("User ID-${regObj.UID} has been removed successfully.Please see changes in the H2 table");
      </script>
      <h3>See below updated User Form details</h3>
      <h4>
       UserID: ${regObj.UID}<br>
       Name:${regObj.name}<br>
       Email:${regObj.email}<br>
       Password: ${regObj.password}<br>
       Gender : ${regObj.gender}<br>
       Hobbies: ${regObj.hobbies[0]}, ${regObj.hobbies[1]},${regObj.hobbies[2]}<br>
       Message: ${regObj.message}
      </h4>
</body>
</html>