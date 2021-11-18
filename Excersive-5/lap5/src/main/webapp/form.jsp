<%--
  Created by IntelliJ IDEA.
  User: lequo
  Date: 17/11/2021
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String error = (String) request.getAttribute("error"); %>
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Form</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta2/css/all.min.css"
          integrity="sha512-YWzhKL2whUzgiheMoBFwW8CKV4qpHQAEuvilg9FAn5VJUDwKZZxkJNuGM4XkWuk94WCrrwslk8yWNGmY1EduTA=="
          crossorigin="anonymous" referrerpolicy="no-referrer"/>
    <link rel="stylesheet" href="./style.css">
</head>
<body>
<div class="main">
    <div id="header">
        <ul id="nav">
            <li>
                <a href="#">HOME</a>
            </li>
            <li>
                <a href="">
                    PRODUCT
                    <i class="nav-arrow-down ti-angle-down"></i>
                </a>

                <ul class="subnav">
                    <li><a href="">TIVI</a></li>
                    <li><a href="">LAPTOP</a></li>
                </ul>
            </li>
            <li>
                <a href="#">ABOUT US</a
                ></li>
            <li>
                <a href="#">CONTACT</a>
            </li>
        </ul>
        <!-- END NAV -->
    </div>

    <div class="layout1">
        <h1>CONTACT US</h1>
        <div class="form">
            <form action="/lap5/Handling_form1" method="post">
                <div class="inputBox">
                    <input type="text" name="form-1-name" placeholder="Enter Your Name" required> <span for="">Full Name *</span>
                </div>

                <div class="db-inputBox">
                    <input type="email" name="form-1-email" class="" placeholder="Enter Your Email" required><span>Email *</span>
                    <input type="text" name="form-1-phone" placeholder="Enter Your Phone"><span>Phone</span>
                </div>
                <div class="inputBox">
                    <input type="text" name="form-1-service" placeholder="Services" required> <span>Needed Services *</span>
                </div>

                <div class="messege">
                    <textarea name="form-1-mess" placeholder="Your messege here..."></textarea> <span>Messege</span>
                </div>

                <div class="send-btn">
                    <button type="submit">Submit</button>
                </div>
            </form>
        </div>
    </div>
    <div class="layout2">
        <div class="layout2-form">
            <h3>Sign in</h3>
            <form id="login" class="input-group" action="/lap5/Handling_form2" method="post">


                <input type="text" name="form-2-username" <% if(request.getParameter("form-2-username") != null){%> value="<%= request.getParameter("form-2-username")%>" <% } %> class="input-field" placeholder="Account" required>
                <input type="password" name="form-2-password" class="input-field" placeholder="Passwork" required>
                <button type="submit" class="submit-btn" >Submit</button>
            </form>
            <span>or login with</span>
            <div class="social-icons">
                <img src="1200px-Facebook_Logo_(2019).png" alt="">
                <img src="Google__G__Logo.svg.png" alt="">
            </div>
            <%
                if (error != null) { %>
            <div class="form-2-error"
                 style="position: absolute;top: 42px; font-size: 10px; margin: 0px 55px; background-color: #d6a98c; padding: 10px 5px;"><%= error %>
            </div>
            <% } %>
        </div>
    </div>
    <div class="layout3">
        <div class="layout3-form">
            <div class="form-account">
                <h5>Account</h5>
                <input class="input" type="text" placeholder="Full Name"> <span class="form-icon"><i
                    class="fas fa-user-alt"></i></span>
                <input class="input" type="email" placeholder="Email"> <span class="form-icon"> <i
                    class="fas fa-envelope"></i> </span>
                <input class="input" type="password" placeholder="Passwork"><span class="form-icon"><i
                    class="fas fa-key"></i></span>
            </div>
            <div class="form-info">
                <div class="form-date">
                    <h5 class="h5">Date Of Birth</h5>
                    <input class="input" type="number" placeholder="DD">
                    <input class="input" type="number" placeholder="MM">
                    <input class="input" type="number" placeholder="YYYY">
                </div>
                <div class="form-gender">
                    <h5 class="h5">Gender</h5>
                    <input class="input" type="text" placeholder="Male">
                    <input class="input" type="text" placeholder="FeMale">
                </div>
            </div>
            <div class="form-pay">
                <h5 class="h5">Payment Details</h5>
                <div class="form-pay-1">
                    <input class="input" type="text" placeholder="Credit Card"> <span class="creditcard"><i
                        class="fas fa-id-card"></i></span>
                    <input class="input" type="text" placeholder="Paypal"> <span><i class="fas fa-id-card"></i></span>
                </div>
                <input class="input input-2" type="text" placeholder="Card Numeber"> <span class="form-icon icon-2"><i
                    class="fas fa-id-card"></i></span>

            </div>
            <div class="form-info">
                <div class="form-date">
                    <input class="input input-3" type="text" placeholder="Card CVC"> <span class="form-icon"><i
                        class="fas fa-id-card"></i></span>
                </div>
                <div class="form-gender">
                    <input class="input" type="Date" placeholder="">
                    <input class="input" type="Numeber" placeholder="2015">
                </div>
            </div>
            <h5 class="h5">Terms and Conditions</h5>
            <div class="footer">
                <div class="footer-item">
                    <p><input type="checkbox"> I accept the terms and conditions for signing up to this service, and
                        hereby confirm I have read the privacy policy.</p>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
