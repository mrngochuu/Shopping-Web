<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Wedding dress | Home</title>
        <link rel="stylesheet" type="text/css" href="css/index.css">
        <script src="javascript/details.js" type="text/javascript" charset="utf-8" async defer></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">
    </head>
    <body>
        <div class="container-fluid">
            <!-- Header -->
            <nav class="navbar navbar-expand-lg navbar-light bg-light">
                <a class="navbar-brand" href="index.jsp"><img src="img/logo.png" width="50px" height="50px"></a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav mr-auto">
                        <li class="nav-item active">
                            <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Link</a>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                Dropdown
                            </a>
                            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <a class="dropdown-item" href="#">Action</a>
                                <a class="dropdown-item" href="#">Another action</a>
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item" href="#">Something else here</a>
                            </div>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link disabled" href="#">Disabled</a>
                        </li>
                    </ul>
                </div>

                <div class="collapse navbar-collapse flex-grow-0" id="navbarSupportedContent">
                    <ul class="navbar-nav mr-auto">
                        <c:if test="${sessionScope.ROLE eq 'customer'}" var="cusBoolean">
                            <li class="nav-item">
                                <a class="nav-link" href="#">Cart</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="#">${sessionScope.USERNAME}</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="#">Log out</a>
                            </li>
                        </c:if>

                        <c:if test="${sessionScope.ROLE eq 'admin'}" var="adminBoolean">
                            <li class="nav-item">
                                <a class="nav-link" href="#">Manage</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="#">${sessionScope.USERNAME}</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="#">Log out</a>
                            </li>
                        </c:if>

                        <c:if test="${!cusBoolean}">
                            <c:if test="${!adminBoolean}">
                                <li class="nav-item">
                                    <a class="nav-link" href="login.jsp">Login</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="register.jsp">Register</a>
                                </li>       

                            </c:if>
                        </c:if>
                    </ul>
                </div>
            </nav>
            <!-- end header -->

            <!-- body-content -->
            <main class="mb-3">
                <div class="row">
                    <div class="col-lg-12 banner">
                        <div id="demo" class="carousel slide" data-ride="carousel">
                            <!-- Indicators -->
                            <ul class="carousel-indicators">
                                <li data-target="#demo" data-slide-to="0" class="active"></li>
                                <li data-target="#demo" data-slide-to="1"></li>
                                <li data-target="#demo" data-slide-to="2"></li>
                            </ul>

                            <!-- The slideshow -->
                            <div class="carousel-inner">
                                <div class="carousel-item active">
                                    <img src="img/index/wedding-banner.jpg" width="100%" height="600">
                                </div>
                                <div class="carousel-item">
                                    <img src="img/index/wedding-banner02.jpg" width="100%" height="600">
                                </div>
                                <div class="carousel-item">
                                    <img src="img/index/wedding-banner03.jpg" width="100%" height="600">
                                </div>
                            </div>

                            <!-- Left and right controls -->
                            <a class="carousel-control-prev" href="#demo" data-slide="prev">
                                <span class="carousel-control-prev-icon"></span>
                            </a>
                            <a class="carousel-control-next" href="#demo" data-slide="next">
                                <span class="carousel-control-next-icon"></span>
                            </a>
                        </div>
                    </div>
                </div>
                <!-- end banner -->

                <!-- Search-->
                <p class="title">Search advance product</p>
                <div class="row">
                    <form class="form offset-lg-4 col-lg-4 bg-light">
                        <input class="form-control mr-sm-2 mb-3 mt-3" type="text" name="txtSearch" placeholder="Title"/>
                        <!-- Type -->
                        <select class="form-control mr-sm-2 mb-3" name="txtType">
                            <option selected >-- Choose type of real estate -- </option>
                            <!-- 1 vòng for -->
                            <option></option>
                        </select>

                        <!-- City -->
                        <select selected class="form-control mr-sm-2 mb-3" name="txtCity">

                            <option>-- Choose the city -- </option>
                            <option></option>
                        </select>

                        <!-- District -->
                        <select selected class="form-control mr-sm-2 mb-3" name="txtDistrict">
                            <option>-- Choose the district -- </option>
                            <!-- 1 vòng for -->
                            <option></option>
                        </select>
                        <button class="form-control btn btn-outline-success mb-3" type="submit">Search</button>
                    </form>
                </div>

                <!-- List product -->
                <p class="title">Wedding dresses</p>
                <div class="row">
                    <section class="col-lg-3">
                        <div class="card brand">
                            <img src="img/index/Dress_1.jpeg" alt="KARAH" width="100%" height="auto">
                            <div class="card-body">
                                <h4 class="card-title font-italic font-weight-bold">Karah</h4>
                                <p class="card-text">Discover St. Patrick Studio, a collection that follows the latest design trends and executes them with innovative craftsmanship and superioR fabrics by the Pronovias Fashion Group in exclusive partnership with Luv Bridal Australia.</p>
                            </div>
                            <a href="Karah.html" class="btn btn-secondary pl-5 pr-5 mb-3">See details</a>
                        </div>
                    </section>
                    <section class="col-lg-3">
                        <div class="card brand">
                            <img src="img/index/Dress_2.jpeg" alt="KASSIDY" width="100%" height="auto">
                            <div class="card-body">
                                <h4 class="card-title font-italic font-weight-bold">Kassidy</h4>
                                <p class="card-text">Discover St. Patrick Studio, a collection that follows the latest design trends and executes them with innovative craftsmanship and superior fabrics by the Pronovias Fashion Group in exclusive partnership with Luv Bridal Australia.</p>
                            </div>
                            <a href="Kassidy.html" class="btn btn-secondary pl-5 pr-5 mb-3">See details</a>
                        </div>
                    </section>
                    <section class="col-lg-3">
                        <div class="card brand">
                            <img src="img/index/Dress_3.jpeg" alt="EASTON" width="100%" height="auto">
                            <div class="card-body">
                                <h4 class="card-title font-italic font-weight-bold">Easton</h4>
                                <p class="card-text">Subtle in skirt and undeniable in appeal, EASTON is a sheer delight in a bold yet delicate floral lace. Embracing the twin concepts of seduction and innocence, she is classic in her silhouette and intelligent in her low back. Her fettuccine straps draw the eye to the base of her spine, showcasing skin and lengthening the figure.</p>
                            </div>
                            <a href="Easton.html" class="btn btn-secondary pl-5 pr-5 mb-3">See details</a>
                        </div>
                    </section>
                    <section class="col-lg-3">
                        <div class="card brand">
                            <img src="img/index/Dress_4.jpg" alt="EDEN" width="100%" height="auto">
                            <div class="card-body">
                                <h4 class="card-title font-italic font-weight-bold">Eden</h4>
                                <p class="card-text">EDEN, a design that resides in an elite group of gowns, is one of this season?s most fashion forward bridal styles, yet timeless in her appeal. In a combination of French Chantilly lace and eyelash scalloping EDEN intelligently incorporates subtle geometrics to flatter the figure.</p>
                            </div>
                            <a href="eden.html" class="btn btn-secondary pl-5 pr-5 mb-3">See details</a>
                        </div>
                    </section>
                </div>
            </main>
            <!-- footer -->
            <footer class="p-3">
                <div class="row">
                    <div class="col-lg-5">
                        <ul>
                            <h5>In Ho Chi Minh city</h5>
                            <li>Address: 1 Le Loi, Ward Ben Nghe, District 1</li>
                            <li>Phone: 0999999999</li>
                            <li>Fax: (84 24) 3974 3036</li>
                        </ul>
                    </div>
                    <div class="col-lg-5">
                        <ul>
                            <h5>In Ha Noi city</h5>
                            <li>Address: 1 Ly Nam De, Ward Hoang Ma, District Hoang Kiem</li>
                            <li>Phone: 0888888888</li>
                            <li>Fax: (84 24) 3974 3036</li>
                        </ul>
                    </div>
                    <div class="col-lg-2">
                        <h5>Contact me</h5>
                        <a href="#"><img src="img/index/fb.png" alt="Facebook" width="32" height="32"></a>
                        <a href="#"><img src="img/index/instagram.png" alt="Instagram" width="32" height="32"></a>
                        <a href="#"><img src="img/index/skype.png" alt="Skype" width="32" height="32"></a>
                    </div>
                </div>
                <center style="font-size: 15px; opacity: 0.5;">Copyright &copy; G.A.U Co.op
                </center>
            </footer>
        </div>
    </body>
</html>                    