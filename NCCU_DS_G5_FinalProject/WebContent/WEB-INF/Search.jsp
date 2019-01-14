<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>GoogleSearch</title>
</head>
<body>
<form action='${requestUri}' method='get'>

<div>

<select name='food' style='width:180px'>
<option selected>食材</option>
<option value='chicken'>雞肉</option>
<option value='pork'>豬肉</option>
</select>

<select name='food1' style='width:180px'>
<option selected>副食材</option>
<option value='chicken'>雞肉</option>
<option value='pork'>豬肉</option>
</select>

<select name='food2' style='width:180px'>
<option selected>副食材</option>
<option value='chicken'>雞肉</option>
<option value='pork'>豬肉</option>
</select>


</div>
<pre></pre>
<div>
<select name='cook' style='width:180px'>
<option selected>烹調方式</option>
<option value='roast'>烤</option>
<option value='stew'>燉</option>
</select>
</div>
<pre></pre>

<br><input type='submit' value='輸入' />
</form>
</body>
</html>
