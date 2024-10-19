<%--
  Created by IntelliJ IDEA.
  User: carlocontardi
  Date: 19/10/24
  Time: 14:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Java Shop - Sign up</title>
    <meta charset="UTF-8">
    <meta name="author" content="Carlo Contardi">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Questo è un sito web Java FullStack">
    <meta name="keywords" content="Java">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">

</head>
<body class="d-flex align-items-center py-4 bg-body-tertiary">
<!-- TODO FIX: ridimensionare lpagina-->
<main class="form-signin w-100 m-auto">
    <form method="post" action="users-servlet">

        <img class="mb-4" src="images/bag-heart.svg" alt="" width="72" height="57">
        <h1 class="h3 mb-3 fw-normal">Please sign up</h1>
        <div class="form-floating">
            <input type="text" class="form-control" id="first-name" placeholder="First name" name="first-name">
            <label for="first-name">First Name</label>
        </div>
        <div class="form-floating">
            <input type="text" class="form-control" id="last-name" placeholder="Last name" name="last-name">
            <label for="last-name">Last Name</label>
        </div>
        <div class="form-floating">
            <input type="email" class="form-control" id="email" placeholder="name@example.com" name="email">
            <label for="email">Email address</label>
        </div>
        <div class="form-floating">
            <input type="password" class="form-control" id="password" placeholder="Password" name="password">
            <label for="password">Password</label>
        </div>
        <button class="btn btn-primary w-100 py-2" type="submit">Sign Up</button>
        <p class="mt-5 mb-3 text-body-secondary">©2024</p>
    </form>
</main>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>
