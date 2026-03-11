<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head><title>Add Food Item</title></head>
<body>
  <h2>Add Food Item</h2>

  <% String msg = request.getParameter("msg");
     if ("failed".equals(msg)) { %>
       <p style="color:red;">Failed to add item. Try again.</p>
  <% } else if ("success".equals(msg)) { %>
       <p style="color:green;">Food item added successfully!</p>
  <% } %>

  <form action="addFood" method="post">

    <label for="fname">Food Name:</label><br/>
    <input type="text" id="fname" name="fname" placeholder="Enter food name" required/><br/><br/>

    <label for="description">Description:</label><br/>
    <textarea id="description" name="description" placeholder="Enter food description" rows="4" cols="40" required></textarea><br/><br/>

    <label for="price">Price:</label><br/>
    <input type="number" id="price" name="price" placeholder="Enter price" step="0.01" min="0" required/><br/><br/>

    <label for="stock">Stock:</label><br/>
    <input type="number" id="stock" name="stock" placeholder="Enter stock quantity" min="0" required/><br/><br/>

    <label for="category">Category:</label><br/>
    <select id="category" name="category" required>
      <option value="">-- Select Category --</option>
      <option value="Starters">Starters</option>
      <option value="Main Course">Main Course</option>
      <option value="Desserts">Desserts</option>
      <option value="Beverages">Beverages</option>
      <option value="Snacks">Snacks</option>
    </select><br/><br/>

    <input type="submit" value="Add Food Item"/>
    <a href="dashboard.jsp">Cancel</a>

  </form>
</body>
</html>