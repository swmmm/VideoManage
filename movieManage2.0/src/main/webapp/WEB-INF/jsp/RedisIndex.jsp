<%--
  Created by IntelliJ IDEA.
  User: swmmmm
  Date: 2019/6/26
  Time: 10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + "/";
%>
<!DOCTYPE html>
<html>

<head>
    <title></title>
    <link rel="stylesheet" href="<%=basePath%>static/bootstrap4/css/bootstrap.css">
    <style type="text/css">
        .card-deck{
            margin-bottom: 50px;
        }
        #v-pills-tab{
            float: left;
            width: 200px;
            height: calc(100vh - 94px);
            margin-right: 20px;
        }
        #v-pills-tabContent{
            margin-left: 220px;
        }
        .carousel-inner{
            width: 800px;
            margin: auto;
        }
        .card-img-top{
            height: 250px;
        }
    </style>
    <script type="text/javascript" src="<%=basePath%>static/js/jquery-3.1.1.min.js"></script>
    <script type="text/javascript" src="<%=basePath%>static/bootstrap4/js/bootstrap.js"></script>
</head>

<body>
<div class="contianer-fulid">
    <div class="card">
        <div class="card-header text-center">
            <h6>Redis案例实战（电商大数据）</h6>
        </div>
        <div class="card-body bg-light">
            <div class="nav flex-column nav-pills" id="v-pills-tab">
                <a class="nav-link active" id="advertisement_tab" data-toggle="pill" href="#advertisement" >广告访问</a>
                <a class="nav-link" id="goods_recomend_tab" data-toggle="pill" href="#goods_recomend"   >商品推荐</a>
                <a class="nav-link" id="shopping_car_tab" data-toggle="pill" href="#shopping_car">购物车</a>
                <a class="nav-link" id="browse_record_tab" data-toggle="pill" href="#browse_record">点击商品记录分析</a>
                <a class="nav-link" id="session_replace_tab" data-toggle="pill" href="#session_replace">替代Session</a>
                <a class="nav-link" id="page_cache_tab" data-toggle="pill" href="#page_cache">分页缓存</a>
            </div>
            <div class="tab-content" id="v-pills-tabContent">
                <div class="tab-pane fade show active" id="advertisement">
                    <div class="carousel slide " data-ride="carousel">
                        <div class="carousel-inner">
                            <c:forEach items="${advertisements}" var="advertisement">
                                <div class="carousel-item card text-white bg-secondary ">
                                    <div class="card-img-top" ><p>${advertisement['imageUrl']}</p></div>
                                    <div class="card-header">${advertisement['adName']}</div>
                                    <div class="card-body">
                                        <h5 class="card-title">${advertisement['adId']}</h5>
                                        <p class="card-text">${advertisement['content']}</p>
                                    </div>
                                </div>
                            </c:forEach>
                        </div>
                        <script type="text/javascript">
                            $(".carousel-item").first().addClass("active");
                        </script>
                    </div>
                </div>
                <div class="tab-pane fade " id="goods_recomend">
                    商品推荐...
                    <div class="card-deck text-white">
                    </div>
                </div>
                <div class="tab-pane fade " id="shopping_car">购物车...</div>
                <div class="tab-pane fade " id="browse_record">点击商品记录分析...</div>
                <div class="tab-pane fade " id="session_replace">替代Session...</div>
                <div class="tab-pane fade " id="page_cache">分页缓存...</div>
            </div>
        </div>
    </div>
</div>
<script type="text/javascript">
    $("#goods_recomend_tab").click(function () {
        $.ajax({
            type:"get",
            url:"/redis/goodsRecommend",
            success:function (data) {
                $(".card-deck").empty();
                for (var i=0;i<data.length;i++){
                    $(".card-deck").append("<div class=\"card bg-secondary \">\n" +
                        "                            <div class=\"card-img-top\">"+data[i].adInfo+"</div>\n" +
                        "                            <div class=\"card-body\">\n"+
                        "                                <h5 class=\"card-title\">"+data[i].goodsId+"</h5>\n" +
                        "                                <p class=\"card-text\">"+data[i].goodsInfo+"</p>\n" +
                        "                            </div>\n" +
                        "                        </div>")
                }

            }
        })
    })
</script>
</body>

</html>
