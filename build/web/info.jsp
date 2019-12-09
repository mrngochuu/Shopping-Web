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
        <div class="container-fluid bg-light"> 
            <div class="row">
                <div class="col-lg-8 mx-auto">
                    <div class="card card-signin my-5">
                        <div class="card-body">
                            <h3 class="card-title text-center"><s:property value="#session.USERNAME" />'s INFOMATION </h3>
                            <s:form theme="simple" cssClass="form-signin row mt-5" action="UpdateInfoAction" method="POST" enctype="multipart/form-data" >
                                <div class="offset-lg-1 col-lg-2 m-auto">
                                    <img src="<s:property value="%{#request.USER.avatar}"/>" width="220" height ="220"  border="1" />
                                    </div>
                                    <div class="offset-lg-2 col-lg-6">
                                    <s:textfield cssClass="form-control" name="fullname" value="%{#request.USER.fullname}" placeholder="Fullname" />
                                    <font color="red">
                                    <s:fielderror fieldName="lengthFullname"/>
                                    <s:fielderror fieldName="specFullname"/>
                                    </font>
                                    <s:textfield cssClass="form-control" name="phone" value="%{#request.USER.phone}" placeholder="Phone number (0xxxxxxxxx)" />
                                    <font color="red">
                                    <s:fielderror fieldName="phone"/>
                                    </font>
                                    <s:textarea cssClass="form-control" name="address" value="%{#request.USER.address}" placeholder="Address" />
                                    <font color="red">
                                    <s:fielderror fieldName="requiredAddress"/>
                                    </font>
                                    <s:textfield cssClass="form-control" name="email" value="%{#request.USER.email}" placeholder="Email" />
                                    <font color="red">
                                    <s:fielderror fieldName="email"/>
                                    </font>
                                    <s:submit cssClass="btn btn-lg btn-primary btn-block text-uppercase mb-3" value="Update"/>
                                </div>

                            </s:form>
                            <hr class="my-4">
                            <div class="mb-3">
                                <a href="index.jsp">Home Page</a>
                            </div>
                            <div class="mb-3">
                                <a href="changePassword.jsp">Change password</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>