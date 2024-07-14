<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Dictionary</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<div class="container mt-5">
    <h1>English-Vietnamese Dictionary</h1>
    <form action="translate" method="post">
        <div class="mb-3">
            <label for="word" class="form-label">Enter an English word:</label>
            <input type="text" class="form-control" id="word" name="word" required>
        </div>
        <button type="submit" class="btn btn-primary">Translate</button>
    </form>

    <c:if test="${not empty result}">
        <div class="mt-5">
            <h2>Result</h2>
            <p>Word: <span>${word}</span></p>
            <p>Translation: <span>${result}</span></p>
        </div>
    </c:if>
</div>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
</html>
