<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Form</title>
</head>
<body>
<form action="hello" method="POST">
    Parametr1: <input name="userParametr1"/>
    <br><br>
    Parametr2: <input name="userParametr2"/>
    <br><br>
    Operation: <select name="operation">
    <option>+</option>
    <option>-</option>
    <option>*</option>
    <option>/</option>
</select>
    <br><br>
    <input type="submit" value="Submit"/>
</form>
</body>
</html>