<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Information</title>
</head>
<body>
<h1>User Information</h1>
<form action="/ServletExample/Register" method="post">
<table>
<tbody>
<tr>
<td>User name : </td>
<td><input type="text" name="userName" ></td>
</tr> 
<tr>
<td>Password : </td>
<td><input type="password" name="passwd" ></td>
</tr>

<tr> 
<td>Gender : </td>
<td><input type="radio" name="gender" value="male" /> Male &nbsp;
<input type="radio" name="gender" value="female" /> Female &nbsp;
</td>
</tr>

<tr> 
<td>Hobbies : </td>
<td><input type="checkbox" name="hobbies" value="movies" /> Movies &nbsp;
<input type="checkbox" name="hobbies" value="singing" /> Singing &nbsp;
<input type="checkbox" name="hobbies" value="dancing" /> Dancing &nbsp;
</td>
</tr>

<tr>
<td>Country : </td>
<td> 
<select name="country">
		<option value="India">India </option>
		<option value="Srilanka">Srilanka </option>
		<option value="Australia">Australia </option>
		<option value="Switzerland">Switzerland </option>

</select>
</td> 
</tr>

<tr>
<td>Languages Known : </td>
<td> 
<select name="languages" multiple="multiple">
		<option value="Telugu">Telugu </option>
		<option value="Hindi">Hindi </option>
		<option value="English">English </option>
		<option value="Tamil">Tamil </option>

</select>
</td> 
</tr>
<tr>
<td>&nbsp;</td>
<td><input type="submit" value="Register" name="btnRegister"/> &nbsp;
<input type="reset" value="Clear" name="btnClear"/>
</tr>

</tbody>
</table>


</form>
</body>
</html>