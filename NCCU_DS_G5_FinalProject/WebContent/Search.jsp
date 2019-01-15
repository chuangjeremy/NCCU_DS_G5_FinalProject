<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<style>
body {font-family: "Times New Roman", Georgia, Serif;}
h1, h2, h3, h4, h5, h6 {
  font-family: "Playfair Display";
  letter-spacing: 5px;}
</style>
<title>GoogleSearch</title>
</head>

<body>
<form action='${requestUri}' method='get'>

<div class="w3-top">
  <div class="w3-bar w3-white w3-padding w3-card" style="letter-spacing:4px;">
    <a href="#home" class="w3-bar-item w3-button"> Recherche de recette </a>
    <div class="w3-right w3-hide-small">
      <a href="#about" class="w3-bar-item w3-button">About</a>
      <a href="#menu" class="w3-bar-item w3-button">Menu</a>
      <a href="#contact" class="w3-bar-item w3-button">Contact</a>
    </div>
  </div>
</div>

<!-- Header -->
<header class="w3-display-container w3-content w3-wide" style="max-width:1600px;min-width:500px" id="home">
  <img class="w3-image" src="images/DS_Fries.jpg" alt="Hamburger Catering" width="1600" height="500">
  
  <div class="w3-display-bottomleft w3-padding-large w3-opacity">
    <h1 class="w3-xxlarge">Recipes</h1>
  </div>
</header>


<!-- Page content -->
<div class="w3-content" style="max-width:1100px">

  <!-- About Section -->
  <div class="w3-row w3-padding-64" id="about">
    <div class="w3-col m6 w3-padding-large w3-hide-small">
     <img src="images/DS_Pizza.jpg" class="w3-round w3-image w3-opacity-min" alt="Table Setting" width="600" height="800">
    </div>

    <div class="w3-col m6 w3-padding-large">
      <h1 class="w3-center">About Us</h1><br>
      <h5 class="w3-center">Tradition since 2019</h5>
      <p class="w3-large"><font size="2">Recherche de recette is founded by three experienced chefs who enjoy cooking, sharing recipes and making friends with foodies worldwide. We hope to help foodies to search for their desired recipes which can satisfy their appetite for delicacies. We are also looking for software engineers who would like to contribute their expertise to bring awesome recipes to the world. In addition, partnerships with advertisers and any donation are also welcomed! Feel free contact us!</font></p>
        <p class="w3-large w3-text-grey w3-hide-medium"><b> Chef Vincent Chen </b> <font size="1">106306001 sophomore MIS student with great sense of fast food recipe </font><br>
 		<b> Chef Ele Hsieh </b> <font size="1">105302055 junior Money & Banking student with expertise in fried and roasted dishes </font><br>
 		<b> Chef Jeremy Chuang </b> <font size="1">103303005 Accounting student with 23 years of cuisine sampling experience, specialize in dairy related dishes </font></p>
    </div>
  </div>
  
  <hr>
  
<!-- Menu Section -->
  <div class="w3-row w3-padding-64" id="menu">
    <div class="w3-col l6 w3-padding-large">
      <h1 class="w3-center">Search For Optimal Recipes</h1><br>

<div>

<select name='food' style='width:180px'>
<option selected>Ingredient</option>
<option value='chicken'>Chicken</option>
<option value='pork'>Pork</option>
</select>


<select name='food1' style='width:180px'>
<option selected>Sub-ingredient</option>
<option value='chicken'>Chicken</option>
<option value='pork'>Pork</option>
</select>

<select name='food2' style='width:180px'>
<option selected>Sub-ingredient</option>
<option value='chicken'>Chicken</option>
<option value='pork'>Pork</option>
</select>


</div>
<pre></pre>
<div>
<select name='cook' style='width:180px'>
<option selected>Cooking Techniques</option>
<option value='roast'>Roast</option>
<option value='stew'>Stewed</option>
</select>
</div>
<pre></pre>

<br><input type='submit' value='Submit' />

    </div>
    
    <div class="w3-col l6 w3-padding-large">
      <img src="/w3images/tablesetting.jpg" class="w3-round w3-image w3-opacity-min" alt="Menu" style="width:100%">
    </div>
  </div>

  <hr>
  
  
</form>


  <!-- Contact Section -->
  <div class="w3-container w3-padding-64" id="contact">
    <h1>Contact</h1><br>
    <p>We offer full-service recipes for any event, large or small. We understand your needs and we will search for the food to satisfy the biggerst criteria of them all, both look and taste. Do not hesitate to contact us.</p>
    <p class="w3-text-blue-grey w3-large"><b>64, Sec.2, ZhiNan Rd., Wenshan District, Taipei City 11605, Taiwan</b></p>
    <p>You can also contact us by phone +886 987987987 or email 103303005@nccu.edu.tw, or you can send us a message here, we will definiely not reply to you.</p>
    <form action="/action_page.php" target="_blank">
      <p><input class="w3-input w3-padding-16" type="text" placeholder="Name" required name="Name"></p>
      <p><input class="w3-input w3-padding-16" type="number" placeholder="How many people" required name="People"></p>
      <p><input class="w3-input w3-padding-16" type="datetime-local" placeholder="Date and time" required name="date" value="2017-11-16T20:00"></p>
      <p><input class="w3-input w3-padding-16" type="text" placeholder="Message \ Special requirements" required name="Message"></p>
      <p><button class="w3-button w3-light-grey w3-section" type="submit">SEND MESSAGE</button></p>
    </form>
  </div>
  
<!-- End page content -->
</div>

<!-- Footer -->
<footer class="w3-center w3-light-grey w3-padding-32">
  <p> NCCU Data Structures (Fall 2018) Thursday 1:10-4:00pm <b>Group 5</b></p>
</footer>


</html>
