<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Course's List</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
    <style>
        * {
            box-sizing: border-box;

        }

        table, th, td {
            padding: 10px;
            margin: 5px;
            text-align: center;
            background: #eec2c8;
            font-family: "Helvetica Neue", Helvetica, Arial, sans-serif;
        }

        .title {
            font-weight: bold;
            color: #CB1926;
            margin-top: 40px;
            text-align: center;
        }


        .container {
            position: relative;
            margin: auto;
            right: 0;
            left: 0;
            padding: 15px;
            width: 60%;
        }


        .home {
            text-align: center;
            margin-left: auto;
            margin-right: auto;
            font-weight: bold;
        }

        .table {
            width: 100%;
            text-align: center;
            padding: 10px;
            border: none;
            margin-top: 10px;


        }

        table td {
            color: #000000;
            border: 1px solid white;
            border-collapse: collapse;

        }

        .table th {
            background: #a50319;
            color: #f1f1f1;
            border: 1px solid white;
            border-collapse: collapse;


        }

        p {
            font-weight: normal;
            margin: 20px;
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

        .btn {
            border-color: #CACACA;
        }

        body {
            background: hsl(0deg 0% 100%);
        }

        @media only screen and (max-width: 760px),
        (min-device-width: 768px) and (max-device-width: 1024px) {

            td {
                padding: 5px;
            }

            table {
                width: 100%;
                margin: 30px auto;

            }

            .navbar-toggler {
                background-color: #CACACA;
            }

            .container a {
                font-size: 15px;
            }

            th {
                font-size: 13px;
            }

            td {
                font-size: 12px;
            }

            .title {
                font-size: 25px;
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

<h2 class="home">Courses Table</h2>
<div class="container">
    <a href="addcourse"
       style="margin-left: 5px; text-decoration: none;background:#a50319;padding:10px;color:#ffffff;font-family:Helvetica Neue, Helvetica, Arial, sans-serif">Add
        Course </a>
    <table class="table">
        <tr>
            <th>Course Number</th>
            <th>Description</th>
            <th>Category</th>
            <th>Duration</th>
            <th>With Bond</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="course" items="${mylistCourse}">
            <tr>
                <td>${course.courseNumber}</td>
                <td>${course.description}</td>
                <td>${course.category}</td>
                <td>${course.minutesDuration} </td>
                <td>${course.withBond   } </td>

                <td><a href="update"
                       style="text-decoration: none;background:#CB1926;color: #ffffff;font-family:Helvetica Neue, Helvetica, Arial, sans-serif; padding: 5px">Update</a>
                    <a style="text-decoration: none; background:#CB1926;color: #ffffff;font-family:Helvetica Neue, Helvetica, Arial, sans-serif; padding: 5px "
                       href="${pageContext.request.contextPath}
                /dellistlearnercourse?learnerCourseid=${course.courseNumber}"
                       onclick="return confirm('Are you sure do delete this record?')">Delete</a>
                </td>
            </tr>
        </c:forEach>

    </table>


</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-u1OknCvxWvY5kfmNBILK2hRnQC3Pr17a+RTT6rIHI7NnikvbZlHgTPOOmMi466C8"
        crossorigin="anonymous"></script>
</body>
</html>
