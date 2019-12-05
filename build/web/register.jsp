<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <title>G.A.U | Register</title>
        <meta charset="UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">
        <sb:head/>
    </head>
    <body>
        <div class="container-fluid"> 
            <div class="row">
                <div class="col-sm-9 col-md-7 col-lg-5 mx-auto">
                    <div class="card card-signin my-5">
                        <div class="card-body">
                            <h3 class="card-title text-center">REGISTER</h3>
                            <s:form theme="simple" cssClass="form-signin" action="RegisterAction" method="POST">
                                <s:textfield cssClass="form-control" name="username" placeholder="Username" />
                                <font color="red">
                                <s:if test="%{exception.message.indexOf('duplicate') > -1}">
                                    <s:property value="username"/> is existed!
                                </s:if>
                                <s:fielderror fieldName="lengthUsername"/>
                                <s:fielderror fieldName="specUsername"/>
                                </font>
                                <s:textfield cssClass="form-control" name="fullname" placeholder="Fullname" />
                                <font color="red">
                                <s:fielderror fieldName="lengthFullname"/>
                                <s:fielderror fieldName="specFullname"/>
                                </font>
                                <s:password cssClass="form-control" name="password" placeholder="Password"/>
                                <font color="red">
                                <s:fielderror fieldName="lengthPassword"/>
                                <s:fielderror fieldName="specPassword"/>
                                </font>
                                <s:password cssClass="form-control" name="confirm" placeholder="Retype-Password"/>
                                <font color="red">
                                <s:fielderror fieldName="confirm"/>
                                </font>
                                <s:textfield cssClass="form-control" name="phone" placeholder="Phone number (0xxxxxxxxx)" />
                                <font color="red">
                                <s:fielderror fieldName="phone"/>
                                </font>
                                <s:textarea cssClass="form-control" name="address" placeholder="Address" />
                                <font color="red">
                                <s:fielderror fieldName="requiredAddress"/>
                                </font>
                                <s:textfield cssClass="form-control" name="email" placeholder="Email" />
                                <font color="red">
                                <s:fielderror fieldName="email"/>
                                </font>
                                <s:submit cssClass="btn btn-lg btn-primary btn-block text-uppercase mb-3" value="Register"/>
                            </s:form>
                            <hr class="my-4">
                            <div class="mb-3">
                                <a href="index.jsp">Home Page</a>
                            </div>
                            <div class="mb-3">
                                <a href="register.jsp">Login</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>