<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Learner's Profile</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
    <style>
        * {
            box-sizing: border-box;

        }

        .container {
            padding: 15px;
        }

        .title {
            font-weight: bold;
            color: #CB1926;
            margin-top: 40px;
            text-align: center;
        }

        .home, .display {

            margin-top: 10px;
            text-align: center;
        }

        .a {
            text-align: center;
        }

        a {
            color: #000000;
            padding: 5px;
        }
        .navbar-expand-lg{
            background: #222;

        }
        .nav-item a,.btn-outline-success{
            color: #CACACA;
            font-weight: bold;
            font-family:"Helvetica Neue",Helvetica,Arial,sans-serif;
            text-transform: capitalize;

        }
        .navbar-toggler{
            background-color: #CACACA;
        }


        .btn{
            border-color: #CACACA;
        }
        body{
            background: hsl(0deg 0% 100%);
        }
    </style>
</head>
<body>
<nav class="navbar navbar-expand-lg">
    <div class="container-fluid" >
        <a class="navbar-brand" href="home"><img src="https://gateway.77soft.com/images/77whitetransparent.png" alt="77L&D" height="38"></a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link" aria-current="page" href="home" >Home</a>
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
                    <a class="nav-link" href="addLearner" >Enrollment Form</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="listEmployee" >Employees List</a>
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
<h2 class="home">Manager's Profile</h2>
<table border="1px solid" width="50%" align="center" style="margin-top:30px;pxpadding: 40px;font-family: Helvetica Neue, Helvetica, Arial, sans-serif" >

    <tr>
        <th style="background: #A42527; color: #f1f1f1; padding: 10px;" >MESSAGE: </th>
        <td style="background: #eec2c8; padding: 10px;"> ${message}</td>

    </tr>
</table>


<div align="center">
    <br></br>
    <a href="addManager" style="text-decoration: none;padding:7px; background:#CB1926;color: #ffffff;font-family:Helvetica Neue, Helvetica, Arial, sans-serif">Add New Manager </a>
    <br></br>
    <a href="listManager" style="text-decoration: none;padding:7px; background:#CB1926;color: #ffffff;font-family:Helvetica Neue, Helvetica, Arial, sans-serif"> Managers List</a>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-u1OknCvxWvY5kfmNBILK2hRnQC3Pr17a+RTT6rIHI7NnikvbZlHgTPOOmMi466C8" crossorigin="anonymous"></script>
</body>
</html>
