<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Enrollment Form</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
</head>
<style>
    * {
        box-sizing: border-box;
    }

    .container p {
        text-align: match-parent;
        color: #A42527;
        font-weight: bold;
        font-family: "Helvetica Neue", Helvetica, Arial, sans-serif;
    }

    .container {

        position: relative;
        margin: auto;
        right: 0;
        left: 0;
        padding: 15px;
        border-radius: 5px;
        border: solid #CACACA;
        width: 50%;
    }


    .title {
        font-weight: bold;
        color: #CB1926;
        margin-top: 40px;
        text-align: center;
        margin-bottom: 20px;
    }

    .home, .submit {
        margin-bottom: 10px;
        text-align: center;
        font-weight: bold;
        font-family: "Helvetica Neue", Helvetica, Arial, sans-serif;
    }


    a {
        color: #000000;
        padding: 5px;
    }


    ::placeholder {
        color: #A42527;
        opacity: .5;
    }

    input {
        color: #A42527;
        align-text: center;
    }

    input[type=text], select {
        color: #A42527;
        width: 100%;
        padding: 10px;
        margin: 4px 0 4px 0;
        display: inline-block;
        border: none;
        background: #f1f1f1;
    }

    .error {
        display: block;
        width: 50%;
        color: #ffffff;
        background: #CB1926;
        margin-left: auto;
        margin-right: auto;
    }

    .navbar-expand-lg {
        background: #222;

    }

    .nav-item a, .btn-outline-success {
        color: #CACACA;
        font-weight: bold;
        font-family: "Helvetica Neue", Helvetica, Arial, sans-serif;
        text-transform: capitalize;

    }

    .navbar-toggler {
        background-color: #CACACA;
    }


    .btn {
        border-color: #CACACA;
    }

    body {
        background: hsl(0deg 0% 100%);
    }

    @media only screen and (max-width: 760px),
    (min-device-width: 768px) and (max-device-width: 1024px) {
        input[type=text], select {
            width: 100%;
            padding: 10px;
            margin: 4px 0 4px 0;
            display: inline-block;
            border: none;
            background: #f1f1f1;
        }

        .title {
            font-size: 25px;
        }

        .home {
            font-size: 22px;
        }
    }
</style>
</head>
<body>
<nav class="navbar navbar-expand-lg">
    <div class="container-fluid">
        <a class="navbar-brand" href="home"><img src="https://gateway.77soft.com/images/77whitetransparent.png"
                                                 alt="77L&D" height="38"></a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
                aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link" aria-current="page" href="home">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="about_us">About Us</a>
                </li>
                <%--                <li class="nav-item dropdown">--%>
                <%--                    <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">--%>
                <%--                        Dropdown--%>
                <%--                    </a>--%>
                <%--                    <ul class="dropdown-menu">--%>
                <%--                        <li><a class="dropdown-item" href="#">Action</a></li>--%>
                <%--                        <li><a class="dropdown-item" href="#">Another action</a></li>--%>
                <%--                        <li><hr class="dropdown-divider"></li>--%>
                <%--                        <li><a class="dropdown-item" href="#">Something else here</a></li>--%>
                <%--                    </ul>--%>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="addLearner">Enrollment Form</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="listEmployee">Employees List</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="listlearnercourse">Courses List</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="search">Search</a>
                </li>
            </ul>

        </div>
    </div>
</nav>
<h1 class="title">77 Global Learning and Management System</h1>
<div class="container">
    <h2 class="home">Add Course Form</h2>

    <%--@elvariable id="courseForm" type=""--%>
    <form:form id="update" modelAttribute="courseForm" action="courseAction"
               method="post" class="myform">
        <p>Course Number</p>
        <form:input type="text" name="courseNumber"
                    placeholder="enter course number..." path="courseNumber"/>
        <%--    <form:errors path="courseNumber" class="error" ></form:errors>--%>
        <p>Description</p>
        <form:input type="text" name="description"
                    placeholder="enter course Course Description..." path="description"/>
        <%--    <form:errors path="description" class="error" ></form:errors>--%>
        <p>Category</p>
        <form:select path="category">
            <form:option value="Design"/>
            <form:option value="Language"/>
            <form:option value="Variables"/>
            <form:option value="Programming"/>
        </form:select>
        <p>Duration</p>
        <form:input type="text" name="minutesDuration"
                    placeholder="enter course Duration..." path="minutesDuration"/>
        <%--    <form:errors path="minutesDuration" class="error" ></form:errors>--%>
        <p>Course Bond</p>
        <form:select path="withBond">
            <form:option value="true"/>
            <form:option value="false"/>
        </form:select>

        <br></br>

        <input class="submit" type="submit" value="Submit"/>

    </form:form>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-u1OknCvxWvY5kfmNBILK2hRnQC3Pr17a+RTT6rIHI7NnikvbZlHgTPOOmMi466C8"
            crossorigin="anonymous"></script>
</div>
</body>
</html>
