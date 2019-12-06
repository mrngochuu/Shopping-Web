<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- Header -->
<div class="container-fluid">
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
                <s:url action="LogoutAction" id="logoutLink"></s:url>
                <s:url action="ShowInfoAction" id='showInfoLink'></s:url>
                <s:url action="ShowCartAction" id='showCartLink'></s:url>
                <s:url action="ManageAction" id='manageLink'></s:url>

                <s:if test="%{#session.ROLE == 'user'}">
                    <li class="nav-item">
                        <s:a cssClass="nav-link ml-3" href="%{showCartLink}"><i class="fas fa-shopping-cart mr-1"></i>Cart</s:a>
                        </li>
                    <li class="nav-item">
                        <s:a cssClass="nav-link ml-3" href="%{showInfoLink}"><i class="fas fa-user-circle mr-1"></i><s:property value="#session.USERNAME" /></s:a>
                    </li>
                    <li class="nav-item">
                        <s:a cssClass="nav-link ml-3" href="%{logoutLink}"><i class="fas fa-sign-out-alt mr-1"></i>Logout</s:a>
                    </li>
                </s:if>

                <s:if test="%{#session.ROLE == 'admin'}">
                    <li class="nav-item">
                        <s:a cssClass="nav-link ml-3" href="%{manageLink}"><i class="fas fa-tasks mr-1"></i></i>Manage</s:a>
                        </li>
                        <li class="nav-item">
                        <s:a cssClass="nav-link ml-3" href="%{showInfoLink}"><i class="fas fa-user-circle mr-1"></i><s:property value="#session.USERNAME" /></s:a>
                        </li>
                        <li class="nav-item">
                        <s:a cssClass="nav-link ml-3" href="%{logoutLink}"><i class="fas fa-sign-out-alt mr-1"></i>Logout</s:a>
                        </li>
                </s:if>

                <s:if test="%{#session.ROLE != 'admin' and #session.ROLE != 'user'}">
                    <li class="nav-item">
                        <s:a cssClass="nav-link ml-3" href="login.jsp"><i class="fas fa-sign-in-alt mr-1"></i></i>Login</s:a>
                    </li>
                    <li class="nav-item">
                        <s:a cssClass="nav-link ml-3" href="register.jsp"><i class="fas fa-plus-circle mr-1"></i></i>Register</s:a>
                    </li> 
                </s:if>

            </ul>
        </div>
    </nav>
</div>
<!-- end header -->