<!DOCTYPE html>
<html>

<head lang="en">     <meta charset="UTF-8">



  <title>myFirstProject</title>

</head>


<body>

<div>
  <form action="${pageContext.request.contextPath}/myServlet" method="post">


    <p>Enter Name.
      <input type="text" name="name" /></p>




    <p>Last Name.
      <input type="text" name="name2" /></p>


    <p>Password.
      <input type="password" name="pass" /></p>

    <p>Single-selection radiobuttons.
      <input type="radio" name="gender" value="M" /> Male
      <input type="radio" name="gender" value="F" /> Female</p>

    <p>Single-selection checkbox.
      <input type="checkbox" name="agree" /> Agree?</p>

    <p>Multi-selection checkboxes.
      <input type="checkbox" name="role" value="USER" /> User
      <input type="checkbox" name="role" value="ADMIN" /> Admin</p>

    <p>Single-selection dropdown.
      <select name="countryCode">
        <option value="NL">Netherlands</option>
        <option value="US">United States</option>
      </select></p>

    <p>Multi-selection listbox.
      <select name="animalId" multiple="true" size="2">
        <option value="1">Cat</option>
        <option value="2">Dog</option>
      </select></p>

    <p>Text area.
      <textarea name="message"></textarea></p>

    <p>Submit button.
      <input type="submit" name="submit" value="submit" /></p>
  </form>


</div>

</body>

</html>